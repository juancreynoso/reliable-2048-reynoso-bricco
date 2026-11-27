#!/bin/bash
# Infers invariants with Daikon from ALL our executions together, in one run:
#   manual tests + Randoop tests + EvoSuite tests + fuzzed games of MainCLI.
# Each source alone is biased (few sizes, odd boards, always 4x4...); together
# they falsify each other's spurious invariants. Output: daikon-output-all.txt
#
#   ./runDaikon.sh [games]      (default 200 fuzzed games)
#
# daikon.jar needs Java 11+ on the PATH; the project itself is built with JDK 8.
set -e
GAMES="${1:-200}"
OUT=daikon-traces/all          # traces are regenerated, not kept in git
PATTERN="ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell"

./mvn8 -q clean test-compile
./mvn8 -q dependency:build-classpath -Dmdep.outputFile=target/cp.txt > /dev/null
DEPS="$(cat target/cp.txt)"

# EvoSuite's runner only works on Java 8 and Chicory needs Java 11+, so we trace a
# plain-JUnit copy of the EvoSuite tests (without @RunWith and the scaffolding).
mkdir -p target/evosuite-plain
for c in Cell Board; do
    sed -E '/^@RunWith/d; s/ extends [A-Za-z]+_ESTest_scaffolding//; /import org\.(evosuite\.runtime\.EvoRunner|junit\.runner\.RunWith)/d' \
        "src/test/java/ar/edu/unrc/game2048/${c}_ESTest.java" > "target/evosuite-plain/${c}_ESTest.java"
done
javac -nowarn -cp "target/classes:$DEPS" -d target/evosuite-plain target/evosuite-plain/*.java
CP="lib/daikon.jar:target/classes:target/evosuite-plain:target/test-classes:$DEPS"

rm -rf "$OUT" && mkdir -p "$OUT"
trace() {   # trace <name> <test classes...>  (big boards: record every call until 100, then a sample)
    local name="$1"; shift
    java -ea -cp "$CP" daikon.Chicory --ppt-select-pattern="$PATTERN" --sample-start=100 \
         --output-dir="$OUT" --dtrace-file="$name.dtrace.gz" org.junit.runner.JUnitCore "$@" > "$OUT/$name.log" 2>&1 || true
    echo "$name: $(grep -E '^(OK|Tests run)' "$OUT/$name.log" | tail -1)"
}
trace Manual ar.edu.unrc.game2048.BoardTest ar.edu.unrc.game2048.CellTest ar.edu.unrc.game2048.MainCLITest
trace Randoop $(cd src/test/java && ls randoopTests/*/RegressionTest[0-9]*.java | sed 's/\.java$//; s#/#.#g')
trace EvoSuite ar.edu.unrc.game2048.Cell_ESTest ar.edu.unrc.game2048.Board_ESTest

python3 generateFuzzTraces.py "$GAMES" "$OUT/fuzzer" > "$OUT/fuzzer.log"
echo "Fuzzer: $(grep -c OK "$OUT/fuzzer.log")/$GAMES games OK"

java -Xmx6g -cp lib/daikon.jar daikon.Daikon -o "$OUT/all.inv.gz" \
     "$OUT"/*.dtrace.gz "$OUT"/fuzzer/*.dtrace.gz > daikon-output-all.txt
echo "Invariants written to daikon-output-all.txt"
