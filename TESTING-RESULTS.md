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
`mvn test`, `pom.xml` now excludes `**/randoopTests/board/**`; `randoopTests.cell` stays in.

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

These would normally make the suite flaky on every rerun, but they don't: the `@EvoRunnerParameters(mockJVMNonDeterminism = true, ...)` on the test class makes EvoSuite's own runner mock `Math.random()`, replaying the exact sequence it saw during generation. This is a real difference from Randoop, whose plain JUnit tests have no such mocking - which is exactly why the Randoop suite for `Board` (Phase 3.1) was flaky and this one isn't.


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

