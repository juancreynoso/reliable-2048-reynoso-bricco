# Assignment 3 Report — Automated Test Generation and Fuzzing

## Phase 1: EvoSuite

### Coverage and mutation scores

**JaCoCo coverage**:

| Class | Technique | Instruction | Branch | Line | Method |
|---|---|:---:|:---:|:---:|:---:|
| Cell  | Manual (Assignment 1)   | 100% | 100% | 100% | 100% |
| Cell  | Randoop (Assignment 2)  | 92%  | 100% | 95%  | 89%  |
| Cell  | EvoSuite (Assignment 3) | 98%  | 94%  | 96%  | 100% |
| Board | Manual (Assignment 1)   | 100% | 96%  | 99%  | 100% |
| Board | Randoop (Assignment 2)  | 87%  | 80%  | 90%  | 92%  |
| Board | EvoSuite (Assignment 3) | 96%  | 89%  | 95%  | 100% |

EvoSuite also reports its own combined coverage (across LINE, BRANCH,
EXCEPTION, WEAKMUTATION, OUTPUT, METHOD, METHODNOEXCEPTION and CBRANCH
criteria together, via its own instrumentation, independent of JaCoCo):
**92.0%** (225/247 goals) for `Cell`, **92.5%** (1274/1393 goals) for `Board`.

**PITest mutation score** — only measured for the hand-written suite so far:

| Class | Line Coverage | Mutation Coverage | Test Strength |
|---|:---:|:---:|:---:|
| Board.java | 99% (161/162) | 94% (145/155) | 94% (145/154) |
| Cell.java  | 100% (20/20)  | 100% (23/23)  | 100% (23/23)  |

Mutation score wasn't separately isolated for the Randoop or EvoSuite suites —
PITest's `targetTests` filter in `pom.xml` doesn't currently reach
`randoopTests.*` sub-packages or `*_ESTest` classes. Worth extending if we
want that comparison too.

### EvoSuite vs. Randoop

| | Randoop | EvoSuite |
|---|---|---|
| Strategy | Feedback-directed **random** exploration — builds call sequences at random, guided only by what compiles/executes without error | **Search-based** (genetic algorithm) — evolves a population of candidate test suites against a fitness function (coverage) |
| Goal | None explicit — accumulate as many valid sequences as the time budget allows | Explicit — maximize coverage (line/branch/exception/weak-mutation/...) |
| Test count, same-ish budget | Hundreds (409 `Cell` / 74 `Board` in 10s) | Dozens (24 `Cell` / 49 `Board` in 60s) — far fewer, but each one earns its place |
| Determinism | None — plain JUnit; `Board`'s suite is genuinely flaky on rerun (`Math.random()`) | Mocks `Math.random()` (`mockJVMNonDeterminism`) through its own runner/classloader — tests replay deterministically as generated |
| Oracles | Regression assertions from observed behavior | Also regression assertions from observed behavior — same fundamental limitation |
| Readability | Straightforward, one call per line, easy to follow | Mixed — some clean, some fragile/confusing (dead variables, indirect asserts, huge hardcoded strings) |
| Bugs found | Undocumented `NullPointerException` in `Cell.canMergeWith(null)`/`mergeWith(null)` | Same `NullPointerException`, found independently |

Both tools rediscovered the exact same real bug independently
(`canMergeWith(null)`/`mergeWith(null)` throwing an undocumented NPE), which
is a good sign it's a genuine gap rather than a tooling artifact.

### Bugs found

- **`Cell.canMergeWith(null)` / `Cell.mergeWith(null)` throw an undocumented
  `NullPointerException`.** Minimal reproducer:
  ```java
  Cell cell = Cell.EMPTY;
  cell.mergeWith(null); // NullPointerException — not documented in the Javadoc
  ```
  Found independently by Randoop (Phase 3.1) and EvoSuite
  (`Cell_ESTest.test04`/`test05`). Not fixed yet — `Board` never calls these
  with a null argument, so it doesn't affect gameplay, but the contract
  should either be documented (`@throws NullPointerException`) or defended
  against explicitly.
- `Cell`'s constructor didn't validate "power of two", only non-negativity — caught
  while implementing `repOK()`. See `TESTING-RESULTS.md`, Phase 3.2.
  *(Fixed in Assignment 2, listed here for completeness)*

## Phase 2: Fuzzing

