"""
Assignment 5, Exercise 1a: grammar-based fuzzer of initial boards.

The grammar describes the valid boards "[v1,...,v16]": 16 cells, each one 0 or
a power of two from 2 to 131072 (Board.MAX_INITIAL_TILE). Every generated board
is played for a few random moves, and the game must not crash, must show
exactly the board it was given, and must start with score 0.

    python3 boardFuzzer.py [boards]       (default 500)
"""

import random
import re
import subprocess
import sys
from collections import Counter
from concurrent.futures import ThreadPoolExecutor

from fuzzer import RandomFuzzer, parse_board

TILES = [str(2 ** k) for k in range(1, 18)]   # 2 .. 131072
GRAMMAR = {
    "<board>": ["[<row>,<row>,<row>,<row>]"],
    "<row>": ["<cell>,<cell>,<cell>,<cell>"],
    "<cell>": ["0", "<tile>"],
    "<tile>": ["<small>", "<small>", "<small>", "<large>"],   # small tiles 3 times more likely, so tiles merge
    "<small>": TILES[:11],                                    # 2 .. 2048
    "<large>": TILES[11:],                                    # 4096 .. 131072
}

COMMAND = ["java", "-ea", "-cp", "target/classes", "ar.edu.unrc.game2048.MainCLI"]


def random_board(symbol="<board>"):
    """Expand the grammar: replace every <symbol> by one of its options, at random."""
    text = random.choice(GRAMMAR[symbol])
    return re.sub(r"<\w+>", lambda m: random_board(m.group()), text)


def run(board, keys):
    """Play `board` with `keys`; return why the game is wrong, or None if it is right."""
    result = subprocess.run(COMMAND + [board], input=keys, capture_output=True, text=True, timeout=10)
    if result.returncode != 0 or result.stderr:
        return "crash: " + (result.stderr.strip().splitlines() or ["exit %d" % result.returncode])[0]
    rows = [line for line in result.stdout.splitlines() if line.startswith("|")][:4]
    if [int(c.strip() or 0) for row in rows for c in row.split("|")[1:-1]] != parse_board(board):
        return "the first board is not the input board"
    if re.search(r"Score: (\d+)", result.stdout).group(1) != "0":
        return "the initial score is not 0"
    return None


def report(boards, reasons):
    failures = Counter(r for r in reasons if r)
    print("%d boards: %d passed, %d failed" % (len(boards), len(boards) - sum(failures.values()),
                                              sum(failures.values())))
    for reason, count in failures.most_common():
        example = next(b for b, r in zip(boards, reasons) if r == reason)
        print("  %d x %s\n      e.g. %s" % (count, reason, example))


def main():
    random.seed(42)
    n = int(sys.argv[1]) if len(sys.argv) > 1 else 500
    keys = RandomFuzzer(min_length=5, max_length=30)
    games = [(random_board(), keys.fuzz()) for _ in range(n)]
    with ThreadPoolExecutor() as pool:
        reasons = list(pool.map(lambda game: run(*game), games))
    report([board for board, _ in games], reasons)


if __name__ == "__main__":
    main()
