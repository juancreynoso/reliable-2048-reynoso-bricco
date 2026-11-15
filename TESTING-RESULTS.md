# Phase 1 Baseline Metrics


The results are shown below and obtained with the following excecutions:

```bash
mvn clean test jacoco:report
mvn pitest:mutationCoverage
```

### JaCoCo — Code Coverage

| Class            | Instruction | Branch | Line   | Method |
|-------------------|:-----------:|:------:|:------:|:------:|
| Cell               | 87% (98/113)  | 68% (15/22) | 90% (18/20)  | 100% (9/9)  |
| Board              | 88% (796/906) | 76% (88/116)| 89% (135/152)| 100% (24/24)|
| Board.Position     | 97% (60/62)   | 80% (8/10)  | 100% (10/10) | 100% (4/4)  |
| Board.Direction    | 0% (0/27)     | n/a         | 0% (0/2)     | 0% (0/1)    |
| MainCLI            | 0% (0/130)    | 0% (0/13)   | 0% (0/40)    | 0% (0/4)    |
| **Overall**        | **77% (954/1238)** | **69% (111/161)** | **73% (163/224)** | **88% (37/42)** |


### PITest — Mutation Analysis

| Class       | Line Coverage | Mutation Coverage | Test Strength |
|-------------|:--------------:|:------------------:|:--------------:|
| Board.java  | 90% (145/162)  | 61% (95/155)        | 69% (95/137)   |
| Cell.java   | 90% (18/20)    | 78% (18/23)          | 90% (18/20)    |
| MainCLI.java| 0% (0/40)      | 0% (0/21)            | n/a (0/0)      |
| **Overall** | **73% (163/222)** | **57% (113/199)** | **72% (113/157)** |

# Phase 2 Improved Metrics

After adding tests to `BoardTest.java` and `CellTest.java` (targeting the JaCoCo/PITest reports from the baseline) the results obtained with:

```bash
mvn clean test jacoco:report
mvn pitest:mutationCoverage
```

70 tests total (46 `BoardTest` + 24 `CellTest`), all passing.

`MainCLI` is excluded from JaCoCo and PITest scope because it's the CLI entry point, not unit testable.

### JaCoCo — Code Coverage

| Class            | Instruction | Branch | Line   | Method |
|-------------------|:-----------:|:------:|:------:|:------:|
| Cell               | 100% (126/126) | 100% (22/22) | 100% (20/20) | 100% (9/9)  |
| Board              | 100% (909/911) | 96% (112/116) | 99% (151/152) | 100% (24/24)|
| Board.Position     | 100% (73/73)   | 90% (9/10)   | 100% (10/10) | 100% (4/4)  |
| Board.Direction    | 0% (0/44)      | n/a          | 0% (0/2)     | 0% (0/1)    |
| **Overall**        | **96% (1108/1154)** | **96% (143/148)** | **98% (181/184)** | **97% (37/38)** |


### PITest — Mutation Analysis

| Class       | Line Coverage | Mutation Coverage | Test Strength |
|-------------|:--------------:|:------------------:|:--------------:|
| Board.java  | 99% (161/162)  | 94% (145/155)      | 94% (145/154)  |
| Cell.java   | 100% (20/20)   | 100% (23/23)       | 100% (23/23)   |
| **Overall** | **99% (181/182)** | **94% (168/178)** | **95% (168/177)** |

# Phase 3.1 — Randoop (First Run)

```bash
java -cp "lib/randoop-all-4.3.4.jar:target/classes" randoop.main.Main gentests \
  --testclass=ar.edu.unrc.game2048.Cell --time-limit=10 \
  --junit-output-dir=src/test/java --junit-package-name=randoopTests.cell

java -cp "lib/randoop-all-4.3.4.jar:target/classes" randoop.main.Main gentests \
  --testclass=ar.edu.unrc.game2048.Board --time-limit=10 \
  --junit-output-dir=src/test/java --junit-package-name=randoopTests.board
```

