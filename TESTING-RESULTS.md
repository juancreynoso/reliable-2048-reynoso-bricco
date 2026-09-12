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


