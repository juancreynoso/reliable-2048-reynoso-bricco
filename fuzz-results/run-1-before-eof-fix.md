# Fuzzing campaign summary

- Budget: 10.0 min (elapsed 600 s), workers: 12, master seed: 278198182
- Classes: `<snapshot of target/classes before the fix>`
- Games: 28682, total move lines sent: 29507689
- Games from a random board: 14277, from a grammar board: 14405
- Games whose input does not end with q (EOF): 11530
- PASS: 28375, FAIL: 307, UNRESOLVED: 0

## Distinct failures (1)

### 1. exit 1: Exception in thread "main" java.util.NoSuchElementException: No line found

- Outcome: FAIL, occurrences: 307
- Detail: `Exception in thread "main" java.util.NoSuchElementException: No line found | 	at java.util.Scanner.nextLine(Scanner.java:1540) | 	at ar.edu.unrc.game2048.MainCLI.play(MainCLI.java:52) | 	at ar.edu.unrc.game2048.MainCLI.main(MainCLI.java:119)`
- Seed: 2048400590
- Board: `random (from seed)`
- Minimal input (0 lines): `''`
- Repro: `java -ea -Dseed=2048400590 -cp <snapshot of target/classes before the fix> ar.edu.unrc.game2048.MainCLI < fuzz-results/run-1/failures/1.min.input`

