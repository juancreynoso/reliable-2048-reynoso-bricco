# Bug evidence

Error-revealing tests produced by the tools after the professor's feedback.
They are kept outside `src/test` on purpose: they fail (that is their point)
or no longer compile against the fixed code.

| Folder | Tool and setting | Code it ran on | What it shows |
|---|---|---|---|
| `randoop-checkrep/before-power-of-two-fix/` | Randoop + `@CheckRep` on `Cell.repOk()`, 1000 sequences, seed 42 | `Cell` at commit `e3cfe35` (constructor did not check powers of two) | 9 tests: `new Cell(10)`, `new Cell(100)`, ... break `repOk()` |
| `randoop-checkrep/before-cell-1-fix/` | same | `Cell` at commit `3558588^` (constructor accepted 1) | 3 tests: `new Cell(1)` breaks `repOk()` |
| `evosuite-contracts/before-fixes/` | EvoSuite `-Dcheck_contracts=true`, seed 42, 30000 statements | code before the fixes of this round | undocumented `NullPointerException` in `canMergeWith(null)`, `mergeWith(null)`, `new Board((Board) null)`; the other entries are documented exceptions (false positives, see the next row) |
| `evosuite-contracts/after-fixes/` | same | fixed code | only false positives: documented `IllegalArgumentException`/`IndexOutOfBoundsException` (EvoSuite 1.0.6 flags every unchecked exception, declared with `throws` or not), and "toString returns normally" on a 16x16 board, which is EvoSuite's own runtime stopping a loop after 10000 iterations, not an exception of our code |

In the original runs (Assignment 2) Randoop reported "all pass" on both buggy
versions of `Cell`: without `@CheckRep` it had no oracle for an invalid state.
