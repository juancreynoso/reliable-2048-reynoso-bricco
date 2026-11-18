#!/bin/bash
# Infers invariants with Daikon from ALL the executions we have, in one run:
#   1. the manual tests (BoardTest, CellTest)
#   2. the Randoop suites (randoopTests.cell, randoopTests.board)
#   3. the EvoSuite suites (Cell_ESTest, Board_ESTest)
#   4. fuzzed games of MainCLI (random and grammar-generated initial boards)
# Each source has its own bias (the tests use few sizes, Randoop builds odd
# boards, the fuzzer always plays 4x4 games); together they falsify each
# other's spurious invariants. Output: daikon-output-all.txt
#
# Usage: ./runDaikon.sh [fuzzed-games]   (default 40)
set -e

# The project is built with JDK 8 (./mvn8), but daikon.jar needs Java 11+:
# Chicory and Daikon run on the `java` of the PATH (classes for Java 8 run fine on it).
java -version 2>&1 | grep -q 'version "1\.' && { echo "daikon.jar needs Java 11+ on the PATH" >&2; exit 1; }
GAMES="${1:-40}"
# daikon.jar may live in lib/ (as the assignment suggests) or at the repo root
export DAIKON_JAR="${DAIKON_JAR:-$([ -f lib/daikon.jar ] && echo lib/daikon.jar || echo daikon.jar)}"
OUT=daikon-traces/all
PATTERN="ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell"

./mvn8 -q clean test-compile
./mvn8 -q dependency:build-classpath -Dmdep.outputFile=target/cp.txt > /dev/null
CP="$DAIKON_JAR:target/classes:target/test-classes:$(cat target/cp.txt)"

# EvoSuite's runner (EvoRunner) only works on Java 8, and Chicory needs Java 11+.
# Trace a plain-JUnit copy of the EvoSuite tests instead (no @RunWith, no scaffolding).
# Without EvoSuite's runtime, java.util.Random is not mocked, so some assertions that
# recorded mocked random tiles fail; the executions are traced all the same.
PLAIN=target/evosuite-plain
mkdir -p "$PLAIN/src" "$PLAIN/classes"
for c in Cell Board; do
    sed -E '/^@RunWith/d; s/ extends [A-Za-z]+_ESTest_scaffolding//;
            /import org.evosuite.runtime.(EvoRunner|EvoRunnerParameters);/d;
            /import org.junit.runner.RunWith;/d' \
        "src/test/java/ar/edu/unrc/game2048/${c}_ESTest.java" > "$PLAIN/src/${c}_ESTest.java"
done
javac -nowarn -cp "target/classes:$(cat target/cp.txt)" -d "$PLAIN/classes" "$PLAIN"/src/*.java
CP="$DAIKON_JAR:target/classes:$PLAIN/classes:target/test-classes:$(cat target/cp.txt)"   # plain copy first
rm -rf "$OUT" && mkdir -p "$OUT"

chicory() {   # chicory <trace-name> <extra chicory options...> -- <test classes...>
    local name="$1"; shift
    local opts=()
    while [ "$1" != "--" ]; do opts+=("$1"); shift; done; shift
    java -ea -cp "$CP" daikon.Chicory --ppt-select-pattern="$PATTERN" "${opts[@]}" \
         --output-dir="$OUT" --dtrace-file="$name.dtrace.gz" \
         org.junit.runner.JUnitCore "$@" > "$OUT/$name.log" 2>&1 || true
    echo "$name: $(grep -E '^(OK|Tests run)' "$OUT/$name.log" | tail -1)"
    [ "$(gzip -dc "$OUT/$name.dtrace.gz" | wc -l)" -gt 100 ] || { echo "no trace for $name, see $OUT/$name.log" >&2; exit 1; }
}

chicory Manual -- ar.edu.unrc.game2048.BoardTest ar.edu.unrc.game2048.CellTest
chicory Randoop --sample-start=100 -- $(cd src/test/java && ls randoopTests/*/RegressionTest[0-9]*.java | sed 's/\.java$//; s#/#.#g')
chicory EvoSuite --sample-start=100 -- ar.edu.unrc.game2048.Cell_ESTest ar.edu.unrc.game2048.Board_ESTest

python3 generateFuzzTraces.py "$GAMES" "$OUT/fuzzer" > "$OUT/fuzzer.log"
echo "Fuzzer: $(grep -c OK "$OUT/fuzzer.log")/$GAMES games OK"

java -Xmx3g -cp "$DAIKON_JAR" daikon.Daikon -o "$OUT/all.inv.gz" \
     "$OUT"/*.dtrace.gz "$OUT"/fuzzer/*.dtrace.gz > daikon-output-all.txt
echo "Invariants written to daikon-output-all.txt"
