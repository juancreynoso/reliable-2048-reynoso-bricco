package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

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
    public void isNotLosingBoard() {
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
    public void anInitializedBoardIsNotFull() {
        Board board = new Board();

        assertFalse(board.isFull());
    }

    @Test
    public void moveACellUpAndAppearsInTheCorrectPosition() {
        Board board = new Board();
        cleanBoard(board);
        Cell cell = new Cell(2);
        board.setCell(3, 2, cell); // Last row right center col

        board.moveUp();

        Cell cellDst = board.getCell(0,2);

        assertEquals(2, cellDst.getValue());
    }

    @Test
    public void moveACellDownAndAppearsInTheCorrectPosition() {
        Board board = new Board();
        cleanBoard(board);
        Cell cell = new Cell(2);
        board.setCell(0, 2, cell); // first row right center col

        board.moveDown();

        Cell cellDst = board.getCell(3,2);

        assertEquals(2, cellDst.getValue());
    }

    @Test
    public void moveACellLeftAndAppearsInTheCorrectPosition() {
        Board board = new Board();
        cleanBoard(board);
        Cell cell = new Cell(2);
        board.setCell(2, 3, cell); // down-center row last col

        board.moveLeft();

        Cell cellDst = board.getCell(2,0);

        assertEquals(2, cellDst.getValue());
    }

    @Test
    public void moveACellRightAndAppearsInTheCorrectPosition() {
        Board board = new Board();
        cleanBoard(board);
        Cell cell = new Cell(2);
        board.setCell(2, 0, cell); // down-center row first col

        board.moveRight();

        Cell cellDst = board.getCell(2,3);

        assertEquals(2, cellDst.getValue());
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
    public void hashCodeOfSamePositionsAreEquals() {
        Board.Position p1 = new Board.Position(2, 3);
        Board.Position p2 = new Board.Position(2, 3);

        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void positionToStringIsOk() {
        Board.Position position = new Board.Position(2, 3);

        assertEquals("(2, 3)", position.toString());
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