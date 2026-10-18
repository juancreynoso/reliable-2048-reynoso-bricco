package ar.edu.unrc.game2048;

import org.junit.Test;
import static org.junit.Assert.*;

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

        try {
            cell1.mergeWith(cell2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
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
        try {
            Cell cell = new Cell(-2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void equalsSameInstanceOk() {
        Cell cell = new Cell(8);

        assertTrue(cell.equals(cell));
    }

    @Test
    public void equalsWithNullFails() {
        Cell cell = new Cell(2);

        assertFalse(cell.equals(null));
    }

    @Test
    public void equalsWithDifferentClassFails() {
        Cell cell = new Cell(2);

        assertFalse(cell.equals("2"));
    }

    @Test
    public void hashCodeDiffersForDifferentValues() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(4);

        assertNotEquals(cell1.hashCode(), cell2.hashCode());
    }

    @Test
    public void toStringEmptyCell() {
        Cell cell = new Cell(0);

        assertEquals(".", cell.toString());
    }

    @Test
    public void emptySingletonIsEmptyAndZero() {
        assertTrue(Cell.EMPTY.isEmpty());
        assertEquals(0, Cell.EMPTY.getValue());
    }

    @Test
    public void mergeWithBothEmptyFails() {
        Cell cell1 = new Cell(0);
        Cell cell2 = new Cell(0);

        try {
            cell1.mergeWith(cell2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void repOkAcceptsEmptyAndPowersOfTwoFromTwo() {
        assertTrue(new Cell(0).repOk());
        assertTrue(new Cell(2).repOk());
        assertTrue(new Cell(2048).repOk());
    }

    @Test
    public void repOkRejectsOne() {
        // 1 is 2^0, but the smallest tile in the game is 2
        assertFalse(new Cell(1).repOk());
    }

    @Test
    public void mergeWithLargeValueOk() {
        Cell cell1 = new Cell(1024);
        Cell cell2 = new Cell(1024);
        Cell result = new Cell(2048);

        assertEquals(result, cell1.mergeWith(cell2));
    }
}