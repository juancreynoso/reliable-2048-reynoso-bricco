"""
Assignment 4, Phase 3.3: broaden the Daikon trace by playing fuzzed games of
MainCLI under Chicory. Uses RandomFuzzer from fuzzer.py. Each game is written to its
own .dtrace.gz file.

"""

import os
import random
import subprocess

from fuzzer import RandomFuzzer

SEED = 42
GAMES = 40
MIN_MOVES, MAX_MOVES = 50, 400
OUT_DIR = "daikon-traces/fuzzer"

CHICORY = [
    "java", "-cp", "lib/daikon.jar:target/classes", "daikon.Chicory",
    "--ppt-select-pattern=ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell",
    f"--output-dir={OUT_DIR}",
]


def main():
    random.seed(SEED)
    os.makedirs(OUT_DIR, exist_ok=True)
    env = dict(os.environ, JAVA_TOOL_OPTIONS="-ea")
    fuzzer = RandomFuzzer(min_length=MIN_MOVES, max_length=MAX_MOVES)

    for i in range(GAMES):
        result = subprocess.run(
            CHICORY + [f"--dtrace-file=MainCLI-{i:02d}.dtrace.gz",
                       "ar.edu.unrc.game2048.MainCLI"],
            input=fuzzer.fuzz(), capture_output=True, text=True, env=env,
        )
        score = result.stdout.rsplit("Final score:", 1)[-1].strip() or "?"
        status = "OK" if result.returncode == 0 else f"exit {result.returncode}"
        print(f"game {i:02d}: {status}, final score {score}")


if __name__ == "__main__":
    main()