**Cell — 409 tests generated, all pass** (`mvn test
-Dtest=randoopTests.cell.RegressionTest0`). Fully deterministic. Every
exception found is either the documented `IllegalArgumentException`
(negative value / incompatible merge) or an **undocumented
`NullPointerException`** from `canMergeWith(null)`/`mergeWith(null)` — neither
method's Javadoc mentions it.

**Board — 74 tests generated, 17 fail on re-run** (`mvn test
-Dtest=randoopTests.board.RegressionTest0`). The failures show some
flakiness: `addRandomTile()` calls `Math.random()` with no
seed, so tests that hard-code exact tile placement can't reproduce on a
second run.

Since those failures are non-deterministic and were breaking the default
`mvn test`, `pom.xml` excluded `**/randoopTests/board/**` at this point; `randoopTests.cell` stayed in.
This exclusion only hid the flakiness; it was later fixed at its cause (see Phase 3.3).

**Coverage vs. hand-written suites** — Randoop-only run
(`-Dtest='randoopTests.cell.RegressionTest0,randoopTests.board.RegressionTest0'
-Dmaven.test.failure.ignore=true jacoco:report`) compared to Phase 2 above:

| Class | Instruction | Branch | Line | Method |
|---|:---:|:---:|:---:|:---:|
| Cell — Randoop        | 92%  | 100% | 95%  | 89%  |
| Cell — hand-written   | 100% | 100% | 100% | 100% |
| Board — Randoop       | 87%  | 80%  | 90%  | 92%  |
| Board — hand-written  | 100% | 96%  | 99%  | 100% |

Randoop gets close on both classes with just random exploration, but
hand-written still being better on every metric, since those tests target
the specific states (merges, losing-board, edge cases) is weird to see that the random sequences
from randoop construct those cases on their own.

# Phase 3.2 — repOK() and Randoop (Second Run)

Implemented `repOk()` on `Cell` and `Board`, checking the invariants already
documented in each class's Javadoc (`Cell`: value non-negative and, if
non-zero, a power of two; `Board`: non-null square grid, all cells non-null
and individually valid, non-negative score).

**Bug found while implementing `Cell.repOk()`**: the `Cell` constructor only
rejected negative values (`if (value < 0) throw ...`), but never checked that
the value is a power of two — even though the class Javadoc already promised
`@throws IllegalArgumentException if the value is negative or not a power of
two`. So `new Cell(97)` (and any other non-power-of-two value) didn't throw,
silently producing an invalid `Cell`. This explains why the Phase 3.1 Randoop
run for `Cell` reported "all pass" despite generating calls like `new
Cell(97)`: nothing was there yet to catch it as wrong. `Cell.repOk()` catches
it correctly (returns `false`), but the constructor itself should reject bad
input up front instead of only being able to be checked afterwards. Fixed by
adding the same bit trick used in `repOk()` as a second guard clause:
`if (value != 0 && (value & (value - 1)) != 0) throw new
IllegalArgumentException(...)`.

Re-ran Randoop with the same commands as Phase 3.1, after the fix:

**Cell — 585 tests generated, all pass** (`mvn test
-Dtest='randoopTests.cell.RegressionTest,randoopTests.cell.RegressionTest0,randoopTests.cell.RegressionTest1'`).
None of the newly generated sequences hit the power-of-two rejection path,
since the constructor now enforces the invariant directly instead of letting
invalid `Cell`s slip through and get recorded as "expected" behavior.

