package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    @Test
    public void cellInitValueOk() {
        Cell cell = new Cell(16);
        assertEquals(16, cell.getValue());
    }

    @Test
    public void isEmptyFails() {
        Cell cell = new Cell(2);
        assertFalse(cell.isEmpty());
    }

    @Test
    public void isEmptyOk() {
        Cell cell2 = new Cell(0);
        assertTrue(cell2.isEmpty());
    }

    @Test
    public void getValue() {
        Cell cell = new Cell(2);

        assertEquals(2, cell.getValue());
    }

    @Test
    public void canMergeWithOk() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(2);

        assertTrue(cell1.canMergeWith(cell2));
    }

    @Test
    public void canMergeWithFails() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(4);

        assertFalse(cell1.canMergeWith(cell2));
    }
    
    @Test public void bothCellsAreEmptyAndCanNotMerge() {
        Cell cell1 = new Cell(0);
        Cell cell2 = new Cell(0);

        assertFalse(cell1.canMergeWith(cell2));
    }

    @Test 
    public void secondCellIsEmptyAndCanNotMerge() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(0);

        assertFalse(cell1.canMergeWith(cell2));
    }

    @Test 
    public void firstCellIsEmptyAndCanNotMerge() {
        Cell cell1 = new Cell(0);
        Cell cell2 = new Cell(2);

        assertFalse(cell1.canMergeWith(cell2));
    }

    @Test
    public void mergeWithOk() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(2);
        Cell result = new Cell(4);

        assertEquals(result, cell1.mergeWith(cell2));
    }

    @Test
    public void mergeWithFails() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(4);

        assertThrowsExactly(IllegalArgumentException.class, () -> {
            cell1.mergeWith(cell2);
        });
    }

    @Test
    public void equalsOk() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(2);

        assertTrue(cell1.equals(cell2));
    }

    @Test
    public void equalsFails() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(4);

        assertFalse(cell1.equals(cell2));
    }

    @Test
    public void hashCodeOk() {
        Cell cell1 = new Cell(4);
        Cell cell2 = new Cell(4);

        int hashedCell1 = cell1.hashCode();
        int hashedCell2 = cell2.hashCode();

        assertEquals(hashedCell1, hashedCell2);
    }

    @Test
    public void toStringOk() {
        Cell cell = new Cell(16);

        assertEquals("16", cell.toString());
    }

    @Test
    public void initializeCellWithNegativeValue() {
        assertThrowsExactly(IllegalArgumentException.class, () -> {
            Cell cell = new Cell(-2);
        });
    }
}