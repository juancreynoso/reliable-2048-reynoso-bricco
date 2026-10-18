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


**PITest mutation score**, measured with `mvn pitest:mutationCoverage -DtargetTests=<technique's test classes>`:

| Class | Manual | Randoop | EvoSuite |
|---|:---:|:---:|:---:|
| Board | 83% (145/175) | not reported (excluded) | **85% (149/175)** |
| Cell  | 74% (26/35)   | **83% (29/35)**         | 69% (24/35)    |

Note that:

- They are not directly comparable to the Phase 2 figures in `TESTING-RESULTS.md` (Board 94%, Cell 100%). Those were measured before `repOK()` existed, so the classes now have more mutable code: 175 mutants on `Board` instead of 155, and 35 on `Cell` instead of 23.
- The whole drop in the manual column is `repOK()`: 21 of `Board`'s mutants and 8 of `Cell`'s come back as `NO_COVERAGE`, because no hand-written test ever calls `repOk()`. The generated suites call it constantly — 3,534 references across Randoop's `Cell` suite, 26 across EvoSuite's. That's why EvoSuite edges past the manual suite on `Board` despite being clearly behind it in branch coverage.

Randoop's `Board` score isn't reported because we excluded that suite in `pom.xml`: its non-determinism (Phase 3.1) broke the build.

### EvoSuite vs. Randoop comparison

| | Randoop | EvoSuite |
|---|---|---|
| Strategy | Feedback-directed **random** exploration — builds call sequences at random, guided only by what compiles/executes without error | **Search-based** (genetic algorithm) — evolves a population of candidate test suites against a fitness function (coverage) |
| Goal | None explicit — accumulate as many valid sequences as the time budget allows | Explicit — maximize coverage (line/branch/exception/weak-mutation/...) |
| Test count, same-ish budget | Hundreds (409 `Cell` / 74 `Board` in 10s) | Far fewer, but each one earns its place (24 `Cell` / 49 `Board` in 60s) |
| Determinism | None — plain JUnit; `Board`'s suite is genuinely flaky on rerun (`Math.random()`) | Mocks `Math.random()` (`mockJVMNonDeterminism`) through its own runner/classloader — tests replay deterministically as generated |
| Oracles | Regression assertions from observed behavior | Also regression assertions from observed behavior — same fundamental limitation |
| Readability | Straightforward, one call per line, easy to follow | Mixed — some clean, some fragile or confusing |
| Bugs found | Undocumented `NullPointerException` in `Cell.canMergeWith(null)`/`mergeWith(null)` | Same `NullPointerException`, found independently |


### Bugs found

- **`Cell.canMergeWith(null)` / `Cell.mergeWith(null)` throw an undocumented `NullPointerException`:**
  ```java
  Cell cell = Cell.EMPTY;
  cell.mergeWith(null); // NullPointerException — not documented in the Javadoc
  ```
  Found independently by Randoop (Phase 3.1) and EvoSuite (`Cell_ESTest.test04`/`test05`). Not fixed yet — `Board` never calls these
  with a null argument, so it doesn't affect gameplay, but the contract should either be documented (`@throws NullPointerException`) or defended against explicitly.
- `Cell`'s constructor didn't validate "power of two", only non-negativity — caught while implementing `repOK()`. See `TESTING-RESULTS.md`, Phase 3.2. *(Fixed in Assignment 2, listed here for completeness)*

## Phase 2: Fuzzing

### How the fuzzer works

`fuzzer.py` follows the Fuzzing Book's `Runner`/`Fuzzer` split:

