"""
Fuzzer for the Reliable 2048 CLI (Assignment 3, improved after the professor's review).

Structure follows the Fuzzing Book (Zeller et al.): a Fuzzer generates inputs
and a Runner executes the program and classifies the outcome.

The runner's oracle is a model of the game rules written in Python: after every
key, the next board printed must be exactly what the rules say, the score must
grow by the merged values, the win message must appear once, "Game Over" only on
a dead board, and every row of the printed board must have the same width.

    python3 fuzzer.py --minutes 10 [--workers 4] [--seed 42]

Each game starts from a random board (-Dseed) or from a board of the grammar of
Assignment 5, and gets 50 to 2000 keys: moves, some invalid keys, and 40% of the
time no final "q" (as if the player closed the input).
"""

import argparse
import os
import random
import subprocess
import time
from collections import Counter
from concurrent.futures import ThreadPoolExecutor

PASS = "PASS"              # the game followed the rules
FAIL = "FAIL"              # crash, or something the rules do not allow
UNRESOLVED = "UNRESOLVED"  # timeout

KEYS = ['a', 's', 'w', 'd']   # left, down, up, right
QUIT = 'q'
INVALID_KEYS = ["x", "1", "", " ", "ww", "up", "?", "ä", "\t"]

# ---------------------------------------------------------------- the model
# Cells are numbered 0..15 row by row. Each list is one row or column, starting
# at the edge the tiles move towards.
LINES = {
    "A": [[4 * r + c for c in range(4)] for r in range(4)],            # left
    "D": [[4 * r + c for c in reversed(range(4))] for r in range(4)],  # right
    "W": [[4 * r + c for r in range(4)] for c in range(4)],            # up
    "S": [[4 * r + c for r in reversed(range(4))] for c in range(4)],  # down
}


def slide(values):
    """Slide one line towards its start and merge equal neighbours once."""
    tiles = [v for v in values if v]
    result, gained = [], 0
    while tiles:
        if len(tiles) > 1 and tiles[0] == tiles[1]:
            result.append(2 * tiles[0])
            gained += 2 * tiles[0]
            tiles = tiles[2:]
        else:
            result.append(tiles.pop(0))
    return result + [0] * (len(values) - len(result)), gained


def move(board, key):
    """The board after a move (before the new random tile) and the points won."""
    new, gained = list(board), 0
    for line in LINES[key]:
        values, points = slide([board[i] for i in line])
        for i, v in zip(line, values):
            new[i] = v
        gained += points
    return new, gained


def is_dead(board):
    return all(move(board, key)[0] == board for key in LINES)


def parse_board(board):
    """The 16 values of a board such as "[0,2,...]"."""
    return [int(v) for v in board[1:-1].split(",")]


# ---------------------------------------------------------------- the oracle
def turns(stdout):
    """One (score, cells, grid lines, text) per board printed by MainCLI."""
    result = []
    for chunk in stdout.split("Score: ")[1:]:
        lines = chunk.splitlines()
        grid = [line for line in lines if line[:1] in ("+", "|")]
        rows = [line for line in grid if line.startswith("|")]
        cells = [int(c.strip() or 0) for row in rows for c in row.split("|")[1:-1]]
        result.append((int(lines[0]), cells, grid, chunk))
    return result


def check(board, keys, out, err, code):
    """Return why the game is wrong, or None if it follows the rules."""
    if code != 0 or err:
        return "crash: " + (err.strip().splitlines() or ["exit %d" % code])[0]
    t = turns(out)
    if not t:
        return "no board printed"
    if board and (t[0][0], t[0][1]) != (0, parse_board(board)):
        return "the first board is not the input board"
    for _, _, grid, _ in t:
        if len(set(map(len, grid))) > 1:
            return "the rows of the printed board have different widths"

    # MainCLI reads one key per board printed: key i takes board i to board i+1
    for i, key in enumerate(keys[:len(t) - 1]):
        (s0, b0, _, _), (s1, b1, _, _) = t[i], t[i + 1]
        key = key.strip().upper()
        expected, gained = move(b0, key) if key in LINES else (b0, 0)
        if expected == b0:
            if (s1, b1) != (s0, b0):
                return "the board changed on a key that moves nothing (%r)" % key
            continue
        changed = [j for j in range(16) if expected[j] != b1[j]]
        if len(changed) != 1 or expected[changed[0]] != 0 or b1[changed[0]] not in (2, 4):
            return "wrong board after %s" % key
        if s1 != s0 + gained:
            return "wrong score after %s" % key

    first_win = next((i for i, (_, b, _, _) in enumerate(t) if max(b) >= 2048), None)
    wins = [i for i, (_, _, _, text) in enumerate(t) if "Congratulations" in text]
    if first_win is not None and first_win not in wins:
        return "no win message on a board with a tile >= 2048"
    if len(wins) > 1 or (wins and wins[0] != first_win):
        return "the win message is shown more than once"
    if ("Game Over" in t[-1][3]) != is_dead(t[-1][1]):
        return "'Game Over' does not match the board"
    return None


