"""Pipeline tests with a scripted fake LLM (they check the tool, not any real model).

    python3 -m unittest oasis/test_oasis.py
"""
import json
import os
import sys
import unittest

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import refiner as oasis


class FakeLLM:
    model = "fake"

    def __init__(self, inputs, mutants):
        self.inputs, self.mutants = inputs, mutants

    def chat(self, system, user):
        if "TOO STRONG" in user:
            return "```json\n" + json.dumps({"inputs": self.inputs}) + "\n```"
        if "TOO WEAK" in user:
            return json.dumps({"mutants": self.mutants})
        return json.dumps({"feedback": "fake feedback", "suggestions": ["true"]})


def load(case):
    d = os.path.join(HERE, "cases", case)
    spec = json.load(open(os.path.join(d, "case.json")))
    return spec, open(os.path.join(d, spec["source"])).read()


SRC = "public class Subject { static boolean canMerge(int a, int b) { %s } }"


class OasisTest(unittest.TestCase):
    def test_too_strong_assertion_gives_counterexamples(self):
        spec, src = load("cell_equals")
        r = oasis.analyse(FakeLLM([[8, 8], [2, 2], [3, 3], [0, 0], ["x", 1], [4]], []), spec, src,
                          spec["assertion"], 10, 0, log=lambda *_: None)
        got = [c["input"] for c in r["strong"]]
        self.assertIn([8, 8], got)
        self.assertIn([0, 0], got)
        self.assertNotIn([2, 2], got)     # satisfies the assertion
        self.assertNotIn([3, 3], got)     # violates the precondition: skipped
        self.assertEqual(r["inputs_tried"], 4)  # malformed inputs dropped

    def test_overflow_found_in_plausible_assertion(self):
        spec, src = load("merge_value")
        r = oasis.analyse(FakeLLM([[2, 2], [1073741824, 1073741824]], []), spec, src,
                          spec["assertion"], 10, 0, log=lambda *_: None)
        self.assertEqual([c["input"] for c in r["strong"]], [[1073741824, 1073741824]])
        self.assertEqual(r["strong"][0]["result"], "-2147483648")

    def test_weak_assertion_surviving_mutants(self):
        spec, src = load("can_merge")
        mutants = [
            {"description": "always false", "source": SRC % "return false;", "distinguishing_input": [2, 2]},
            {"description": "ignores zeros", "source": SRC % "return a == b;", "distinguishing_input": [0, 0]},
            {"description": "merges different cells", "source": SRC % "return a != 0 && b != 0;",
             "distinguishing_input": [2, 4]},
            {"description": "equivalent", "source": SRC % "if (a == 0 && b == 0) return false; return a == b;",
             "distinguishing_input": [2, 2]},
            {"description": "broken", "source": "this is not java", "distinguishing_input": [2, 2]},
        ]
        r = oasis.analyse(FakeLLM([[2, 2], [2, 4], [0, 0]], mutants), spec, src,
                          spec["assertion"], 10, 5, log=lambda *_: None)
        survivors = {m["description"] for m in r["weak"]}
        self.assertEqual(survivors, {"always false"})
        # a==b returns true on (0,0), which violates `a >= 2`: killed
        self.assertEqual({m["description"] for m in r["killed"]},
                         {"ignores zeros", "merges different cells"})
        reasons = {d["description"] for d in r["discarded"]}
        self.assertEqual(reasons, {"equivalent", "broken"})


if __name__ == "__main__":
    unittest.main()
