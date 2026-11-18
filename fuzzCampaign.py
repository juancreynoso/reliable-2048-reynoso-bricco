"""
Time-based fuzzing campaign for the Reliable 2048 CLI.

Reuses the Fuzzing Book style pieces of fuzzer.py (PASS/FAIL/UNRESOLVED) and
boardFuzzer.py (BOARD_GRAMMAR, GrammarFuzzer, board parsing) and runs games in
parallel until the time budget ends.  Every game is checked against a set of
oracles; each distinct failure reason is minimised and saved with a repro.

  python3 fuzzCampaign.py --minutes 10 --classes target/classes --out fuzz-results
  python3 fuzzCampaign.py --repro fuzz-results/failures/1.json --classes target/classes
"""

import argparse
import json
import os
import random
import re
import shlex
import subprocess
import time
from collections import Counter
from concurrent.futures import ThreadPoolExecutor, wait, FIRST_COMPLETED

from fuzzer import PASS, FAIL, UNRESOLVED, KEYS, QUIT
from boardFuzzer import BOARD_GRAMMAR, GrammarFuzzer, parse_board

MAIN = "ar.edu.unrc.game2048.MainCLI"
TIMEOUT = 20
INVALID_KEYS = ["x", "1", "ww", "wasd", "e", "", "?", "-", "0", "\t", "ä", "up", "qq", "Q Q"]


# ---------------------------------------------------------------- generation
def gen_moves(rng):
    """Return (lines, text): the stdin of one game.  `lines` are the raw lines."""
    lines = []
    for _ in range(rng.randint(50, 2000)):
        r = rng.random()
        k = rng.choice(KEYS)
        if r < 0.80:
            lines.append(k)
        elif r < 0.88:
            lines.append(k.upper())
        elif r < 0.92:
            lines.append(rng.choice(INVALID_KEYS))
        elif r < 0.94:
            lines.append("")
        else:
            lines.append(rng.choice([" ", "  ", "\t"]) + rng.choice([k, k.upper()]) + rng.choice([" ", "  "]))
    if rng.random() < 0.6:
        lines.append(rng.choice([QUIT, QUIT.upper(), " q "]))
    return lines


def to_text(lines, trailing_newline=True):
    return "\n".join(lines) + ("\n" if trailing_newline and lines else "")


# ------------------------------------------------------------------- running
class Campaign:
    def __init__(self, classes, java):
        self.cmd = [java, "-ea"]
        self.classes = classes

    def argv(self, seed, board):
        return self.cmd[:1] + ["-ea", "-Dseed=%d" % seed, "-cp", self.classes, MAIN] + ([board] if board else [])

    def run(self, seed, board, text):
        try:
            res = subprocess.run(self.argv(seed, board), input=text.encode("utf-8"), capture_output=True,
                                 timeout=TIMEOUT)
        except subprocess.TimeoutExpired:
            return UNRESOLVED, "timeout", ""
        out = res.stdout.decode("utf-8", "replace")
        err = res.stderr.decode("utf-8", "replace")
        outcome, reason, detail = check(out, err, res.returncode, board)
        return outcome, reason, detail


BOARD_RE = re.compile(r"Score: (-?\d+)\n((?:\+[-+]*\n\|[^\n]*\n){4})\+")


def parse_boards(stdout):
    """List of (score, cells) for every board printed, in order."""
    boards = []
    for m in BOARD_RE.finditer(stdout):
        cells = []
        for row in m.group(2).splitlines():
            if row.startswith("|"):
                cells += [c.strip() for c in row.split("|")[1:-1]]
        boards.append((int(m.group(1)), cells))
    return boards


def is_pow2(v):
    return v >= 2 and v & (v - 1) == 0


def is_lost(vals):
    if 0 in vals:
        return False
    for r in range(4):
        for c in range(4):
            v = vals[4 * r + c]
            if c < 3 and v == vals[4 * r + c + 1]:
                return False
            if r < 3 and v == vals[4 * (r + 1) + c]:
                return False
    return True


def normalise(line):
    return re.sub(r"\d+", "N", line.strip())


def check(out, err, code, board):
    """Apply all oracles; returns (outcome, reason, detail).

    Output oracles run first so that a crash (e.g. at EOF) cannot hide a wrong board."""
    res = check_output(out, board)
    if res[0] != PASS:
        return res
    return check_crash(out, err, code)


def check_crash(out, err, code):
    if code != 0 or err.strip():
        lines = [l for l in err.splitlines() if l.strip()]
        first = next((l for l in lines if "Exception" in l or "Error" in l),
                     lines[0] if lines else "no stderr")
        return FAIL, "exit %d: %s" % (code, normalise(first)), err.strip()[:600]
    return PASS, "", ""


