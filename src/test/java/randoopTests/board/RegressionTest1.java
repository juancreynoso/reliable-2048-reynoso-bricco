package randoopTests.board;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveLeft();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board7.getSize();
        java.lang.Class<?> wildcardClass9 = board7.getClass();
        boolean boolean10 = board1.equals((java.lang.Object) board7);
        boolean boolean11 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        boolean boolean15 = board13.isFull();
        boolean boolean16 = board13.moveDown();
        int int17 = board13.getSize();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Board.Direction direction20 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean21 = board18.move(direction20);
        boolean boolean22 = board13.move(direction20);
        boolean boolean23 = board1.move(direction20);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board1.getEmptyPositions();
        boolean boolean25 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Position position28 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) 10);
        boolean boolean29 = board1.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + direction20 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction20.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        int int2 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(1073741824);
        boolean boolean5 = cell4.isEmpty();
        boolean boolean6 = cell0.canMergeWith(cell4);
        int int7 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 0);
        boolean boolean4 = position2.equals((java.lang.Object) "Not a valid tile: '");
        boolean boolean6 = position2.equals((java.lang.Object) ",");
        int int7 = position2.row;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (short) 1);
        int int14 = cell13.getValue();
        int int15 = cell13.getValue();
        boolean boolean16 = position2.equals((java.lang.Object) int15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        boolean boolean18 = board17.isFull();
        boolean boolean19 = board17.moveLeft();
        ar.edu.unrc.game2048.Board.Direction direction20 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean21 = board17.move(direction20);
        boolean boolean22 = board17.moveUp();
        boolean boolean23 = position2.equals((java.lang.Object) board17);
        java.lang.String str24 = board17.toString();
        boolean boolean25 = board17.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + direction20 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction20.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|    4|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str24, "Score: 4\n+-----+-----+-----+-----+\n|    4|    4|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: 0?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|    2|     |     |     |?+-----+-----+-----+-----+?|     |     |     |    2|?+-----+-----+-----+-----+?|    2|     |     |     |?+-----+-----+-----+-----+?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.Class<?> wildcardClass3 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board.Direction direction5 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean6 = board3.move(direction5);
        boolean boolean7 = board1.move(direction5);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board9.isFull();
        boolean boolean12 = board9.moveDown();
        int int13 = board9.getSize();
        boolean boolean14 = board9.moveDown();
        int int15 = board9.getSize();
        boolean boolean17 = board9.equals((java.lang.Object) (short) 100);
        boolean boolean18 = board1.equals((java.lang.Object) board9);
        long long19 = board1.getScore();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        boolean boolean25 = board23.moveDown();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean30 = board29.isFull();
        ar.edu.unrc.game2048.Cell cell33 = board29.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board34);
        boolean boolean36 = board35.isFull();
        ar.edu.unrc.game2048.Cell cell39 = board35.getCell(0, (int) (short) 1);
        boolean boolean40 = cell33.canMergeWith(cell39);
        board23.setCell(0, (int) (short) 1, cell33);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(board42);
        boolean boolean44 = board43.isFull();
        ar.edu.unrc.game2048.Cell cell47 = board43.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(board48);
        boolean boolean50 = board49.isFull();
        ar.edu.unrc.game2048.Cell cell53 = board49.getCell(0, (int) (short) 1);
        boolean boolean54 = cell47.canMergeWith(cell53);
        boolean boolean55 = cell33.canMergeWith(cell47);
        java.lang.String str56 = cell47.toString();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (short) 100, 536870912, cell47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 536870912) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + direction5 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction5.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "." + "'", str56, ".");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (short) 1);
        boolean boolean18 = cell11.canMergeWith(cell17);
        board1.setCell(0, (int) (short) 1, cell11);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        ar.edu.unrc.game2048.Cell cell25 = board21.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        boolean boolean28 = board27.isFull();
        ar.edu.unrc.game2048.Cell cell31 = board27.getCell(0, (int) (short) 1);
        boolean boolean32 = cell25.canMergeWith(cell31);
        boolean boolean33 = cell11.canMergeWith(cell25);
        java.lang.String str34 = cell11.toString();
        java.lang.String str35 = cell11.toString();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(board42);
        boolean boolean44 = board43.isFull();
        ar.edu.unrc.game2048.Cell cell47 = board43.getCell(0, (int) (short) 1);
        boolean boolean48 = cell41.canMergeWith(cell47);
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board(board49);
        boolean boolean51 = board50.isFull();
        ar.edu.unrc.game2048.Cell cell54 = board50.getCell(0, (int) (short) 1);
        java.lang.String str55 = cell54.toString();
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(board59);
        boolean boolean61 = board60.isFull();
        ar.edu.unrc.game2048.Cell cell64 = board60.getCell(0, (int) (short) 1);
        boolean boolean65 = cell64.isEmpty();
        board56.setCell(1, 0, cell64);
        boolean boolean67 = cell54.canMergeWith(cell64);
        ar.edu.unrc.game2048.Cell cell69 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int70 = cell69.getValue();
        boolean boolean71 = cell54.canMergeWith(cell69);
        boolean boolean72 = cell47.canMergeWith(cell54);
        ar.edu.unrc.game2048.Board board73 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board74 = new ar.edu.unrc.game2048.Board(board73);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet75 = board74.getEmptyPositions();
        boolean boolean76 = board74.moveDown();
        boolean boolean78 = board74.equals((java.lang.Object) ": ");
        boolean boolean79 = board74.isFull();
        boolean boolean80 = cell54.equals((java.lang.Object) board74);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell81 = cell11.mergeWith(cell54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "." + "'", str55, ".");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1073741824 + "'", int70 == 1073741824);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(positionSet75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveLeft();
        ar.edu.unrc.game2048.Board.Direction direction3 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean4 = board0.move(direction3);
        boolean boolean5 = board0.moveUp();
        boolean boolean6 = board0.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = board8.isFull();
        boolean boolean11 = board8.moveDown();
        int int12 = board8.getSize();
        boolean boolean13 = board8.moveDown();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board8);
        java.lang.String str15 = board8.toString();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        boolean boolean19 = board17.isFull();
        boolean boolean20 = board17.moveDown();
        int int21 = board17.getSize();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        ar.edu.unrc.game2048.Board.Direction direction24 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean25 = board22.move(direction24);
        boolean boolean26 = board17.move(direction24);
        boolean boolean27 = board8.move(direction24);
        boolean boolean28 = board0.move(direction24);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean30 = board0.moveUp();
        boolean boolean31 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction3 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction3.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + direction24 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction24.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (short) 1);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = cell5.equals((java.lang.Object) board8);
        boolean boolean11 = board8.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board12.isWinningBoard();
        int int15 = board12.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        boolean boolean20 = board18.isFull();
        long long21 = board18.getScore();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean24 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell(0, (int) (short) 1);
        boolean boolean28 = board23.isFull();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board30.getEmptyPositions();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board32);
        ar.edu.unrc.game2048.Board.Direction direction34 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean35 = board32.move(direction34);
        boolean boolean36 = board30.move(direction34);
        boolean boolean37 = board23.move(direction34);
        boolean boolean38 = board18.move(direction34);
        boolean boolean39 = board12.move(direction34);
        boolean boolean40 = board8.move(direction34);
        java.lang.Class<?> wildcardClass41 = board8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertTrue("'" + direction34 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction34.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 0);
        boolean boolean4 = position2.equals((java.lang.Object) "Not a valid tile: '");
        boolean boolean6 = position2.equals((java.lang.Object) ",");
        int int7 = position2.row;
        int int8 = position2.row;
        int int9 = position2.row;
        java.lang.String str10 = position2.toString();
        int int11 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(1, 0)" + "'", str10, "(1, 0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        java.lang.String str4 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.String str8 = board1.toString();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        boolean boolean12 = board10.isFull();
        boolean boolean13 = board10.moveDown();
        int int14 = board10.getSize();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        ar.edu.unrc.game2048.Board.Direction direction17 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean18 = board15.move(direction17);
        boolean boolean19 = board10.move(direction17);
        boolean boolean20 = board1.move(direction17);
        boolean boolean21 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position24 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 0);
        boolean boolean26 = position24.equals((java.lang.Object) "Not a valid tile: '");
        boolean boolean28 = position24.equals((java.lang.Object) ",");
        int int29 = position24.row;
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (short) 1);
        int int36 = cell35.getValue();
        int int37 = cell35.getValue();
        boolean boolean38 = position24.equals((java.lang.Object) int37);
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board39);
        boolean boolean41 = board40.isFull();
        ar.edu.unrc.game2048.Cell cell44 = board40.getCell(0, (int) (short) 1);
        boolean boolean45 = board40.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet46 = board40.getEmptyPositions();
        boolean boolean47 = board40.isFull();
        boolean boolean48 = board40.moveUp();
        boolean boolean49 = position24.equals((java.lang.Object) board40);
        boolean boolean50 = board1.equals((java.lang.Object) boolean49);
        boolean boolean51 = board1.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction17.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(positionSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        boolean boolean2 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (short) 1);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = cell5.equals((java.lang.Object) board8);
        boolean boolean11 = board8.moveUp();
        boolean boolean12 = board8.moveUp();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board13.isWinningBoard();
        java.lang.String str16 = board13.toString();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean18 = board8.equals((java.lang.Object) board17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        long long5 = board1.getScore();
        java.lang.Class<?> wildcardClass6 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.String str8 = board1.toString();
        boolean boolean9 = board1.moveUp();
        boolean boolean10 = board1.isFull();
        boolean boolean11 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean5 = board4.isFull();
        ar.edu.unrc.game2048.Cell cell8 = board4.getCell(0, (int) (short) 1);
        boolean boolean9 = cell8.isEmpty();
        board0.setCell(1, 0, cell8);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean12 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(16, 42L);
        boolean boolean3 = board2.moveLeft();
        long long4 = board2.getScore();
        boolean boolean5 = board2.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board2.getEmptyPositions();
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(536870912);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 2 and 536870912");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (short) 1);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = cell5.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell(0, (int) (short) 1);
        int int17 = cell16.getValue();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board19.getEmptyPositions();
        boolean boolean21 = cell16.equals((java.lang.Object) board19);
        boolean boolean22 = board19.moveDown();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board23.isWinningBoard();
        int int26 = board23.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board23.getEmptyPositions();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board29.getEmptyPositions();
        boolean boolean31 = board29.isFull();
        long long32 = board29.getScore();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board33);
        boolean boolean35 = board34.isFull();
        ar.edu.unrc.game2048.Cell cell38 = board34.getCell(0, (int) (short) 1);
        boolean boolean39 = board34.isFull();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board40);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board41.getEmptyPositions();
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(board43);
        ar.edu.unrc.game2048.Board.Direction direction45 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean46 = board43.move(direction45);
        boolean boolean47 = board41.move(direction45);
        boolean boolean48 = board34.move(direction45);
        boolean boolean49 = board29.move(direction45);
        boolean boolean50 = board23.move(direction45);
        boolean boolean51 = board19.move(direction45);
        boolean boolean52 = cell5.equals((java.lang.Object) direction45);
        java.lang.String str53 = cell5.toString();
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(board54);
        boolean boolean56 = board55.isFull();
        ar.edu.unrc.game2048.Cell cell59 = board55.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board61 = new ar.edu.unrc.game2048.Board(board60);
        boolean boolean62 = board61.isFull();
        ar.edu.unrc.game2048.Cell cell65 = board61.getCell(0, (int) (short) 1);
        boolean boolean66 = cell59.canMergeWith(cell65);
        ar.edu.unrc.game2048.Cell cell67 = null;
        boolean boolean68 = cell65.canMergeWith(cell67);
        boolean boolean69 = cell65.isEmpty();
        int int70 = cell65.getValue();
        boolean boolean71 = cell5.canMergeWith(cell65);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertTrue("'" + direction45 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction45.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "." + "'", str53, ".");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cell59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board2.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board2.getEmptyPositions();
        java.lang.Class<?> wildcardClass5 = positionSet4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        boolean boolean7 = board5.moveDown();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.isFull();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell(0, (int) (short) 1);
        boolean boolean22 = cell15.canMergeWith(cell21);
        board5.setCell(0, (int) (short) 1, cell15);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        ar.edu.unrc.game2048.Cell cell29 = board25.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (short) 1);
        boolean boolean36 = cell29.canMergeWith(cell35);
        boolean boolean37 = cell15.canMergeWith(cell29);
        java.lang.String str38 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell39 = null;
        boolean boolean40 = cell15.canMergeWith(cell39);
        boolean boolean41 = board2.equals((java.lang.Object) cell39);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction2 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean3 = board0.move(direction2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + direction2 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction2.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (short) 1);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = cell5.equals((java.lang.Object) board8);
        long long11 = board8.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board8.getEmptyPositions();
        boolean boolean13 = board8.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (short) 1);
        boolean boolean6 = board1.isLosingBoard();
        boolean boolean7 = board1.isFull();
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 536870912);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        int int8 = board5.getSize();
        long long9 = board5.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board5.getEmptyPositions();
        boolean boolean11 = board0.equals((java.lang.Object) board5);
        boolean boolean12 = board5.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        int int2 = cell0.getValue();
        int int3 = cell0.getValue();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell9 = board5.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.isFull();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell(0, (int) (short) 1);
        boolean boolean16 = cell9.canMergeWith(cell15);
        boolean boolean17 = cell0.canMergeWith(cell9);
        java.lang.String str18 = cell9.toString();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean24 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell(0, (int) (short) 1);
        boolean boolean28 = cell27.isEmpty();
        board19.setCell(1, 0, cell27);
        int int30 = cell27.getValue();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell(0, (int) (short) 1);
        java.lang.String str37 = cell36.toString();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board41);
        boolean boolean43 = board42.isFull();
        ar.edu.unrc.game2048.Cell cell46 = board42.getCell(0, (int) (short) 1);
        boolean boolean47 = cell46.isEmpty();
        board38.setCell(1, 0, cell46);
        boolean boolean49 = cell36.canMergeWith(cell46);
        ar.edu.unrc.game2048.Cell cell51 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int52 = cell51.getValue();
        boolean boolean53 = cell36.canMergeWith(cell51);
        boolean boolean54 = cell27.canMergeWith(cell51);
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(board55);
        boolean boolean57 = board56.isFull();
        ar.edu.unrc.game2048.Cell cell60 = board56.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board61 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board62 = new ar.edu.unrc.game2048.Board(board61);
        boolean boolean63 = board62.isFull();
        ar.edu.unrc.game2048.Cell cell66 = board62.getCell(0, (int) (short) 1);
        boolean boolean67 = cell60.canMergeWith(cell66);
        ar.edu.unrc.game2048.Board board68 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board69 = new ar.edu.unrc.game2048.Board(board68);
        boolean boolean70 = board69.isFull();
        ar.edu.unrc.game2048.Cell cell73 = board69.getCell(0, (int) (short) 1);
        java.lang.String str74 = cell73.toString();
        ar.edu.unrc.game2048.Board board75 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board78 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board79 = new ar.edu.unrc.game2048.Board(board78);
        boolean boolean80 = board79.isFull();
        ar.edu.unrc.game2048.Cell cell83 = board79.getCell(0, (int) (short) 1);
        boolean boolean84 = cell83.isEmpty();
        board75.setCell(1, 0, cell83);
        boolean boolean86 = cell73.canMergeWith(cell83);
        ar.edu.unrc.game2048.Cell cell88 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int89 = cell88.getValue();
        boolean boolean90 = cell73.canMergeWith(cell88);
        boolean boolean91 = cell66.canMergeWith(cell73);
        boolean boolean92 = cell51.canMergeWith(cell73);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell93 = cell9.mergeWith(cell73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1073741824 + "'", int52 == 1073741824);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(cell73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "." + "'", str74, ".");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(cell83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1073741824 + "'", int89 == 1073741824);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(16, 0);
        int int3 = position2.col;
        int int4 = position2.row;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell(0, (int) (short) 1);
        boolean boolean11 = board6.isFull();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        ar.edu.unrc.game2048.Board.Direction direction17 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean18 = board15.move(direction17);
        boolean boolean19 = board13.move(direction17);
        boolean boolean20 = board6.move(direction17);
        boolean boolean21 = position2.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction17.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean5 = board4.isFull();
        ar.edu.unrc.game2048.Cell cell8 = board4.getCell(0, (int) (short) 1);
        boolean boolean9 = cell8.isEmpty();
        board0.setCell(1, 0, cell8);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board0.getCell(5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (5, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(1073741824);
        boolean boolean4 = cell3.isEmpty();
        boolean boolean5 = cell0.canMergeWith(cell3);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = cell0.equals(obj6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (short) 1);
        java.lang.String str14 = cell13.toString();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (short) 1);
        boolean boolean24 = cell23.isEmpty();
        board15.setCell(1, 0, cell23);
        boolean boolean26 = cell13.canMergeWith(cell23);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(16, 42L);
        boolean boolean30 = board29.moveLeft();
        long long31 = board29.getScore();
        boolean boolean32 = board29.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board29.getEmptyPositions();
        boolean boolean34 = cell13.equals((java.lang.Object) board29);
        boolean boolean35 = cell0.canMergeWith(cell13);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 1);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (short) 1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (short) 1);
        boolean boolean12 = cell5.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell13 = null;
        boolean boolean14 = cell11.canMergeWith(cell13);
        boolean boolean15 = cell11.isEmpty();
        java.lang.String str16 = cell11.toString();
        java.lang.String str17 = cell11.toString();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        boolean boolean19 = board18.isFull();
        boolean boolean20 = board18.moveLeft();
        ar.edu.unrc.game2048.Board.Direction direction21 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean22 = board18.move(direction21);
        boolean boolean23 = board18.moveUp();
        boolean boolean24 = board18.moveRight();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board26.getEmptyPositions();
        boolean boolean28 = board26.isFull();
        boolean boolean29 = board26.moveDown();
        int int30 = board26.getSize();
        boolean boolean31 = board26.moveDown();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board26);
        java.lang.String str33 = board26.toString();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board34);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board35.getEmptyPositions();
        boolean boolean37 = board35.isFull();
        boolean boolean38 = board35.moveDown();
        int int39 = board35.getSize();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board40);
        ar.edu.unrc.game2048.Board.Direction direction42 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean43 = board40.move(direction42);
        boolean boolean44 = board35.move(direction42);
        boolean boolean45 = board26.move(direction42);
        boolean boolean46 = board18.move(direction42);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean48 = board18.moveUp();
        boolean boolean49 = cell11.equals((java.lang.Object) board18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + direction21 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction21.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n" + "'", str33, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + direction42 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction42.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (short) 1);
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board.Direction direction12 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean13 = board10.move(direction12);
        boolean boolean14 = board8.move(direction12);
        boolean boolean15 = board1.move(direction12);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board1.getEmptyPositions();
        int int17 = board1.getSize();
        boolean boolean18 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        boolean boolean22 = board20.isFull();
        boolean boolean23 = board20.moveDown();
        int int24 = board20.getSize();
        boolean boolean25 = board20.moveDown();
        int int26 = board20.getSize();
        boolean boolean27 = board20.isLosingBoard();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean29 = board1.equals((java.lang.Object) board20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction12.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(5);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board1.equals((java.lang.Object) board2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (short) 1);
        boolean boolean6 = board1.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        boolean boolean8 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board1.getEmptyPositions();
        int int10 = board1.getSize();
        boolean boolean11 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str2 = board1.toString();
        int int3 = board1.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (short) 1);
        boolean boolean18 = cell17.isEmpty();
        board9.setCell(1, 0, cell17);
        int int20 = cell17.getValue();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (short) 1);
        java.lang.String str27 = cell26.toString();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell(0, (int) (short) 1);
        boolean boolean37 = cell36.isEmpty();
        board28.setCell(1, 0, cell36);
        boolean boolean39 = cell26.canMergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell41 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int42 = cell41.getValue();
        boolean boolean43 = cell26.canMergeWith(cell41);
        boolean boolean44 = cell17.canMergeWith(cell41);
        boolean boolean45 = cell7.canMergeWith(cell41);
        // The following exception was thrown during execution in test generation
        try {
            board4.setCell((-2147483648), 1, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-2147483648, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1073741824 + "'", int42 == 1073741824);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(1073741824);
        boolean boolean6 = cell5.isEmpty();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board8.isFull();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell(0, (int) (short) 1);
        int int13 = cell12.getValue();
        boolean boolean15 = cell12.equals((java.lang.Object) (short) 100);
        boolean boolean16 = cell5.equals((java.lang.Object) boolean15);
        int int17 = cell5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((-2147483648), 52, cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-2147483648, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1073741824 + "'", int17 == 1073741824);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (short) 1);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = cell5.equals((java.lang.Object) board8);
        boolean boolean11 = board8.hasEmptyCells();
        int int12 = board8.getSize();
        java.lang.Object obj13 = null;
        boolean boolean14 = board8.equals(obj13);
        java.lang.String str15 = board8.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2147483647, (int) 'a');
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }
}

