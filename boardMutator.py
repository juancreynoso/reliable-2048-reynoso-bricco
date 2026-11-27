"""
Assignment 5, Exercise 1b: mutation-based fuzzer of initial boards.

Takes valid boards from the grammar (boardFuzzer.py) and breaks them with 1 to 3
random edits: insert, replace or delete one character. The oracle decides on its
own whether the result is still a valid board (does it belong to the grammar?),
without using the Java parser, so the two can disagree:
  - still valid -> it must be played correctly, as in 1a;
  - invalid     -> MainCLI must reject it with a message: exit code != 0, no exception.

    python3 boardMutator.py [boards]      (default 2000)
"""

import random
import subprocess
import sys
from concurrent.futures import ThreadPoolExecutor

from boardFuzzer import COMMAND, TILES, random_board, report, run


def mutate(board):
    """Apply 1 to 3 random edits; half of the new characters belong to the board format."""
    for _ in range(random.randint(1, 3)):
        pos = random.randrange(len(board) + 1)
        char = random.choice("0123456789,[]") if random.random() < 0.5 else chr(random.randint(32, 126))
        edit = random.choice(["insert", "replace", "delete"])
        if edit == "insert":
            board = board[:pos] + char + board[pos:]
        elif edit == "replace":
            board = board[:pos] + char + board[pos + 1:]
        else:
            board = board[:pos] + board[pos + 1:]
    return board


def is_valid(board):
    """True if the board belongs to the language of the grammar."""
    values = board[1:-1].split(",")
    return (board.startswith("[") and board.endswith("]") and len(values) == 16
            and all(v == "0" or v in TILES for v in values))


def check(board):
    if is_valid(board):
        return run(board, "q\n")
    result = subprocess.run(COMMAND + [board], input="q\n", capture_output=True, text=True, timeout=10)
    if result.returncode == 0:
        return "accepted an invalid board"
    if "Exception" in result.stderr:
        return "crashed instead of rejecting the board"
    return None


def main():
    random.seed(42)
    n = int(sys.argv[1]) if len(sys.argv) > 1 else 2000
    boards = [mutate(random_board()) for _ in range(n)]
    print("%d still valid after mutating" % sum(map(is_valid, boards)))
    with ThreadPoolExecutor() as pool:
        report(boards, list(pool.map(check, boards)))


if __name__ == "__main__":
    main()
