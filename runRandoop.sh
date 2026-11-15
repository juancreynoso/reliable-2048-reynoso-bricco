#!/bin/bash
# Regenerates the Randoop regression tests for Cell and Board (src/test/java/randoopTests).
# Same seed + --deterministic => running it twice gives byte-identical tests.
# --flaky-test-behavior=HALT: stop instead of writing a test that fails on re-run.
set -e

JAVA8_HOME="${JAVA_8_HOME:-$(/usr/libexec/java_home -v 1.8)}"
JAVA="$JAVA8_HOME/bin/java"
REPO="$(cd "$(dirname "$0")" && pwd)"

./mvn8 -q clean compile

# Randoop compiles and re-runs the generated tests to filter flaky ones, and that step
# breaks when the classpath has spaces or accents (like this repo's path): work in /tmp.
WORK="$(mktemp -d)"
cp -r target/classes "$WORK/classes"
cp lib/randoop-all-4.3.4.jar "$WORK/"
cd "$WORK"

COMMON=(--randomseed=42 --deterministic=true --time-limit=0 --generated-limit=1000
        --flaky-test-behavior=HALT --junit-output-dir=out)

"$JAVA" -cp "randoop-all-4.3.4.jar:classes" randoop.main.Main gentests "${COMMON[@]}" \
    --testclass=ar.edu.unrc.game2048.Cell --junit-package-name=randoopTests.cell

# Without these, Randoop reuses 2048 and 131072 (constants of Board) as board sizes and
# builds a 131072x131072 grid that never finishes.
"$JAVA" -cp "randoop-all-4.3.4.jar:classes" randoop.main.Main gentests "${COMMON[@]}" \
    --testclass=ar.edu.unrc.game2048.Board --junit-package-name=randoopTests.board \
    --literals-level=NONE \
    --omit-field=ar.edu.unrc.game2048.Board.WINNING_VALUE \
    --omit-field=ar.edu.unrc.game2048.Board.MAX_INITIAL_TILE \
    --omit-field=ar.edu.unrc.game2048.Board.DEFAULT_SEED

rm -rf "$REPO/src/test/java/randoopTests"
cp -r out/randoopTests "$REPO/src/test/java/"
rm -rf "$WORK"
