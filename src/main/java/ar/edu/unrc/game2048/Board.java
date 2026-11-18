package ar.edu.unrc.game2048;

import randoop.CheckRep;

import java.util.*;

/**
 * Represents the 2048 game board.
 * The board is a square grid of Cells, typically 4x4.
 *
 * Representation Invariants:
 * - grid is a non-null square matrix (rows == cols)
 * - all cells in the grid are non-null (they may be EMPTY)
 * - all cell values are valid per Cell invariants
 * - the board is always in a valid game state
 *
 * Thread-safety: This class is not thread-safe.
 */
public class Board {

    /**
     * Board default number of rows/columns (4 x 4)
     */
    public static final int DEFAULT_SIZE = 4;

    /**
     * Default winning value: when board contains this value, the player wins (2048)
     */
    public static final int WINNING_VALUE = 2048;

    /**
     * Largest board size accepted. Without a bound, {@code new Board(131072)}
     * tries to allocate 2^34 cells and never finishes (Randoop and EvoSuite
     * kept doing that with the constants of this class).
     */
    public static final int MAX_SIZE = 16;

    /**
     * Board size (i.e., number of rows and columns). Must be between 1 and {@link #MAX_SIZE}.
     */
    private final int size;

    /**
     * Contents of the board: a 2D array of Cells. grid[row][col] represents the cell at (row, col).
     */
    private final Cell[][] grid;

    /**
     * Game accumulated score. A long: every merge adds up to 2^30, so an int
     * score wraps around to a negative number after a few big merges.
     */
    private long score;

    /**
     * Seed used when none is given, so boards built by tests (and by Randoop or
     * EvoSuite) always get the same random tiles.
     */
    public static final long DEFAULT_SEED = 42;

    /**
     * Source of the random tiles. One per board (not static), so a board's tiles
     * do not depend on what other boards did before it.
     */
    private final Random random;

    /**
     * Creates a new board of the default size (4x4) with two random tiles.
     */
    public Board() {
        this(DEFAULT_SIZE);
    }

    /**
     * Creates a new board of the specified size with two random tiles.
     *
     * @param size the board size (between 1 and {@link #MAX_SIZE})
     * @throws IllegalArgumentException if size is out of range
     */
    public Board(int size) throws IllegalArgumentException {
        this(size, DEFAULT_SEED);
    }

    /**
     * Creates a new board of the specified size whose random tiles come from
     * the given seed. The same seed always gives the same game.
     *
     * @param size the board size (between 1 and {@link #MAX_SIZE})
     * @param seed the seed of the random tiles
     * @throws IllegalArgumentException if size is out of range
     */
    public Board(int size, long seed) throws IllegalArgumentException {
        if (size <= 0 || size > MAX_SIZE) {
            throw new IllegalArgumentException(
                    "Board size must be between 1 and " + MAX_SIZE + ": " + size);
        }
        this.size = size;
        this.grid = new Cell[size][size];
        this.score = 0;
        this.random = new Random(seed);
        initializeEmpty();
        addRandomTile();
        addRandomTile();
        assert repOk() : "invalid board after construction";
    }

    /**
     * Copy constructor - creates a deep copy of another board.
     * The copy gets its own generator, started from {@link #DEFAULT_SEED}.
     *
     * @param other the board to copy (must not be null)
     * @throws IllegalArgumentException if other is null
     */
    public Board(Board other) throws IllegalArgumentException {
        if (other == null) {
            throw new IllegalArgumentException("Cannot copy a null board");
        }
        this.size = other.size;
        this.grid = new Cell[size][];
        this.score = other.score;
        this.random = new Random(DEFAULT_SEED);
        for (int r = 0; r < size; r++) {
            this.grid[r] = other.grid[r].clone();   // cells are immutable: sharing them is safe
        }
        assert repOk() : "invalid board after copy";
    }

    /**
     * Largest tile allowed in an initial board: 2^17, the largest tile that can
     * appear in a real game on a 4x4 board. It was introduced in Assignment 5,
     * when larger tiles made merges and the score overflow an int; those
     * overflows are now fixed at their cause ({@link Cell#MAX_VALUE} and a
     * {@code long} score), and the bound stays as the input contract.
     */
    public static final int MAX_INITIAL_TILE = 131072;

