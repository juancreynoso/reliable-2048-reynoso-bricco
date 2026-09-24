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
TARGET_CLASS="ar.edu.unrc.game2048.Board"
SEARCH_BUDGET=60

# Download EvoSuite if not exists
if [ ! -f "$EVOSUITE_JAR" ]; then
    echo "Downloading EvoSuite..."
    wget "$EVOSUITE_URL" || curl -L -o "$EVOSUITE_JAR" "$EVOSUITE_URL"
fi

# Build project first
mvn clean compile

CLASS_PATH=$(pwd)/target/classes

# Generate tests
echo "Generating EvoSuite tests..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $TARGET_CLASS \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java

# Run tests
mvn test