- `CLIRunner` launches `ar.edu.unrc.game2048.MainCLI` as a subprocess, feeds it a string on stdin, and classifies the outcome as `PASS` (clean exit, no stderr), `FAIL` (non-zero exit code or stderr output — including an `AssertionError`), or `UNRESOLVED` (10s timeout).
- `RandomFuzzer.fuzz()` (implemented as part of this assignment) picks a random sequence length `n` uniformly between `min_length` and `max_length`, then builds the input by choosing `n` keys uniformly at random from `['a', 's', 'w', 'd']` (all four moves equally likely — there's no a priori reason to bias towards one direction), joins them one per line, and appends `q` to quit gracefully. E.g. for `n = 3`: `'w\na\nd\nq\n'`.

### Running without assertions (2.3)

20 trials, `min_length=10, max_length=50`: **20/20 PASS**, no crashes, no non-zero exits, no stderr output.

### Enhancing with `repOK()` (2.4)

`Board.repOk()` and `Cell.repOk()` (from Assignment 2) were reused as-is. Added one defensive check in `MainCLI.play()`, right after every move is applied:

```java
assert board.repOk() : "Board invariant violated after move " + input;
```

Updated `CLIRunner.COMMAND` to run with `-ea` so the assertion is actually enabled (verified independently: a throwaway `assert false` class 
confirms the JVM enforces assertions under `-ea` and reports `AssertionError` with a non-zero exit, which `CLIRunner` correctly classifies as `FAIL`).

Re-ran the fuzzer with `-ea`:
- 20 trials, `min_length=10, max_length=50` (same budget as 2.3): **20/20 PASS**.
- A larger batch, run separately for more confidence: 300 trials,
  `min_length=10, max_length=200`: **300/300 PASS**.

### Results

No crashes and no `repOK()` assertion failures were found in ~320 fuzzing trials across sequence lengths from 10 to 200 moves. `Board`'s 
invariant (non-null square grid, valid cells, non-negative score) held after every move exercised by the fuzzer — consistent with the fact 
that `Board`'s move methods already went through targeted manual tests, Randoop, and EvoSuite in the previous assignments, so the state space 
the fuzzer can reach through valid W/A/S/D/Q input alone doesn't overlap with the known undocumented-NPE bug (`canMergeWith(null)`), which 
requires an argument the CLI never constructs.

### Fuzzer vs. EvoSuite vs. Randoop

| | Randoop | EvoSuite | Fuzzer |
|---|---|---|---|
| Interface exercised | Java API (direct method calls) | Java API (direct method calls) | External — CLI stdin/stdout, as a real player would use it |
| Input generation | Feedback-directed random method sequences | Genetic search, guided by a coverage fitness function | Uninformed random move sequences (no feedback, no coverage guidance) |
| Oracle | Regression assertions (recorded behavior) | Regression assertions (recorded behavior) | Only a crash/non-zero-exit/stderr, unless invariants are wired in explicitly |
| Sensitivity to logic bugs | High — can call any public method directly, including edge-case argument combinations (e.g. `null`) | High — same reason | Low by default; increases only as far as `repOK()` assertions are actually placed in the code path the CLI exercises |
| Bug found here | `canMergeWith(null)` NPE | Same `canMergeWith(null)` NPE (independently) | None — the CLI's input space never reaches that code path |

The fuzzer is the weakest of the three at finding bugs *in this project*, precisely because it only reaches the program through the same narrow
interface a human player would use (four move keys + quit) — it can't construct the malformed arguments (like `null`) that Randoop and EvoSuite
found by calling methods directly. Its value is different: it validates that the *whole program*, not just individual methods, holds its 
invariants under long, unplanned sequences of real gameplay input — and `repOK()` is what turns "did it crash" into "did it become 
inconsistent," which is a strictly stronger check. For this program, wiring `repOK()` into `MainCLI` mattered more for *what the fuzzer could detect* than anything about the fuzzer's generation strategy itself.

## Reflections

**Which technique was most effective for this program?** We separate the meaning of effective in the following three items:

- **Coverage**: the hand-written suite still wins (100%/96% instruction/branch on `Board`, vs EvoSuite's 96%/89% and Randoop's 87%/80%). It's the only one that builds the specific board states (merges, losing boards, full boards) that Evosuite or Randoop rarely do.
- **Mutation score**: the generators win. EvoSuite takes `Board` (85% vs 83%) and Randoop takes `Cell` (83% vs 74%), both beating the manual suite on exactly the code the humans forgot to test. We wrote `repOK()` and never wrote a single test for it; the generators exercised it thousands of times for free, just by calling every public method they could reach. That's the most useful thing we got out of this assignment: not a bug, but proof of a blind spot in our own suite.
- **Bug finding**: Randoop and EvoSuite tie — both independently found the undocumented `NullPointerException` in `canMergeWith(null)`/`mergeWith(null)`. The fuzzer found nothing, and structurally couldn't: the CLI only accepts four move keys, so it can never
hand a `null` to anything.

As automated bug-finders we would rank them **1) EvoSuite, 2) Randoop 3) Fuzzing**, but none of them replaces the manual suite, they complement it and they are different also between them. 
The generators are good at breadth (every public method, odd arguments, boundary values) and bad at intent: every oracle they produce is a recording of current behavior, so they catch *regressions* and *crashes*, never "this answer is wrong".

