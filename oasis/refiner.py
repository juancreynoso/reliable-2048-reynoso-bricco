#!/usr/bin/env python3
"""
A small OASIs-style assertion refiner.

Given a Java method and an assertion (a Java boolean expression over the
parameters and `result`), it asks an LLM for feedback that helps the *user*
decide how to refine the assertion:

  * too strong (false positive): the LLM proposes inputs that should violate the
    assertion; the tool runs them and reports the ones that really do (and that
    satisfy the user's precondition).
  * too weak (false negative): the LLM proposes mutants of the method that the
    assertion should not detect; the tool compiles them, runs them and reports
    the non-equivalent mutants the assertion cannot kill.

The tool never changes the assertion by itself. With --interactive the user may
type a refined assertion and the analysis is repeated.

  python3 oasis/refiner.py oasis/cases/can_merge/case.json [--provider openrouter|nvidia]
         [--model M] [--inputs N] [--mutants K] [--interactive] [--report out.md]
"""

import argparse
import json
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import javaharness as jh
from llm import LLMClient, LLMError, extract_json

SYSTEM = ("You are an expert in Java, testing and formal specification. "
          "Reply ONLY with a single JSON object, no prose outside it.")


def fmt_signature(spec):
    params = ", ".join(f"{t} {n}" for t, n in spec["params"])
    return f"static {spec['return_type']} {spec['method']}({params})"


def context(spec, source, assertion):
    return (f"Java subject (class Subject):\n```java\n{source}\n```\n"
            f"Method under analysis: {fmt_signature(spec)}\n"
            f"Assertion (Java boolean expression; `result` is the return value, parameters are in scope): "
            f"{assertion}\n"
            f"Precondition that valid inputs satisfy (Java boolean expression): {spec.get('precondition', 'true')}\n"
            f"Intent of the method: {spec.get('description', '(not given)')}\n")


def ask_inputs(llm, spec, source, assertion, n):
    prompt = context(spec, source, assertion) + (
        f"\nTASK: the assertion may be TOO STRONG (it may fail on valid inputs). Propose up to {n} "
        f"diverse inputs that satisfy the precondition and are most likely to VIOLATE the assertion "
        f"(boundary values, special values, large values, unusual combinations).\n"
        f'Reply as JSON: {{"inputs": [[arg1, arg2, ...], ...]}} with one JSON value per parameter, '
        f"in order ({', '.join(n_ for _, n_ in spec['params'])}).")
    return extract_json(llm.chat(SYSTEM, prompt)).get("inputs", [])


def ask_mutants(llm, spec, source, assertion, k):
    prompt = context(spec, source, assertion) + (
        f"\nTASK: the assertion may be TOO WEAK (it may accept wrong implementations). Propose {k} "
        f"mutants of the Subject class: small, plausible faults that change the method's behaviour on "
        f"at least one VALID input but that this assertion would NOT detect (the assertion would still "
        f"hold). Each mutant is the COMPLETE source of the Subject class, same class name and same method "
        f"signature, so that it compiles on its own.\n"
        f'Reply as JSON: {{"mutants": [{{"description": "...", "source": "<full java source>", '
        f'"distinguishing_input": [arg1, ...]}}, ...]}} where distinguishing_input is a valid input on '
        f"which the mutant returns something different from the original.")
    return extract_json(llm.chat(SYSTEM, prompt)).get("mutants", [])


def ask_feedback(llm, spec, assertion, strong, weak):
    lines = []
    for c in strong:
        lines.append(f"- input {c['input']} -> result {c['result']} violates the assertion")
    for m in weak:
        lines.append(f"- mutant '{m['description']}' survives (assertion cannot kill it); differs from "
                     f"the original on input {m['witness']}")
    prompt = (f"Method: {fmt_signature(spec)}\nIntent: {spec.get('description', '')}\n"
              f"Assertion under review: {assertion}\nPrecondition: {spec.get('precondition', 'true')}\n"
              f"Evidence gathered by running the program:\n" + ("\n".join(lines) or "- none") + "\n\n"
              "TASK: write feedback for the developer who owns this assertion. For each piece of "
              "evidence, say what it suggests (assertion too strong? assertion too weak? or a bug in the "
              "program?). Then propose up to 3 candidate refined assertions as Java boolean expressions, "
              "clearly marked as suggestions: the developer makes the final decision.\n"
              'Reply as JSON: {"feedback": "<text>", "suggestions": ["<java expr>", ...]}')
    r = extract_json(llm.chat(SYSTEM, prompt))
    return r.get("feedback", ""), r.get("suggestions", [])


def valid_inputs(spec, raw):
    """Keep only inputs with the right arity and Java-representable values."""
    good = []
    for args in raw:
        if not isinstance(args, list) or len(args) != len(spec["params"]):
            continue
        try:
            for (t, _), v in zip(spec["params"], args):
                jh.java_literal(v, t)
        except ValueError:
            continue
        if args not in good:
            good.append(args)
    return good


