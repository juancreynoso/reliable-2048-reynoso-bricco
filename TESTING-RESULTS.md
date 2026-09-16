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
