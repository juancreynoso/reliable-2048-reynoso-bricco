"""
A simple OASIs (Assignment 5, Exercise 2): it helps the user refine an assertion
(a postcondition) of a Java method, with the help of an LLM. It never changes the
assertion; it shows evidence, and the user decides.

  1. Too strong? The LLM proposes valid inputs that may violate the assertion.
     We run them on the real method and report the ones that do (false positives).
  2. Too weak? The LLM proposes mutants (wrong versions) of the method. We run
     them and report the ones that behave differently from the original but
     still satisfy the assertion (false negatives: the assertion cannot kill them).
  3. The LLM reads that evidence and suggests better assertions.

    export OPENROUTER_API_KEY=...
    python3 oasis/refiner.py oasis/cases/can_merge/case.json [--assertion "..."] [--report out.md]

A case (case.json) gives the method (Subject.java), its int parameters, the
precondition of a valid input and the assertion, as Java expressions over the
parameters and `result`. Re-run with --assertion to try a refined assertion.
"""

import argparse
import json
import os
import subprocess
import tempfile
import time
import urllib.request

URL = "https://openrouter.ai/api/v1/chat/completions"
MODEL = os.environ.get("OASIS_MODEL", "nvidia/nemotron-3-ultra-550b-a55b:free")


# --------------------------------------------------------------- the LLM
def ask_llm(prompt):
    """Send a prompt to the LLM and return the JSON object in its answer."""
    body = json.dumps({"model": MODEL, "messages": [
        {"role": "system", "content": "You are an expert in Java testing. Reply ONLY with one JSON object."},
        {"role": "user", "content": prompt}]}).encode()
    request = urllib.request.Request(URL, body, {
        "Authorization": "Bearer " + os.environ["OPENROUTER_API_KEY"], "Content-Type": "application/json"})
    error = None
    for attempt in range(4):   # free models are often busy: wait and retry
        try:
            with urllib.request.urlopen(request, timeout=180) as response:
                text = json.load(response)["choices"][0]["message"]["content"]
            return json.loads(text[text.index("{"):text.rindex("}") + 1])
        except Exception as e:
            error = e
            time.sleep(2 ** attempt)
    raise RuntimeError("the LLM did not answer: %s" % error)


def describe(case, source, assertion):
    return ("Java class:\n```java\n%s\n```\nMethod: %s(%s)\nAssertion (`result` is the return value): %s\n"
            "Valid inputs satisfy: %s\nIntent: %s\n" % (
                source, case["method"], ", ".join("int " + p for _, p in case["params"]),
                assertion, case["precondition"], case["description"]))


# ---------------------------------------------------- running Java for real
def run(case, source, assertion, inputs):
    """Run the method on each input; one line per input:
    'SKIP' (not a valid input), 'OK <result>', 'VIOLATION <result>' or 'EXC <exception>'."""
    if not inputs:
        return []
    params = [p for _, p in case["params"]]
    harness = """public class Harness {
  public static void main(String[] args) {
    int[][] inputs = {%s};
    for (int[] in : inputs) {
      %s
      if (!(%s)) { System.out.println("SKIP"); continue; }
      try {
        %s result = Subject.%s(%s);
        System.out.println(((%s) ? "OK " : "VIOLATION ") + result);
      } catch (Throwable t) { System.out.println("EXC " + t.getClass().getSimpleName()); }
    }
  }
}""" % (", ".join("{%s}" % ", ".join(map(str, i)) for i in inputs),
        " ".join("int %s = in[%d];" % (p, k) for k, p in enumerate(params)),
        case["precondition"], case["return_type"], case["method"], ", ".join(params), assertion)
    with tempfile.TemporaryDirectory() as folder:
        for name, text in (("Subject.java", source), ("Harness.java", harness)):
            with open(os.path.join(folder, name), "w") as f:
                f.write(text)
        compiled = subprocess.run(["javac", "Subject.java", "Harness.java"], cwd=folder,
                                  capture_output=True, text=True)
        if compiled.returncode != 0:
            raise RuntimeError("does not compile: " + compiled.stderr[:300])
        ran = subprocess.run(["java", "-cp", folder, "Harness"], capture_output=True, text=True, timeout=60)
    return ran.stdout.splitlines()