def check_output(out, board):
    boards = parse_boards(out)
    if not boards:
        return FAIL, "no board printed", out[:300]
    scores = [s for s, _ in boards]
    if min(scores) < 0:
        return FAIL, "negative score", str(scores[:20])
    for i in range(1, len(scores)):
        if scores[i] < scores[i - 1]:
            return FAIL, "score decreased between turns", "turn %d: %d -> %d" % (i, scores[i - 1], scores[i])

    vals_all = []
    for i, (_, cells) in enumerate(boards):
        try:
            vals = [int(c) if c else 0 for c in cells]
        except ValueError:
            return FAIL, "unparsable tile", str(cells)
        if len(vals) != 16:
            return FAIL, "board is not 4x4", str(cells)
        for v in vals:
            if v != 0 and not is_pow2(v):
                return FAIL, "tile is not 0 or a power of two >= 2", "board %d: %s" % (i, vals)
        vals_all.append(vals)

    if board and vals_all[0] != parse_board(board):
        return FAIL, "first printed board differs from the input board", str(vals_all[0])

    game_over = "Game Over" in out
    if game_over and not is_lost(vals_all[-1]):
        return FAIL, "Game Over printed but the board still has a move", str(vals_all[-1])
    if not game_over and is_lost(vals_all[-1]):
        return FAIL, "board has no move but Game Over was not printed", str(vals_all[-1])
    m = re.search(r"Final score: (-?\d+)", out)
    if m and int(m.group(1)) != scores[-1]:
        return FAIL, "final score differs from last printed score", "%s vs %d" % (m.group(1), scores[-1])
    return PASS, "", ""


