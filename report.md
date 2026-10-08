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

**PITest mutation score**, measured per technique against the *current* code
with `mvn pitest:mutationCoverage -DtargetTests=<that technique's test classes>`:

| Class | Manual | Randoop | EvoSuite |
|---|:---:|:---:|:---:|
| Board | 83% (145/175) | not reported (excluded) | **85% (149/175)** |
| Cell  | 74% (26/35)   | **83% (29/35)**         | 69% (24/35)    |

Note that:

- They are not directly comparable to the Phase 2 figures in `TESTING-RESULTS.md`
  (Board 94%, Cell 100%). Those were measured before `repOK()` existed, so
  the classes now have more mutable code: 175 mutants on `Board` instead of
  155, and 35 on `Cell` instead of 23.
- The whole drop in the manual column is `repOK()`: 21 of `Board`'s mutants
  and 8 of `Cell`'s come back as `NO_COVERAGE`, because **no hand-written
  test ever calls `repOk()`** (0 references in `BoardTest`/`CellTest`). The
  generated suites call it constantly — 3,534 references across Randoop's
  `Cell` suite, 26 across EvoSuite's — simply because it's a public method
  and they call everything they can reach. That's why EvoSuite edges past
  the manual suite on `Board` despite being clearly behind it on
  line/branch coverage.

Randoop's `Board` score isn't reported: that suite is excluded in `pom.xml`
because its non-determinism (Phase 3.1) broke the build, and PITest inherits
surefire's exclusions, so it never runs.

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

### How the fuzzer works

`fuzzer.py` follows the Fuzzing Book's `Runner`/`Fuzzer` split:

- `CLIRunner` launches `ar.edu.unrc.game2048.MainCLI` as a subprocess, feeds
  it a string on stdin, and classifies the outcome as `PASS` (clean exit, no
  stderr), `FAIL` (non-zero exit code or stderr output — including an
  `AssertionError`), or `UNRESOLVED` (10s timeout).
- `RandomFuzzer.fuzz()` (implemented as part of this assignment) picks a
  random sequence length `n` uniformly between `min_length` and `max_length`,
  then builds the input by choosing `n` keys uniformly at random from
  `['a', 's', 'w', 'd']` (all four moves equally likely — there's no a priori
  reason to bias towards one direction), joins them one per line, and
  appends `q` to quit gracefully. E.g. for `n = 3`: `'w\na\nd\nq\n'`.

### Running without assertions (2.3)

20 trials, `min_length=10, max_length=50`: **20/20 PASS**, no crashes, no
non-zero exits, no stderr output.

### Enhancing with `repOK()` (2.4)

`Board.repOk()` and `Cell.repOk()` (from Assignment 2) were reused as-is.
Added one defensive check in `MainCLI.play()`, right after every move is
applied:

```java
assert board.repOk() : "Board invariant violated after move " + input;
```

Updated `CLIRunner.COMMAND` to run with `-ea` so the assertion is actually
enabled (verified independently: a throwaway `assert false` class confirms
the JVM enforces assertions under `-ea` and reports `AssertionError` with a
non-zero exit, which `CLIRunner` correctly classifies as `FAIL`).

Re-ran the fuzzer with `-ea`:
- 20 trials, `min_length=10, max_length=50` (same budget as 2.3): **20/20 PASS**.
- A larger batch, run separately for more confidence: 300 trials,
  `min_length=10, max_length=200`: **300/300 PASS**.

### Results

No crashes and no `repOK()` assertion failures were found in ~320 fuzzing
trials across sequence lengths from 10 to 200 moves. `Board`'s invariant
(non-null square grid, valid cells, non-negative score) held after every
move exercised by the fuzzer — consistent with the fact that `Board`'s move
methods already went through targeted manual tests, Randoop, and EvoSuite in
the previous assignments, so the state space the fuzzer can reach through
valid W/A/S/D/Q input alone doesn't overlap with the known undocumented-NPE
bug (`canMergeWith(null)`), which requires an argument the CLI never
constructs.

### Fuzzer vs. EvoSuite vs. Randoop

| | Randoop | EvoSuite | Fuzzer |
|---|---|---|---|
| Interface exercised | Java API (direct method calls) | Java API (direct method calls) | External — CLI stdin/stdout, as a real player would use it |
| Input generation | Feedback-directed random method sequences | Genetic search, guided by a coverage fitness function | Uninformed random move sequences (no feedback, no coverage guidance) |
| Oracle | Regression assertions (recorded behavior) | Regression assertions (recorded behavior) | Only a crash/non-zero-exit/stderr, unless invariants are wired in explicitly |
| Sensitivity to logic bugs | High — can call any public method directly, including edge-case argument combinations (e.g. `null`) | High — same reason | Low by default; increases only as far as `repOK()` assertions are actually placed in the code path the CLI exercises |
| Bug found here | `canMergeWith(null)` NPE | Same `canMergeWith(null)` NPE (independently) | None — the CLI's input space never reaches that code path |

The fuzzer is the weakest of the three at finding bugs *in this project*,
precisely because it only reaches the program through the same narrow
interface a human player would use (four move keys + quit) — it can't
construct the malformed arguments (like `null`) that Randoop and EvoSuite
found by calling methods directly. Its value is different: it validates
that the *whole program*, not just individual methods, holds its invariants
under long, unplanned sequences of real gameplay input — and `repOK()` is
what turns "did it crash" into "did it become inconsistent," which is a
strictly stronger check. For this program, wiring `repOK()` into `MainCLI`
mattered more for *what the fuzzer could detect* than anything about the
fuzzer's generation strategy itself.

## Reflections

**Which technique was most effective for this program?** We separate the meaning of effective in the following:

- **Coverage**: the hand-written suite still wins (100%/96% instruction/branch
  on `Board`, vs EvoSuite's 96%/89% and Randoop's 87%/80%). It's the only one
  that deliberately builds the specific board states (merges, losing boards,
  full boards) that the generators rarely stumble into on their own.
- **Mutation score**: the generators win. EvoSuite takes `Board` (85% vs 83%)
  and Randoop takes `Cell` (83% vs 74%), both beating the manual suite on
  exactly the code the humans forgot to test. We wrote `repOK()` and never
  wrote a single test for it; the generators exercised it thousands of times
  for free, just by calling every public method they could reach. That's the
  most useful thing we got out of this assignment: not a bug, but proof of a
  blind spot in our own suite.
- **Bug finding**: Randoop and EvoSuite tie — both independently found the
  undocumented `NullPointerException` in
  `canMergeWith(null)`/`mergeWith(null)`. The fuzzer found nothing, and
  structurally couldn't: the CLI only accepts four move keys, so it can never
  hand a `null` to anything.

As automated bug-finders we would rank them **1) EvoSuite, 2) Randoop 3) Fuzzing**,
but none of them replaces the manual suite, they complement it and they are different also 
betwenn them. 
The generators are good at breadth (every public method, odd arguments, boundary
values) and bad at intent: every oracle they produce is a recording of
current behavior, so they catch *regressions* and *crashes*, never "this
answer is wrong".

The exception is the fuzzer with `repOK()` enabled, the only setup where an
automated tool checked a property we specified ourselves. It never fired
here, but fuzzing as random input in addition to hand-written invariant can
find bugs that we are not looking for.