def is_input(case, values):
    """An input proposed by the LLM must be a list of ints, one per parameter."""
    return (isinstance(values, list) and len(values) == len(case["params"])
            and all(type(v) is int and -2 ** 31 <= v < 2 ** 31 for v in values))


def classify(original, mutant):
    """'killed' if the assertion catches the mutant, 'survives' if the mutant behaves
    differently but the assertion accepts it, 'equivalent?' if it never differs."""
    verdict = "equivalent?"
    for o, m in zip(original, mutant):
        if o == "SKIP" or o == m:
            continue                       # not a valid input, or same behaviour
        if m.startswith("VIOLATION") or (m.startswith("EXC") and not o.startswith("EXC")):
            return "killed"
        verdict = "survives"               # it differs here and the assertion accepts it
    return verdict


# ------------------------------------------------------------- the analysis
def analyse(case, source, assertion, llm=ask_llm, inputs=15, mutants=5):
    about = describe(case, source, assertion)
    proposed = llm(about + "\nThe assertion may be TOO STRONG. Propose up to %d different inputs that satisfy "
                   "the precondition and are likely to VIOLATE it (boundaries, large values). "
                   'Reply {"inputs": [[a, b], ...]}' % inputs).get("inputs", [])
    tests = []
    for values in proposed:
        if is_input(case, values) and values not in tests:
            tests.append(values)
    wrong_versions = llm(about + "\nThe assertion may be TOO WEAK. Propose %d mutants of the class: small "
                         "plausible faults that change the result on some valid input but still satisfy the "
                         "assertion. Each one is the full source of class Subject. "
                         'Reply {"mutants": [{"description": "...", "source": "...", "input": [a, b]}]} '
                         "where input is a valid input on which the mutant differs." % mutants).get("mutants", [])
    for m in wrong_versions:       # the inputs where the LLM says each mutant differs are tests too
        if is_input(case, m.get("input")) and m["input"] not in tests:
            tests.append(m["input"])

    original = run(case, source, assertion, tests)
    violations = [(t, line.split(" ", 1)[1]) for t, line in zip(tests, original) if line.startswith("VIOLATION")]
    verdicts = {}
    for m in wrong_versions:
        try:
            verdicts[m.get("description", "?")] = classify(original, run(case, m.get("source", ""), assertion, tests))
        except RuntimeError:
            verdicts[m.get("description", "?")] = "does not compile"

    evidence = ["input %s returns %s and violates the assertion" % v for v in violations]
    evidence += ["mutant '%s' survives" % d for d, v in verdicts.items() if v == "survives"]
    advice = llm("Assertion: %s\nMethod intent: %s\nEvidence from running the program:\n%s\n\nSay what the "
                 "evidence suggests (assertion too strong, too weak, or a bug in the program) and propose up "
                 'to 3 better assertions. Reply {"feedback": "...", "suggestions": ["..."]}' % (
                     assertion, case["description"], "\n".join("- " + e for e in evidence) or "- none"))
    return {"assertion": assertion, "tests": len(tests), "violations": violations, "mutants": verdicts,
            "feedback": advice.get("feedback", ""), "suggestions": advice.get("suggestions", [])}


def report(case, r):
    lines = ["# OASIs report: %s" % case["name"], "",
             "Assertion: `%s`  " % r["assertion"], "Precondition: `%s`  " % case["precondition"],
             "Inputs run: %d" % r["tests"], "", "## Too strong? Inputs that violate it", ""]
    lines += ["- `%s` returns `%s`" % v for v in r["violations"]] or ["None found."]
    lines += ["", "## Too weak? Mutants", ""]
    lines += ["- %s: **%s**" % (d, v) for d, v in r["mutants"].items()] or ["None proposed."]
    lines += ["", "## LLM feedback (the user decides)", "", r["feedback"], ""]
    lines += ["- `%s`" % s for s in r["suggestions"]]
    return "\n".join(lines) + "\n"


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("case")
    parser.add_argument("--assertion", help="try another assertion instead of the one in the case")
    parser.add_argument("--report", help="also write the report to this file")
    args = parser.parse_args()
    with open(args.case) as f:
        case = json.load(f)
    with open(os.path.join(os.path.dirname(args.case), case["source"])) as f:
        source = f.read()
    text = report(case, analyse(case, source, args.assertion or case["assertion"]))
    print(text)
    if args.report:
        with open(args.report, "w") as f:
            f.write(text)


if __name__ == "__main__":
    main()
