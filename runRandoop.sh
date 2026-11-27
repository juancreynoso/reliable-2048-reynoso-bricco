#!/bin/bash
# Regenerates the Randoop tests of Cell and Board in src/test/java/randoopTests.
#   --randomseed + --deterministic + --generated-limit : the same tests on every run
#   --flaky-test-behavior=HALT : stop if a generated test fails when re-run
#   @CheckRep on repOk()       : Randoop checks the invariant after every call;
#                                a false repOk() becomes an error test (ErrorTest*.java)
#   randoop-literals.txt       : int boundaries (2^29, 2^30, MAX_VALUE) as inputs
# Runs WITHOUT -ea: otherwise the `assert repOk()` in Board throws first and
# Randoop takes it as an expected exception instead of a broken invariant.
set -e
JAVA="${JAVA_8_HOME:-$(/usr/libexec/java_home -v 1.8)}/bin/java"
REPO="$(pwd)"
./mvn8 -q clean compile

# Randoop re-runs the tests it writes, and that breaks on paths with spaces or
# accents (like this repo's), so it works in a temporary folder.
WORK="$(mktemp -d)"
cp -r target/classes lib/randoop-all-4.3.4.jar randoop-literals.txt "$WORK/"
cd "$WORK"

generate() {   # generate <package> <classes...>
    local package="$1"; shift
    "$JAVA" -cp "randoop-all-4.3.4.jar:classes" randoop.main.Main gentests \
        --randomseed=42 --deterministic=true --time-limit=0 --generated-limit=1000 \
        --flaky-test-behavior=HALT --junit-output-dir=out --junit-package-name="$package" \
        --literals-file=CLASSES --literals-file=randoop-literals.txt --literals-level=ALL \
        $(printf -- '--testclass=ar.edu.unrc.game2048.%s ' "$@")
}
generate randoopTests.cell Cell
generate randoopTests.board Board Cell   # with Cell too, so Randoop can put its own tiles on a board

rm -rf "$REPO/src/test/java/randoopTests"
cp -r out/randoopTests "$REPO/src/test/java/"
rm -rf "$WORK"

# Error tests fail on purpose (they show a bug): keep them in failing-generated-tests/ (not in git), out of `mvn test`.
cd "$REPO"
if ls src/test/java/randoopTests/*/ErrorTest*.java > /dev/null 2>&1; then
    mkdir -p failing-generated-tests
    mv src/test/java/randoopTests/*/ErrorTest*.java failing-generated-tests/
    echo "Randoop found error tests: see failing-generated-tests/"
fi
