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
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.isFull();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        java.lang.String str3 = board2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), (int) (byte) -1);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean1 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        boolean boolean5 = cell2.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        boolean boolean9 = board7.isFull();
        boolean boolean10 = board7.moveDown();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isFull();
        boolean boolean14 = board7.equals((java.lang.Object) board12);
        boolean boolean15 = cell2.equals((java.lang.Object) boolean14);
        int int16 = cell2.getValue();
        boolean boolean17 = cell0.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        java.lang.String str20 = cell18.toString();
        java.lang.String str21 = cell18.toString();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean24 = cell22.equals((java.lang.Object) (-1.0f));
        boolean boolean25 = cell18.canMergeWith(cell22);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long29 = board28.getScore();
        java.lang.String str30 = board28.toString();
        java.lang.String str31 = board28.toString();
        boolean boolean32 = cell18.equals((java.lang.Object) board28);
        boolean boolean33 = cell2.canMergeWith(cell18);
        java.lang.Class<?> wildcardClass34 = cell2.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str30, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str31, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        boolean boolean3 = cell0.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        boolean boolean7 = board5.isFull();
        boolean boolean8 = board5.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        boolean boolean12 = board5.equals((java.lang.Object) board10);
        boolean boolean13 = cell0.equals((java.lang.Object) boolean12);
        int int14 = cell0.getValue();
        ar.edu.unrc.game2048.Board.Position position17 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        int int18 = position17.row;
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean20 = position17.equals((java.lang.Object) cell19);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board21.moveUp();
        boolean boolean24 = board21.isFull();
        boolean boolean25 = board21.moveRight();
        boolean boolean26 = cell19.equals((java.lang.Object) boolean25);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int28 = cell27.getValue();
        boolean boolean30 = cell27.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        boolean boolean34 = board32.isFull();
        boolean boolean35 = board32.moveDown();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        boolean boolean39 = board32.equals((java.lang.Object) board37);
        boolean boolean40 = cell27.equals((java.lang.Object) boolean39);
        boolean boolean41 = cell19.equals((java.lang.Object) boolean40);
        ar.edu.unrc.game2048.Cell cell42 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int43 = cell42.getValue();
        java.lang.String str44 = cell42.toString();
        java.lang.String str45 = cell42.toString();
        boolean boolean46 = cell42.isEmpty();
        boolean boolean47 = cell42.isEmpty();
        java.lang.String str48 = cell42.toString();
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int50 = cell49.getValue();
        boolean boolean52 = cell49.equals((java.lang.Object) "\n");
        boolean boolean53 = cell42.canMergeWith(cell49);
        boolean boolean54 = cell19.canMergeWith(cell49);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell55 = cell0.mergeWith(cell49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "." + "'", str48, ".");
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        java.lang.String str9 = board6.toString();
        long long10 = board6.getScore();
        boolean boolean11 = board6.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        boolean boolean4 = board1.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(3, 0L);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        boolean boolean3 = cell0.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        boolean boolean7 = board5.isFull();
        boolean boolean8 = board5.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        boolean boolean12 = board5.equals((java.lang.Object) board10);
        boolean boolean13 = cell0.equals((java.lang.Object) boolean12);
        int int14 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        boolean boolean18 = cell15.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        boolean boolean22 = board20.isFull();
        boolean boolean23 = board20.moveDown();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        boolean boolean27 = board20.equals((java.lang.Object) board25);
        boolean boolean28 = cell15.equals((java.lang.Object) boolean27);
        int int29 = cell15.getValue();
        boolean boolean30 = cell0.canMergeWith(cell15);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        boolean boolean34 = board32.moveDown();
        boolean boolean35 = cell0.equals((java.lang.Object) board32);
        java.lang.String str36 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell38 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int39 = cell38.getValue();
        int int40 = cell38.getValue();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int42 = cell41.getValue();
        java.lang.String str43 = cell41.toString();
        boolean boolean44 = cell38.canMergeWith(cell41);
        boolean boolean45 = cell0.canMergeWith(cell38);
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int47 = cell46.getValue();
        boolean boolean49 = cell46.equals((java.lang.Object) "\n");
        boolean boolean50 = cell46.isEmpty();
        boolean boolean51 = cell0.canMergeWith(cell46);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1073741824 + "'", int39 == 1073741824);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1073741824 + "'", int40 == 1073741824);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int4 = cell3.getValue();
        int int5 = cell3.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = cell3.canMergeWith(cell6);
        boolean boolean10 = cell0.canMergeWith(cell6);
        boolean boolean12 = cell6.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1073741824 + "'", int4 == 1073741824);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1073741824 + "'", int5 == 1073741824);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board4.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board4.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell(4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.moveDown();
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, (int) (byte) 1);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean6 = board1.equals((java.lang.Object) (short) 0);
        int int7 = board1.getSize();
        boolean boolean8 = board1.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board0.getCell((-1), 131072);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 131072) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        boolean boolean3 = cell0.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        boolean boolean7 = board5.isFull();
        boolean boolean8 = board5.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        boolean boolean12 = board5.equals((java.lang.Object) board10);
        boolean boolean13 = cell0.equals((java.lang.Object) boolean12);
        int int14 = cell0.getValue();
        java.lang.Class<?> wildcardClass15 = cell0.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-2147483648), (int) (byte) 1);
        int int3 = position2.col;
        int int4 = position2.row;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2147483648) + "'", int5 == (-2147483648));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: 0?+-----+-----+?|     |     |?+-----+-----+?|    2|    2|?+-----+-----+?");
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
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.isFull();
        java.lang.String str5 = board1.toString();
        long long6 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) " values, got ");
        java.lang.String str7 = position2.toString();
        int int8 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 0)" + "'", str3, "(-1, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(-1, 0)" + "'", str7, "(-1, 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 1073741824);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        boolean boolean3 = cell0.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        boolean boolean7 = board5.isFull();
        boolean boolean8 = board5.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        boolean boolean12 = board5.equals((java.lang.Object) board10);
        boolean boolean13 = cell0.equals((java.lang.Object) boolean12);
        int int14 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        boolean boolean18 = cell15.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        boolean boolean22 = board20.isFull();
        boolean boolean23 = board20.moveDown();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        boolean boolean27 = board20.equals((java.lang.Object) board25);
        boolean boolean28 = cell15.equals((java.lang.Object) boolean27);
        int int29 = cell15.getValue();
        boolean boolean30 = cell0.canMergeWith(cell15);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        boolean boolean34 = board32.moveDown();
        boolean boolean35 = cell0.equals((java.lang.Object) board32);
        boolean boolean36 = board32.isFull();
        boolean boolean37 = board32.moveDown();
        long long38 = board32.getScore();
        boolean boolean39 = board32.isFull();
        boolean boolean40 = board32.isFull();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 4L + "'", long38 == 4L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        int int6 = board5.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = cell0.canMergeWith(cell4);
        boolean boolean8 = cell4.isEmpty();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        boolean boolean12 = board10.isFull();
        boolean boolean13 = board10.moveDown();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board15.isFull();
        boolean boolean17 = board10.equals((java.lang.Object) board15);
        java.lang.String str18 = board15.toString();
        long long19 = board15.getScore();
        long long20 = board15.getScore();
        boolean boolean21 = cell4.equals((java.lang.Object) board15);
        java.lang.String str22 = cell4.toString();
        boolean boolean24 = cell4.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) (-2147483648));
        boolean boolean3 = board2.moveDown();
        boolean boolean4 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        boolean boolean4 = board1.isLosingBoard();
        boolean boolean5 = board1.isFull();
        boolean boolean7 = board1.equals((java.lang.Object) " and ");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board1.getCell(536870912, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (536870912, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveDown();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board8.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        boolean boolean11 = board8.moveUp();
        long long12 = board8.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4L + "'", long12 == 4L);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean8 = board6.move(direction7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        long long10 = board9.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        java.lang.String str3 = board0.toString();
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.hasEmptyCells();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.hasEmptyCells();
        boolean boolean10 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) (-1.0f));
        boolean boolean3 = cell0.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: 0?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|    2|     |     |     |?+-----+-----+-----+-----+?|    2|     |     |     |?+-----+-----+-----+-----+?|    2|    2|     |     |?+-----+-----+-----+-----+?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        boolean boolean4 = board1.isLosingBoard();
        boolean boolean5 = board1.isFull();
        long long6 = board1.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.moveUp();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.isLosingBoard();
        boolean boolean8 = board1.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("-----+");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: -----+");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        long long4 = board0.getScore();
        java.lang.Object obj5 = null;
        boolean boolean6 = board0.equals(obj5);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int10 = board9.getSize();
        ar.edu.unrc.game2048.Board.Direction direction11 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean12 = board9.move(direction11);
        boolean boolean13 = board9.moveDown();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long17 = board16.getScore();
        java.lang.String str18 = board16.toString();
        ar.edu.unrc.game2048.Board.Direction direction19 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean20 = board16.move(direction19);
        boolean boolean21 = board9.move(direction19);
        boolean boolean22 = board0.move(direction19);
        ar.edu.unrc.game2048.Board.Direction direction23 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean24 = board0.move(direction23);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int28 = cell27.getValue();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        long long31 = board29.getScore();
        boolean boolean32 = board29.isWinningBoard();
        boolean boolean33 = cell27.equals((java.lang.Object) board29);
        java.lang.String str34 = cell27.toString();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(2147483647, (-2147483648), cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2147483647, -2147483648) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction11.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction19 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction19.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + direction23 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction23.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        boolean boolean3 = cell0.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        boolean boolean7 = board5.isFull();
        boolean boolean8 = board5.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        boolean boolean12 = board5.equals((java.lang.Object) board10);
        boolean boolean13 = cell0.equals((java.lang.Object) boolean12);
        int int14 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        boolean boolean18 = cell15.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        boolean boolean22 = board20.isFull();
        boolean boolean23 = board20.moveDown();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        boolean boolean27 = board20.equals((java.lang.Object) board25);
        boolean boolean28 = cell15.equals((java.lang.Object) boolean27);
        int int29 = cell15.getValue();
        boolean boolean30 = cell0.canMergeWith(cell15);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        boolean boolean34 = board32.moveDown();
        boolean boolean35 = cell0.equals((java.lang.Object) board32);
        java.lang.String str36 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell38 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int39 = cell38.getValue();
        int int40 = cell38.getValue();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int42 = cell41.getValue();
        java.lang.String str43 = cell41.toString();
        boolean boolean44 = cell38.canMergeWith(cell41);
        boolean boolean45 = cell0.canMergeWith(cell38);
        int int46 = cell38.getValue();
        ar.edu.unrc.game2048.Cell cell47 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int48 = cell47.getValue();
        java.lang.String str49 = cell47.toString();
        java.lang.String str50 = cell47.toString();
        boolean boolean51 = cell47.isEmpty();
        boolean boolean52 = cell47.isEmpty();
        java.lang.String str53 = cell47.toString();
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int55 = cell54.getValue();
        boolean boolean57 = cell54.equals((java.lang.Object) "\n");
        boolean boolean58 = cell47.canMergeWith(cell54);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell59 = cell38.mergeWith(cell47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 1073741824 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1073741824 + "'", int39 == 1073741824);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1073741824 + "'", int40 == 1073741824);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1073741824 + "'", int46 == 1073741824);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "." + "'", str50, ".");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "." + "'", str53, ".");
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.hasEmptyCells();
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.isWinningBoard();
        boolean boolean10 = board1.moveLeft();
        boolean boolean11 = board1.moveUp();
        boolean boolean12 = board1.moveDown();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        int int15 = board14.getSize();
        int int16 = board14.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board14.getEmptyPositions();
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isFull();
        boolean boolean20 = board14.hasEmptyCells();
        boolean boolean21 = board14.hasEmptyCells();
        boolean boolean22 = board14.hasEmptyCells();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        long long25 = board23.getScore();
        boolean boolean26 = board23.isWinningBoard();
        ar.edu.unrc.game2048.Board.Direction direction27 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean28 = board23.move(direction27);
        boolean boolean29 = board14.move(direction27);
        boolean boolean30 = board1.move(direction27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + direction27 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction27.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.moveUp();
        java.lang.String str9 = board6.toString();
        java.lang.String str10 = board6.toString();
        boolean boolean11 = board1.equals((java.lang.Object) str10);
        boolean boolean12 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveUp();
        java.lang.Class<?> wildcardClass6 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board3);
        long long6 = board5.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.isWinningBoard();
        java.lang.String str7 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveDown();
        int int8 = board1.getSize();
        boolean boolean9 = board1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        boolean boolean4 = board1.isFull();
        boolean boolean5 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        long long5 = board3.getScore();
        boolean boolean6 = board3.isLosingBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board7.isFull();
        boolean boolean9 = board1.equals((java.lang.Object) boolean8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = cell0.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board4.hasEmptyCells();
        boolean boolean6 = board4.isFull();
        boolean boolean7 = board4.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveLeft();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = board8.moveRight();
        boolean boolean11 = board8.moveLeft();
        boolean boolean12 = board8.moveUp();
        boolean boolean13 = board1.equals((java.lang.Object) boolean12);
        boolean boolean14 = board1.moveRight();
        ar.edu.unrc.game2048.Cell cell17 = board1.getCell(1, 0);
        java.lang.String str18 = cell17.toString();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        int int21 = board20.getSize();
        boolean boolean22 = board20.moveRight();
        boolean boolean23 = board20.isLosingBoard();
        boolean boolean24 = cell17.equals((java.lang.Object) board20);
        ar.edu.unrc.game2048.Cell cell25 = null;
        boolean boolean26 = cell17.canMergeWith(cell25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) (-2147483648));
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position(16, (-2147483648));
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) '4', (long) 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