The exception is the fuzzer with `repOK()` enabled, the only setup where an automated tool checked a property we specified ourselves. It never fired here, but fuzzing as random input in addition to hand-written invariant can find bugs that we are not looking for.


# Assignment 4 Report — Oracle Generation with Daikon

## Commands executed

Chicory runs tests through `org.junit.runner.JUnitCore`, so `BoardTest` and `CellTest` were converted to JUnit 4.

Trace from the manual test suite:
```bash
./mvn8 -o clean test-compile
mvn -o dependency:build-classpath -q -DforceStdout -Dmdep.outputFile=/tmp/cp.txt
java -cp "lib/daikon.jar:target/classes:target/test-classes:$(cat /tmp/cp.txt)" daikon.Chicory \
     --ppt-select-pattern="ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell" \
     --output-dir=daikon-traces \
     org.junit.runner.JUnitCore ar.edu.unrc.game2048.BoardTest ar.edu.unrc.game2048.CellTest
java -cp "lib/daikon.jar:target/classes" daikon.Daikon \
     -o daikon-traces/JUnitCore.inv.gz daikon-traces/JUnitCore.dtrace.gz > daikon-output.txt
```

Broadened trace (Phase 3.3), adding 40 fuzzed games of `MainCLI`:
```bash
python3 generateFuzzTraces.py
java -Xmx4g -cp "lib/daikon.jar:target/classes" daikon.Daikon \
     -o daikon-traces/JUnitCoreAndFuzzer.inv.gz \
     daikon-traces/JUnitCore.dtrace.gz daikon-traces/fuzzer/*.dtrace.gz > daikon-output-fuzzer.txt
```

## Phase 3.3: Broadening the trace with the fuzzer

`generateFuzzTraces.py` reuses `RandomFuzzer` from Assignment 3 (seed 42, 50–400 moves per game) and plays 40 games of `MainCLI` under Chicory, one trace file per game. It sets `JAVA_TOOL_OPTIONS=-ea` so the `assert board.repOk()` in `MainCLI` runs, which puts `repOk()` in the trace for the first time (no manual test calls it). All 40 games finished without violating `repOk()`, with final scores between 300 and 2240.

| Invariant | Tests only | Tests + fuzzer | Result |
|---|:---:|:---:|---|
| `Board`: `score one of { 0, 4 }` | ok | x | Spurious, eliminated |
| `Board`: `DEFAULT_SIZE >= score` | ok | x | Spurious, eliminated |
| `Board`: `size >= score` | ok | x | Spurious, eliminated |
| `moveUp()` ENTER: `score == 0` | ok | x | Spurious precondition, eliminated |
| `Board`: `score >= 0` | x | ok | New and correct — the `score >= 0` clause of our `repOK()` |
| `Board`: `size one of { 2, 4, 5 }` | ok | ok | Spurious, survives |
| `Board`: `WINNING_VALUE > size` | ok | ok | Spurious, survives |
| `Board`: `score % DEFAULT_SIZE == 0` | x | ok | New, too strong |
| `Cell`: value is a power of two | x | x | Still not inferred |
| `repOk()` EXIT: `grid == orig(grid)`, `score == orig(score)` | — | ok | New and useful: `repOk()` has no side effects |

Broadening the trace only removed the spurious invariants about what the new source of executions varies. The fuzzer plays long games, so the score-related ones went away, but `MainCLI` always builds a 4x4 board, so the size-related ones survived. The `Cell` case shows that more data doesn't help when the property can't be expressed with Daikon's templates.

`score % DEFAULT_SIZE == 0` (score is a multiple of 4) holds in every real game, since tiles spawn as 2 or 4 and every merge adds a power of two that is at least 4. But with the original `Cell.repOk()` it was not a valid class invariant: `new Cell(1)` passed `repOK()` (1 = 2⁰), and merging two of them through the public API gave a score of 2 with `repOk()` still true. That gap is what led to the `Cell.repOk()` change described in Phase 4.1.

## Phase 3.2: Classification of inferred invariants

All invariants below come from `daikon-output-fuzzer.txt` (tests + 40 fuzzed games), the richest of the two runs. "Spurious" means true for the observed runs but not a property of the program.

### `Cell`

