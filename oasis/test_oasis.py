"""Tests of the tool with a fake LLM (they check the tool, not a real model).

    python3 -m unittest oasis/test_oasis.py
"""
import json
import os
import sys
import unittest

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import refiner as oasis


def fake_llm(inputs, mutants):
    """An LLM that always proposes the given inputs and mutants."""
    def ask(prompt):
        if "TOO STRONG" in prompt:
            return {"inputs": inputs}
        if "TOO WEAK" in prompt:
            return {"mutants": mutants}
        return {"feedback": "fake feedback", "suggestions": ["true"]}
    return ask


def load(name):
    folder = os.path.join(HERE, "cases", name)
    with open(os.path.join(folder, "case.json")) as f:
        case = json.load(f)
    with open(os.path.join(folder, case["source"])) as f:
        return case, f.read()


def analyse(name, inputs, mutants=()):
    case, source = load(name)
    return oasis.analyse(case, source, case["assertion"], llm=fake_llm(inputs, list(mutants)))


CAN_MERGE = "public class Subject { static boolean canMerge(int a, int b) { %s } }"


class OasisTest(unittest.TestCase):
    def test_too_strong_assertion_gives_inputs_that_violate_it(self):
        r = analyse("cell_equals", [[8, 8], [2, 2], [3, 3], [0, 0], ["x", 1], [4]])
        violating = [inputs for inputs, _ in r["violations"]]
        self.assertEqual(violating, [[8, 8], [0, 0]])   # (2,2) satisfies it, (3,3) is not valid
        self.assertEqual(r["tests"], 4)                  # malformed inputs are dropped

    def test_overflow_is_found_with_a_plausible_assertion(self):
        r = analyse("merge_value", [[2, 2], [1073741824, 1073741824]])
        self.assertEqual(r["violations"], [([1073741824, 1073741824], "-2147483648")])

    def test_weak_assertion_lets_mutants_survive(self):
        r = analyse("can_merge", [[2, 2], [2, 4], [0, 0]], [
            {"description": "always false", "source": CAN_MERGE % "return false;", "input": [2, 2]},
            {"description": "ignores zeros", "source": CAN_MERGE % "return a == b;", "input": [0, 0]},
            {"description": "merges different", "source": CAN_MERGE % "return a != 0 && b != 0;", "input": [2, 4]},
            {"description": "same as original",
             "source": CAN_MERGE % "if (a == 0 && b == 0) return false; return a == b;", "input": [2, 2]},
            {"description": "broken", "source": "this is not java", "input": [2, 2]},
        ])
        self.assertEqual(r["mutants"], {"always false": "survives",
                                        "ignores zeros": "killed",       # true on (0,0) violates a >= 2
                                        "merges different": "killed",
                                        "same as original": "equivalent?",
                                        "broken": "does not compile"})

    def test_a_mutant_that_differs_where_the_original_violates_is_not_equivalent(self):
        body = ("public class Subject { static int mergeValue(int a, int b) { "
                "if (a == 0 && b == 0 || a != b) throw new IllegalArgumentException(); %s } }")
        big = [1073741824, 1073741824]
        r = analyse("merge_value", [[2, 2], big], [
            {"description": "0 at 2^30", "source": body % "return a == 1073741824 ? 0 : a * 2;", "input": big},
            {"description": "a + a", "source": body % "return a + a;", "input": big},
        ])
        self.assertEqual(r["mutants"], {"0 at 2^30": "killed", "a + a": "equivalent?"})

    def test_a_mutant_accepted_where_the_original_violates_survives(self):
        r = analyse("cell_equals", [[8, 8]], [
            {"description": "false on 8,8", "input": [8, 8],
             "source": "public class Subject { static boolean cellEquals(int a, int b) { return a == b && a != 8; } }"},
        ])
        self.assertEqual(r["mutants"], {"false on 8,8": "survives"})


if __name__ == "__main__":
    unittest.main()
