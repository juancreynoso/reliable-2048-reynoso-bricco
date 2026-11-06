"""Compile and run a Java subject on a list of inputs, evaluating an assertion on each."""

import json
import os
import subprocess
import tempfile

JAVA_TYPES = {"int", "long", "boolean", "double", "String"}


class HarnessError(RuntimeError):
    pass


def java_literal(value, jtype):
    if jtype == "int":
        if isinstance(value, bool) or not isinstance(value, int) or not -2**31 <= value < 2**31:
            raise ValueError(f"{value!r} is not an int")
        return str(value)
    if jtype == "long":
        if isinstance(value, bool) or not isinstance(value, int) or not -2**63 <= value < 2**63:
            raise ValueError(f"{value!r} is not a long")
        return f"{value}L"
    if jtype == "boolean":
        if not isinstance(value, bool):
            raise ValueError(f"{value!r} is not a boolean")
        return "true" if value else "false"
    if jtype == "double":
        if isinstance(value, bool) or not isinstance(value, (int, float)) or value != value or abs(value) == float("inf"):
            raise ValueError(f"{value!r} is not a finite double")
        return repr(float(value))
    if jtype == "String":
        if value is None:
            return "null"
        if not isinstance(value, str):
            raise ValueError(f"{value!r} is not a String")
        return json.dumps(value)
    raise ValueError(f"unsupported type {jtype}")


def build_harness(spec, inputs):
    params = spec["params"]
    rtype = spec["return_type"]
    pre = spec.get("precondition", "true")
    lines = ["public class Harness {"]
    for i, args in enumerate(inputs):
        decls = "\n".join(f"    final {t} {n} = {java_literal(v, t)};"
                          for (t, n), v in zip(params, args))
        call = ", ".join(n for _, n in params)
        lines.append(f"""  static void t{i}() {{
    try {{
{decls}
      if (!({pre})) {{ System.out.println("{i}\\tSKIP"); return; }}
      final {rtype} result;
      try {{ result = Subject.{spec['method']}({call}); }}
      catch (Throwable t) {{ System.out.println("{i}\\tEXC\\t" + t.getClass().getSimpleName()); return; }}
      boolean ok;
      try {{ ok = ({spec['assertion']}); }}
      catch (Throwable t) {{ System.out.println("{i}\\tASSERTEXC\\t" + String.valueOf(result)); return; }}
      System.out.println("{i}\\t" + (ok ? "OK" : "VIOLATION") + "\\t" + String.valueOf(result));
    }} catch (Throwable t) {{ System.out.println("{i}\\tHARNESSERR\\t" + t); }}
  }}""")
    lines.append("  public static void main(String[] a) {")
    lines += [f"    t{i}();" for i in range(len(inputs))]
    lines.append("  }\n}")
    return "\n".join(lines)


def run(spec, subject_source, inputs, timeout=60):
    """Return a list of dicts {status, result} per input.
    status: SKIP | OK | VIOLATION | EXC | ASSERTEXC | HARNESSERR."""
    if not inputs:
        return []
    with tempfile.TemporaryDirectory() as d:
        with open(os.path.join(d, "Subject.java"), "w") as f:
            f.write(subject_source)
        with open(os.path.join(d, "Harness.java"), "w") as f:
            f.write(build_harness(spec, inputs))
        c = subprocess.run(["javac", "Subject.java", "Harness.java"], cwd=d,
                           capture_output=True, text=True, timeout=timeout)
        if c.returncode != 0:
            raise HarnessError(c.stderr.strip()[:600])
        try:
            r = subprocess.run(["java", "-cp", d, "Harness"], capture_output=True, text=True,
                               timeout=timeout)
        except subprocess.TimeoutExpired:
            raise HarnessError("timeout while running the subject (possible infinite loop)")
    out = [None] * len(inputs)
    for line in r.stdout.splitlines():
        parts = line.split("\t")
        if len(parts) >= 2 and parts[0].isdigit():
            out[int(parts[0])] = {"status": parts[1], "result": parts[2] if len(parts) > 2 else None}
    for i, o in enumerate(out):
        if o is None:
            out[i] = {"status": "HARNESSERR", "result": r.stderr.strip()[:200]}
    return out
