package ar.edu.unrc.game2048;

import randoop.CheckRep;

import java.util.Objects;

/**
 * Represents a single cell in the 2048 game board.
 * A cell is either empty (value = 0) or contains a power of two from 2 on (2, 4, 8, ...).
 * 
 * Representation Invariant:
 * - value >= 0
 * - if value > 0, then value is a power of two and value >= 2
 * 
 * Immutable class - once created, a Cell cannot change its value.
 */
public final class Cell {

    /**
     * Cell value (0 for empty, or a power of two >= 2).
     */
    private final int value;
    
    /**
     * Largest tile an int can hold (2^30). Two such tiles cannot merge: 2^31
     * does not fit in an int (it would wrap around to a negative value).
     */
    public static final int MAX_VALUE = 1 << 30;

    /**
     * The empty cell singleton (value = 0).
     */
    public static final Cell EMPTY = new Cell(0);
    
    /**
     * Creates a new cell with the given value.
     * 
     * @param value the value of the cell (must be 0 or a power of two >= 2)
     * @throws IllegalArgumentException if the value is negative, 1, or not a power of two (except 0)
     */
    public Cell(int value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("Cell value cannot be negative: " + value);
        }
        if (value != 0 && (value & (value - 1)) != 0) {
            throw new IllegalArgumentException("Cell value must be a power of two: " + value);
        }
        if (value == 1) {
            // 1 is 2^0, but the smallest tile is 2: such a cell would break repOk()
            throw new IllegalArgumentException("Cell value must be 0 or at least 2: " + value);
        }
        this.value = value;
    }
    
    /**
     * Checks if this cell is empty.
     * 
     * @return true if the cell is empty (value == 0), false otherwise
     */
    public boolean isEmpty() {
        return value == 0;
    }
    
    /**
     * Gets the numeric value of this cell.
     * 
     * @return the cell value (0 for empty cells)
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Checks if this cell can merge with another cell.
     * Two cells can merge if they are both non-empty, have the same value,
     * and that value is below {@link #MAX_VALUE} (so the result fits in an int).
     * 
     * @param other the other cell to check merge compatibility with (may be null)
     * @return true if the cells can merge, false otherwise (also for null)
     */
    public boolean canMergeWith(Cell other) {
        return other != null && !isEmpty() && value == other.value && value < MAX_VALUE;
    }
    
    /**
     * Creates a new cell that is the result of merging this cell with another.
     * The resulting cell has double the value.
     * 
     * @param other the cell to merge with (must have the same value)
     * @return a new Cell with the merged value
     * @throws IllegalArgumentException if the cells cannot be merged
     *         (see {@link #canMergeWith(Cell)}), including when {@code other} is null
     */
    public Cell mergeWith(Cell other) throws IllegalArgumentException {
        if (!canMergeWith(other)) {
            throw new IllegalArgumentException(
                "Cannot merge cells: " + this + " and " + other
            );
        }
        return new Cell(this.value * 2);
    }

    /**
     * Checks the representation invariant of this cell.
     * A cell is valid if its value is zero (empty) or a power of two
     * that is at least 2.
     *
     * <p>{@link CheckRep} makes Randoop call it after every method it generates.
     *
     * @return true if the representation invariant holds
     */
    @CheckRep
    public boolean repOk() {
        if (value < 0) {
            return false;
        }
        return value == 0 || (value >= 2 && (value & (value - 1)) == 0);
    }

    /**
     * Compares this cell with another object for equality.
     * Two cells are equal if they have the same value.
     * 
     * @param o the object to compare with
     * @return true if the object is a Cell with the same value, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return value == cell.value;
    }
    
    /**
     * Returns the hash code for this cell.
     * Cells with the same value will have the same hash code.
     * 
     * @return the hash code based on the cell's value
     */
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
    
    /**
     * Returns a string representation of this cell.
     * Empty cells (value = 0) are represented as ".", non-empty cells as their numeric value.
     * 
     * @return "." if the cell is empty, otherwise the numeric value as a string
     */
    @Override
    public String toString() {
        return value == 0 ? "." : String.valueOf(value);
    }
}
