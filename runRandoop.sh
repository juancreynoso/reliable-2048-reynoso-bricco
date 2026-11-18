#!/bin/bash
# Regenerates the Randoop tests for Cell and Board (src/test/java/randoopTests).
#
# - repOk() is annotated with @randoop.CheckRep: Randoop calls it after every
#   generated call, and a false result becomes an error-revealing test (ErrorTest*.java).
# - -ea enables the `assert repOk()` postconditions inside Board, so a violation
#   is also caught at the method that causes it.
# - Same seed + --deterministic => running it twice gives byte-identical tests.
# - --flaky-test-behavior=HALT: stop instead of writing a test that fails on re-run.
# - Board.MAX_SIZE bounds the board size, so Randoop can now use the class
#   constants (2048, 131072) as tile values without building a huge grid.
#
# Usage: ./runRandoop.sh [output-dir]   (default: src/test/java)
set -e

JAVA8_HOME="${JAVA_8_HOME:-$(/usr/libexec/java_home -v 1.8)}"
JAVA="$JAVA8_HOME/bin/java"
REPO="$(cd "$(dirname "$0")" && pwd)"
DEST="${1:-$REPO/src/test/java}"

cd "$REPO"
./mvn8 -q clean compile

# Randoop compiles and re-runs the generated tests to filter flaky ones, and that step
# breaks when the classpath has spaces or accents (like this repo's path): work in /tmp.
WORK="$(mktemp -d)"
cp -r target/classes "$WORK/classes"
cp lib/randoop-all-4.3.4.jar "$WORK/"
cd "$WORK"

CP="randoop-all-4.3.4.jar:classes"
COMMON=(--randomseed=42 --deterministic=true --time-limit=0 --generated-limit=1000
        --flaky-test-behavior=HALT --junit-output-dir=out
        --literals-file=CLASSES --literals-level=ALL)

"$JAVA" -ea -cp "$CP" randoop.main.Main gentests "${COMMON[@]}" \
    --testclass=ar.edu.unrc.game2048.Cell --junit-package-name=randoopTests.cell

# Cell is also given to the Board run, so Randoop can build large tiles
# (mergeWith chains) and put them on a board with setCell.
"$JAVA" -ea -cp "$CP" randoop.main.Main gentests "${COMMON[@]}" \
    --testclass=ar.edu.unrc.game2048.Board --testclass=ar.edu.unrc.game2048.Cell \
    --junit-package-name=randoopTests.board

rm -rf "$DEST/randoopTests"
mkdir -p "$DEST"
cp -r out/randoopTests "$DEST/"
rm -rf "$WORK"
