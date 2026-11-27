#!/bin/bash
# Regenerates the EvoSuite tests of Cell and Board (Cell_ESTest, Board_ESTest).
#   -seed + a budget in statements (not seconds) : the same search on every run
#   assertion_strategy=ALL : keep every assertion (the default filter is not deterministic)
#   client_on_thread       : the default client process uses RMI, which failed here at random
#   check_contracts        : EvoSuite also reports broken contracts (an AssertionError from
#                            `assert repOk()`, undeclared exceptions, NullPointerException,
#                            equals/hashCode); each one becomes a failing *_Failed_ESTest
# EvoSuite 1.0.6 only runs on JDK 8.
set -e
JAVA="${JAVA_8_HOME:-$(/usr/libexec/java_home -v 1.8)}/bin/java"
./mvn8 -q clean compile

for class in Cell Board; do
    "$JAVA" -jar evosuite-1.0.6.jar -class "ar.edu.unrc.game2048.$class" -projectCP target/classes \
        -seed 42 -Dstopping_condition=MaxStatements -Dsearch_budget=30000 -Dglobal_timeout=1200 \
        -Dassertion_strategy=ALL -Dclient_on_thread=true -Dcheck_contracts=true \
        -Dtest_dir=src/test/java
done

# Contract violations are failing tests on purpose: move them out of src/test so
# `mvn test` stays green, and review them by hand in failing-generated-tests/ (not in git).
if ls src/test/java/ar/edu/unrc/game2048/*_Failed_ESTest*.java > /dev/null 2>&1; then
    mkdir -p failing-generated-tests
    mv src/test/java/ar/edu/unrc/game2048/*_Failed_ESTest*.java failing-generated-tests/
    echo "Contract violations found: see failing-generated-tests/"
fi
