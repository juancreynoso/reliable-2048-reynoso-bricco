"""
Assignment 5, Exercise 1a: grammar-based fuzzer for initial 2048 boards.

BOARD_GRAMMAR generates valid 4x4 boards in the format accepted by
`MainCLI "[v1,...,v16]"`. A valid cell is 0, or a power of two from 2 up to
2^17 = 131072 (Board.MAX_INITIAL_TILE, the largest tile of a real 4x4 game).
"""

import random
import re
import subprocess
import sys
from collections import Counter
from concurrent.futures import ThreadPoolExecutor

from fuzzer import PASS, FAIL, UNRESOLVED, RandomFuzzer

# Grammar
SMALL_TILES = [str(2 ** k) for k in range(1, 12)]    # 2 .. 2048
LARGE_TILES = [str(2 ** k) for k in range(12, 18)]   # 4096 .. 131072

BOARD_GRAMMAR = {
    "<start>": ["[<row>,<row>,<row>,<row>]"],
    "<row>": ["<cell>,<cell>,<cell>,<cell>"],
    "<cell>": ["0", "<tile>"],
    # Small tiles are listed three times so they are picked more often:
    # boards made only of large, all-different tiles almost never merge.
    "<tile>": ["<small>", "<small>", "<small>", "<large>"],
    "<small>": SMALL_TILES,
    "<large>": LARGE_TILES,
}

NONTERMINAL = re.compile(r"<[^<> ]+>")


def expand(grammar, symbol="<start>"):
    """Expand `symbol` by replacing every nonterminal with a random expansion."""
    expansion = random.choice(grammar[symbol])
    return NONTERMINAL.sub(lambda m: expand(grammar, m.group()), expansion)


class GrammarFuzzer:
    def __init__(self, grammar):
        self.grammar = grammar

    def fuzz(self) -> str:
        return expand(self.grammar)



# Harness
COMMAND = ["java", "-ea", "-cp", "target/classes", "ar.edu.unrc.game2048.MainCLI"]
TIMEOUT = 10  # seconds


def parse_board(text):
    """Values of a board string such as "[0,2,...]", as a list of ints."""
    return [int(v) for v in text[1:-1].split(",")]


def first_printed_board(stdout):
    """Cells of the first board MainCLI prints, read from its |-separated rows."""
    rows = [line for line in stdout.splitlines() if line.startswith("|")][:4]
    return [int(cell.strip() or 0) for row in rows for cell in row.split("|")[1:-1]]


def run_board(board, moves):
    """Run MainCLI on `board` with `moves` on stdin; return (outcome, reason)."""
    try:
        result = subprocess.run(COMMAND + [board], input=moves,
                                capture_output=True, text=True, timeout=TIMEOUT)
    except subprocess.TimeoutExpired:
        return UNRESOLVED, "timeout"

    if result.returncode != 0 or result.stderr:
        lines = [l for l in result.stderr.splitlines() if l.strip()]
        first = next((l for l in lines if "Exception" in l or "Error" in l),
                     lines[0] if lines else "no stderr")
        return FAIL, f"exit {result.returncode}: {first.strip()}"
    if first_printed_board(result.stdout) != parse_board(board):
        return FAIL, "loaded board differs from the input"
    score = re.search(r"Score: (-?\d+)", result.stdout)
    if not score or score.group(1) != "0":
        return FAIL, "initial score is not 0"
    return PASS, ""


def main():
    trials = int(sys.argv[1]) if len(sys.argv) > 1 else 500
    random.seed(42)
    boards = GrammarFuzzer(BOARD_GRAMMAR)
    moves = RandomFuzzer(min_length=5, max_length=30)
    inputs = [(boards.fuzz(), moves.fuzz()) for _ in range(trials)]

    with ThreadPoolExecutor() as pool:
        results = list(pool.map(lambda args: run_board(*args), inputs))

    outcomes = Counter(outcome for outcome, _ in results)
    print(f"{trials} boards: " + ", ".join(f"{k} {outcomes[k]}" for k in (PASS, FAIL, UNRESOLVED)))

    failures = Counter(reason for outcome, reason in results if outcome != PASS)
    for reason, count in failures.most_common():
        example = next(board for (board, _), (o, r) in zip(inputs, results) if r == reason)
        print(f"\n[{count}x] {reason}\n  e.g. {example}")


if __name__ == "__main__":
    main()