| # | Program point | Invariant | Classification | Reasoning |
|---|---|---|---|---|
| 1 | `OBJECT` | `this.value >= 0` | Correct and useful | First clause of `repOk()`. A negative value would be a real bug (the constructor rejects it). |
| 2 | `isEmpty()` EXIT | `(this.value == 0) <==> (return == true)` | Correct and useful | The complete specification of `isEmpty()`, as a biconditional. Violating it would be a real bug. |
| 3 | `mergeWith()` EXIT | `2 * this.value - return.value == 0` | Correct and useful | The actual postcondition of a merge: the result is double the operand. Daikon found it without being told. |
| 4 | `mergeWith()` ENTER | `this.value == other.value`, `this.value >= 2`, `this.value is a power of 2` | Correct and useful | The real precondition, and it matches `canMergeWith()`. It also shows that merged cells are never empty. |
| 5 | `canMergeWith()` EXIT | `(return == true) ==> this.value == other.value`, `this.value >= 2` | Correct and useful | Soundness half of the spec: it never says "mergeable" for different or empty cells. The converse is not at the method-level EXIT because two empty cells are equal but not mergeable. |
| 6 | `getValue()` EXIT | `this.value == return`, `return >= 0` | Correct but trivial | Restates the getter's body. |
| 7 | `hashCode()` ENTER | `this.value one of { 0, 2, 4 }` | Too strong / spurious | Only those values were hashed in the traces. Any power of two is valid. |
| 8 | `equals()` EXIT | `(return == true) ==> this.value one of { 2, 4, 2048 }` | Too strong / spurious | Artefact of the few values compared in tests. `Cell(8).equals(Cell(8))` is true. |
| 9 | `OBJECT` | *(missing)* `value is a power of 2` | Not inferred | It appears at the `EXIT` of many methods, but never as a class invariant (see 4.1). |

### `Board`

| # | Program point | Invariant | Classification | Reasoning |
|---|---|---|---|---|
| 1 | `OBJECT` | `this.score >= 0` | Correct and useful | `score` clause of `repOk()`. Only inferred after adding the fuzzer (the tests never produce a score other than 0 or 4). |
| 2 | `OBJECT` | `this.size == size(this.grid[])` | Correct and useful | `grid.length == size` clause of `repOk()`. |
| 3 | `OBJECT` | `this.grid != null`, `this.grid[] elements != null` | Correct but trivial | Both are clauses of `repOk()`, but a null row or grid would crash on the first access anyway. |
| 4 | `OBJECT` | `this.size one of { 2, 4, 5 }` | Too strong / spurious | Only the sizes that the tests build. `Board(int)` accepts other sizes, and the fuzzer always uses 4. |
| 5 | `OBJECT` | `WINNING_VALUE > this.size` | Too strong / spurious | Compares two unrelated constants. It holds only for the sizes that were tried. |
| 6 | `OBJECT` | `this.score % this.size == 0` | Too strong / spurious | Holds only because every size-2 or size-5 board in the traces has score 0. A 5x5 board with score 4 (one merge of two 2s) violates it. |
| 7 | `OBJECT` | `this.score % DEFAULT_SIZE == 0` | Correct in practice, but accidental | Every merge adds a value ≥ 4 that is a power of two, so the score is a multiple of 4. It only held for *valid* cells after the `Cell.repOk()` fix (with `Cell(1)` it did not). The link to `DEFAULT_SIZE` is a coincidence of the number 4, so it is not worth encoding as a spec. |
| 8 | `collapseLine()` EXIT | `this.score >= orig(this.score)` | Correct and useful | The score never decreases. This is a property of the program that `repOk()` cannot express, because it relates two states. |
| 9 | `addRandomTile()` EXIT | `this.score == orig(this.score)`, `this.grid == orig(this.grid)` | Correct and useful | Spawning a tile never changes the score. |
| 10 | `repOk()` EXIT | `grid == orig(grid)`, `score == orig(score)` | Correct and useful | `repOk()` has no side effects, which is what an oracle needs. |

## Phase 4.1: Daikon vs. `repOk()`

**What Daikon rediscovered.** Of the `repOk()` clauses:

