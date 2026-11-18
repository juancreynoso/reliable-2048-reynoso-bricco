package randoopTests.board;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = ar.edu.unrc.game2048.Cell.MAX_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1073741824 + "'", int0 == 1073741824);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        long long0 = ar.edu.unrc.game2048.Board.DEFAULT_SEED;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 42L + "'", long0 == 42L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(1, 2048, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board1.getCell(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board0.getCell(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, (int) (short) -1);
        boolean boolean4 = position2.equals((java.lang.Object) 3);
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = ar.edu.unrc.game2048.Board.MAX_INITIAL_TILE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 131072 + "'", int0 == 131072);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell(0, (int) (byte) 0);
        int int11 = cell10.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(0, 2048, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int0 = ar.edu.unrc.game2048.Board.MAX_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        java.lang.String str5 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString(",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: ,");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("(0, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: (0, 10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((-1), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        int int7 = position2.col;
        int int8 = position2.col;
        java.lang.String str9 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0, 10)" + "'", str9, "(0, 10)");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board1.getCell((int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 2) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        int int12 = cell11.getValue();
        int int13 = cell11.getValue();
        boolean boolean14 = cell5.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        boolean boolean22 = cell20.equals((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell23 = cell11.mergeWith(cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        boolean boolean2 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        int int7 = cell5.getValue();
        java.lang.String str8 = cell5.toString();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        java.lang.String str15 = cell14.toString();
        int int16 = cell14.getValue();
        int int17 = cell14.getValue();
        java.lang.String str18 = cell14.toString();
        int int19 = cell14.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = cell5.mergeWith(cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ar.edu.unrc.game2048.Board board0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot copy a null board");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        boolean boolean8 = board1.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        boolean boolean4 = board1.isWinningBoard();
        boolean boolean5 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Cannot copy a null board");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Cannot copy a null board");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be 0 or at least 2: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        java.lang.String str15 = cell14.toString();
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell((-1), 2, cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 2) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board1.getCell(1073741824, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1073741824, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.isFull();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell(0, (int) (byte) 0);
        int int16 = cell15.getValue();
        int int17 = cell15.getValue();
        java.lang.String str18 = cell15.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell19 = cell5.mergeWith(cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.moveLeft();
        boolean boolean9 = board7.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board1.getCell(131072, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (131072, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell3 = board0.getCell(1, 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        boolean boolean18 = cell11.canMergeWith(cell17);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(4, (int) (byte) 0, cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        boolean boolean8 = board1.isFull();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean8 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        boolean boolean8 = board1.moveUp();
        java.lang.Class<?> wildcardClass9 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, (int) (short) -1);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        java.lang.Class<?> wildcardClass8 = board7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        int int6 = position2.row;
        java.lang.Class<?> wildcardClass7 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        boolean boolean8 = board1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board1.getCell(1073741824, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1073741824, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString(", ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: , ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass7 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        java.lang.String str15 = cell14.toString();
        int int16 = cell14.getValue();
        int int17 = cell14.getValue();
        java.lang.String str18 = cell14.toString();
        int int19 = cell14.getValue();
        java.lang.String str20 = cell14.toString();
        boolean boolean21 = cell5.canMergeWith(cell14);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean24 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell(0, (int) (byte) 0);
        java.lang.String str28 = cell27.toString();
        int int29 = cell27.getValue();
        int int30 = cell27.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell31 = cell14.mergeWith(cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Direction cannot be null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Direction cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveUp();
        boolean boolean6 = board1.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        java.lang.Class<?> wildcardClass17 = board9.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean7 = cell5.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell11 = board8.getCell(1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = cell5.mergeWith(cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        int int9 = cell5.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        long long3 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board1.getCell(2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2, 10) is out of bounds for board size 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean6 = cell5.isEmpty();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell(1, 0);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell(0, (int) (byte) 0);
        java.lang.String str17 = cell16.toString();
        int int18 = cell16.getValue();
        int int19 = cell16.getValue();
        java.lang.String str20 = cell16.toString();
        int int21 = cell16.getValue();
        boolean boolean22 = cell10.canMergeWith(cell16);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell23 = cell5.mergeWith(cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) -1, (long) 131072);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = position2.equals((java.lang.Object) board7);
        boolean boolean9 = board7.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 10)" + "'", str6, "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveDown();
        java.lang.Class<?> wildcardClass18 = board9.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board0.getCell(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        int int12 = cell11.getValue();
        int int13 = cell11.getValue();
        boolean boolean14 = cell5.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        java.lang.String str21 = cell20.toString();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell25 = board22.getCell(1, 0);
        boolean boolean26 = cell20.canMergeWith(cell25);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell27 = cell11.mergeWith(cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.hasEmptyCells();
        boolean boolean5 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, (int) (byte) 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        int int14 = cell13.getValue();
        int int15 = cell13.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) 1, (int) (byte) 100, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: ?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        boolean boolean12 = cell5.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = board20.isFull();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell(0, (int) (byte) 0);
        java.lang.String str25 = cell24.toString();
        int int26 = cell24.getValue();
        board14.setCell(0, 0, cell24);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell28 = cell5.mergeWith(cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        java.lang.String str12 = cell11.toString();
        int int13 = cell11.getValue();
        board1.setCell(0, 0, cell11);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        int int27 = cell26.getValue();
        int int28 = cell26.getValue();
        boolean boolean29 = cell20.canMergeWith(cell26);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (byte) 0);
        boolean boolean42 = cell35.canMergeWith(cell41);
        int int43 = cell41.getValue();
        boolean boolean44 = cell26.equals((java.lang.Object) int43);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell45 = cell11.mergeWith(cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell3 = board0.getCell(1, 0);
        boolean boolean4 = board0.isFull();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        int int7 = board6.getSize();
        java.lang.String str8 = board6.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(131072, 1);
        int int11 = position10.row;
        boolean boolean12 = position2.equals((java.lang.Object) position10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 131072 + "'", int11 == 131072);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        int int9 = board1.getSize();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveUp();
        long long18 = board9.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        boolean boolean12 = cell5.canMergeWith(cell11);
        int int13 = cell11.getValue();
        java.lang.Class<?> wildcardClass14 = cell11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 10, (long) 'a');
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean5 = board4.isFull();
        ar.edu.unrc.game2048.Cell cell8 = board4.getCell(0, (int) (byte) 0);
        boolean boolean9 = cell8.isEmpty();
        int int10 = cell8.getValue();
        boolean boolean11 = board2.equals((java.lang.Object) int10);
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        boolean boolean2 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell(1, 0);
        boolean boolean11 = cell5.canMergeWith(cell10);
        java.lang.String str12 = cell10.toString();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board14.isFull();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = board20.isFull();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell(0, (int) (byte) 0);
        int int25 = cell24.getValue();
        int int26 = cell24.getValue();
        boolean boolean27 = cell18.canMergeWith(cell24);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean30 = board29.isFull();
        ar.edu.unrc.game2048.Cell cell33 = board29.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board34);
        boolean boolean36 = board35.isFull();
        ar.edu.unrc.game2048.Cell cell39 = board35.getCell(0, (int) (byte) 0);
        boolean boolean40 = cell33.canMergeWith(cell39);
        int int41 = cell39.getValue();
        boolean boolean42 = cell24.equals((java.lang.Object) int41);
        java.lang.String str43 = cell24.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell44 = cell10.mergeWith(cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board8.isFull();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        boolean boolean16 = board14.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("invalid board after construction");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: invalid board after construction");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board1.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        java.lang.String str14 = cell13.toString();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell18 = board15.getCell(1, 0);
        boolean boolean19 = cell13.canMergeWith(cell18);
        java.lang.String str20 = cell18.toString();
        boolean boolean21 = board1.equals((java.lang.Object) str20);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.row;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        int int11 = board8.getSize();
        ar.edu.unrc.game2048.Board.Direction direction12 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean13 = board8.move(direction12);
        boolean boolean15 = board8.equals((java.lang.Object) "]");
        boolean boolean16 = position2.equals((java.lang.Object) board8);
        boolean boolean17 = board8.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction12.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(4);
        boolean boolean9 = position2.equals((java.lang.Object) 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, 3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 10, (long) 1);
        long long3 = board2.getScore();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board0.getCell(2048, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 2) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        int int8 = position2.col;
        int int9 = position2.row;
        int int10 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        boolean boolean9 = cell5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        long long7 = board1.getScore();
        boolean boolean8 = board1.isFull();
        boolean boolean9 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        boolean boolean11 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Position (%d, %d) is out of bounds for board size %d");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Position (%d, %d) is out of bounds for board size %d");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(3, (long) (byte) 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.moveUp();
        boolean boolean9 = board6.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board1.getCell(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, 42L);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell(1, 0);
        boolean boolean11 = cell5.canMergeWith(cell10);
        int int12 = cell10.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(131072, 8L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 131072");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board1.isLosingBoard();
        java.lang.String str16 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        boolean boolean3 = board1.moveLeft();
        long long4 = board1.getScore();
        boolean boolean5 = board1.isFull();
        java.lang.String str6 = board1.toString();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        int int21 = cell20.getValue();
        int int22 = cell20.getValue();
        boolean boolean23 = cell14.canMergeWith(cell20);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        ar.edu.unrc.game2048.Cell cell29 = board25.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        boolean boolean36 = cell29.canMergeWith(cell35);
        int int37 = cell35.getValue();
        boolean boolean38 = cell20.equals((java.lang.Object) int37);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(4, (int) (short) 100, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.hasEmptyCells();
        boolean boolean7 = board1.moveRight();
        boolean boolean8 = board1.moveDown();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.moveLeft();
        boolean boolean9 = board7.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        boolean boolean3 = board1.moveLeft();
        long long4 = board1.getScore();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = board8.isFull();
        boolean boolean11 = board8.moveDown();
        boolean boolean12 = board8.moveDown();
        boolean boolean13 = board8.moveUp();
        boolean boolean14 = board8.moveLeft();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board18.isFull();
        ar.edu.unrc.game2048.Cell cell22 = board18.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board24.isFull();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell(0, (int) (byte) 0);
        int int29 = cell28.getValue();
        int int30 = cell28.getValue();
        boolean boolean31 = cell22.canMergeWith(cell28);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board32);
        boolean boolean34 = board33.isFull();
        ar.edu.unrc.game2048.Cell cell37 = board33.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board38);
        boolean boolean40 = board39.isFull();
        ar.edu.unrc.game2048.Cell cell43 = board39.getCell(0, (int) (byte) 0);
        boolean boolean44 = cell37.canMergeWith(cell43);
        int int45 = cell43.getValue();
        boolean boolean46 = cell28.equals((java.lang.Object) int45);
        java.lang.String str47 = cell28.toString();
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell51 = board48.getCell(1, 0);
        boolean boolean52 = cell28.canMergeWith(cell51);
        board8.setCell((int) (byte) 1, (int) (short) 1, cell28);
        int int54 = cell28.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(2, (-1), cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: 0?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|    2|     |     |     |?+-----+-----+-----+-----+?|     |     |     |    2|?+-----+-----+-----+-----+?|    2|     |     |     |?+-----+-----+-----+-----+?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board1.getCell((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board8.isFull();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        int int16 = cell5.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        boolean boolean12 = cell5.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board14.isFull();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = board20.isFull();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell(0, (int) (byte) 0);
        int int25 = cell24.getValue();
        int int26 = cell24.getValue();
        boolean boolean27 = cell18.canMergeWith(cell24);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean30 = board29.isFull();
        ar.edu.unrc.game2048.Cell cell33 = board29.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board34);
        boolean boolean36 = board35.isFull();
        ar.edu.unrc.game2048.Cell cell39 = board35.getCell(0, (int) (byte) 0);
        boolean boolean40 = cell33.canMergeWith(cell39);
        int int41 = cell39.getValue();
        boolean boolean42 = cell24.equals((java.lang.Object) int41);
        java.lang.String str43 = cell24.toString();
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell47 = board44.getCell(1, 0);
        boolean boolean48 = cell24.canMergeWith(cell47);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell49 = cell5.mergeWith(cell47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(3, 42L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        boolean boolean2 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        int int8 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0, 10)" + "'", str7, "(0, 10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2048);
        boolean boolean3 = cell1.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean9 = position2.equals((java.lang.Object) direction8);
        int int10 = position2.col;
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position(2, (int) (short) -1);
        boolean boolean14 = position2.equals((java.lang.Object) 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        boolean boolean4 = board1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        boolean boolean7 = cell5.isEmpty();
        int int8 = cell5.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.isFull();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell(0, (int) (byte) 0);
        int int22 = cell21.getValue();
        int int23 = cell21.getValue();
        boolean boolean24 = cell15.canMergeWith(cell21);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean27 = board26.isFull();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell(0, (int) (byte) 0);
        boolean boolean37 = cell30.canMergeWith(cell36);
        int int38 = cell36.getValue();
        boolean boolean39 = cell21.equals((java.lang.Object) int38);
        java.lang.String str40 = cell21.toString();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell44 = board41.getCell(1, 0);
        boolean boolean45 = cell21.canMergeWith(cell44);
        board1.setCell((int) (byte) 1, (int) (short) 1, cell21);
        int int47 = board1.getSize();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        int int8 = board1.getSize();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        int int7 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = position2.equals((java.lang.Object) boolean15);
        java.lang.String str17 = position2.toString();
        java.lang.Class<?> wildcardClass18 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0, 10)" + "'", str17, "(0, 10)");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        boolean boolean21 = cell14.canMergeWith(cell20);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board((int) (byte) 10, (long) 1);
        boolean boolean25 = cell20.equals((java.lang.Object) 1);
        boolean boolean26 = cell5.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        int int7 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 10)" + "'", str6, "(0, 10)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass5 = positionSet4.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.moveUp();
        boolean boolean6 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        int int21 = cell20.getValue();
        int int22 = cell20.getValue();
        boolean boolean23 = cell14.canMergeWith(cell20);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        ar.edu.unrc.game2048.Cell cell29 = board25.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        boolean boolean36 = cell29.canMergeWith(cell35);
        int int37 = cell35.getValue();
        boolean boolean38 = cell20.equals((java.lang.Object) int37);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 1, 10, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isLosingBoard();
        long long4 = board0.getScore();
        boolean boolean5 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board0.getCell(10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("     ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]:      ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        int int12 = cell11.getValue();
        int int13 = cell11.getValue();
        boolean boolean14 = cell5.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        boolean boolean27 = cell20.canMergeWith(cell26);
        int int28 = cell26.getValue();
        boolean boolean29 = cell11.equals((java.lang.Object) int28);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board31.getEmptyPositions();
        boolean boolean33 = board31.isFull();
        boolean boolean34 = board31.moveDown();
        boolean boolean35 = board31.moveDown();
        boolean boolean36 = cell11.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        ar.edu.unrc.game2048.Cell cell12 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = cell5.mergeWith(cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean6 = cell5.isEmpty();
        java.lang.String str7 = cell5.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (-1));
        boolean boolean4 = position2.equals((java.lang.Object) 1.0d);
        int int5 = position2.row;
        int int6 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        int int7 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = position2.equals((java.lang.Object) boolean15);
        java.lang.String str17 = position2.toString();
        java.lang.String str18 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0, 10)" + "'", str17, "(0, 10)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0, 10)" + "'", str18, "(0, 10)");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell6 = board3.getCell(0, 0);
        boolean boolean7 = board3.isFull();
        boolean boolean8 = cell1.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(2048);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        boolean boolean3 = board1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString(" and ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]:  and ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("%5d");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: %5d");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell(0, (int) (byte) 0);
        int int20 = cell19.getValue();
        int int21 = cell19.getValue();
        boolean boolean22 = cell13.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board24.isFull();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean31 = board30.isFull();
        ar.edu.unrc.game2048.Cell cell34 = board30.getCell(0, (int) (byte) 0);
        boolean boolean35 = cell28.canMergeWith(cell34);
        int int36 = cell34.getValue();
        boolean boolean37 = cell19.equals((java.lang.Object) int36);
        java.lang.String str38 = cell19.toString();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell42 = board39.getCell(1, 0);
        boolean boolean43 = cell19.canMergeWith(cell42);
        boolean boolean44 = board1.equals((java.lang.Object) cell42);
        java.lang.String str45 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str45, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("0|[1-9][0-9]{0,5}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: 0|[1-9][0-9]{0,5}");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        long long7 = board1.getScore();
        boolean boolean8 = board1.isFull();
        boolean boolean9 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        int int7 = board6.getSize();
        boolean boolean8 = board6.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        int int21 = cell20.getValue();
        int int22 = cell20.getValue();
        boolean boolean23 = cell14.canMergeWith(cell20);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        ar.edu.unrc.game2048.Cell cell29 = board25.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        boolean boolean36 = cell29.canMergeWith(cell35);
        int int37 = cell35.getValue();
        boolean boolean38 = cell20.equals((java.lang.Object) int37);
        java.lang.String str39 = cell20.toString();
        boolean boolean40 = board6.equals((java.lang.Object) str39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        int int3 = board1.getSize();
        boolean boolean4 = board1.moveDown();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        boolean boolean13 = board11.isFull();
        boolean boolean14 = board11.moveDown();
        int int15 = board11.getSize();
        boolean boolean16 = board11.moveDown();
        long long17 = board11.getScore();
        boolean boolean18 = board11.isFull();
        ar.edu.unrc.game2048.Cell cell21 = board11.getCell(1, 0);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(97, (int) (short) 10, cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4L + "'", long17 == 4L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, (int) (short) -1);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveDown();
        boolean boolean11 = board6.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean12 = board6.isLosingBoard();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell(0, 0);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board6.equals((java.lang.Object) board14);
        boolean boolean20 = position2.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board24.isFull();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell(0, (int) (byte) 0);
        boolean boolean29 = cell28.isEmpty();
        int int30 = cell28.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell((int) (short) -1, (int) (short) 1, cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        long long7 = board6.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        boolean boolean8 = board1.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board1.getCell(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        long long2 = board0.getScore();
        boolean boolean3 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell3 = board0.getCell(1, 0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell9 = board5.getCell(0, (int) (byte) 0);
        java.lang.String str10 = cell9.toString();
        int int11 = cell9.getValue();
        int int12 = cell9.getValue();
        java.lang.String str13 = cell9.toString();
        int int14 = cell9.getValue();
        boolean boolean15 = cell3.canMergeWith(cell9);
        int int16 = cell9.getValue();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        boolean boolean13 = cell11.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean21 = cell11.equals((java.lang.Object) board20);
        boolean boolean22 = cell5.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board23.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board23.getEmptyPositions();
        boolean boolean27 = board23.moveDown();
        boolean boolean28 = cell5.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell17.canMergeWith(cell23);
        boolean boolean27 = cell5.canMergeWith(cell23);
        java.lang.String str28 = cell5.toString();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board30.getEmptyPositions();
        boolean boolean32 = board30.isFull();
        boolean boolean33 = board30.moveDown();
        boolean boolean34 = board30.moveDown();
        boolean boolean35 = board30.moveUp();
        boolean boolean36 = board30.moveLeft();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board39);
        boolean boolean41 = board40.isFull();
        ar.edu.unrc.game2048.Cell cell44 = board40.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board45);
        boolean boolean47 = board46.isFull();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell(0, (int) (byte) 0);
        int int51 = cell50.getValue();
        int int52 = cell50.getValue();
        boolean boolean53 = cell44.canMergeWith(cell50);
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(board54);
        boolean boolean56 = board55.isFull();
        ar.edu.unrc.game2048.Cell cell59 = board55.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board61 = new ar.edu.unrc.game2048.Board(board60);
        boolean boolean62 = board61.isFull();
        ar.edu.unrc.game2048.Cell cell65 = board61.getCell(0, (int) (byte) 0);
        boolean boolean66 = cell59.canMergeWith(cell65);
        int int67 = cell65.getValue();
        boolean boolean68 = cell50.equals((java.lang.Object) int67);
        java.lang.String str69 = cell50.toString();
        ar.edu.unrc.game2048.Board board70 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell73 = board70.getCell(1, 0);
        boolean boolean74 = cell50.canMergeWith(cell73);
        board30.setCell((int) (byte) 1, (int) (short) 1, cell50);
        boolean boolean76 = board30.moveLeft();
        boolean boolean77 = cell5.equals((java.lang.Object) boolean76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cell59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "." + "'", str69, ".");
        org.junit.Assert.assertNotNull(cell73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board1.getCell(131072, 131072);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (131072, 131072) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean9 = position2.equals((java.lang.Object) direction8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        boolean boolean13 = board11.isFull();
        boolean boolean14 = board11.moveDown();
        boolean boolean16 = board11.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean17 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Cell cell22 = board19.getCell(0, 0);
        java.lang.String str23 = board19.toString();
        boolean boolean24 = board11.equals((java.lang.Object) board19);
        boolean boolean25 = board19.moveLeft();
        boolean boolean26 = board19.moveUp();
        boolean boolean27 = board19.moveDown();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board29.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board29.getEmptyPositions();
        int int32 = board29.getSize();
        java.lang.String str33 = board29.toString();
        boolean boolean34 = board19.equals((java.lang.Object) str33);
        boolean boolean35 = position2.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str23, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str33, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        java.lang.String str2 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.isLosingBoard();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = board20.isFull();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell(0, (int) (byte) 0);
        boolean boolean25 = cell24.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell(131072, 3, cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (131072, 3) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean5 = board0.move(direction4);
        java.lang.Object obj6 = null;
        boolean boolean7 = board0.equals(obj6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board0.getCell((int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell(1, 0);
        boolean boolean11 = cell5.canMergeWith(cell10);
        boolean boolean12 = cell5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1073741824, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 1073741824");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass5 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell(0, (int) (byte) 0);
        int int20 = cell19.getValue();
        int int21 = cell19.getValue();
        boolean boolean22 = cell13.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board24.isFull();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean31 = board30.isFull();
        ar.edu.unrc.game2048.Cell cell34 = board30.getCell(0, (int) (byte) 0);
        boolean boolean35 = cell28.canMergeWith(cell34);
        int int36 = cell34.getValue();
        boolean boolean37 = cell19.equals((java.lang.Object) int36);
        java.lang.String str38 = cell19.toString();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell42 = board39.getCell(1, 0);
        boolean boolean43 = cell19.canMergeWith(cell42);
        boolean boolean44 = board1.equals((java.lang.Object) cell42);
        boolean boolean45 = board1.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 1073741824);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell3 = board0.getCell(1, 0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell9 = board5.getCell(0, (int) (byte) 0);
        java.lang.String str10 = cell9.toString();
        int int11 = cell9.getValue();
        int int12 = cell9.getValue();
        java.lang.String str13 = cell9.toString();
        int int14 = cell9.getValue();
        boolean boolean15 = cell3.canMergeWith(cell9);
        java.lang.String str16 = cell3.toString();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("A board needs ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: A board needs ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveRight();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        ar.edu.unrc.game2048.Cell cell25 = board21.getCell(0, (int) (byte) 0);
        java.lang.String str26 = cell25.toString();
        int int27 = cell25.getValue();
        int int28 = cell25.getValue();
        int int29 = cell25.getValue();
        board9.setCell(3, (int) (short) 0, cell25);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board9.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(positionSet31);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.String str8 = board7.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveUp();
        java.lang.String str8 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 4\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.isFull();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell(0, (int) (byte) 0);
        int int22 = cell21.getValue();
        int int23 = cell21.getValue();
        boolean boolean24 = cell15.canMergeWith(cell21);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean27 = board26.isFull();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell(0, (int) (byte) 0);
        boolean boolean37 = cell30.canMergeWith(cell36);
        int int38 = cell36.getValue();
        boolean boolean39 = cell21.equals((java.lang.Object) int38);
        java.lang.String str40 = cell21.toString();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell44 = board41.getCell(1, 0);
        boolean boolean45 = cell21.canMergeWith(cell44);
        board1.setCell((int) (byte) 1, (int) (short) 1, cell21);
        boolean boolean47 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        java.lang.Class<?> wildcardClass2 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell8 = board5.getCell(0, 0);
        java.lang.String str9 = board5.toString();
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean11 = board5.move(direction10);
        boolean boolean12 = board3.move(direction10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board3);
        int int14 = board3.getSize();
        boolean boolean15 = board3.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 0);
        int int3 = position2.col;
        int int4 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean6 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean9 = position2.equals((java.lang.Object) direction8);
        int int10 = position2.col;
        int int11 = position2.col;
        java.lang.String str12 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0, 10)" + "'", str12, "(0, 10)");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 10, 100L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        int int12 = cell11.getValue();
        int int13 = cell11.getValue();
        boolean boolean14 = cell5.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        java.lang.String str21 = cell20.toString();
        int int22 = cell20.getValue();
        int int23 = cell20.getValue();
        java.lang.String str24 = cell20.toString();
        int int25 = cell20.getValue();
        java.lang.String str26 = cell20.toString();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board27);
        boolean boolean29 = board28.isFull();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board33);
        boolean boolean35 = board34.isFull();
        ar.edu.unrc.game2048.Cell cell38 = board34.getCell(0, (int) (byte) 0);
        int int39 = cell38.getValue();
        int int40 = cell38.getValue();
        boolean boolean41 = cell32.canMergeWith(cell38);
        boolean boolean42 = cell20.canMergeWith(cell38);
        java.lang.String str43 = cell20.toString();
        boolean boolean44 = cell11.equals((java.lang.Object) str43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        java.lang.String str15 = cell14.toString();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell19 = board16.getCell(1, 0);
        boolean boolean20 = cell14.canMergeWith(cell19);
        java.lang.String str21 = cell19.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell22 = cell5.mergeWith(cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(131072, 1);
        int int3 = position2.row;
        int int4 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 131072 + "'", int3 == 131072);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 131072 + "'", int4 == 131072);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        int int5 = position2.row;
        int int6 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell3 = board0.getCell(1, 0);
        boolean boolean4 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        int int3 = board1.getSize();
        boolean boolean4 = board1.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell4 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(2, (int) (short) 0, cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean7 = cell5.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        long long16 = board14.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell17.canMergeWith(cell23);
        boolean boolean27 = cell5.canMergeWith(cell23);
        java.lang.String str28 = cell5.toString();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean31 = board30.isFull();
        ar.edu.unrc.game2048.Cell cell34 = board30.getCell(0, (int) (byte) 0);
        int int35 = cell34.getValue();
        int int36 = cell34.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell37 = cell5.mergeWith(cell34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean8 = board1.isWinningBoard();
        boolean boolean9 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        boolean boolean4 = board1.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        boolean boolean9 = position2.equals((java.lang.Object) (byte) 10);
        int int10 = position2.row;
        int int11 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0, 10)" + "'", str7, "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean5 = board4.isFull();
        ar.edu.unrc.game2048.Cell cell8 = board4.getCell(0, (int) (byte) 0);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell(1, 0);
        boolean boolean14 = cell8.canMergeWith(cell13);
        java.lang.String str15 = cell13.toString();
        boolean boolean16 = position2.equals((java.lang.Object) str15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        int int5 = position2.row;
        int int6 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(131072);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 131072");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        long long4 = board0.getScore();
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.isLosingBoard();
        boolean boolean17 = board9.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        boolean boolean8 = position2.equals((java.lang.Object) "(2, -1)");
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        boolean boolean12 = board10.isFull();
        boolean boolean13 = board10.moveDown();
        boolean boolean14 = board10.moveDown();
        boolean boolean15 = board10.moveUp();
        boolean boolean16 = board10.moveLeft();
        boolean boolean17 = board10.hasEmptyCells();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Cell cell22 = board19.getCell(0, 0);
        java.lang.String str23 = board19.toString();
        ar.edu.unrc.game2048.Board.Direction direction24 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean25 = board19.move(direction24);
        boolean boolean26 = board10.move(direction24);
        boolean boolean27 = position2.equals((java.lang.Object) board10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str23, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction24 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction24.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.hasEmptyCells();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean9 = position2.equals((java.lang.Object) direction8);
        int int10 = position2.col;
        int int11 = position2.row;
        java.lang.Object obj12 = null;
        boolean boolean13 = position2.equals(obj12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board1.isLosingBoard();
        boolean boolean16 = board1.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        boolean boolean2 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, 42L);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        int int8 = position2.col;
        java.lang.String str9 = position2.toString();
        java.lang.String str10 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0, 10)" + "'", str9, "(0, 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0, 10)" + "'", str10, "(0, 10)");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell3 = board0.getCell(1, 0);
        boolean boolean4 = board0.isLosingBoard();
        boolean boolean5 = board0.moveUp();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = position2.equals((java.lang.Object) board7);
        int int9 = position2.row;
        int int10 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 10)" + "'", str6, "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell(1, 0);
        boolean boolean11 = cell5.canMergeWith(cell10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean19 = board13.moveLeft();
        long long20 = board13.getScore();
        boolean boolean21 = cell10.equals((java.lang.Object) long20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean24 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell(0, (int) (byte) 0);
        java.lang.String str28 = cell27.toString();
        int int29 = cell27.getValue();
        int int30 = cell27.getValue();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell(0, (int) (byte) 0);
        java.lang.String str37 = cell36.toString();
        int int38 = cell36.getValue();
        int int39 = cell36.getValue();
        java.lang.String str40 = cell36.toString();
        int int41 = cell36.getValue();
        java.lang.String str42 = cell36.toString();
        boolean boolean43 = cell27.canMergeWith(cell36);
        boolean boolean44 = cell10.equals((java.lang.Object) cell27);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board45);
        boolean boolean47 = board46.isFull();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board51);
        boolean boolean53 = board52.isFull();
        ar.edu.unrc.game2048.Cell cell56 = board52.getCell(0, (int) (byte) 0);
        boolean boolean57 = cell50.canMergeWith(cell56);
        boolean boolean58 = cell50.isEmpty();
        boolean boolean59 = cell27.equals((java.lang.Object) cell50);
        java.lang.String str60 = cell50.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "." + "'", str60, ".");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        boolean boolean2 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        java.lang.String str12 = cell11.toString();
        int int13 = cell11.getValue();
        board1.setCell(0, 0, cell11);
        boolean boolean15 = board1.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveDown();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        ar.edu.unrc.game2048.Cell cell25 = board21.getCell(0, (int) (byte) 0);
        java.lang.String str26 = cell25.toString();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell30 = board27.getCell(1, 0);
        boolean boolean31 = cell25.canMergeWith(cell30);
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell(10, 1073741824, cell30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1073741824) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean7 = cell5.equals((java.lang.Object) 100.0f);
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        java.lang.String str15 = cell14.toString();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell19 = board16.getCell(1, 0);
        boolean boolean20 = cell14.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean28 = board22.moveLeft();
        long long29 = board22.getScore();
        boolean boolean30 = cell19.equals((java.lang.Object) long29);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell(0, (int) (byte) 0);
        java.lang.String str37 = cell36.toString();
        int int38 = cell36.getValue();
        int int39 = cell36.getValue();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board40);
        boolean boolean42 = board41.isFull();
        ar.edu.unrc.game2048.Cell cell45 = board41.getCell(0, (int) (byte) 0);
        java.lang.String str46 = cell45.toString();
        int int47 = cell45.getValue();
        int int48 = cell45.getValue();
        java.lang.String str49 = cell45.toString();
        int int50 = cell45.getValue();
        java.lang.String str51 = cell45.toString();
        boolean boolean52 = cell36.canMergeWith(cell45);
        boolean boolean53 = cell19.equals((java.lang.Object) cell36);
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell57 = board54.getCell(1, 0);
        ar.edu.unrc.game2048.Board board58 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board(board58);
        boolean boolean60 = board59.isFull();
        ar.edu.unrc.game2048.Cell cell63 = board59.getCell(0, (int) (byte) 0);
        java.lang.String str64 = cell63.toString();
        int int65 = cell63.getValue();
        int int66 = cell63.getValue();
        java.lang.String str67 = cell63.toString();
        int int68 = cell63.getValue();
        boolean boolean69 = cell57.canMergeWith(cell63);
        boolean boolean70 = cell36.canMergeWith(cell57);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell71 = cell5.mergeWith(cell36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "." + "'", str51, ".");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cell63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "." + "'", str64, ".");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "." + "'", str67, ".");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1073741824, (long) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 1073741824");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveUp();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        java.lang.String str5 = board1.toString();
        long long6 = board1.getScore();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        boolean boolean27 = cell20.canMergeWith(cell26);
        boolean boolean28 = cell14.canMergeWith(cell20);
        board1.setCell(2, 0, cell14);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        long long7 = board1.getScore();
        boolean boolean8 = board1.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean9 = position2.equals((java.lang.Object) direction8);
        int int10 = position2.col;
        int int11 = position2.col;
        int int12 = position2.row;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        boolean boolean16 = board14.isFull();
        boolean boolean17 = board14.moveDown();
        boolean boolean18 = board14.moveDown();
        boolean boolean19 = board14.moveUp();
        boolean boolean20 = board14.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board14.getEmptyPositions();
        boolean boolean22 = position2.equals((java.lang.Object) positionSet21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell3 = board0.getCell(1, 0);
        java.lang.String str4 = cell3.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveDown();
        boolean boolean10 = board6.moveDown();
        boolean boolean11 = board6.moveUp();
        boolean boolean12 = board6.moveLeft();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        int int27 = cell26.getValue();
        int int28 = cell26.getValue();
        boolean boolean29 = cell20.canMergeWith(cell26);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (byte) 0);
        boolean boolean42 = cell35.canMergeWith(cell41);
        int int43 = cell41.getValue();
        boolean boolean44 = cell26.equals((java.lang.Object) int43);
        java.lang.String str45 = cell26.toString();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell49 = board46.getCell(1, 0);
        boolean boolean50 = cell26.canMergeWith(cell49);
        board6.setCell((int) (byte) 1, (int) (short) 1, cell26);
        boolean boolean52 = cell3.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell(1, 0);
        boolean boolean11 = cell5.canMergeWith(cell10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean19 = board13.moveLeft();
        long long20 = board13.getScore();
        boolean boolean21 = cell10.equals((java.lang.Object) long20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean24 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell(0, (int) (byte) 0);
        java.lang.String str28 = cell27.toString();
        int int29 = cell27.getValue();
        int int30 = cell27.getValue();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell(0, (int) (byte) 0);
        java.lang.String str37 = cell36.toString();
        int int38 = cell36.getValue();
        int int39 = cell36.getValue();
        java.lang.String str40 = cell36.toString();
        int int41 = cell36.getValue();
        java.lang.String str42 = cell36.toString();
        boolean boolean43 = cell27.canMergeWith(cell36);
        boolean boolean44 = cell10.equals((java.lang.Object) cell27);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board45);
        boolean boolean47 = board46.isFull();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board51);
        boolean boolean53 = board52.isFull();
        ar.edu.unrc.game2048.Cell cell56 = board52.getCell(0, (int) (byte) 0);
        boolean boolean57 = cell50.canMergeWith(cell56);
        boolean boolean58 = cell50.isEmpty();
        boolean boolean59 = cell27.equals((java.lang.Object) cell50);
        java.lang.String str60 = cell27.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "." + "'", str60, ".");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 10);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell8 = board5.getCell(0, 0);
        boolean boolean9 = position2.equals((java.lang.Object) cell8);
        int int10 = cell8.getValue();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        boolean boolean14 = board12.isFull();
        boolean boolean15 = board12.moveDown();
        boolean boolean17 = board12.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean18 = board12.isLosingBoard();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        ar.edu.unrc.game2048.Cell cell23 = board20.getCell(0, 0);
        java.lang.String str24 = board20.toString();
        boolean boolean25 = board12.equals((java.lang.Object) board20);
        ar.edu.unrc.game2048.Cell cell28 = board12.getCell(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell29 = cell8.mergeWith(cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, 10)" + "'", str3, "(97, 10)");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str24, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 0);
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        boolean boolean8 = board1.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) (byte) 10);
        boolean boolean3 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board.Direction direction6 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean7 = board1.move(direction6);
        boolean boolean8 = board1.isLosingBoard();
        boolean boolean9 = board1.moveRight();
        java.lang.String str10 = board1.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction6 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction6.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        int int7 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = position2.equals((java.lang.Object) boolean15);
        java.lang.String str17 = position2.toString();
        int int18 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0, 10)" + "'", str17, "(0, 10)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        int int12 = cell11.getValue();
        int int13 = cell11.getValue();
        boolean boolean14 = cell5.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        boolean boolean27 = cell20.canMergeWith(cell26);
        int int28 = cell26.getValue();
        boolean boolean29 = cell11.equals((java.lang.Object) int28);
        java.lang.String str30 = cell11.toString();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell34 = board31.getCell(1, 0);
        boolean boolean35 = cell11.canMergeWith(cell34);
        java.lang.String str36 = cell34.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass3 = positionSet2.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) -1, (long) 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass9 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveUp();
        boolean boolean6 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.hasEmptyCells();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.moveLeft();
        boolean boolean7 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, (int) (byte) 100);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        long long6 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass8 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        long long7 = board1.getScore();
        boolean boolean8 = board1.isFull();
        boolean boolean9 = board1.hasEmptyCells();
        java.lang.String str10 = board1.toString();
        boolean boolean11 = board1.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2);
        boolean boolean2 = board1.hasEmptyCells();
        boolean boolean3 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        boolean boolean2 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("invalid board after copy");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: invalid board after copy");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean7 = cell5.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell(0, (int) (byte) 0);
        java.lang.String str22 = cell21.toString();
        int int23 = cell21.getValue();
        int int24 = cell21.getValue();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean27 = board26.isFull();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell(0, (int) (byte) 0);
        java.lang.String str31 = cell30.toString();
        int int32 = cell30.getValue();
        int int33 = cell30.getValue();
        java.lang.String str34 = cell30.toString();
        int int35 = cell30.getValue();
        java.lang.String str36 = cell30.toString();
        boolean boolean37 = cell21.canMergeWith(cell30);
        boolean boolean38 = cell30.isEmpty();
        java.lang.String str39 = cell30.toString();
        boolean boolean40 = cell5.canMergeWith(cell30);
        java.lang.Class<?> wildcardClass41 = cell30.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        java.lang.String str15 = cell14.toString();
        int int16 = cell14.getValue();
        int int17 = cell14.getValue();
        java.lang.String str18 = cell14.toString();
        int int19 = cell14.getValue();
        java.lang.String str20 = cell14.toString();
        boolean boolean21 = cell5.canMergeWith(cell14);
        int int22 = cell14.getValue();
        int int23 = cell14.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        boolean boolean9 = position2.equals((java.lang.Object) (byte) 10);
        int int10 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0, 10)" + "'", str7, "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean7 = cell5.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        java.lang.String str16 = board14.toString();
        boolean boolean17 = board14.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board4.isWinningBoard();
        int int7 = board4.getSize();
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean9 = board4.move(direction8);
        boolean boolean10 = board1.move(direction8);
        java.lang.Object obj11 = null;
        boolean boolean12 = board1.equals(obj11);
        int int13 = board1.getSize();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        boolean boolean17 = board16.moveDown();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        ar.edu.unrc.game2048.Cell cell25 = board21.getCell(0, (int) (byte) 0);
        int int26 = cell25.getValue();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board27);
        boolean boolean29 = board28.isFull();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board28);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean35 = cell25.equals((java.lang.Object) board34);
        java.lang.String str36 = cell25.toString();
        board16.setCell((int) (short) 0, 1, cell25);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(3, 10, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (3, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        java.lang.String str15 = cell14.toString();
        int int16 = cell14.getValue();
        int int17 = cell14.getValue();
        java.lang.String str18 = cell14.toString();
        int int19 = cell14.getValue();
        java.lang.String str20 = cell14.toString();
        boolean boolean21 = cell5.canMergeWith(cell14);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean24 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell(0, (int) (byte) 0);
        boolean boolean29 = cell27.equals((java.lang.Object) 100.0f);
        int int30 = cell27.getValue();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell(0, (int) (byte) 0);
        int int37 = cell36.getValue();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board38);
        boolean boolean40 = board39.isFull();
        ar.edu.unrc.game2048.Cell cell43 = board39.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(board39);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(board39);
        boolean boolean46 = cell36.equals((java.lang.Object) board45);
        java.lang.String str47 = cell36.toString();
        boolean boolean48 = cell27.canMergeWith(cell36);
        boolean boolean49 = cell14.canMergeWith(cell27);
        boolean boolean50 = cell14.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Not a valid tile: '");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Not a valid tile: '");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        int int12 = cell11.getValue();
        int int13 = cell11.getValue();
        boolean boolean14 = cell5.canMergeWith(cell11);
        java.lang.String str15 = cell11.toString();
        java.lang.String str16 = cell11.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(16, (long) 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        long long3 = board1.getScore();
        boolean boolean4 = board1.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1073741824, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 1073741824");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        boolean boolean8 = board1.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.moveDown();
        int int11 = board1.getSize();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: 0?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|     |     |     |    2|?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|     |    2|     |     |?+-----+-----+-----+-----+?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell19 = board9.getCell((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board7.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.hasEmptyCells();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.moveLeft();
        boolean boolean7 = board0.isWinningBoard();
        int int8 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board4.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (long) 4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        boolean boolean18 = cell11.canMergeWith(cell17);
        boolean boolean19 = cell5.canMergeWith(cell11);
        java.lang.String str20 = cell11.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell3 = board0.getCell(1, 0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell9 = board5.getCell(0, (int) (byte) 0);
        java.lang.String str10 = cell9.toString();
        int int11 = cell9.getValue();
        int int12 = cell9.getValue();
        java.lang.String str13 = cell9.toString();
        int int14 = cell9.getValue();
        boolean boolean15 = cell3.canMergeWith(cell9);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell(0, (int) (byte) 0);
        java.lang.String str22 = cell21.toString();
        int int23 = cell21.getValue();
        int int24 = cell21.getValue();
        java.lang.String str25 = cell21.toString();
        int int26 = cell21.getValue();
        java.lang.String str27 = cell21.toString();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean30 = board29.isFull();
        ar.edu.unrc.game2048.Cell cell33 = board29.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board34);
        boolean boolean36 = board35.isFull();
        ar.edu.unrc.game2048.Cell cell39 = board35.getCell(0, (int) (byte) 0);
        int int40 = cell39.getValue();
        int int41 = cell39.getValue();
        boolean boolean42 = cell33.canMergeWith(cell39);
        boolean boolean43 = cell21.canMergeWith(cell39);
        boolean boolean44 = cell3.canMergeWith(cell21);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        ar.edu.unrc.game2048.Cell cell17 = board1.getCell(0, 0);
        boolean boolean18 = board1.moveRight();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board1);
        long long20 = board1.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 4L + "'", long20 == 4L);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveUp();
        ar.edu.unrc.game2048.Cell cell20 = board9.getCell(3, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        java.lang.String str27 = cell26.toString();
        int int28 = cell26.getValue();
        int int29 = cell26.getValue();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        java.lang.String str36 = cell35.toString();
        int int37 = cell35.getValue();
        int int38 = cell35.getValue();
        java.lang.String str39 = cell35.toString();
        int int40 = cell35.getValue();
        java.lang.String str41 = cell35.toString();
        boolean boolean42 = cell26.canMergeWith(cell35);
        boolean boolean43 = cell20.canMergeWith(cell35);
        int int44 = cell20.getValue();
        boolean boolean45 = cell20.isEmpty();
        java.lang.Object obj46 = null;
        boolean boolean47 = cell20.equals(obj46);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveUp();
        ar.edu.unrc.game2048.Cell cell20 = board9.getCell(3, (int) (byte) 0);
        boolean boolean21 = board9.moveUp();
        boolean boolean22 = board9.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        int int7 = cell5.getValue();
        boolean boolean8 = cell5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        java.lang.String str15 = cell14.toString();
        int int16 = cell14.getValue();
        int int17 = cell14.getValue();
        java.lang.String str18 = cell14.toString();
        int int19 = cell14.getValue();
        java.lang.String str20 = cell14.toString();
        boolean boolean21 = cell5.canMergeWith(cell14);
        int int22 = cell14.getValue();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board23.isWinningBoard();
        java.lang.String str26 = board23.toString();
        boolean boolean27 = board23.isFull();
        boolean boolean28 = cell14.equals((java.lang.Object) board23);
        java.lang.Class<?> wildcardClass29 = board23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str26, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        boolean boolean2 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell(0, (int) (byte) 0);
        java.lang.String str11 = cell10.toString();
        int int12 = cell10.getValue();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board13.isWinningBoard();
        boolean boolean16 = board13.isLosingBoard();
        boolean boolean17 = board13.hasEmptyCells();
        java.lang.String str18 = board13.toString();
        boolean boolean19 = cell10.equals((java.lang.Object) str18);
        ar.edu.unrc.game2048.Board.Position position22 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean24 = position22.equals((java.lang.Object) 10.0f);
        int int25 = position22.col;
        int int26 = position22.row;
        int int27 = position22.row;
        int int28 = position22.col;
        boolean boolean29 = cell10.equals((java.lang.Object) position22);
        java.lang.String str30 = cell10.toString();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(2, 131072, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2, 131072) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board5.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        java.lang.String str12 = cell11.toString();
        int int13 = cell11.getValue();
        board1.setCell(0, 0, cell11);
        int int15 = cell11.getValue();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 10);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell8 = board5.getCell(0, 0);
        boolean boolean9 = position2.equals((java.lang.Object) cell8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.isFull();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell(0, (int) (byte) 0);
        int int16 = cell15.getValue();
        java.lang.Object obj17 = null;
        boolean boolean18 = cell15.equals(obj17);
        boolean boolean19 = position2.equals(obj17);
        int int20 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, 10)" + "'", str3, "(97, 10)");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveDown();
        boolean boolean10 = board6.moveDown();
        boolean boolean11 = board6.moveUp();
        boolean boolean12 = board6.moveLeft();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        int int27 = cell26.getValue();
        int int28 = cell26.getValue();
        boolean boolean29 = cell20.canMergeWith(cell26);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (byte) 0);
        boolean boolean42 = cell35.canMergeWith(cell41);
        int int43 = cell41.getValue();
        boolean boolean44 = cell26.equals((java.lang.Object) int43);
        java.lang.String str45 = cell26.toString();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell49 = board46.getCell(1, 0);
        boolean boolean50 = cell26.canMergeWith(cell49);
        board6.setCell((int) (byte) 1, (int) (short) 1, cell26);
        board0.setCell(0, 1, cell26);
        boolean boolean53 = cell26.isEmpty();
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (int) '4');
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(16, (-1));
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.hasEmptyCells();
        boolean boolean7 = board1.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        boolean boolean13 = board9.isFull();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean16 = board1.equals((java.lang.Object) board15);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        int int6 = board1.getSize();
        int int7 = board1.getSize();
        java.lang.String str8 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        int int8 = board1.getSize();
        java.lang.Class<?> wildcardClass9 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        int int12 = cell5.getValue();
        boolean boolean13 = cell5.isEmpty();
        boolean boolean14 = cell5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveDown();
        boolean boolean10 = board6.moveDown();
        boolean boolean11 = board6.moveUp();
        boolean boolean12 = board6.moveLeft();
        boolean boolean13 = board6.hasEmptyCells();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Cell cell18 = board15.getCell(0, 0);
        java.lang.String str19 = board15.toString();
        ar.edu.unrc.game2048.Board.Direction direction20 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean21 = board15.move(direction20);
        boolean boolean22 = board6.move(direction20);
        boolean boolean23 = board1.move(direction20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str19, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction20 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction20.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        boolean boolean6 = board4.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board4.getEmptyPositions();
        boolean boolean8 = board0.equals((java.lang.Object) positionSet7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell17.canMergeWith(cell23);
        boolean boolean27 = cell5.canMergeWith(cell23);
        ar.edu.unrc.game2048.Board.Position position30 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean32 = position30.equals((java.lang.Object) '4');
        boolean boolean34 = position30.equals((java.lang.Object) 'a');
        int int35 = position30.col;
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean43 = board37.moveLeft();
        boolean boolean44 = position30.equals((java.lang.Object) boolean43);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board45);
        boolean boolean47 = board46.isFull();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell(0, (int) (byte) 0);
        boolean boolean52 = cell50.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board(board53);
        boolean boolean55 = board54.isFull();
        ar.edu.unrc.game2048.Cell cell58 = board54.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board(board54);
        boolean boolean60 = cell50.equals((java.lang.Object) board59);
        boolean boolean61 = position30.equals((java.lang.Object) board59);
        boolean boolean62 = cell5.equals((java.lang.Object) position30);
        int int63 = position30.row;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveDown();
        boolean boolean10 = board6.moveDown();
        boolean boolean11 = board6.moveUp();
        boolean boolean12 = board6.moveLeft();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        int int27 = cell26.getValue();
        int int28 = cell26.getValue();
        boolean boolean29 = cell20.canMergeWith(cell26);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (byte) 0);
        boolean boolean42 = cell35.canMergeWith(cell41);
        int int43 = cell41.getValue();
        boolean boolean44 = cell26.equals((java.lang.Object) int43);
        java.lang.String str45 = cell26.toString();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell49 = board46.getCell(1, 0);
        boolean boolean50 = cell26.canMergeWith(cell49);
        board6.setCell((int) (byte) 1, (int) (short) 1, cell26);
        board0.setCell(0, 1, cell26);
        java.lang.Class<?> wildcardClass53 = cell26.getClass();
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean9 = position2.equals((java.lang.Object) direction8);
        int int10 = position2.col;
        int int11 = position2.col;
        int int12 = position2.row;
        int int13 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveLeft();
        long long7 = board1.getScore();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 0);
        int int11 = position10.col;
        int int12 = position10.col;
        boolean boolean13 = board1.equals((java.lang.Object) position10);
        java.lang.Class<?> wildcardClass14 = position10.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = position2.equals((java.lang.Object) board7);
        java.lang.Class<?> wildcardClass9 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 10)" + "'", str6, "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveLeft();
        java.lang.String str8 = board1.toString();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell(0, (int) (byte) 0);
        boolean boolean18 = cell16.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = board20.isFull();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean26 = cell16.equals((java.lang.Object) board25);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board27);
        boolean boolean29 = board28.isFull();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell(0, (int) (byte) 0);
        java.lang.String str33 = cell32.toString();
        int int34 = cell32.getValue();
        int int35 = cell32.getValue();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (byte) 0);
        java.lang.String str42 = cell41.toString();
        int int43 = cell41.getValue();
        int int44 = cell41.getValue();
        java.lang.String str45 = cell41.toString();
        int int46 = cell41.getValue();
        java.lang.String str47 = cell41.toString();
        boolean boolean48 = cell32.canMergeWith(cell41);
        boolean boolean49 = cell41.isEmpty();
        java.lang.String str50 = cell41.toString();
        boolean boolean51 = cell16.canMergeWith(cell41);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(100, 1, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "." + "'", str50, ".");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        int int4 = board1.getSize();
        boolean boolean5 = board1.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.row;
        java.lang.Object obj8 = null;
        boolean boolean9 = position2.equals(obj8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        int int7 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = position2.equals((java.lang.Object) boolean15);
        int int17 = position2.col;
        int int18 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(3, (-1L));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        boolean boolean8 = position2.equals((java.lang.Object) "(2, -1)");
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board9.isWinningBoard();
        int int12 = board9.getSize();
        long long13 = board9.getScore();
        boolean boolean14 = position2.equals((java.lang.Object) board9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isLosingBoard();
        int int8 = board1.getSize();
        boolean boolean9 = board1.moveDown();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        java.lang.String str8 = cell5.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(16);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(3, 1L);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        java.lang.String str5 = board0.toString();
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        java.lang.String str5 = board1.toString();
        long long6 = board1.getScore();
        boolean boolean7 = board1.moveRight();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell(0, (int) (byte) 0);
        int int20 = cell19.getValue();
        int int21 = cell19.getValue();
        boolean boolean22 = cell13.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board24.isFull();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean31 = board30.isFull();
        ar.edu.unrc.game2048.Cell cell34 = board30.getCell(0, (int) (byte) 0);
        boolean boolean35 = cell28.canMergeWith(cell34);
        int int36 = cell34.getValue();
        boolean boolean37 = cell19.equals((java.lang.Object) int36);
        java.lang.String str38 = cell19.toString();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell42 = board39.getCell(1, 0);
        boolean boolean43 = cell19.canMergeWith(cell42);
        boolean boolean44 = board1.equals((java.lang.Object) cell42);
        int int45 = cell42.getValue();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = position2.equals((java.lang.Object) board7);
        java.lang.String str9 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 10)" + "'", str6, "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0, 10)" + "'", str9, "(0, 10)");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell17.canMergeWith(cell23);
        boolean boolean27 = cell5.canMergeWith(cell23);
        java.lang.String str28 = cell5.toString();
        java.lang.String str29 = cell5.toString();
        java.lang.String str30 = cell5.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        boolean boolean18 = cell11.canMergeWith(cell17);
        boolean boolean19 = cell5.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        int int22 = board21.getSize();
        boolean boolean23 = board21.moveLeft();
        long long24 = board21.getScore();
        boolean boolean25 = board21.isFull();
        java.lang.String str26 = board21.toString();
        ar.edu.unrc.game2048.Cell cell29 = board21.getCell(1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell30 = cell11.mergeWith(cell29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str26, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell29);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.hasEmptyCells();
        boolean boolean7 = board1.moveRight();
        boolean boolean9 = board1.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), (int) (byte) -1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell6 = board3.getCell(0, 0);
        boolean boolean7 = board3.isFull();
        boolean boolean8 = cell1.equals((java.lang.Object) board3);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board3.getCell(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, (int) (short) -1);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveDown();
        boolean boolean11 = board6.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean12 = board6.isLosingBoard();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell(0, 0);
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board6.equals((java.lang.Object) board14);
        boolean boolean20 = position2.equals((java.lang.Object) board6);
        int int21 = position2.row;
        java.lang.String str22 = position2.toString();
        java.lang.String str23 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(2, -1)" + "'", str22, "(2, -1)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(2, -1)" + "'", str23, "(2, -1)");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell17.canMergeWith(cell23);
        boolean boolean27 = cell5.canMergeWith(cell23);
        java.lang.String str28 = cell5.toString();
        java.lang.String str29 = cell5.toString();
        ar.edu.unrc.game2048.Cell cell30 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell31 = cell5.mergeWith(cell30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.isFull();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell(0, (int) (byte) 0);
        java.lang.String str16 = cell15.toString();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell20 = board17.getCell(1, 0);
        boolean boolean21 = cell15.canMergeWith(cell20);
        boolean boolean22 = cell20.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell(131072, 3, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (131072, 3) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        long long4 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        long long7 = board1.getScore();
        boolean boolean8 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board1.getCell(1, 0);
        boolean boolean12 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        boolean boolean8 = board1.isFull();
        boolean boolean9 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (-1));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveLeft();
        java.lang.String str8 = board1.toString();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        boolean boolean12 = board10.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board10.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction14 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean15 = board10.move(direction14);
        boolean boolean16 = board1.move(direction14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction14.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board4.isWinningBoard();
        int int7 = board4.getSize();
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean9 = board4.move(direction8);
        boolean boolean10 = board1.move(direction8);
        java.lang.Object obj11 = null;
        boolean boolean12 = board1.equals(obj11);
        int int13 = board1.getSize();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board14.isWinningBoard();
        java.lang.String str17 = board14.toString();
        boolean boolean18 = board14.isFull();
        boolean boolean19 = board1.equals((java.lang.Object) board14);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board1.getCell((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        long long8 = board7.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        boolean boolean15 = cell13.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean23 = cell13.equals((java.lang.Object) board22);
        boolean boolean24 = board1.equals((java.lang.Object) board22);
        boolean boolean25 = board1.isFull();
        ar.edu.unrc.game2048.Board.Direction direction26 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean27 = board1.move(direction26);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + direction26 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction26.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean1 = cell0.isEmpty();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        boolean boolean5 = board3.isFull();
        boolean boolean6 = board3.moveDown();
        boolean boolean7 = board3.isWinningBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean9 = board3.isLosingBoard();
        int int10 = board3.getSize();
        boolean boolean11 = cell0.equals((java.lang.Object) board3);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 10);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean7 = position5.equals((java.lang.Object) 10.0f);
        int int8 = position5.col;
        boolean boolean10 = position5.equals((java.lang.Object) 0);
        int int11 = position5.row;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Cell cell16 = board13.getCell(0, 0);
        java.lang.String str17 = board13.toString();
        long long18 = board13.getScore();
        boolean boolean19 = position5.equals((java.lang.Object) board13);
        boolean boolean20 = position2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board21.isWinningBoard();
        java.lang.String str24 = board21.toString();
        boolean boolean25 = board21.isFull();
        boolean boolean26 = position2.equals((java.lang.Object) board21);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str24, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (-1));
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.moveDown();
        int int9 = board6.getSize();
        boolean boolean10 = board6.moveDown();
        boolean boolean11 = position2.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, -1)" + "'", str4, "(0, -1)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        int int4 = board1.getSize();
        boolean boolean5 = board1.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getSize();
        long long4 = board0.getScore();
        boolean boolean5 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        boolean boolean8 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell(0, 0);
        java.lang.String str14 = board10.toString();
        ar.edu.unrc.game2048.Board.Direction direction15 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean16 = board10.move(direction15);
        boolean boolean17 = board1.move(direction15);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction15 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction15.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(positionSet18);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        java.lang.Class<?> wildcardClass6 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean5 = board0.move(direction4);
        java.lang.Class<?> wildcardClass6 = direction4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean5 = board0.move(direction4);
        boolean boolean6 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveUp();
        boolean boolean10 = board6.moveUp();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Board.Position position16 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 10);
        java.lang.String str17 = position16.toString();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Cell cell22 = board19.getCell(0, 0);
        boolean boolean23 = position16.equals((java.lang.Object) cell22);
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell((-1), 0, cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(97, 10)" + "'", str17, "(97, 10)");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        int int12 = cell11.getValue();
        int int13 = cell11.getValue();
        boolean boolean14 = cell5.canMergeWith(cell11);
        java.lang.String str15 = cell11.toString();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean24 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell(0, (int) (byte) 0);
        boolean boolean29 = cell27.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean37 = cell27.equals((java.lang.Object) board36);
        boolean boolean38 = cell21.canMergeWith(cell27);
        boolean boolean39 = cell21.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell40 = cell11.mergeWith(cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        long long7 = board1.getScore();
        boolean boolean8 = board1.isFull();
        boolean boolean9 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell(0, 2);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        boolean boolean17 = board15.isFull();
        boolean boolean18 = board15.moveDown();
        int int19 = board15.getSize();
        boolean boolean20 = board15.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board15.getEmptyPositions();
        int int22 = board15.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell26 = board15.getCell((int) (byte) 0, 1);
        int int27 = cell26.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell28 = cell13.mergeWith(cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        java.lang.String str8 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet9);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 10);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean13 = position11.equals((java.lang.Object) '4');
        boolean boolean15 = position11.equals((java.lang.Object) 'a');
        int int16 = position11.col;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board18.isFull();
        ar.edu.unrc.game2048.Cell cell22 = board18.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean24 = board18.moveLeft();
        boolean boolean25 = position11.equals((java.lang.Object) boolean24);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        boolean boolean28 = board27.isFull();
        ar.edu.unrc.game2048.Cell cell31 = board27.getCell(0, (int) (byte) 0);
        boolean boolean33 = cell31.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board34);
        boolean boolean36 = board35.isFull();
        ar.edu.unrc.game2048.Cell cell39 = board35.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board35);
        boolean boolean41 = cell31.equals((java.lang.Object) board40);
        boolean boolean42 = position11.equals((java.lang.Object) board40);
        boolean boolean43 = board1.equals((java.lang.Object) board40);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        int int2 = board0.getSize();
        boolean boolean3 = board0.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell17.canMergeWith(cell23);
        boolean boolean27 = cell5.canMergeWith(cell23);
        java.lang.String str28 = cell5.toString();
        java.lang.String str29 = cell5.toString();
        boolean boolean30 = cell5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell8 = board5.getCell(0, 0);
        java.lang.String str9 = board5.toString();
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean11 = board5.move(direction10);
        boolean boolean12 = board3.move(direction10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board3);
        int int14 = board3.getSize();
        int int15 = board3.getSize();
        boolean boolean16 = board3.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board8.isFull();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        boolean boolean16 = board14.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        int int8 = board1.getSize();
        int int9 = board1.getSize();
        java.lang.String str10 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell6 = board3.getCell(0, 0);
        boolean boolean7 = board3.isFull();
        boolean boolean8 = cell1.equals((java.lang.Object) board3);
        boolean boolean9 = board3.moveUp();
        boolean boolean10 = board3.moveLeft();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board14.isFull();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell(0, (int) (byte) 0);
        java.lang.String str19 = cell18.toString();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        ar.edu.unrc.game2048.Cell cell25 = board21.getCell(0, (int) (byte) 0);
        int int26 = cell25.getValue();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board27);
        boolean boolean29 = board28.isFull();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board28);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean35 = cell25.equals((java.lang.Object) board34);
        java.lang.String str36 = cell25.toString();
        int int37 = cell25.getValue();
        boolean boolean38 = cell18.equals((java.lang.Object) cell25);
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board39);
        boolean boolean41 = board40.isFull();
        ar.edu.unrc.game2048.Cell cell44 = board40.getCell(0, (int) (byte) 0);
        int int45 = cell44.getValue();
        java.lang.Object obj46 = null;
        boolean boolean47 = cell44.equals(obj46);
        boolean boolean48 = cell18.equals(obj46);
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell(1, 97, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.isLosingBoard();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        ar.edu.unrc.game2048.Cell cell29 = board25.getCell(0, (int) (byte) 0);
        boolean boolean31 = cell29.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board32);
        boolean boolean34 = board33.isFull();
        ar.edu.unrc.game2048.Cell cell37 = board33.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board33);
        boolean boolean39 = cell29.equals((java.lang.Object) board38);
        boolean boolean40 = cell23.canMergeWith(cell29);
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell(0, (-1), cell29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Cell cell16 = board13.getCell(0, 0);
        java.lang.String str17 = board13.toString();
        ar.edu.unrc.game2048.Board.Direction direction18 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean19 = board13.move(direction18);
        boolean boolean20 = board11.move(direction18);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board11.getEmptyPositions();
        boolean boolean22 = board1.equals((java.lang.Object) board11);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction18.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, (int) (byte) -1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean7 = cell5.equals((java.lang.Object) 100.0f);
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        boolean boolean16 = cell14.equals((java.lang.Object) 100.0f);
        int int17 = cell14.getValue();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        int int24 = cell23.getValue();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean27 = board26.isFull();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board26);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board26);
        boolean boolean33 = cell23.equals((java.lang.Object) board32);
        java.lang.String str34 = cell23.toString();
        boolean boolean35 = cell14.canMergeWith(cell23);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell36 = cell5.mergeWith(cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (long) 4);
        boolean boolean3 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean5 = board0.move(direction4);
        java.lang.Object obj6 = null;
        boolean boolean7 = board0.equals(obj6);
        int int8 = board0.getSize();
        boolean boolean9 = board0.moveUp();
        java.lang.String str10 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|     |    2|     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 4\n+-----+-----+-----+-----+\n|    4|     |    2|     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        boolean boolean3 = board1.moveLeft();
        long long4 = board1.getScore();
        boolean boolean5 = board1.isFull();
        java.lang.String str6 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        long long3 = board1.getScore();
        boolean boolean4 = board1.moveDown();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        int int7 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = position2.equals((java.lang.Object) boolean15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board18.isFull();
        ar.edu.unrc.game2048.Cell cell22 = board18.getCell(0, (int) (byte) 0);
        boolean boolean24 = cell22.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean27 = board26.isFull();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board26);
        boolean boolean32 = cell22.equals((java.lang.Object) board31);
        boolean boolean33 = position2.equals((java.lang.Object) board31);
        int int34 = position2.col;
        int int35 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell(0, (int) (byte) 0);
        int int20 = cell19.getValue();
        int int21 = cell19.getValue();
        boolean boolean22 = cell13.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board24.isFull();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean31 = board30.isFull();
        ar.edu.unrc.game2048.Cell cell34 = board30.getCell(0, (int) (byte) 0);
        boolean boolean35 = cell28.canMergeWith(cell34);
        int int36 = cell34.getValue();
        boolean boolean37 = cell19.equals((java.lang.Object) int36);
        java.lang.String str38 = cell19.toString();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell42 = board39.getCell(1, 0);
        boolean boolean43 = cell19.canMergeWith(cell42);
        boolean boolean44 = board1.equals((java.lang.Object) cell42);
        java.lang.String str45 = cell42.toString();
        java.lang.String str46 = cell42.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        boolean boolean13 = cell11.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean21 = cell11.equals((java.lang.Object) board20);
        boolean boolean22 = cell5.canMergeWith(cell11);
        boolean boolean23 = cell5.isEmpty();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        ar.edu.unrc.game2048.Cell cell29 = board25.getCell(0, (int) (byte) 0);
        java.lang.String str30 = cell29.toString();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell34 = board31.getCell(1, 0);
        boolean boolean35 = cell29.canMergeWith(cell34);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean43 = board37.moveLeft();
        long long44 = board37.getScore();
        boolean boolean45 = cell34.equals((java.lang.Object) long44);
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(board46);
        boolean boolean48 = board47.isFull();
        ar.edu.unrc.game2048.Cell cell51 = board47.getCell(0, (int) (byte) 0);
        java.lang.String str52 = cell51.toString();
        int int53 = cell51.getValue();
        int int54 = cell51.getValue();
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(board55);
        boolean boolean57 = board56.isFull();
        ar.edu.unrc.game2048.Cell cell60 = board56.getCell(0, (int) (byte) 0);
        java.lang.String str61 = cell60.toString();
        int int62 = cell60.getValue();
        int int63 = cell60.getValue();
        java.lang.String str64 = cell60.toString();
        int int65 = cell60.getValue();
        java.lang.String str66 = cell60.toString();
        boolean boolean67 = cell51.canMergeWith(cell60);
        boolean boolean68 = cell34.equals((java.lang.Object) cell51);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell69 = cell5.mergeWith(cell51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "." + "'", str61, ".");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "." + "'", str64, ".");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "." + "'", str66, ".");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 10);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean7 = position5.equals((java.lang.Object) 10.0f);
        int int8 = position5.col;
        boolean boolean10 = position5.equals((java.lang.Object) 0);
        int int11 = position5.row;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Cell cell16 = board13.getCell(0, 0);
        java.lang.String str17 = board13.toString();
        long long18 = board13.getScore();
        boolean boolean19 = position5.equals((java.lang.Object) board13);
        boolean boolean20 = position2.equals((java.lang.Object) position5);
        java.lang.String str21 = position5.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0, 10)" + "'", str21, "(0, 10)");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell(1, 0);
        boolean boolean11 = cell5.canMergeWith(cell10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean19 = board13.moveLeft();
        long long20 = board13.getScore();
        boolean boolean21 = cell10.equals((java.lang.Object) long20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean24 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell(0, (int) (byte) 0);
        java.lang.String str28 = cell27.toString();
        int int29 = cell27.getValue();
        int int30 = cell27.getValue();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell(0, (int) (byte) 0);
        java.lang.String str37 = cell36.toString();
        int int38 = cell36.getValue();
        int int39 = cell36.getValue();
        java.lang.String str40 = cell36.toString();
        int int41 = cell36.getValue();
        java.lang.String str42 = cell36.toString();
        boolean boolean43 = cell27.canMergeWith(cell36);
        boolean boolean44 = cell10.equals((java.lang.Object) cell27);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board45);
        boolean boolean47 = board46.isFull();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board51);
        boolean boolean53 = board52.isFull();
        ar.edu.unrc.game2048.Cell cell56 = board52.getCell(0, (int) (byte) 0);
        boolean boolean57 = cell50.canMergeWith(cell56);
        boolean boolean58 = cell50.isEmpty();
        boolean boolean59 = cell27.equals((java.lang.Object) cell50);
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board61 = new ar.edu.unrc.game2048.Board(board60);
        boolean boolean62 = board61.isFull();
        ar.edu.unrc.game2048.Cell cell65 = board61.getCell(0, (int) (byte) 0);
        java.lang.String str66 = cell65.toString();
        int int67 = cell65.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell68 = cell50.mergeWith(cell65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "." + "'", str66, ".");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        int int7 = position2.col;
        int int8 = position2.row;
        int int9 = position2.row;
        java.lang.String str10 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0, 10)" + "'", str10, "(0, 10)");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell17.canMergeWith(cell23);
        boolean boolean27 = cell5.canMergeWith(cell23);
        boolean boolean29 = cell5.equals((java.lang.Object) "Cell value must be 0 or at least 2: ");
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell33 = board30.getCell(1, 0);
        boolean boolean34 = cell5.canMergeWith(cell33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isLosingBoard();
        int int8 = board1.getSize();
        boolean boolean9 = board1.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        java.lang.String str15 = cell14.toString();
        int int16 = cell14.getValue();
        int int17 = cell14.getValue();
        java.lang.String str18 = cell14.toString();
        int int19 = cell14.getValue();
        java.lang.String str20 = cell14.toString();
        boolean boolean21 = cell5.canMergeWith(cell14);
        int int22 = cell14.getValue();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        boolean boolean26 = board24.isLosingBoard();
        boolean boolean27 = board24.moveUp();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean29 = cell14.equals((java.lang.Object) board28);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        ar.edu.unrc.game2048.Cell cell34 = board31.getCell(0, 0);
        ar.edu.unrc.game2048.Board.Direction direction35 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean36 = board31.move(direction35);
        boolean boolean37 = board28.equals((java.lang.Object) board31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + direction35 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction35.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 10, (long) (byte) -1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell(0, (int) (byte) 0);
        int int17 = cell16.getValue();
        int int18 = cell16.getValue();
        boolean boolean19 = cell10.canMergeWith(cell16);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        ar.edu.unrc.game2048.Cell cell25 = board21.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        boolean boolean28 = board27.isFull();
        ar.edu.unrc.game2048.Cell cell31 = board27.getCell(0, (int) (byte) 0);
        boolean boolean32 = cell25.canMergeWith(cell31);
        int int33 = cell31.getValue();
        boolean boolean34 = cell16.equals((java.lang.Object) int33);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(0, (int) (byte) -1, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        boolean boolean18 = cell11.canMergeWith(cell17);
        boolean boolean19 = cell5.canMergeWith(cell11);
        int int20 = cell11.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        boolean boolean13 = cell11.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean21 = cell11.equals((java.lang.Object) board20);
        boolean boolean22 = cell5.canMergeWith(cell11);
        java.lang.String str23 = cell11.toString();
        boolean boolean24 = cell11.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        int int12 = cell5.getValue();
        boolean boolean13 = cell5.isEmpty();
        int int14 = cell5.getValue();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        boolean boolean22 = cell20.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board24.isFull();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean30 = cell20.equals((java.lang.Object) board29);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell(0, (int) (byte) 0);
        java.lang.String str37 = cell36.toString();
        int int38 = cell36.getValue();
        int int39 = cell36.getValue();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board40);
        boolean boolean42 = board41.isFull();
        ar.edu.unrc.game2048.Cell cell45 = board41.getCell(0, (int) (byte) 0);
        java.lang.String str46 = cell45.toString();
        int int47 = cell45.getValue();
        int int48 = cell45.getValue();
        java.lang.String str49 = cell45.toString();
        int int50 = cell45.getValue();
        java.lang.String str51 = cell45.toString();
        boolean boolean52 = cell36.canMergeWith(cell45);
        boolean boolean53 = cell45.isEmpty();
        java.lang.String str54 = cell45.toString();
        boolean boolean55 = cell20.canMergeWith(cell45);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell56 = cell5.mergeWith(cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "." + "'", str51, ".");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        int int7 = position2.col;
        int int8 = position2.row;
        int int9 = position2.row;
        int int10 = position2.row;
        java.lang.String str11 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(0, 10)" + "'", str11, "(0, 10)");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveUp();
        ar.edu.unrc.game2048.Cell cell20 = board9.getCell(3, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        java.lang.String str27 = cell26.toString();
        int int28 = cell26.getValue();
        int int29 = cell26.getValue();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        java.lang.String str36 = cell35.toString();
        int int37 = cell35.getValue();
        int int38 = cell35.getValue();
        java.lang.String str39 = cell35.toString();
        int int40 = cell35.getValue();
        java.lang.String str41 = cell35.toString();
        boolean boolean42 = cell26.canMergeWith(cell35);
        boolean boolean43 = cell20.canMergeWith(cell35);
        int int44 = cell20.getValue();
        int int45 = cell20.getValue();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell9 = board5.getCell(0, (int) (byte) 0);
        int int10 = cell9.getValue();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean19 = cell9.equals((java.lang.Object) board18);
        java.lang.String str20 = cell9.toString();
        board0.setCell((int) (short) 0, 1, cell9);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean24 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean30 = board29.isFull();
        ar.edu.unrc.game2048.Cell cell33 = board29.getCell(0, (int) (byte) 0);
        boolean boolean34 = cell27.canMergeWith(cell33);
        int int35 = cell33.getValue();
        boolean boolean36 = board0.equals((java.lang.Object) cell33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean8 = board1.moveDown();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        int int2 = board1.getSize();
        boolean boolean3 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean7 = cell5.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell(0, (int) (byte) 0);
        java.lang.String str22 = cell21.toString();
        int int23 = cell21.getValue();
        int int24 = cell21.getValue();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean27 = board26.isFull();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell(0, (int) (byte) 0);
        java.lang.String str31 = cell30.toString();
        int int32 = cell30.getValue();
        int int33 = cell30.getValue();
        java.lang.String str34 = cell30.toString();
        int int35 = cell30.getValue();
        java.lang.String str36 = cell30.toString();
        boolean boolean37 = cell21.canMergeWith(cell30);
        boolean boolean38 = cell30.isEmpty();
        java.lang.String str39 = cell30.toString();
        boolean boolean40 = cell5.canMergeWith(cell30);
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board41);
        boolean boolean43 = board42.isFull();
        ar.edu.unrc.game2048.Cell cell46 = board42.getCell(0, (int) (byte) 0);
        java.lang.String str47 = cell46.toString();
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell51 = board48.getCell(1, 0);
        boolean boolean52 = cell46.canMergeWith(cell51);
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board(board53);
        boolean boolean55 = board54.isFull();
        ar.edu.unrc.game2048.Cell cell58 = board54.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board(board54);
        boolean boolean60 = board54.moveLeft();
        long long61 = board54.getScore();
        boolean boolean62 = cell51.equals((java.lang.Object) long61);
        ar.edu.unrc.game2048.Board board63 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(board63);
        boolean boolean65 = board64.isFull();
        ar.edu.unrc.game2048.Cell cell68 = board64.getCell(0, (int) (byte) 0);
        java.lang.String str69 = cell68.toString();
        int int70 = cell68.getValue();
        int int71 = cell68.getValue();
        ar.edu.unrc.game2048.Board board72 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board73 = new ar.edu.unrc.game2048.Board(board72);
        boolean boolean74 = board73.isFull();
        ar.edu.unrc.game2048.Cell cell77 = board73.getCell(0, (int) (byte) 0);
        java.lang.String str78 = cell77.toString();
        int int79 = cell77.getValue();
        int int80 = cell77.getValue();
        java.lang.String str81 = cell77.toString();
        int int82 = cell77.getValue();
        java.lang.String str83 = cell77.toString();
        boolean boolean84 = cell68.canMergeWith(cell77);
        boolean boolean85 = cell51.equals((java.lang.Object) cell68);
        ar.edu.unrc.game2048.Board board86 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board87 = new ar.edu.unrc.game2048.Board(board86);
        ar.edu.unrc.game2048.Cell cell90 = board87.getCell(0, 0);
        boolean boolean91 = cell51.equals((java.lang.Object) cell90);
        boolean boolean92 = cell30.canMergeWith(cell90);
        java.lang.String str93 = cell90.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "." + "'", str69, ".");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(cell77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "." + "'", str78, ".");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "." + "'", str81, ".");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "." + "'", str83, ".");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(cell90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "." + "'", str93, ".");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean8 = board7.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board8.isFull();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        java.lang.String str16 = cell5.toString();
        boolean boolean17 = cell5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        int int9 = cell5.getValue();
        java.lang.String str10 = cell5.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board4.isWinningBoard();
        int int7 = board4.getSize();
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean9 = board4.move(direction8);
        boolean boolean10 = board1.move(direction8);
        java.lang.Object obj11 = null;
        boolean boolean12 = board1.equals(obj11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board14.isFull();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board.Direction direction21 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean22 = board14.move(direction21);
        boolean boolean23 = board1.move(direction21);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + direction21 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction21.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, 1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.isFull();
        boolean boolean8 = board1.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 10);
        java.lang.String str12 = position11.toString();
        boolean boolean13 = board1.equals((java.lang.Object) position11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(97, 10)" + "'", str12, "(97, 10)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 10);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        boolean boolean6 = position2.equals((java.lang.Object) "'");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, 10)" + "'", str3, "(97, 10)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveLeft();
        java.lang.String str8 = board1.toString();
        ar.edu.unrc.game2048.Cell cell11 = null;
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((-1), 0, cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(1);
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        java.lang.String str12 = cell11.toString();
        int int13 = cell11.getValue();
        int int14 = cell11.getValue();
        java.lang.String str15 = cell11.toString();
        int int16 = cell11.getValue();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        boolean boolean20 = board18.isFull();
        boolean boolean21 = board18.moveDown();
        boolean boolean22 = board18.moveDown();
        boolean boolean23 = board18.moveUp();
        boolean boolean24 = cell11.equals((java.lang.Object) board18);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (short) 1, 100, cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isWinningBoard();
        int int4 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean7 = cell5.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        boolean boolean16 = board14.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board4.isWinningBoard();
        int int7 = board4.getSize();
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean9 = board4.move(direction8);
        boolean boolean10 = board1.move(direction8);
        java.lang.Object obj11 = null;
        boolean boolean12 = board1.equals(obj11);
        java.lang.Class<?> wildcardClass13 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        boolean boolean12 = cell5.canMergeWith(cell11);
        boolean boolean13 = cell5.isEmpty();
        ar.edu.unrc.game2048.Board.Position position16 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean18 = position16.equals((java.lang.Object) '4');
        boolean boolean20 = position16.equals((java.lang.Object) 'a');
        int int21 = position16.col;
        int int22 = position16.col;
        int int23 = position16.col;
        boolean boolean24 = cell5.equals((java.lang.Object) int23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isFull();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board.Direction direction17 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean18 = board10.move(direction17);
        boolean boolean19 = board6.move(direction17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction17.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 10);
        int int3 = position2.col;
        int int4 = position2.row;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board1.isLosingBoard();
        long long16 = board1.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        int int8 = position2.row;
        int int9 = position2.row;
        int int10 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 10);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell8 = board5.getCell(0, 0);
        boolean boolean9 = position2.equals((java.lang.Object) cell8);
        int int10 = cell8.getValue();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board18.isFull();
        ar.edu.unrc.game2048.Cell cell22 = board18.getCell(0, (int) (byte) 0);
        int int23 = cell22.getValue();
        int int24 = cell22.getValue();
        boolean boolean25 = cell16.canMergeWith(cell22);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell26 = cell8.mergeWith(cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, 10)" + "'", str3, "(97, 10)");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean7 = cell5.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        java.lang.String str16 = board14.toString();
        ar.edu.unrc.game2048.Board.Direction direction17 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean18 = board14.move(direction17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction17.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        java.lang.String str15 = cell14.toString();
        int int16 = cell14.getValue();
        int int17 = cell14.getValue();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        java.lang.String str24 = cell23.toString();
        int int25 = cell23.getValue();
        int int26 = cell23.getValue();
        java.lang.String str27 = cell23.toString();
        int int28 = cell23.getValue();
        java.lang.String str29 = cell23.toString();
        boolean boolean30 = cell14.canMergeWith(cell23);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell31 = cell5.mergeWith(cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isLosingBoard();
        boolean boolean9 = board6.moveDown();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        int int6 = board1.getSize();
        int int7 = board1.getSize();
        boolean boolean8 = board1.moveLeft();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        long long4 = board1.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board1.getCell((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean9 = board1.move(direction8);
        boolean boolean10 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, 2048);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        ar.edu.unrc.game2048.Cell cell17 = board1.getCell(0, 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        boolean boolean25 = cell23.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        boolean boolean28 = board27.isFull();
        ar.edu.unrc.game2048.Cell cell31 = board27.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board27);
        boolean boolean33 = cell23.equals((java.lang.Object) board32);
        int int34 = cell23.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell35 = cell17.mergeWith(cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.moveDown();
        boolean boolean7 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.hasEmptyCells();
        java.lang.String str5 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.hasEmptyCells();
        boolean boolean8 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        long long7 = board1.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.isLosingBoard();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        boolean boolean19 = board17.isFull();
        boolean boolean20 = board17.moveDown();
        int int21 = board17.getSize();
        boolean boolean22 = board17.moveDown();
        boolean boolean23 = board9.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveUp();
        java.lang.String str10 = board6.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        boolean boolean11 = board8.isLosingBoard();
        boolean boolean12 = board8.hasEmptyCells();
        java.lang.String str13 = board8.toString();
        boolean boolean14 = cell5.equals((java.lang.Object) str13);
        ar.edu.unrc.game2048.Board.Position position17 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean19 = position17.equals((java.lang.Object) 10.0f);
        int int20 = position17.col;
        int int21 = position17.row;
        int int22 = position17.row;
        int int23 = position17.col;
        boolean boolean24 = cell5.equals((java.lang.Object) position17);
        java.lang.String str25 = cell5.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        boolean boolean29 = board27.isFull();
        boolean boolean30 = board27.moveDown();
        boolean boolean32 = board27.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean33 = board27.isLosingBoard();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board34);
        ar.edu.unrc.game2048.Cell cell38 = board35.getCell(0, 0);
        java.lang.String str39 = board35.toString();
        boolean boolean40 = board27.equals((java.lang.Object) board35);
        boolean boolean41 = board35.moveLeft();
        boolean boolean42 = board35.moveUp();
        boolean boolean43 = board35.moveUp();
        ar.edu.unrc.game2048.Cell cell46 = board35.getCell(3, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(board47);
        boolean boolean49 = board48.isFull();
        ar.edu.unrc.game2048.Cell cell52 = board48.getCell(0, (int) (byte) 0);
        java.lang.String str53 = cell52.toString();
        int int54 = cell52.getValue();
        int int55 = cell52.getValue();
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board(board56);
        boolean boolean58 = board57.isFull();
        ar.edu.unrc.game2048.Cell cell61 = board57.getCell(0, (int) (byte) 0);
        java.lang.String str62 = cell61.toString();
        int int63 = cell61.getValue();
        int int64 = cell61.getValue();
        java.lang.String str65 = cell61.toString();
        int int66 = cell61.getValue();
        java.lang.String str67 = cell61.toString();
        boolean boolean68 = cell52.canMergeWith(cell61);
        boolean boolean69 = cell46.canMergeWith(cell61);
        boolean boolean70 = cell5.canMergeWith(cell61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str39, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "." + "'", str53, ".");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "." + "'", str62, ".");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "." + "'", str65, ".");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "." + "'", str67, ".");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        int int4 = board1.getSize();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell8 = board5.getCell(0, 0);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean10 = board5.move(direction9);
        boolean boolean11 = board1.move(direction9);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        long long1 = board0.getScore();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        boolean boolean5 = board3.isFull();
        boolean boolean6 = board3.moveDown();
        int int7 = board3.getSize();
        java.lang.String str8 = board3.toString();
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean10 = board3.move(direction9);
        boolean boolean11 = board0.move(direction9);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        long long7 = board1.getScore();
        boolean boolean8 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board1.getCell(1, 0);
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell(0, 1);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell14);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveUp();
        ar.edu.unrc.game2048.Cell cell20 = board9.getCell(3, (int) (byte) 0);
        boolean boolean21 = board9.moveUp();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        ar.edu.unrc.game2048.Cell cell29 = board25.getCell(0, (int) (byte) 0);
        java.lang.String str30 = cell29.toString();
        int int31 = cell29.getValue();
        int int32 = cell29.getValue();
        java.lang.String str33 = cell29.toString();
        int int34 = cell29.getValue();
        int int35 = cell29.getValue();
        int int36 = cell29.getValue();
        java.lang.String str37 = cell29.toString();
        boolean boolean38 = cell29.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell(100, (int) '4', cell29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean10 = position8.equals((java.lang.Object) 10.0f);
        int int11 = position8.col;
        int int12 = position8.row;
        int int13 = position8.row;
        int int14 = position8.col;
        boolean boolean16 = position8.equals((java.lang.Object) "A board needs ");
        boolean boolean17 = position2.equals((java.lang.Object) boolean16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 10, 8L);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean5 = board0.move(direction4);
        boolean boolean6 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board8.isFull();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell9 = board5.getCell(0, (int) (byte) 0);
        int int10 = cell9.getValue();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean19 = cell9.equals((java.lang.Object) board18);
        java.lang.String str20 = cell9.toString();
        board0.setCell((int) (short) 0, 1, cell9);
        java.lang.String str22 = cell9.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) 1);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        boolean boolean20 = board18.isFull();
        boolean boolean21 = board18.moveDown();
        int int22 = board18.getSize();
        java.lang.String str23 = board18.toString();
        ar.edu.unrc.game2048.Board.Direction direction24 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean25 = board18.move(direction24);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        boolean boolean29 = board27.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board27.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction31 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean32 = board27.move(direction31);
        boolean boolean33 = board18.move(direction31);
        boolean boolean34 = board9.move(direction31);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str23, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction24 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction24.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertTrue("'" + direction31 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction31.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        boolean boolean3 = board1.moveLeft();
        long long4 = board1.getScore();
        boolean boolean5 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString(": ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: : ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getSize();
        boolean boolean4 = board0.isFull();
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean9 = position7.equals((java.lang.Object) '4');
        boolean boolean11 = position7.equals((java.lang.Object) 'a');
        int int12 = position7.col;
        boolean boolean13 = board0.equals((java.lang.Object) position7);
        int int14 = position7.col;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, 100);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell17.canMergeWith(cell23);
        boolean boolean27 = cell5.canMergeWith(cell23);
        ar.edu.unrc.game2048.Board.Position position30 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean32 = position30.equals((java.lang.Object) '4');
        boolean boolean34 = position30.equals((java.lang.Object) 'a');
        int int35 = position30.col;
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean43 = board37.moveLeft();
        boolean boolean44 = position30.equals((java.lang.Object) boolean43);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board45);
        boolean boolean47 = board46.isFull();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell(0, (int) (byte) 0);
        boolean boolean52 = cell50.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board(board53);
        boolean boolean55 = board54.isFull();
        ar.edu.unrc.game2048.Cell cell58 = board54.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board(board54);
        boolean boolean60 = cell50.equals((java.lang.Object) board59);
        boolean boolean61 = position30.equals((java.lang.Object) board59);
        boolean boolean62 = cell5.equals((java.lang.Object) position30);
        ar.edu.unrc.game2048.Board board63 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet64 = board63.getEmptyPositions();
        java.lang.String str65 = board63.toString();
        boolean boolean66 = position30.equals((java.lang.Object) str65);
        int int67 = position30.col;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(positionSet64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str65, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        int int7 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = position2.equals((java.lang.Object) boolean15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board18.isFull();
        ar.edu.unrc.game2048.Cell cell22 = board18.getCell(0, (int) (byte) 0);
        boolean boolean24 = cell22.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean27 = board26.isFull();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board26);
        boolean boolean32 = cell22.equals((java.lang.Object) board31);
        boolean boolean33 = position2.equals((java.lang.Object) board31);
        long long34 = board31.getScore();
        boolean boolean35 = board31.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board31.getEmptyPositions();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board37);
        int int39 = board38.getSize();
        boolean boolean40 = board38.isWinningBoard();
        boolean boolean41 = board31.equals((java.lang.Object) boolean40);
        boolean boolean42 = board31.moveUp();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell(0, (int) (byte) 0);
        int int20 = cell19.getValue();
        int int21 = cell19.getValue();
        boolean boolean22 = cell13.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board24.isFull();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean31 = board30.isFull();
        ar.edu.unrc.game2048.Cell cell34 = board30.getCell(0, (int) (byte) 0);
        boolean boolean35 = cell28.canMergeWith(cell34);
        int int36 = cell34.getValue();
        boolean boolean37 = cell19.equals((java.lang.Object) int36);
        java.lang.String str38 = cell19.toString();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell42 = board39.getCell(1, 0);
        boolean boolean43 = cell19.canMergeWith(cell42);
        boolean boolean44 = board1.equals((java.lang.Object) cell42);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board45);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet47 = board46.getEmptyPositions();
        boolean boolean48 = board46.isFull();
        boolean boolean49 = board46.moveDown();
        boolean boolean50 = board46.isWinningBoard();
        int int51 = board46.getSize();
        boolean boolean52 = cell42.equals((java.lang.Object) board46);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(positionSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveUp();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board9);
        java.lang.Class<?> wildcardClass19 = board9.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) (byte) 100);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        ar.edu.unrc.game2048.Cell cell17 = board1.getCell(0, 0);
        boolean boolean18 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveUp();
        ar.edu.unrc.game2048.Cell cell20 = board9.getCell(3, (int) (byte) 0);
        boolean boolean21 = board9.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        int int8 = position2.col;
        java.lang.String str9 = position2.toString();
        int int10 = position2.col;
        int int11 = position2.row;
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Cell cell18 = board15.getCell(0, 0);
        boolean boolean19 = board15.isFull();
        boolean boolean20 = cell13.equals((java.lang.Object) board15);
        boolean boolean21 = board15.moveDown();
        boolean boolean22 = position2.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0, 10)" + "'", str9, "(0, 10)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, 0);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveUp();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        int int3 = position2.row;
        int int4 = position2.row;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (long) 10);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        boolean boolean15 = cell13.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean23 = cell13.equals((java.lang.Object) board22);
        boolean boolean24 = board1.equals((java.lang.Object) board22);
        boolean boolean25 = board1.isFull();
        java.lang.Class<?> wildcardClass26 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0);
        int int8 = position2.col;
        int int9 = position2.row;
        int int10 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        long long7 = board1.getScore();
        boolean boolean8 = board1.isFull();
        boolean boolean9 = board1.hasEmptyCells();
        boolean boolean10 = board1.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString(")");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        boolean boolean9 = board7.isFull();
        boolean boolean10 = board7.moveDown();
        boolean boolean12 = board7.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean13 = board7.isLosingBoard();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Cell cell18 = board15.getCell(0, 0);
        java.lang.String str19 = board15.toString();
        boolean boolean20 = board7.equals((java.lang.Object) board15);
        boolean boolean21 = board15.moveLeft();
        boolean boolean22 = board15.moveUp();
        boolean boolean23 = board15.moveUp();
        ar.edu.unrc.game2048.Cell cell26 = board15.getCell(3, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board27);
        boolean boolean29 = board28.isFull();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell(0, (int) (byte) 0);
        java.lang.String str33 = cell32.toString();
        int int34 = cell32.getValue();
        int int35 = cell32.getValue();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (byte) 0);
        java.lang.String str42 = cell41.toString();
        int int43 = cell41.getValue();
        int int44 = cell41.getValue();
        java.lang.String str45 = cell41.toString();
        int int46 = cell41.getValue();
        java.lang.String str47 = cell41.toString();
        boolean boolean48 = cell32.canMergeWith(cell41);
        boolean boolean49 = cell26.canMergeWith(cell41);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(1, (int) (short) -1, cell41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str19, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        boolean boolean8 = board1.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) (byte) 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        long long7 = board1.getScore();
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean9 = board1.move(direction8);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        int int6 = board1.getSize();
        int int7 = board1.getSize();
        boolean boolean8 = board1.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.lang.String str4 = board1.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board1.getCell((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        boolean boolean7 = cell5.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean15 = cell5.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        boolean boolean19 = board17.isFull();
        boolean boolean20 = board17.moveDown();
        int int21 = board17.getSize();
        boolean boolean22 = board17.moveDown();
        long long23 = board17.getScore();
        boolean boolean24 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell27 = board17.getCell(1, 0);
        boolean boolean28 = cell5.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4L + "'", long23 == 4L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        int int8 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board1.getCell((int) (byte) 0, 1);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean5 = board3.isWinningBoard();
        boolean boolean6 = board3.isLosingBoard();
        boolean boolean7 = board3.isWinningBoard();
        boolean boolean8 = board3.moveUp();
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean10 = board3.move(direction9);
        boolean boolean11 = board0.move(direction9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell(1, 0);
        boolean boolean11 = cell5.canMergeWith(cell10);
        java.lang.String str12 = cell10.toString();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board14.isFull();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell(0, (int) (byte) 0);
        java.lang.String str19 = cell18.toString();
        int int20 = cell18.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell21 = cell10.mergeWith(cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.hasEmptyCells();
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board1.getEmptyPositions();
        boolean boolean10 = board1.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell3 = board0.getCell(1, 0);
        boolean boolean4 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board0.equals((java.lang.Object) board12);
        java.lang.String str14 = board12.toString();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board6.getSize();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean5 = board0.move(direction4);
        java.lang.Object obj6 = null;
        boolean boolean7 = board0.equals(obj6);
        int int8 = board0.getSize();
        boolean boolean9 = board0.isWinningBoard();
        boolean boolean10 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = position2.equals((java.lang.Object) board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board7.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board7.getCell(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 10)" + "'", str6, "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet9);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board1.isLosingBoard();
        boolean boolean16 = board1.moveRight();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = board20.isFull();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell(0, (int) (byte) 0);
        boolean boolean25 = cell24.isEmpty();
        int int26 = cell24.getValue();
        board1.setCell((int) (byte) 1, 0, cell24);
        long long28 = board1.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 4L + "'", long28 == 4L);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        int int6 = board1.getSize();
        int int7 = board1.getSize();
        long long8 = board1.getScore();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.moveUp();
        boolean boolean17 = board9.moveRight();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board18.isWinningBoard();
        boolean boolean21 = board18.isLosingBoard();
        boolean boolean22 = board18.isWinningBoard();
        boolean boolean23 = board18.moveUp();
        ar.edu.unrc.game2048.Board.Direction direction24 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean25 = board18.move(direction24);
        boolean boolean26 = board9.move(direction24);
        boolean boolean27 = board9.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + direction24 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction24.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = position2.equals((java.lang.Object) board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board7.getEmptyPositions();
        boolean boolean10 = board7.isLosingBoard();
        boolean boolean11 = board7.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 10)" + "'", str6, "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(1, 0);
        boolean boolean13 = board9.moveDown();
        boolean boolean14 = board1.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        boolean boolean12 = cell5.canMergeWith(cell11);
        boolean boolean13 = cell5.isEmpty();
        int int14 = cell5.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        int int12 = cell5.getValue();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board14.isFull();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean20 = board14.isWinningBoard();
        boolean boolean21 = cell5.equals((java.lang.Object) boolean20);
        boolean boolean22 = cell5.isEmpty();
        int int23 = cell5.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        int int12 = cell5.getValue();
        boolean boolean13 = cell5.isEmpty();
        int int14 = cell5.getValue();
        java.lang.String str15 = cell5.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        boolean boolean5 = board1.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board6.moveLeft();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell(0, (int) (byte) 0);
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell17.canMergeWith(cell23);
        boolean boolean27 = cell5.canMergeWith(cell23);
        ar.edu.unrc.game2048.Board.Position position30 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean32 = position30.equals((java.lang.Object) '4');
        boolean boolean34 = position30.equals((java.lang.Object) 'a');
        int int35 = position30.col;
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean43 = board37.moveLeft();
        boolean boolean44 = position30.equals((java.lang.Object) boolean43);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board45);
        boolean boolean47 = board46.isFull();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell(0, (int) (byte) 0);
        boolean boolean52 = cell50.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board(board53);
        boolean boolean55 = board54.isFull();
        ar.edu.unrc.game2048.Cell cell58 = board54.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board(board54);
        boolean boolean60 = cell50.equals((java.lang.Object) board59);
        boolean boolean61 = position30.equals((java.lang.Object) board59);
        boolean boolean62 = cell5.equals((java.lang.Object) position30);
        boolean boolean63 = cell5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((-1), (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.String str3 = board2.toString();
        java.lang.String str4 = board2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+\n|     |    2|\n+-----+-----+\n|     |    2|\n+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+\n|     |    2|\n+-----+-----+\n|     |    2|\n+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+\n|     |    2|\n+-----+-----+\n|     |    2|\n+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+\n|     |    2|\n+-----+-----+\n|     |    2|\n+-----+-----+\n");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        java.lang.String str6 = board1.toString();
        java.lang.String str7 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
    }
}

