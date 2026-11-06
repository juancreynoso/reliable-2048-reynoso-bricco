# OASIs report: Cell.mergeWith (plausible postcondition, hidden overflow)

Method: `static int mergeValue(int a, int b)`  
Assertion under review: `(long) result == 2L * a`  
Precondition: `a == b && a >= 2 && (a & (a - 1)) == 0`  
Inputs executed: 2

## Possible false positive (assertion too strong)

- input `[1073741824, 1073741824]` returns `-2147483648` and violates the assertion

If these inputs are valid, either the assertion is too strong or the program has a bug.

## Possible false negative (assertion too weak)

No surviving non-equivalent mutant found.

Killed mutants: 1. Discarded mutants: 4
- discarded: Returns 0 for the maximum power of two (2^30) instead of the overflowed value. (behaves like the original on every input tried (possibly an equivalent mutant))
- discarded: Returns the input value (2^30) instead of doubling it for the maximum power of two. (behaves like the original on every input tried (possibly an equivalent mutant))
- discarded: Returns a*2+1 for the maximum power of two, differing by one from the overflowed result. (behaves like the original on every input tried (possibly an equivalent mutant))
- discarded: Introduces a side effect (static counter increment) on every valid input while preserving the return value. (behaves like the original on every input tried (possibly an equivalent mutant))

## LLM feedback

The evidence shows that for input a = b = 1073741824 (2^30), the method returns -2147483648 due to integer overflow, while the assertion expects 2147483648. This indicates the assertion is too strong because it does not account for the wrapping behavior of Java's int arithmetic. The program correctly implements doubling with int overflow, so the assertion should be refined to match the actual int result.

## Suggested refinements (the user decides)

- `result == a + a`
- `result == (int)(2L * a)`
- `result == 2 * a`

---