# ---------------------------------------------------------------- Runner
class Runner:
    """Runs the program under test and returns (outcome, reason)."""

    def run(self, inp):
        raise NotImplementedError


class CLIRunner(Runner):
    """Runs MainCLI (with -ea) on one game: inp = (seed, initial board or None, keys)."""

    def run(self, inp):
        seed, board, keys = inp
        command = ["java", "-ea", "-Dseed=%d" % seed, "-cp", "target/classes",
                   "ar.edu.unrc.game2048.MainCLI"] + ([board] if board else [])
        try:
            result = subprocess.run(command, input="\n".join(keys) + "\n",
                                    capture_output=True, text=True, timeout=60)
        except subprocess.TimeoutExpired:
            return UNRESOLVED, "timeout"
        reason = check(board, keys, result.stdout, result.stderr, result.returncode)
        return (FAIL, reason) if reason else (PASS, None)


# ---------------------------------------------------------------- Fuzzers
class Fuzzer:
    def fuzz(self):
        raise NotImplementedError


class RandomFuzzer(Fuzzer):
    """A random sequence of moves followed by a quit command, one key per line
    (Assignment 3; also used by boardFuzzer.py and generateFuzzTraces.py)."""

    def __init__(self, min_length=10, max_length=50):
        self.min_length = min_length
        self.max_length = max_length

    def fuzz(self):
        length = random.randint(self.min_length, self.max_length)
        moves = [random.choice(KEYS) for _ in range(length)]
        moves.append(QUIT)
        return "\n".join(moves) + "\n"


class GameFuzzer(Fuzzer):
    """A whole game: (seed, initial board or None, keys). Keys are mostly moves,
    sometimes uppercase or invalid, and 40% of the games do not end with q."""

    def fuzz(self):
        from boardFuzzer import random_board   # imported here: boardFuzzer imports this file
        board = random_board() if random.random() < 0.5 else None
        keys = []
        for _ in range(random.randint(50, 2000)):
            key = random.choice(KEYS)
            r = random.random()
            keys.append(key if r < 0.8 else key.upper() if r < 0.9 else random.choice(INVALID_KEYS))
        if random.random() < 0.6:
            keys.append(QUIT)
        return random.randrange(2 ** 31), board, keys


# ---------------------------------------------------------------- main
def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--minutes", type=float, default=10)
    parser.add_argument("--workers", type=int, default=4)
    parser.add_argument("--seed", type=int, default=42)
    parser.add_argument("--out", default="fuzz-results")
    args = parser.parse_args()
    random.seed(args.seed)
    os.makedirs(args.out, exist_ok=True)
    fuzzer, runner = GameFuzzer(), CLIRunner()

    games, failures, examples = 0, Counter(), []
    end = time.time() + 60 * args.minutes
    with ThreadPoolExecutor(args.workers) as pool:
        while time.time() < end:
            batch = [fuzzer.fuzz() for _ in range(4 * args.workers)]
            for (seed, board, keys), (outcome, reason) in zip(batch, pool.map(runner.run, batch)):
                games += 1
                if outcome != PASS:
                    failures[reason] += 1
                    if failures[reason] == 1:   # keep the first example of each kind, to reproduce it
                        path = os.path.join(args.out, "failure-%d.input" % (len(examples) + 1))
                        with open(path, "w") as f:
                            f.write("\n".join(keys) + "\n")
                        examples.append("- **%s**: `java -ea -Dseed=%d -cp target/classes "
                                        "ar.edu.unrc.game2048.MainCLI %s < %s`\n"
                                        % (reason, seed, '"%s"' % board if board else "", path))

    failed = sum(failures.values())
    summary = "%d games in %g minutes (seed %d): %d passed, %d failed\n\n" % (
        games, args.minutes, args.seed, games - failed, failed)
    summary += "".join("- %d x %s\n" % (n, r) for r, n in failures.most_common())
    summary += "".join(examples)
    with open(os.path.join(args.out, "summary.md"), "w") as f:
        f.write(summary)
    print(summary)


if __name__ == "__main__":
    main()