# --------------------------------------------------------------- minimisation
def minimise(camp, seed, board, lines, trailing_newline, reason, budget=150):
    """ddmin-lite: shorten the move list while the same failure reason persists."""
    runs = [0]

    def fails(ls, tn=trailing_newline):
        if runs[0] >= budget:
            return False
        runs[0] += 1
        o, r, _ = camp.run(seed, board, to_text(ls, tn))
        return r == reason

    # 1. shortest failing prefix (binary search; failures are not always monotone but it is a good start)
    lo, hi = 0, len(lines)
    while lo < hi:
        mid = (lo + hi) // 2
        if fails(lines[:mid]):
            hi = mid
        else:
            lo = mid + 1
    best = lines[:hi] if fails(lines[:hi]) else list(lines)
    # 2. remove chunks, halving the chunk size
    chunk = max(1, len(best) // 2)
    while chunk >= 1 and runs[0] < budget:
        i = 0
        while i < len(best):
            cand = best[:i] + best[i + chunk:]
            if cand != best and fails(cand):
                best = cand
            else:
                i += chunk
        chunk //= 2
    # 3. does a trailing newline matter?
    tn = trailing_newline
    if tn and fails(best, False):
        tn = False
    return best, tn


# ----------------------------------------------------------------- reporting
def repro_cmd(camp, seed, board, input_file):
    a = camp.argv(seed, board)
    return " ".join(shlex.quote(x) for x in a) + " < " + shlex.quote(input_file)


def save_failure(camp, outdir, n, reason, detail, seed, board, lines, tn, min_lines, min_tn, count):
    fdir = os.path.join(outdir, "failures")
    os.makedirs(fdir, exist_ok=True)
    full = to_text(lines, tn)
    mini = to_text(min_lines, min_tn)
    with open(os.path.join(fdir, "%d.input" % n), "w") as f:
        f.write(full)
    with open(os.path.join(fdir, "%d.min.input" % n), "w") as f:
        f.write(mini)
    with open(os.path.join(fdir, "%d.json" % n), "w") as f:
        json.dump({"reason": reason, "seed": seed, "board": board, "input": full,
                   "minimal_input": mini}, f, indent=1)
    with open(os.path.join(fdir, "%d.txt" % n), "w") as f:
        f.write("Reason : %s\nCount  : %d\nDetail : %s\nSeed   : %d\nBoard  : %s\n"
                % (reason, count, detail, seed, board or "(random, from seed)"))
        f.write("Moves  : %d lines (full), %d lines (minimal)\n" % (len(lines), len(min_lines)))
        f.write("Minimal input (repr): %r\n\n" % mini)
        f.write("Repro (minimal):\n  %s\n" % repro_cmd(camp, seed, board, os.path.join(fdir, "%d.min.input" % n)))
        f.write("Repro (original):\n  %s\n" % repro_cmd(camp, seed, board, os.path.join(fdir, "%d.input" % n)))


# ---------------------------------------------------------------------- main
def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--minutes", type=float, default=10)
    ap.add_argument("--workers", type=int, default=4)
    ap.add_argument("--seed", type=int, default=None)
    ap.add_argument("--classes", default="target/classes")
    ap.add_argument("--out", default="fuzz-results")
    ap.add_argument("--java", default="java")
    ap.add_argument("--repro", metavar="FILE", help="re-run a failures/<n>.json and print the verdict")
    args = ap.parse_args()
    camp = Campaign(os.path.abspath(args.classes), args.java)

    if args.repro:
        with open(args.repro) as f:
            d = json.load(f)
        for key in ("minimal_input", "input"):
            o, r, det = camp.run(d["seed"], d["board"], d[key])
            print("%-13s -> %s %s %s" % (key, o, r, det))
        return

    seed0 = args.seed if args.seed is not None else random.SystemRandom().randrange(2 ** 31)
    rng = random.Random(seed0)
    boards = GrammarFuzzer(BOARD_GRAMMAR)
    os.makedirs(args.out, exist_ok=True)
    deadline = time.time() + args.minutes * 60

    outcomes = Counter()
    games = moves_total = 0
    kinds = Counter()
    eof_games = 0
    reasons = {}   # reason -> dict(count, first=(seed, board, lines, tn), detail, outcome)

    def job(seed, board, lines, tn):
        return (seed, board, lines, tn) + camp.run(seed, board, to_text(lines, tn))

    def handle(res):
        nonlocal games, moves_total
        seed, board, lines, tn, outcome, reason, detail = res
        games += 1
        moves_total += len(lines)
        outcomes[outcome] += 1
        if outcome != PASS:
            e = reasons.setdefault(reason, {"count": 0, "first": (seed, board, lines, tn),
                                            "detail": detail, "outcome": outcome})
            e["count"] += 1

    t0 = time.time()
    last_print = t0
    with ThreadPoolExecutor(args.workers) as pool:
        pending = set()
        while True:
            now = time.time()
            if now < deadline:
                while len(pending) < args.workers * 2:
                    seed = rng.randrange(2 ** 31)
                    use_grammar = rng.random() < 0.5
                    board = boards.fuzz() if use_grammar else None
                    kinds["grammar board" if use_grammar else "random board"] += 1
                    lines = gen_moves(rng)
                    ends_q = lines[-1].strip().lower() == "q"
                    if not ends_q:
                        eof_games += 1
                    tn = rng.random() < 0.7
                    pending.add(pool.submit(job, seed, board, lines, tn))
            elif not pending:
                break
            done, pending = wait(pending, timeout=1, return_when=FIRST_COMPLETED)
            for fut in done:
                handle(fut.result())
            if time.time() - last_print > 30:
                last_print = time.time()
                print("[%4ds] games=%d fail=%d unresolved=%d distinct=%d" % (
                    last_print - t0, games, outcomes[FAIL], outcomes[UNRESOLVED], len(reasons)), flush=True)
    elapsed = time.time() - t0

    # minimise one reproducer per distinct reason
    print("Minimising %d distinct failure(s)..." % len(reasons), flush=True)
    items = list(reasons.items())

    def mini(item):
        reason, e = item
        seed, board, lines, tn = e["first"]
        return minimise(camp, seed, board, lines, tn, reason)

    with ThreadPoolExecutor(args.workers) as pool:
        minimised = list(pool.map(mini, items))

    rows = []
    for n, ((reason, e), (ml, mtn)) in enumerate(zip(items, minimised), 1):
        seed, board, lines, tn = e["first"]
        save_failure(camp, args.out, n, reason, e["detail"], seed, board, lines, tn, ml, mtn, e["count"])
        rows.append((n, reason, e, seed, board, ml, mtn))

    with open(os.path.join(args.out, "summary.md"), "w") as f:
        f.write("# Fuzzing campaign summary\n\n")
        f.write("- Budget: %.1f min (elapsed %.0f s), workers: %d, master seed: %d\n"
                % (args.minutes, elapsed, args.workers, seed0))
        f.write("- Classes: `%s`\n" % camp.classes)
        f.write("- Games: %d, total move lines sent: %d\n" % (games, moves_total))
        f.write("- Games from a random board: %d, from a grammar board: %d\n"
                % (kinds["random board"], kinds["grammar board"]))
        f.write("- Games whose input does not end with q (EOF): %d\n" % eof_games)
        f.write("- PASS: %d, FAIL: %d, UNRESOLVED: %d\n\n" % (outcomes[PASS], outcomes[FAIL], outcomes[UNRESOLVED]))
        f.write("## Distinct failures (%d)\n\n" % len(rows))
        for n, reason, e, seed, board, ml, mtn in rows:
            f.write("### %d. %s\n\n- Outcome: %s, occurrences: %d\n- Detail: `%s`\n- Seed: %d\n- Board: `%s`\n"
                    % (n, reason, e["outcome"], e["count"], e["detail"].replace("\n", " | ")[:300], seed,
                       board or "random (from seed)"))
            f.write("- Minimal input (%d lines): `%r`\n- Repro: `%s`\n\n"
                    % (len(ml), to_text(ml, mtn),
                       repro_cmd(camp, seed, board, os.path.join(args.out, "failures", "%d.min.input" % n))))
    print(open(os.path.join(args.out, "summary.md")).read())


if __name__ == "__main__":
    main()