| `repOk()` clause | Daikon |
|---|---|
| `Cell`: `value >= 0` | Inferred (`Cell:::OBJECT`) |
| `Board`: `grid != null` | Inferred |
| `Board`: `grid.length == size` | Inferred (`this.size == size(this.grid[])`) |
| `Board`: `score >= 0` | Inferred, only with the fuzzer |
| `Board`: cells are not null | Inferred (`this.grid[] elements != null`) |
| `Board`: `size > 0` | Not exactly: the traces only give `size one of { 2, 4, 5 }`, which implies it but is spurious |

**What Daikon missed, and why.**
- *`value` is a power of two as a class invariant.* Daikon has a `is a power of 2` template and finds it at many method exits, but at `OBJECT` the traces contain `0`, which is not a power of two. The only expression that holds at all points is the disjunction `value == 0 || value is a power of 2`, and Daikon did not report it at `OBJECT` in our output (it only reports a disjunction when a single template covers it). `repOk()` states it directly.
- *`grid[r].length == size` for every row, and `every cell satisfies repOk()`.* They are universally quantified over a two-dimensional array. The only array properties in the output are one-dimensional ones (`elements != null`, `size(...)`), so it did not state them.
- *`size > 0`* and bounds in general: Daikon only reports what the traces show, and it saw a few sizes.

**What Daikon found that `repOk()` lacked.** In the `EXIT` of `isEmpty()`, `canMergeWith()`, `mergeWith()` and `equals()`, Daikon reports `this.value >= 2` for every non-empty cell, which is more than `repOk()` required: the old check accepted `Cell(1)` (1 = 2⁰, so `(1 & 0) == 0`). That gap is real: with `setCell(r, c, new Cell(1))`, merging two such cells gave a score of 2, so a score that is not a multiple of 4 was possible while `repOk()` still returned true. The same gap made `score % DEFAULT_SIZE == 0` look "too strong", although it was true for every sensible game.

**Update made to `repOk()`.** `Cell.repOk()` now requires `value == 0 || (value >= 2 && (value & (value - 1)) == 0)`:
- `CellTest` gets two tests: one for the accepted values (`0`, `2`, `2048`) and one asserting that `new Cell(1).repOk()` is `false`.
- The Randoop regression tests record behaviour, so six assertions that recorded `Cell(1).repOk() == true` (four in `randoopTests/cell/RegressionTest0.java`, two in `RegressionTest1.java`) now expect `false`. Those assertions were recording the gap, not a requirement.
- `Board.repOk()` is unchanged, since it already delegates to `Cell.repOk()` for every cell.
- The `Cell(int)` constructor still accepts 1. We kept it as it was (a cell of 1 can still be built, but is reported as invalid by `repOk()`), because changing the constructor is an API change that Assignment 4 does not ask for.

The traces do not contain any `Cell(1)`, so this change does not alter Daikon's output for the existing traces.

## Phase 4.2: Daikon vs. manual and automated oracles

| Source | What it gave us on 2048 |
|---|---|
| Manual assertions (`CellTest`, `BoardTest`) | Precise and readable (they tell what the game should do), but they cover only the cases we thought of. |
| `repOk()` | The most valuable single oracle: it is checked at every step of every fuzzed game (`assert board.repOk()` in `MainCLI`), and writing it exposed what a valid state is. Its limit is the same as the manual tests: it only contains what we thought of (the `Cell(1)` gap). |
| Randoop assertions | Thousands of assertions, almost all recording the current output. They pass by construction, and when `Cell.repOk()` changed, six of them had to be edited because they had recorded the old behaviour. Good for regression, not for finding errors. |
| EvoSuite assertions | Same nature as Randoop, with better coverage but not more meaning. |
| Daikon invariants | They generalise over many runs and found properties that nobody wrote: the score never decreases, `addRandomTile` and `repOk` do not change the score, `mergeWith` doubles the value, the exact precondition of `mergeWith`. Many are spurious or trivial and need a human to filter them. |

**Which was most useful?** For this program, `repOk()` combined with the fuzzer produced the most useful oracles, because it expresses intent, it is cheap to run on any state, and an automated tool did exercise it on 40 long games. Daikon comes second, and it is the best at *suggesting* oracles: it pointed at the `value >= 2` gap in `repOk()`, which none of the other three sources revealed. Its output is only as good as its traces: with the unit tests alone, it inferred sizes and scores that the tests happened to use, and broadening the traces removed only those that the new runs varied. The most effective use is the combination: Daikon proposes, a person decides which proposals become part of `repOk()`, and the fuzzer then enforces them.
