package ar.edu.unrc.game2048;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void createBoardWithDefaultSize() {
        Board board = new Board();

        assertEquals(4, board.getSize());
    }

    @Test
    public void createBoardWithSpecificSize() {
        Board board = new Board(5);

        assertEquals(5, board.getSize());
    }

    @Test
    public void createACopyOfAGivenBoard() {
        Board board = new Board(5);
        Board boardCopy = new Board(board);

        assertEquals(board, boardCopy);
    }

    @Test
    public void theSizeOfADefaultBoardIs4() {
        Board board = new Board();

        assertEquals(4, board.getSize());
    }

    @Test
    public void theScoreOfAnInitializedBoardIs0() {
        Board board = new Board();

        assertEquals(0, board.getScore());
    }

    @Test
    public void getCellOk() {
        Board board = new Board();
        Cell c1 = new Cell(2);
        board.setCell(0,0, c1);

        Cell c2 = board.getCell(0,0);

        assertEquals(c1, c2);
    }

    @Test
    public void setCellOk() {
        Board board = new Board();
        Cell c1 = new Cell(2);
        board.setCell(0,0, c1);

        assertEquals(2, board.getCell(0,0).getValue());
    }

    @Test
    public void aBoardWithEmptyPositionsHasAnArrayWithThem() {
        Board board = new Board();

        Set<Board.Position> emptyPositions = board.getEmptyPositions();

        assertFalse(emptyPositions.isEmpty());
    }

    @Test
    public void anInitializedBoardHasEmptyCells() {
        Board board = new Board();

        assertTrue(board.hasEmptyCells());
    }

    @Test
    public void isWinningBoardOk() {
        Board board = new Board();
        Cell cell = new Cell(2048);
        board.setCell(2,2, cell);

        assertTrue(board.isWinningBoard());
    }
    
    @Test
    public void isNotWinningBoard() {
        Board board = new Board();
        Cell cell = new Cell(1024);
        board.setCell(2,2, cell);

        assertFalse(board.isWinningBoard());
    }

    @Test
    public void isNotLosingBoardAndCanMergeWithRightNeighbor() {
        Board board = new Board(2);

        int i = 1;
        for (int r = 0; r < board.getSize(); r++) {
            i *= 2;
            for (int c = 0; c < board.getSize(); c++) {
                Cell cell = new Cell(i);
                board.setCell(r, c, cell);
            }
        }

        assertFalse(board.isLosingBoard());
    }

    @Test
    public void isNotLosingBoardAndCanMergeWithDownNeighbor() {
        Board board = new Board(2);

        int i = 1;
        for (int r = 0; r < board.getSize(); r++) {
            i *= 2;
            for (int c = 0; c < board.getSize(); c++) {
                Cell cell = new Cell(i);
                board.setCell(c, r, cell);
            }
        }

        assertFalse(board.isLosingBoard());
    }

    @Test
    public void isNotLosingBoardHasEmptyCells() {
        Board board = new Board(2);
        
        assertFalse(board.isLosingBoard());
    }

    @Test
    public void isLosingBoardAndCannotMerge() {
        Board board = new Board(2);
        Cell c1 = new Cell(2);
        Cell c2 = new Cell(4);
        Cell c3 = new Cell(8);
        Cell c4 = new Cell(16);

        board.setCell(0, 0, c1);
        board.setCell(0, 1, c2);
        board.setCell(1, 0, c3);
        board.setCell(1, 1, c4);

        assertTrue(board.isLosingBoard());
    }

    @Test
    public void anInitializedBoardIsNotFull() {
        Board board = new Board();

        assertFalse(board.isFull());
    }

    @Test
    public void aBoardIsFull() {
        Board board = new Board(2);
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(4));
        board.setCell(1, 0, new Cell(8));
        board.setCell(1, 1, new Cell(16));

        assertTrue(board.isFull());
    }

    @Test
    public void moveACellUpAndAppearsInTheCorrectPosition() {
        Board board = new Board();
        cleanBoard(board);
        Cell cell = new Cell(2);
        board.setCell(3, 2, cell); // Last row right center col
        int emptyBefore = board.getEmptyPositions().size();

        boolean moved = board.moveUp();

        assertTrue(moved);
        Cell cellDst = board.getCell(0,2);
        assertEquals(2, cellDst.getValue());
        assertEquals(emptyBefore - 1, board.getEmptyPositions().size());
    }

    @Test
    public void moveACellDownAndAppearsInTheCorrectPosition() {
        Board board = new Board();
        cleanBoard(board);
        Cell cell = new Cell(2);
        board.setCell(0, 2, cell); // first row right center col
        int emptyBefore = board.getEmptyPositions().size();

        boolean moved = board.moveDown();

        assertTrue(moved);
        Cell cellDst = board.getCell(3,2);
        assertEquals(2, cellDst.getValue());
        assertEquals(emptyBefore - 1, board.getEmptyPositions().size());
    }

    @Test
    public void moveACellLeftAndAppearsInTheCorrectPosition() {
        Board board = new Board();
        cleanBoard(board);
        Cell cell = new Cell(2);
        board.setCell(2, 3, cell); // down-center row last col
        int emptyBefore = board.getEmptyPositions().size();

        boolean moved = board.moveLeft();

        assertTrue(moved);
        Cell cellDst = board.getCell(2,0);
        assertEquals(2, cellDst.getValue());
        assertEquals(emptyBefore - 1, board.getEmptyPositions().size());
    }

    @Test
    public void moveACellRightAndAppearsInTheCorrectPosition() {
        Board board = new Board();
        cleanBoard(board);
        Cell cell = new Cell(2);
        board.setCell(2, 0, cell); // down-center row first col
        int emptyBefore = board.getEmptyPositions().size();

        boolean moved = board.moveRight();

        assertTrue(moved);
        Cell cellDst = board.getCell(2,3);
        assertEquals(2, cellDst.getValue());
        assertEquals(emptyBefore - 1, board.getEmptyPositions().size());
    }

    @Test
    public void moveToAllDirectionsReturnFalseOnAnEmptyBoard() {
        Board board = new Board();
        cleanBoard(board);
        int emptyBefore = board.getEmptyPositions().size();

        assertFalse(board.moveUp());
        assertFalse(board.moveDown());
        assertFalse(board.moveLeft());
        assertFalse(board.moveRight());


        assertEquals(emptyBefore, board.getEmptyPositions().size());
    }

    @Test
    public void boardsWithSameStructureAndCellsAreEquals() {
        Board b1 = new Board(4);
        Board b2 = new Board(4);

        cleanBoard(b1);
        cleanBoard(b2);

        Cell c1 = new Cell(2);
        Cell c2 = new Cell(2);

        b1.setCell(0,0,c1);
        b2.setCell(0,0,c2);

        assertTrue(b1.equals(b2));
    }

    @Test
    public void hashCodeOfSameBoardsAreEquals() {
        Board board = new Board(2);
        Board boardCopy = new Board(board);

        assertEquals(board.hashCode(), boardCopy.hashCode());
    }

    @Test
    public void hashCodeOfANonEmptyBoardIsNotZero() {
        Board board = new Board(2);
        cleanBoard(board);
        board.setCell(0, 0, new Cell(2));

        assertNotEquals(0, board.hashCode());
    }

    @Test
    public void boardsWithDifferentCellsAreNotEquals() {
        Board b1 = new Board(2);
        Board b2 = new Board(2);
        cleanBoard(b1);
        cleanBoard(b2);

        b1.setCell(0, 0, new Cell(2));
        b2.setCell(0, 0, new Cell(4));

        assertFalse(b1.equals(b2));
    }

    @Test
    public void boardsWithDifferentSizesAreNotEquals() {
        Board b1 = new Board(2);
        Board b2 = new Board(4);

        assertFalse(b1.equals(b2));
    }

    @Test
    public void toStringContainsScoreAndValues() {
        Board board = new Board(2);
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, Cell.EMPTY);
        board.setCell(1, 0, new Cell(4));
        board.setCell(1, 1, Cell.EMPTY);

        String result = board.toString();

        assertTrue(result.contains("Score: " + board.getScore()));
        assertTrue(result.contains("2"));
        assertTrue(result.contains("4"));
    }

    @Test
    public void createPositionWithGivenRowAndColumn() {
        Board.Position position = new Board.Position(1, 3);

        assertEquals(1, position.row);
        assertEquals(3, position.col);
    }

    @Test
    public void positionsWithSameRowAndColumnAreEquals() {
        Board.Position p1 = new Board.Position(2, 3);
        Board.Position p2 = new Board.Position(2, 3);

        assertTrue(p1.equals(p2));
    }

    @Test
    public void positionsWithDifferentRowAreNotEquals() {
        Board.Position position = new Board.Position(2, 3);

        assertFalse(position.equals(new Board.Position(0, 0)));
        assertFalse(position.equals(new Board.Position(2, 0)));
        assertFalse(position.equals(null));
    }

    @Test
    public void positionIsTheSameComapredToItself() {
        Board.Position p1 = new Board.Position(2, 3);

        assertTrue(p1.equals(p1));
    }

    @Test
    public void hashCodeOfSamePositionsAreEquals() {
        Board.Position p1 = new Board.Position(2, 3);
        Board.Position p2 = new Board.Position(2, 3);

        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void positionHashCodeIsNotZero() {
        Board.Position position = new Board.Position(2, 3);

        assertNotEquals(0, position.hashCode());
    }

    @Test
    public void positionToStringIsOk() {
        Board.Position position = new Board.Position(2, 3);

        assertEquals("(2, 3)", position.toString());
    }

    @Test
    public void moveMergesTwoEqualAdjacentCellsIntoOne() {
        Board board = new Board();
        cleanBoard(board);
        board.setCell(2, 1, new Cell(2));
        board.setCell(3, 1, new Cell(2));

        board.moveUp();

        assertEquals(4, board.getCell(0, 1).getValue());
        assertEquals(4, board.getScore());
    }

    @Test
    public void canNotAddRandomTileNull() {
        Board board = new Board(2);

        try {
            board.setCell(0, 0, null);;
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void boardInitializedWithSizeNegative() {
        try {
            Board board = new Board(-2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void boardInitializedWithSizeZero() {
        try {
            Board board = new Board(0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test public void compareObjectsForEqualsAndAreExactlyTheSame() {
        Board board = new Board();

        assertTrue(board.equals(board));
    }

    @Test public void compareObjectsForEqualsAndOneIsNull() {
        Board board = new Board();

        assertFalse(board.equals(null));
    }

    @Test public void compareObjectsForEqualsAndOneIsAnotherClasw() {
        Board board = new Board();
        ArrayList<Integer> list = new ArrayList<Integer>();

        assertFalse(board.equals(list));
    }

    @Test
    public void setCellNotInAValidPosition() {
        Board board = new Board(2);
        Cell cell = new Cell(2);
        int row = 3;
        int col = 1;

        try {
            board.setCell(row, col, cell);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals(IndexOutOfBoundsException.class, e.getClass());
        }

    }

    @Test
    public void getCellNotInAValidPosition() {
        Board board = new Board(2);
        int row = 3;
        int col = 1;

        try {
            board.getCell(row, col);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals(IndexOutOfBoundsException.class, e.getClass());
        }
    }

    @Test
    public void getCellAtRowEqualToSize() {
        Board board = new Board(2);
        int row = 2;
        int col = 0;

        try {
            board.getCell(row, col);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals(IndexOutOfBoundsException.class, e.getClass());
        }
    }

    @Test
    public void getCellAtColEqualToSize() {
        Board board = new Board(2);
        int row = 0;
        int col = 2;

        try {
            board.getCell(row, col);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals(IndexOutOfBoundsException.class, e.getClass());
        }
    }

    @Test
    public void fromStringLoadsCellsRowByRow() {
        Board board = Board.fromString("[0,0,0,0,4,2,0,0,0,0,0,0,2,2,2,2]");

        assertEquals(4, board.getCell(1, 0).getValue());
        assertEquals(2, board.getCell(1, 1).getValue());
        assertEquals(2, board.getCell(3, 3).getValue());
        assertTrue(board.getCell(0, 0).isEmpty());
        assertEquals(10, board.getEmptyPositions().size()); // no random tiles added
        assertEquals(0, board.getScore());
        assertTrue(board.repOk());
    }

    @Test
    public void fromStringBoardCanBePlayed() {
        Board board = Board.fromString("[2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");

        assertTrue(board.moveLeft());
        assertEquals(4, board.getCell(0, 0).getValue());
        assertEquals(4, board.getScore());
    }

    @Test
    public void fromStringAcceptsTheLargestInitialTile() {
        Board board = Board.fromString("[131072,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");

        assertEquals(Board.MAX_INITIAL_TILE, board.getCell(0, 0).getValue());
        assertTrue(board.repOk());
    }

    // Found by the grammar-based fuzzer: merging two 2^30 tiles overflowed an int
    // and crashed in Cell.mergeWith().
    @Test
    public void fromStringRejectsTilesWhoseMergeOverflows() {
        try {
            Board.fromString("[1073741824,1073741824,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    // Found while analysing the bug above: four 2^29 tiles in a row made the score
    // overflow to a negative value on a single move.
    @Test
    public void fromStringRejectsTilesWhoseScoreOverflows() {
        try {
            Board.fromString("[536870912,536870912,536870912,536870912,0,0,0,0,0,0,0,0,0,0,0,0]");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    // Invalid boards that the mutation fuzzer found being accepted by fromString().
    @Test
    public void fromStringRejectsFewerThan16Values() {
        assertRejected("[0,0,0,512,16384,16384,0,0,32,16,0,0,0,0,0]");
    }

    @Test
    public void fromStringRejectsLeadingZeros() {
        assertRejected("[0,0,128,0,256,8192,8,512,0,0,0,00,0,0,0,0]");
    }

    @Test
    public void fromStringRejectsMissingBrackets() {
        assertRejected("0,0,0,0,4,2,0,0,0,0,0,0,2,2,2,2");
    }

    @Test
    public void fromStringRejectsOne() {
        assertRejected("[0,0,0,0,8,2,256,8,0,128,1,4096,8,0,0,512]");
    }

    @Test
    public void fromStringRejectsTrailingComma() {
        assertRejected("[0,0,0,0,0,16,0,16,0,256,0,0,131072,65536,32,]");
    }

    @Test
    public void fromStringRejectsNonNumericValues() {
        assertRejected("[16,0,0,0,0,0,0,,0,0,256,8,8,P0,4,64]");
    }

    private void assertRejected(String board) {
        try {
            Board.fromString(board);
            fail("Expected IllegalArgumentException for " + board);
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    /**
     * Helper for testing with an empty board
     * @param board the board to be cleaned
     */
    public void cleanBoard(Board board) {
        for (int r = 0; r < board.getSize(); r++) {
            for (int c = 0; c < board.getSize(); c++) {
                board.setCell(r, c, Cell.EMPTY);
            }
        }
    }

}