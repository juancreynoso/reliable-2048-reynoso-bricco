# OASIs report: Cell.mergeWith (plausible postcondition, hidden overflow)

Method: `static int mergeValue(int a, int b)`  
Assertion under review: `(long) result == 2L * a`  
Precondition: `a == b && a >= 2 && (a & (a - 1)) == 0`  
Inputs executed: 18

## Possible false positive (assertion too strong)

- input `[1073741824, 1073741824]` returns `-2147483648` and violates the assertion

If these inputs are valid, either the assertion is too strong or the program has a bug.

## Possible false negative (assertion too weak)

No surviving non-equivalent mutant found.

Killed mutants: 3. Discarded mutants: 2
- discarded: Added static call counter that increments on each call, introducing a side effect. (behaves like the original on every input tried (possibly an equivalent mutant))
- discarded: Added static flag that is set on first call, introducing a side effect. (behaves like the original on every input tried (possibly an equivalent mutant))

## LLM feedback

The evidence shows that for input a = b = 1073741824 (2^30), the method returns -2147483648 due to 32-bit signed integer overflow, while the assertion expects the mathematical result 2147483648. Since the precondition allows a up to 2^30 (the largest power of two that fits in an int), overflow is a defined behavior of the current implementation. The assertion is therefore too strong: it assumes the mathematical doubling without overflow, but the program follows Java's int semantics where overflow wraps around. The developer should decide whether to weaken the assertion to match the actual overflow behavior, strengthen the precondition to exclude values that cause overflow, or change the method to use a wider type (e.g., long).

## Suggested refinements (the user decides)

- `result == 2 * a`
- `(long) result == (int)(2L * a)`
- `result == (a << 1)`

---

