#!/bin/bash
# generate_evosuite_tests.sh

# EvoSuite 1.0.6 needs com.sun:tools (tools.jar), which only exists in JDK 8.
# Force JDK 8 for this script regardless of the system default (see ./mvn8).
if [[ "$OSTYPE" == "darwin"* ]] && command -v /usr/libexec/java_home >/dev/null 2>&1; then
    JAVA8_HOME="$(/usr/libexec/java_home -v 1.8 2>/dev/null)"
elif [ -n "$JAVA_8_HOME" ]; then
    JAVA8_HOME="$JAVA_8_HOME"
fi

if [ -z "$JAVA8_HOME" ] || [ ! -d "$JAVA8_HOME" ]; then
    echo "No se encontró un JDK 8 instalado." >&2
    echo "Instalá uno (ej: brew install --cask temurin8) o exportá JAVA_8_HOME apuntando a tu JDK 8." >&2
    exit 1
fi

export JAVA_HOME="$JAVA8_HOME"
export PATH="$JAVA_HOME/bin:$PATH"

EVOSUITE_JAR="evosuite-1.0.6.jar"
EVOSUITE_URL="https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar"

# Download EvoSuite if not exists
if [ ! -f "$EVOSUITE_JAR" ]; then
    echo "Downloading EvoSuite..."
    wget "$EVOSUITE_URL" || curl -L -o "$EVOSUITE_JAR" "$EVOSUITE_URL"
fi

# Build project first
mvn -q clean compile

CLASS_PATH=$(pwd)/target/classes

# Reproducible generation:
# - fixed seed, and a budget in statements instead of seconds (a time budget stops the
#   search at a different point on every run, so the seed alone is not enough);
# - global_timeout high enough that the statement budget is what ends the search;
# - assertion_strategy=ALL keeps every assertion (the default MUTATION filter is not
#   deterministic); EvoSuite may still list them in a different order;
# - client_on_thread: the default separate client process talks to the master over RMI,
#   which fails intermittently here ("no such object in table");
# - check_contracts: EvoSuite also checks general contracts on every generated test
#   (an AssertionError from the `assert repOk()` postconditions in Board, undeclared
#   exceptions, NullPointerException, equals/hashCode/toString). A violation is written
#   to <Class>_Failed_ESTest.java, a failing test that reveals a bug. Without this
#   flag every observed behaviour is recorded as "expected" and EvoSuite finds 0 bugs.
COMMON=(-projectCP "$CLASS_PATH" -seed 42 -Dstopping_condition=MaxStatements
        -Dglobal_timeout=1200 -Dassertion_strategy=ALL -Dclient_on_thread=true
        -Dtest_dir=src/test/java -Dcheck_contracts=true)

echo "Generating EvoSuite tests for Cell..."
java -jar "$EVOSUITE_JAR" -class ar.edu.unrc.game2048.Cell "${COMMON[@]}" -Dsearch_budget=30000

# Board.MAX_SIZE bounds the board size, so EvoSuite can use its constant pools
# (2048, 131072, ...) without building a huge grid; no need to limit max_int anymore.
echo "Generating EvoSuite tests for Board..."
java -jar "$EVOSUITE_JAR" -class ar.edu.unrc.game2048.Board "${COMMON[@]}" -Dsearch_budget=30000

# Contract violations are failing tests by design: move them out of src/test (so
# `mvn test` stays green) into bug-evidence/ for manual triage. Many are false
# positives (documented IllegalArgumentException, EvoSuite's own 10000-iteration
# loop limit on toString() of a 16x16 board); see bug-evidence/README.md.
FAILED=(src/test/java/ar/edu/unrc/game2048/*_Failed_ESTest*.java)
if [ -e "${FAILED[0]}" ]; then
    mkdir -p bug-evidence/evosuite-contracts/latest
    mv "${FAILED[@]}" bug-evidence/evosuite-contracts/latest/
    echo "EvoSuite found contract violations: see bug-evidence/evosuite-contracts/latest/"
fi