**Board — 197 tests generated, still flaky on re-run** (same non-determinism
as Phase 3.1, from `addRandomTile()`'s unseeded `Math.random()`). Unrelated
to the `repOk()` work; `Board` itself wasn't changed.

Full suite after the fix (`BoardTest`, `CellTest`, `randoopTests.cell.*`):
**655 tests, 0 failures, 0 errors**.

# Phase 3.3 — Fixing the flaky Board suite (seeded Random)

Excluding `randoopTests.board` from `mvn test` (Phase 3.1) avoided the flaky
tests but did not fix them. The cause was in the code under test, not in
Randoop: `Board.addRandomTile()` used `Math.random()`, a global generator with
no seed, so a fresh `Board` got different tiles on every run.

**Fix.** Each `Board` now has its own `java.util.Random` started from a seed:

- `Board(int size, long seed)` is a new constructor; `Board()` and
  `Board(int size)` use `Board.DEFAULT_SEED` (42).
- The generator is per board, not static, so the tiles of one board do not
  depend on how many boards were created before it (that would make test
  results depend on test order).
- The copy constructor starts its own generator from `DEFAULT_SEED`.
- `MainCLI` still plays a different game every time (it picks a new seed per
  game), and `-Dseed=N` replays a specific one.

**Randoop regenerated with a fixed seed.** `runRandoop.sh` generates both
classes with `--randomseed=42 --deterministic=true` and a limit of 1000
generated tests (`--generated-limit=1000 --time-limit=0`) instead of a time
limit, because a time limit stops at a different point on every run. Running the
script twice produced byte-identical test files.

- `--flaky-test-behavior=HALT`: Randoop re-runs the tests it generates, and if
  one fails it stops instead of writing it. This is how Randoop protects itself
  from flaky tests: it filters them after the fact, but it does not control the
  randomness of the code under test. That is why the seed had to go into `Board`.
- For `Board`: `--literals-level=NONE` and `--omit-field` on `WINNING_VALUE`,
  `MAX_INITIAL_TILE` and `DEFAULT_SEED`. Without them Randoop reused those
  constants as board sizes and built a 131072x131072 grid that never finished.
- The script copies the classes to a temp dir and runs Randoop there. Randoop's
  flaky filter compiles and runs the generated tests, and that step breaks when
  the path has spaces or accents, as this repo's path does.

**Results.** `Cell`: 538 tests (`RegressionTest0` + `RegressionTest1`).
`Board`: 516 tests. All pass, and `pom.xml` no longer excludes
`randoopTests/board`. Repeated runs of `./mvn8 clean test` give the same result:
**1220 tests, 0 failures, 0 errors** (Randoop, EvoSuite and hand-written suites).

**Coverage of the new Randoop suites** (`-Dtest='randoopTests.cell.RegressionTest0,randoopTests.cell.RegressionTest1,randoopTests.board.RegressionTest0,randoopTests.board.RegressionTest1' jacoco:report`):

| Class | Instruction | Branch | Line | Method |
|---|:---:|:---:|:---:|:---:|
| Cell — Randoop (seeded)  | 93% (172/185)  | 92% (33/36)   | 93% (25/27)   | 90% (9/10)  |
| Board — Randoop (seeded) | 82% (952/1156) | 76% (121/160) | 86% (163/190) | 93% (26/28) |

Board went down compared with Phase 3.1 (87% / 80% / 90% instructions /
branches / lines). Two reasons: `Board` has more code now (1156 instructions
against 911 in Phase 2), and without literals Randoop only builds boards from
the sizes it makes up itself, so it reaches fewer merge and game-over states.
That is the price of making the suite deterministic and making it finish.


# Assignment 3 - Evosuite  and Fuzzing
## Phase 1 - Run Evosuite

The results obtained after executing the script `runEvosuite.sh` that generate Evosuite tests were:

TARGET_CLASS| criterion |Coverage |Total_Goals| Covered_Goals
|---|:---:|:---:|:---:|:---:|
|ar.edu.unrc.game2048.Cell|LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH|0.9199404116683528|247|225|
|ar.edu.unrc.game2048.Board|LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH|0.9245340305710225|1393|1274|

### 1.2 Inspect the Generated Tests

- What kinds of inputs did EvoSuite generate?

There is a mixture of two types. Some reasonable values like `new Cell(2)`, `new Board(2)`, that we could write ourselves, and some unreasonable/extreme ones like `new Board(2048)` (a very very big board), `new Board.Position(-2603, -2603)` (negative coordinates), and `new Board((Board) null)` (copy constructor with null).

Something to note is that the number `2048` appears too many times, and that is not a coincidence: it's `Board.WINNING_VALUE`, a public constant in the code. EvoSuite seeds interesting literal constants it finds in the bytecode and reuses them as candidate inputs, which is why the same magic number keeps showing up in unrelated places.

- Are the test oracles (assertions) meaningful, or are they mostly regression assertions?

They are regression asserts, by design: EvoSuite runs the code, observes what it does, and writes the assertion that matches. We can see that in:
- `test10`: `Board board0 = new Board(2048)` - 0 asserts. It just constructs and that is it, the only "oracle" is that it didn't crash.
- `test45`: calls `board0.hashCode()` and discards the result without any assert over it.
- Counter-example: `test18` (`new Cell(196)` expects `IllegalArgumentException` with message "Cell value must be a power of two: 196") looks meaningful since it matches `Cell`'s documented contract, but it's generated the same way as the rest - EvoSuite just happened to observe the constructor rejecting it. If that check had a bug, EvoSuite would have recorded the buggy behavior as "correct" instead.

- Are there any tests that seem fragile or hard to understand?

Yes, a few, and they share the same root cause: `Board`'s random tile placement.
- `test23`: hardcodes the full `toString()` of a freshly created board as one giant string literal - unreadable, and conceptually fragile since it depends on exactly where `addRandomTile()` placed its tiles.
- `test48`: reads `board0.getCell(1, 1)` from a fresh board and asserts it equals `2`, assuming that specific cell got a tile at generation time.
- `test28`: creates `board0` and never uses it again (leftover noise from the genetic search), then writes `assertFalse(boolean1 == boolean0)` instead of the much clearer `assertTrue(boolean0)`.

These would normally make the suite flaky on every rerun, but they don't: the `@EvoRunnerParameters(mockJVMNonDeterminism = true, ...)` on the test class makes EvoSuite's own runner mock `Math.random()`, replaying the exact sequence it saw during generation. This is a real difference from Randoop, whose plain JUnit tests have no such mocking - which is exactly why the Randoop suite for `Board` (Phase 3.1) was flaky and this one wasn't. (Since Phase 3.3 `Board` no longer uses `Math.random()`; see section 1.4 for the regenerated suite.)


### 1.3 Run JaCoCo to measure coverage

Ran with: `./mvn8 clean test jacoco:report -Dtest='*ESTest'` to
use just tests generated by Evosuite.

With the `separateClassLoader = true` (EvoSuite generates by default)  JaCoCo reports 0% coverage for every class that classloader bypasses JaCoCo's instrumentation hook entirely. Then we had to flip it to `separateClassLoader = false` and the measurement was fixed. The flag was turned back to `true` after taking the measurement, so the committed `Cell_ESTest`/`Board_ESTest` keep the value EvoSuite generated.

| Class | Instruction | Branch | Line | Method |
|---|:---:|:---:|:---:|:---:|
| Cell — EvoSuite  | 98% (163/166) | 94% (30/32)  | 96% (24/25)  | 100% (10/10) |
| Board — EvoSuite | 96% (941/979) | 89% (121/136) | 95% (158/166) | 100% (25/25) |

**Comparison across all three techniques** (Manual = Assignment 1/Phase 2,
Randoop = Phase 3.1, both above):

| Class | Technique | Instruction | Branch | Line | Method |
|---|---|:---:|:---:|:---:|:---:|
| Cell  | Manual   | 100% | 100% | 100% | 100% |
| Cell  | Randoop  | 92%  | 100% | 95%  | 89%  |
| Cell  | EvoSuite | 98%  | 94%  | 96%  | 100% |
| Board | Manual   | 100% | 96%  | 99%  | 100% |
| Board | Randoop  | 87%  | 80%  | 90%  | 92%  |
| Board | EvoSuite | 96%  | 89%  | 95%  | 100% |

We could observate that:
- EvoSuite is located between Randoop and the hand-written suite on almost every
  metric, for both classes (closer to manual than Randoop is, which matches), that is because is searching for coverage instead of exploring at
  random.
- On `Board`, EvoSuite's branch coverage (89%) is well above Randoop's (80%)
  but still short of manual (96%) - same story as Randoop: the remaining gap
  is board states (merges, losing-board, edge cases) that are hard to reach
  by search/random exploration alone, and that the hand-written tests build
  deliberately.
- Method coverage is where EvoSuite matches manual exactly (100% on both
  classes). Randoop is the outlier there (89% on `Cell`).

### 1.4 Regenerated with a fixed seed (after Phase 3.3)

After the seeded `Random` in `Board` (Phase 3.3) and the `Cell(1)` fix, the
EvoSuite suites were regenerated for both classes with `runEvosuite.sh`. Settings
(explained in the script's comments):

- `-seed 42` with a budget in statements (`-Dstopping_condition=MaxStatements`),
  not in seconds. A time budget stops the search at a different point on every
  run, so a seed alone is not enough. With these settings the search is
  reproducible (same generations and same fitness). The order of the assertions
  in the output file can still change between runs.
- `-Dassertion_strategy=ALL`: keeps every assertion, since the default
  (`MUTATION`) filter is not deterministic.
- `-Dclient_on_thread=true`: the default separate client process talks to
  EvoSuite's master over RMI, which failed intermittently here.
- `Board` only: `-Dmax_int=16 -Dprimitive_pool=0 -Ddynamic_pool=0`, so EvoSuite
  does not reuse `2048` / `131072` (constants of `Board`) as board sizes.

**Flaky filter.** EvoSuite generated 57 tests for `Board` and wrote 55. The other
2 were dropped in its "Compiling and checking tests" step, where it re-runs the
generated tests and removes the unstable ones. So EvoSuite protects against
flakiness in two ways: it mocks non-determinism (`mockJVMNonDeterminism`:
`Math.random`, clock, files, network) and it filters out tests that still fail on re-run.

**EvoSuite's own coverage** (last two rows of `evosuite-report/statistics.csv`):
`Cell` 91.5% (241/267 goals), `Board` 83.0% (1274/1602 goals).

**JaCoCo coverage** (same method as 1.3: `separateClassLoader = false` only while
measuring, then back to `true`): `Cell_ESTest` has 26 tests and `Board_ESTest` has 55.

| Class | Instruction | Branch | Line | Method |
|---|:---:|:---:|:---:|:---:|
| Cell — EvoSuite (seeded)  | 98% (182/185)  | 92% (33/36)   | 96% (26/27)   | 100% (10/10) |
| Board — EvoSuite (seeded) | 84% (975/1156) | 78% (124/160) | 86% (163/190) | 96% (27/28)  |

`Board` coverage dropped (96% / 89% / 95% in section 1.3). This is a trade-off:
limiting integers to 16 keeps EvoSuite from building huge boards, which made the
generation slow and the tests heavy, but it also explores fewer inputs.

**Updated comparison** (all three suites measured on the current code, so
the numbers are comparable to each other but not to the older tables, because
`Board` and `Cell` have more code now):

| Class | Technique | Instruction | Branch | Line | Method |
|---|---|:---:|:---:|:---:|:---:|
| Cell  | Manual   | 92% | 89% | 93% | 100% |
| Cell  | Randoop  | 93% | 92% | 93% | 90%  |
| Cell  | EvoSuite | 98% | 92% | 96% | 100% |
| Board | Manual   | 99% | 90% | 97% | 100% |
| Board | Randoop  | 82% | 76% | 86% | 93%  |
| Board | EvoSuite | 84% | 78% | 86% | 96%  |

On `Board`, both generated suites are now well below the manual suite and close
to each other. On `Cell` the manual suite is no longer the best: it was 100%
on the old code, but no hand-written test builds a non-power-of-two cell
(e.g. `new Cell(3)`), so the guard added in Phase 3.2 (`Cell.java` line 38) is
never executed by it, while both generators reach it on their own.