    /**
     * Creates a 4x4 board from a string that lists its cells row by row,
     * e.g. "[0,0,0,0,4,2,0,0,0,0,0,0,2,2,2,2]". No random tiles are added:
     * the board is exactly the one described, with score 0.
     *
     * @param s the board description
     * @return the board described by {@code s}
     * @throws IllegalArgumentException if {@code s} is not exactly 16 valid tiles
     *         between brackets: each one 0, or a power of two from 2 up to
     *         {@link #MAX_INITIAL_TILE}, written without sign, spaces or leading zeros
     */
    public static Board fromString(String s) throws IllegalArgumentException {
        if (s == null || !s.startsWith("[") || !s.endsWith("]")) {
            throw new IllegalArgumentException("A board must be written as [v1,...,v16]: " + s);
        }
        // -1 keeps trailing empty values, so "[...,2,]" is rejected instead of ignored
        String[] values = s.substring(1, s.length() - 1).split(",", -1);
        int cells = DEFAULT_SIZE * DEFAULT_SIZE;
        if (values.length != cells) {
            throw new IllegalArgumentException(
                    "A board needs " + cells + " values, got " + values.length + ": " + s);
        }
        int[] tiles = new int[cells];
        for (int i = 0; i < cells; i++) {
            tiles[i] = parseTile(values[i]);
        }

        Board board = new Board();
        for (int i = 0; i < cells; i++) {   // overwrites every cell, random tiles included
            board.setCell(i / DEFAULT_SIZE, i % DEFAULT_SIZE, new Cell(tiles[i]));
        }
        return board;
    }

    /**
     * Parses one tile of a board string.
     *
     * @throws IllegalArgumentException if {@code v} is not 0 or a power of two
     *         from 2 up to {@link #MAX_INITIAL_TILE}
     */
    private static int parseTile(String v) {
        // Canonical decimals only: no sign, spaces or leading zeros, and at most
        // 6 digits (MAX_INITIAL_TILE has 6), so parseInt cannot overflow.
        if (!v.matches("0|[1-9][0-9]{0,5}")) {
            throw new IllegalArgumentException("Not a valid tile: '" + v + "'");
        }
        int value = Integer.parseInt(v);
        boolean powerOfTwo = (value & (value - 1)) == 0;
        if (value != 0 && (value < 2 || !powerOfTwo || value > MAX_INITIAL_TILE)) {
            throw new IllegalArgumentException("Not a valid tile: " + value);
        }
        return value;
    }