def analyse(llm, spec, source, assertion, n_inputs, n_mutants, log=print):
    spec = dict(spec, assertion=assertion)
    inputs = valid_inputs(spec, ask_inputs(llm, spec, source, assertion, n_inputs))
    log(f"[1/3] LLM proposed {len(inputs)} usable inputs")
    mutants = ask_mutants(llm, spec, source, assertion, n_mutants)
    log(f"[2/3] LLM proposed {len(mutants)} mutants")
    for m in mutants:
        w = valid_inputs(spec, [m.get("distinguishing_input", [])])
        inputs += [x for x in w if x not in inputs]

    base = jh.run(spec, source, inputs)
    strong = [{"input": a, "result": o["result"]} for a, o in zip(inputs, base)
              if o["status"] == "VIOLATION"]
    errors = [(a, o) for a, o in zip(inputs, base) if o["status"] in ("ASSERTEXC", "HARNESSERR")]

    weak, killed, discarded = [], [], []
    for m in mutants:
        desc = m.get("description", "(no description)")
        try:
            res = jh.run(spec, m.get("source", ""), inputs)
        except jh.HarnessError as e:
            discarded.append({"description": desc, "why": "does not compile / run: " + str(e)[:150]})
            continue
        witness = None
        detected = False
        for a, o, b in zip(inputs, base, res):
            if o["status"] == "SKIP":
                continue
            if b["status"] in ("VIOLATION",) and o["status"] == "OK":
                detected = True
            if b["status"] == "EXC" and o["status"] != "EXC":
                detected = True
            if witness is None and (b["status"], b["result"]) != (o["status"], o["result"]) \
                    and o["status"] in ("OK", "EXC") and b["status"] in ("OK", "EXC", "VIOLATION"):
                witness = a
        if detected:
            killed.append({"description": desc})
        elif witness is None:
            discarded.append({"description": desc, "why": "behaves like the original on every input "
                              "tried (possibly an equivalent mutant)"})
        else:
            weak.append({"description": desc, "witness": witness, "source": m.get("source", "")})
    log(f"[3/3] runs done: {len(strong)} violating inputs, {len(weak)} surviving mutants")
    try:
        feedback, suggestions = ask_feedback(llm, spec, assertion, strong, weak)
    except LLMError as e:
        feedback, suggestions = f"(feedback request failed: {e})", []
    return {"assertion": assertion, "inputs_tried": len(inputs), "strong": strong, "weak": weak,
            "killed": killed, "discarded": discarded, "errors": errors,
            "feedback": feedback, "suggestions": suggestions}


def render(spec, r):
    L = [f"# OASIs report: {spec['name']}", "",
         f"Method: `{fmt_signature(spec)}`  ",
         f"Assertion under review: `{r['assertion']}`  ",
         f"Precondition: `{spec.get('precondition', 'true')}`  ",
         f"Inputs executed: {r['inputs_tried']}", ""]
    L += ["## Possible false positive (assertion too strong)", ""]
    if r["strong"]:
        L += [f"- input `{c['input']}` returns `{c['result']}` and violates the assertion" for c in r["strong"]]
        L += ["", "If these inputs are valid, either the assertion is too strong or the program has a bug."]
    else:
        L += ["No violating input found."]
    L += ["", "## Possible false negative (assertion too weak)", ""]
    if r["weak"]:
        for m in r["weak"]:
            L += [f"- mutant **{m['description']}** survives; it differs from the original on input `{m['witness']}`"]
    else:
        L += ["No surviving non-equivalent mutant found."]
    L += ["", f"Killed mutants: {len(r['killed'])}. Discarded mutants: {len(r['discarded'])}"]
    L += [f"- discarded: {d['description']} ({d['why']})" for d in r["discarded"]]
    L += ["", "## LLM feedback", "", r["feedback"] or "(none)", "", "## Suggested refinements (the user decides)", ""]
    L += [f"- `{s}`" for s in r["suggestions"]] or ["(none)"]
    return "\n".join(L) + "\n"


def main():
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("case")
    ap.add_argument("--provider", default="openrouter")
    ap.add_argument("--model")
    ap.add_argument("--inputs", type=int, default=15)
    ap.add_argument("--mutants", type=int, default=5)
    ap.add_argument("--interactive", action="store_true")
    ap.add_argument("--assertion", help="override the assertion of the case file")
    ap.add_argument("--report", help="write the markdown report here")
    a = ap.parse_args()

    with open(a.case) as f:
        spec = json.load(f)
    with open(os.path.join(os.path.dirname(os.path.abspath(a.case)), spec["source"])) as f:
        source = f.read()
    try:
        llm = LLMClient(a.provider, a.model)
    except LLMError as e:
        sys.exit(f"error: {e}")
    print(f"model: {llm.model}")

    assertion = a.assertion or spec["assertion"]
    report = ""
    while True:
        try:
            r = analyse(llm, spec, source, assertion, a.inputs, a.mutants)
        except (LLMError, jh.HarnessError) as e:
            sys.exit(f"error: {e}")
        text = render(spec, dict(r))
        print("\n" + text)
        report += text + "\n---\n\n"
        if not a.interactive:
            break
        new = input("New assertion (Enter to stop): ").strip()
        if not new:
            break
        assertion = new
    if a.report:
        with open(a.report, "w") as f:
            f.write(report)
        print(f"report written to {a.report}")


if __name__ == "__main__":
    main()