    /**
     * Initializes the board with all EMPTY cells.
     */
    private void initializeEmpty() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                grid[r][c] = Cell.EMPTY;
            }
        }
    }

    /**
     * Gets the board size (number of rows/columns).
     *
     * @return the board size
     */
    public int getSize() {
        return size;
    }

    /**
     * Gets the current score.
     *
     * @return the score
     */
    public long getScore() {
        return score;
    }

    /**
     * Gets the cell at the specified position.
     *
     * @param row the row index (0-based)
     * @param col the column index (0-based)
     * @return the cell at the specified position
     * @throws IndexOutOfBoundsException if row or col is out of bounds
     */
    public Cell getCell(int row, int col) throws IndexOutOfBoundsException {
        validatePosition(row, col);
        return grid[row][col];
    }

    /**
     * Sets a cell at the specified position.
     *
     * @param row the row index (0-based)
     * @param col the column index (0-based)
     * @param cell the cell to set (must not be null)
     * @throws IndexOutOfBoundsException if row or col is out of bounds
     * @throws IllegalArgumentException if cell is null
     */
    public void setCell(int row, int col, Cell cell)
            throws IndexOutOfBoundsException, IllegalArgumentException {
        validatePosition(row, col);
        if (cell == null) {
            throw new IllegalArgumentException("Cell cannot be null");
        }
        grid[row][col] = cell;
        assert repOk() : "invalid board after setCell(" + row + ", " + col + ", " + cell + ")";
    }

    /**
     * Validates that a position is within bounds.
     *
     * @param row the row index
     * @param col the column index
     * @throws IndexOutOfBoundsException if the position is out of bounds
     */
    private void validatePosition(int row, int col) throws IndexOutOfBoundsException {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("Position (%d, %d) is out of bounds for board size %d",
                            row, col, size)
            );
        }
    }

    /**
     * Gets all empty cells on the board.
     *
     * @return a set of positions of all empty cells
     */
    public Set<Position> getEmptyPositions() {
        Set<Position> empty = new HashSet<>();
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (grid[r][c].isEmpty()) {
                    empty.add(new Position(r, c));
                }
            }
        }
        return empty;
    }

    /**
     * Checks if the board has any empty cells.
     *
     * @return true if there is at least one empty cell
     */
    public boolean hasEmptyCells() {
        return !getEmptyPositions().isEmpty();
    }

    /**
     * Checks if the board is in a winning state.
     * A board is winning if it contains a cell with the WINNING_VALUE (2048).
     *
     * @return true if the board contains 2048
     */
    public boolean isWinningBoard() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (grid[r][c].getValue() == WINNING_VALUE) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if the board is in a losing state (game over).
     * A board is losing if there are no empty cells AND no adjacent cells
     * (horizontal or vertical) can be merged.
     *
     * @return true if the game is over and the player has lost
     */
    public boolean isLosingBoard() {
        if (hasEmptyCells()) {
            return false;
        }

        // Check for possible merges
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                Cell current = grid[r][c];
                // Check right neighbor
                if (c + 1 < size && current.canMergeWith(grid[r][c + 1])) {
                    return false;
                }
                // Check down neighbor
                if (r + 1 < size && current.canMergeWith(grid[r + 1][c])) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the board is full (no empty cells).
     *
     * @return true if there are no empty cells
     */
    public boolean isFull() {
        return !hasEmptyCells();
    }

    // ==================== MOVE OPERATIONS ====================

    /**
     * Moves all tiles upward.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveUp() {
        return move(Direction.UP);
    }

    /**
     * Moves all tiles downward.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveDown() {
        return move(Direction.DOWN);
    }

    /**
     * Moves all tiles left.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveLeft() {
        return move(Direction.LEFT);
    }

    /**
     * Moves all tiles right.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveRight() {
        return move(Direction.RIGHT);
    }

    /**
     * Moves all tiles in the given direction: every row (or column) is slid
     * towards that edge, merging equal neighbours. If the board changed, a
     * new random tile is added.
     *
     * @param direction the direction of the move (must not be null)
     * @return true if the board changed, false otherwise
     * @throws IllegalArgumentException if direction is null
     */
    public boolean move(Direction direction) throws IllegalArgumentException {
        if (direction == null) {
            throw new IllegalArgumentException("Direction cannot be null");
        }
        Board previous = new Board(this);

        for (int index = 0; index < size; index++) {
            List<Position> line = line(direction, index);
            List<Cell> cells = new ArrayList<>();
            for (Position p : line) {
                cells.add(grid[p.row][p.col]);
            }
            List<Cell> collapsed = collapseLine(cells);
            for (int i = 0; i < size; i++) {
                Position p = line.get(i);
                grid[p.row][p.col] = collapsed.get(i);
            }
        }

        boolean moved = finalizeMove(previous);
        assert repOk() : "invalid board after move " + direction;
        return moved;
    }

    /**
     * Positions of the {@code index}-th row (LEFT/RIGHT) or column (UP/DOWN),
     * ordered from the edge the tiles move towards, inward. Collapsing in
     * that order makes merges always favour the far edge.
     */
    private List<Position> line(Direction direction, int index) {
        List<Position> line = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int fromFarEdge = size - 1 - i;
            switch (direction) {
                case UP:    line.add(new Position(i, index)); break;
                case DOWN:  line.add(new Position(fromFarEdge, index)); break;
                case LEFT:  line.add(new Position(index, i)); break;
                default:    line.add(new Position(index, fromFarEdge)); break;  // RIGHT
            }
        }
        return line;
    }

    /**
     * Slides a line of cells (a row or column, ordered from the moving edge
     * inward) towards its start, merging adjacent equal cells and updating
     * the score, then pads the result back up to {@code size} with empty
     * cells.
     *
     * @param line the cells to collapse, ordered from the moving edge inward
     * @return the collapsed line, same order and length as the input
     */
    private List<Cell> collapseLine(List<Cell> line) {
        List<Cell> nonEmpty = new ArrayList<>();
        for (Cell cell : line) {
            if (!cell.isEmpty()) {
                nonEmpty.add(cell);
            }
        }

        List<Cell> merged = new ArrayList<>();
        int i = 0;
        while (i < nonEmpty.size()) {
            if (i + 1 < nonEmpty.size() &&
                    nonEmpty.get(i).canMergeWith(nonEmpty.get(i + 1))) {
                Cell mergedCell = nonEmpty.get(i).mergeWith(nonEmpty.get(i + 1));
                merged.add(mergedCell);
                score += mergedCell.getValue();
                i += 2;
            } else {
                merged.add(nonEmpty.get(i));
                i++;
            }
        }

        while (merged.size() < size) {
            merged.add(Cell.EMPTY);
        }

        return merged;
    }

    /**
     * Compares the board against its pre-move state and, if it changed,
     * adds a new random tile.
     *
     * @param previous a snapshot of the board taken before the move
     * @return true if the board changed as a result of the move
     */
    private boolean finalizeMove(Board previous) {
        boolean moved = !this.equals(previous);
        if (moved) {
            addRandomTile();
        }
        return moved;
    }

    // ==================== RANDOM TILE ADDITION (PRIVATE) ====================

    /**
     * Adds a random tile (2 or 4) to a random empty cell.
     * This method is private to maintain encapsulation - tiles are only added
     * during initialization or after successful moves.
     *
     * @return true if a tile was added, false if the board was full
     */
    private boolean addRandomTile() {
        Set<Position> empty = getEmptyPositions();
        if (empty.isEmpty()) {
            return false;
        }

        // Choose random position
        int randomIndex = random.nextInt(empty.size());
        Position pos = empty.stream().skip(randomIndex).findFirst().get();

        // 90% chance of 2, 10% chance of 4 (standard 2048 rules)
        int value = random.nextDouble() < 0.9 ? 2 : 4;
        grid[pos.row][pos.col] = new Cell(value);

        return true;
    }

    /**
     * Checks the representation invariant of this board.
     * A board is valid if the grid is a non-null square matrix, all cells
     * are non-null and individually valid, and the score is non-negative.
     *
     * <p>{@link CheckRep} makes Randoop call it after every method it
     * generates: a {@code false} result is reported as an error-revealing test.
     *
     * @return true if the representation invariant holds
     */
    @CheckRep
    public boolean repOk() {
        if (grid == null || size <= 0 || size > MAX_SIZE) {
            return false;
        }
        if (grid.length != size) {
            return false;
        }
        if (score < 0) {
            return false;
        }
        for (int r = 0; r < size; r++) {
            if (grid[r] == null || grid[r].length != size) {
                return false;
            }
            for (int c = 0; c < size; c++) {
                Cell cell = grid[r][c];
                if (cell == null || !cell.repOk()) {
                    return false;
                }
            }
        }
        return true;
    }

    // ==================== UTILITY METHODS ====================

    /**
     * Checks if this board is structurally identical to another.
     * Uses deep equality including score.
     *
     * @param o the object to compare
     * @return true if the boards are identical
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return size == board.size &&
                score == board.score &&
                Arrays.deepEquals(grid, board.grid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, Arrays.deepHashCode(grid), score);
    }

    /**
     * Returns a string representation of the board.
     * The board is displayed in a grid format with the current score.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Score: ").append(score).append("\n");
        for (int r = 0; r < size; r++) {
            sb.append("+");
            for (int c = 0; c < size; c++) {
                sb.append("-----+");
            }
            sb.append("\n|");
            for (int c = 0; c < size; c++) {
                String val = grid[r][c].isEmpty() ? "     " :
                        String.format("%5d", grid[r][c].getValue());
                sb.append(val).append("|");
            }
            sb.append("\n");
        }
        sb.append("+");
        for (int c = 0; c < size; c++) {
            sb.append("-----+");
        }
        sb.append("\n");
        return sb.toString();
    }

    // ==================== INNER CLASSES ====================

    /**
     * Represents a direction on the board, as used by {@link #move(Direction)}.
     */
    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    /**
     * Represents a position on the board.
     */
    public static class Position {
        public final int row;
        public final int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return row == position.row && col == position.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }

        @Override
        public String toString() {
            return "(" + row + ", " + col + ")";
        }
    }
}