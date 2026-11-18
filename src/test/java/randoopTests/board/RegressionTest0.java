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
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = ar.edu.unrc.game2048.Board.MAX_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.Class<?> wildcardClass2 = board1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -2147483648");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = null;
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(1, (int) (short) -1, cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass4 = positionSet3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        java.lang.String str3 = board1.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board1.getCell(2147483647, 1073741824);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2147483647, 1073741824) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 0);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(16, 1073741824, cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (16, 1073741824) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board3.toString();
        boolean boolean5 = board3.moveLeft();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell(0, (-2147483648), cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -2147483648) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass4 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int0 = ar.edu.unrc.game2048.Board.MAX_INITIAL_TILE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 131072 + "'", int0 == 131072);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 2147483647");
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
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("'");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: '");
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
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) -1, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 1073741824)" + "'", str4, "(100, 1073741824)");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        int int5 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 2)" + "'", str3, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        boolean boolean3 = cell0.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = cell0.mergeWith(cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell(1073741824, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1073741824, 536870912) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        java.lang.Class<?> wildcardClass3 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
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
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(1073741824);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 1073741824");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        boolean boolean7 = cell4.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board9.isFull();
        boolean boolean12 = board9.moveDown();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board14.isFull();
        boolean boolean16 = board9.equals((java.lang.Object) board14);
        boolean boolean17 = cell4.equals((java.lang.Object) boolean16);
        int int18 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        boolean boolean22 = cell19.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        boolean boolean26 = board24.isFull();
        boolean boolean27 = board24.moveDown();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean30 = board29.isFull();
        boolean boolean31 = board24.equals((java.lang.Object) board29);
        boolean boolean32 = cell19.equals((java.lang.Object) boolean31);
        int int33 = cell19.getValue();
        boolean boolean34 = cell4.canMergeWith(cell19);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 0, 1073741824, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 1073741824) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int5 = position2.row;
        boolean boolean7 = position2.equals((java.lang.Object) "Cell value cannot be negative: ");
        int int8 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board6.getCell((int) (short) 10, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 2147483647) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean1 = cell0.isEmpty();
        java.lang.String str2 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean4 = cell3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = cell0.mergeWith(cell3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        boolean boolean3 = board0.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2147483647, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 2147483647");
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
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board1.getCell(1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.isFull();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        java.lang.String str9 = cell7.toString();
        java.lang.String str10 = cell7.toString();
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell(10, 536870912, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 536870912) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.isFull();
        java.lang.Class<?> wildcardClass4 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        long long6 = board1.getScore();
        boolean boolean7 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, 10);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2048 + "'", int3 == 2048);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board1.getCell(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("invalid board after setCell(");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: invalid board after setCell(");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        java.lang.Class<?> wildcardClass5 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass7 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString(" and ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]:  and ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) (-2147483648));
        java.lang.Class<?> wildcardClass3 = board2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        boolean boolean4 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        boolean boolean3 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.moveUp();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean13 = board6.equals((java.lang.Object) board12);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        long long6 = board1.getScore();
        boolean boolean7 = board1.moveDown();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        boolean boolean2 = board1.isLosingBoard();
        long long3 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        java.lang.String str3 = cell1.toString();
        java.lang.String str4 = cell1.toString();
        int int5 = cell1.getValue();
        boolean boolean6 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        boolean boolean10 = cell7.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        boolean boolean14 = board12.isFull();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        boolean boolean19 = board12.equals((java.lang.Object) board17);
        boolean boolean20 = cell7.equals((java.lang.Object) boolean19);
        int int21 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        boolean boolean25 = cell22.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        boolean boolean29 = board27.isFull();
        boolean boolean30 = board27.moveDown();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        boolean boolean34 = board27.equals((java.lang.Object) board32);
        boolean boolean35 = cell22.equals((java.lang.Object) boolean34);
        int int36 = cell22.getValue();
        boolean boolean37 = cell7.canMergeWith(cell22);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board38);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet40 = board39.getEmptyPositions();
        boolean boolean41 = board39.moveDown();
        boolean boolean42 = cell7.equals((java.lang.Object) board39);
        boolean boolean43 = cell1.equals((java.lang.Object) board39);
        ar.edu.unrc.game2048.Cell cell44 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell45 = cell1.mergeWith(cell44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(positionSet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString(": ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: : ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board3.toString();
        boolean boolean5 = board3.moveLeft();
        boolean boolean7 = board3.equals((java.lang.Object) (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board6.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        java.lang.String str10 = board9.toString();
        boolean boolean11 = board9.moveLeft();
        boolean boolean12 = board0.equals((java.lang.Object) board9);
        boolean boolean13 = board9.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        int int5 = board4.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
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
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        java.lang.String str9 = board6.toString();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = board6.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        java.lang.String str3 = cell1.toString();
        java.lang.String str4 = cell1.toString();
        int int5 = cell1.getValue();
        boolean boolean6 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        java.lang.String str9 = cell7.toString();
        java.lang.String str10 = cell7.toString();
        boolean boolean11 = cell7.isEmpty();
        boolean boolean12 = cell7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = cell1.mergeWith(cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board0.getCell(2048, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board3.toString();
        boolean boolean5 = board3.moveLeft();
        int int6 = board3.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean5 = board2.move(direction4);
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2048, (long) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean2 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board6.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        java.lang.String str10 = board9.toString();
        boolean boolean11 = board9.moveLeft();
        boolean boolean12 = board0.equals((java.lang.Object) board9);
        java.lang.Class<?> wildcardClass13 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 52");
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
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board1.getCell(1, 131072);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 131072) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: |");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("invalid board after construction");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: invalid board after construction");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        long long5 = board4.getScore();
        boolean boolean6 = board4.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell7 = board1.getCell(3, 0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        boolean boolean11 = cell8.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        boolean boolean15 = board13.isFull();
        boolean boolean16 = board13.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board18.isFull();
        boolean boolean20 = board13.equals((java.lang.Object) board18);
        boolean boolean21 = cell8.equals((java.lang.Object) boolean20);
        int int22 = cell8.getValue();
        java.lang.String str23 = cell8.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell24 = cell7.mergeWith(cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 1073741824)" + "'", str5, "(100, 1073741824)");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        int int3 = position2.row;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1L);
        boolean boolean8 = position2.equals((java.lang.Object) 10);
        int int9 = position2.col;
        int int10 = position2.col;
        boolean boolean12 = position2.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1073741824 + "'", int9 == 1073741824);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1073741824 + "'", int10 == 1073741824);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        boolean boolean10 = cell7.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        boolean boolean14 = board12.isFull();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        boolean boolean19 = board12.equals((java.lang.Object) board17);
        boolean boolean20 = cell7.equals((java.lang.Object) boolean19);
        int int21 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        boolean boolean25 = cell22.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        boolean boolean29 = board27.isFull();
        boolean boolean30 = board27.moveDown();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        boolean boolean34 = board27.equals((java.lang.Object) board32);
        boolean boolean35 = cell22.equals((java.lang.Object) boolean34);
        int int36 = cell22.getValue();
        boolean boolean37 = cell7.canMergeWith(cell22);
        int int38 = cell7.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(0, 1073741824, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 1073741824) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int32 = cell31.getValue();
        java.lang.String str33 = cell31.toString();
        java.lang.String str34 = cell31.toString();
        boolean boolean35 = cell31.isEmpty();
        boolean boolean36 = cell31.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell37 = cell15.mergeWith(cell31);
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
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        java.lang.String str4 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        boolean boolean6 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-2147483648), (int) (byte) 1);
        int int3 = position2.col;
        boolean boolean5 = position2.equals((java.lang.Object) ", ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        int int5 = board1.getSize();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board.Direction direction5 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean6 = board0.move(direction5);
        int int7 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board0.getCell((int) 'a', (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, -2147483648) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction5 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction5.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 536870912);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        java.lang.String str7 = cell5.toString();
        java.lang.String str8 = cell5.toString();
        int int9 = cell5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(16, 4, cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (16, 4) is out of bounds for board size 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        java.lang.String str3 = board1.toString();
        boolean boolean4 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.equals((java.lang.Object) (-1.0f));
        int int13 = cell10.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(1073741824, 0, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1073741824, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1L);
        boolean boolean8 = position2.equals((java.lang.Object) 10);
        int int9 = position2.row;
        boolean boolean11 = position2.equals((java.lang.Object) "%5d");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board3.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean1 = cell0.isEmpty();
        boolean boolean2 = cell0.isEmpty();
        int int3 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString(",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: ,");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2048, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        long long4 = board1.getScore();
        boolean boolean5 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board3.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board3.getCell(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveDown();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', (long) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        boolean boolean4 = board1.isLosingBoard();
        boolean boolean5 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        boolean boolean4 = board1.isFull();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.isLosingBoard();
        int int4 = board1.getSize();
        long long5 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        boolean boolean12 = cell9.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        boolean boolean16 = board14.isFull();
        boolean boolean17 = board14.moveDown();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        boolean boolean21 = board14.equals((java.lang.Object) board19);
        boolean boolean22 = cell9.equals((java.lang.Object) boolean21);
        int int23 = cell9.getValue();
        boolean boolean24 = cell9.isEmpty();
        java.lang.String str25 = cell9.toString();
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell(2147483647, 1073741824, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2147483647, 1073741824) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveUp();
        boolean boolean5 = board3.moveUp();
        boolean boolean6 = board3.moveRight();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        int int3 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board1.getCell((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Cannot merge cells: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Cannot merge cells: ");
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
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        boolean boolean10 = cell7.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        boolean boolean14 = board12.isFull();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        boolean boolean19 = board12.equals((java.lang.Object) board17);
        boolean boolean20 = cell7.equals((java.lang.Object) boolean19);
        int int21 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        boolean boolean25 = cell22.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        boolean boolean29 = board27.isFull();
        boolean boolean30 = board27.moveDown();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        boolean boolean34 = board27.equals((java.lang.Object) board32);
        boolean boolean35 = cell22.equals((java.lang.Object) boolean34);
        int int36 = cell22.getValue();
        boolean boolean37 = cell7.canMergeWith(cell22);
        int int38 = cell7.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(0, (int) ' ', cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board1.getCell((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) (-1.0f));
        boolean boolean4 = cell0.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean8 = board6.move(direction7);
        int int9 = board6.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        long long4 = board0.getScore();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int8 = board7.getSize();
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean10 = board7.move(direction9);
        boolean boolean11 = board7.moveDown();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long15 = board14.getScore();
        java.lang.String str16 = board14.toString();
        ar.edu.unrc.game2048.Board.Direction direction17 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean18 = board14.move(direction17);
        boolean boolean19 = board7.move(direction17);
        boolean boolean20 = board0.equals((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction17.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 100");
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
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean8 = board6.move(direction7);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board6.getCell(536870912, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (536870912, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.isLosingBoard();
        java.lang.String str8 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board0.getCell((int) (byte) 10, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 536870912) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Cannot copy a null board");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Cannot copy a null board");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        boolean boolean9 = board1.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.hasEmptyCells();
        boolean boolean8 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString(", ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: , ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        int int4 = board1.getSize();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        int int9 = board8.getSize();
        int int10 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board8.getEmptyPositions();
        java.lang.String str12 = board8.toString();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board.Direction direction14 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean15 = board13.move(direction14);
        boolean boolean16 = board1.move(direction14);
        boolean boolean17 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction14.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        java.lang.String str7 = cell5.toString();
        java.lang.String str8 = cell5.toString();
        int int9 = cell5.getValue();
        boolean boolean10 = cell4.canMergeWith(cell5);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (short) -1, (int) (byte) 1, cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -2147483648");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        int int3 = position2.row;
        int int4 = position2.row;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 1073741824)" + "'", str5, "(100, 1073741824)");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        boolean boolean11 = board6.moveUp();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        java.lang.String str4 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        int int6 = board0.getSize();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell9.equals((java.lang.Object) (-1.0f));
        java.lang.String str12 = cell9.toString();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(536870912, 536870912, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (536870912, 536870912) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean8 = board7.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("(100, 2)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: (100, 2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(536870912, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 536870912");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        int int7 = board1.getSize();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
        boolean boolean21 = cell18.equals((java.lang.Object) "\n");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell22 = cell2.mergeWith(cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) (byte) 100);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        java.lang.String str3 = board0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board0.getCell((int) (byte) -1, 1073741824);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1073741824) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) (-1.0f));
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int4 = cell3.getValue();
        boolean boolean6 = cell3.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = board8.isFull();
        boolean boolean11 = board8.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        boolean boolean15 = board8.equals((java.lang.Object) board13);
        boolean boolean16 = cell3.equals((java.lang.Object) boolean15);
        int int17 = cell3.getValue();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        boolean boolean21 = cell18.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        boolean boolean25 = board23.isFull();
        boolean boolean26 = board23.moveDown();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board27);
        boolean boolean29 = board28.isFull();
        boolean boolean30 = board23.equals((java.lang.Object) board28);
        boolean boolean31 = cell18.equals((java.lang.Object) boolean30);
        int int32 = cell18.getValue();
        boolean boolean33 = cell3.canMergeWith(cell18);
        boolean boolean34 = cell0.canMergeWith(cell3);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveUp();
        int int7 = board1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        long long7 = board1.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int2 = cell1.getValue();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell1.canMergeWith(cell4);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int12 = cell11.getValue();
        int int13 = cell11.getValue();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int15 = cell14.getValue();
        java.lang.String str16 = cell14.toString();
        boolean boolean17 = cell11.canMergeWith(cell14);
        boolean boolean18 = cell8.canMergeWith(cell14);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell19 = cell1.mergeWith(cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 1073741824 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741824 + "'", int2 == 1073741824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1073741824 + "'", int3 == 1073741824);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1073741824 + "'", int12 == 1073741824);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1073741824 + "'", int13 == 1073741824);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int5 = position2.row;
        boolean boolean7 = position2.equals((java.lang.Object) "Cell value cannot be negative: ");
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        java.lang.String str11 = board8.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board8.getEmptyPositions();
        boolean boolean13 = board8.moveRight();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        int int16 = board14.getSize();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board14);
        java.lang.String str18 = board17.toString();
        boolean boolean19 = board17.moveLeft();
        boolean boolean20 = board8.equals((java.lang.Object) board17);
        boolean boolean21 = position2.equals((java.lang.Object) board17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str11, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        int int7 = board1.getSize();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        boolean boolean11 = cell8.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        boolean boolean15 = board13.isFull();
        boolean boolean16 = board13.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board18.isFull();
        boolean boolean20 = board13.equals((java.lang.Object) board18);
        boolean boolean21 = cell8.equals((java.lang.Object) boolean20);
        int int22 = cell8.getValue();
        boolean boolean23 = cell8.isEmpty();
        java.lang.String str24 = cell8.toString();
        boolean boolean25 = board1.equals((java.lang.Object) str24);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        boolean boolean4 = board1.moveDown();
        java.lang.String str5 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        boolean boolean4 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.moveDown();
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean10 = board6.move(direction9);
        boolean boolean11 = board1.move(direction9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        java.lang.String str3 = cell1.toString();
        java.lang.String str4 = cell1.toString();
        int int5 = cell1.getValue();
        boolean boolean6 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        boolean boolean10 = cell7.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        boolean boolean14 = board12.isFull();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        boolean boolean19 = board12.equals((java.lang.Object) board17);
        boolean boolean20 = cell7.equals((java.lang.Object) boolean19);
        int int21 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        boolean boolean25 = cell22.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        boolean boolean29 = board27.isFull();
        boolean boolean30 = board27.moveDown();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        boolean boolean34 = board27.equals((java.lang.Object) board32);
        boolean boolean35 = cell22.equals((java.lang.Object) boolean34);
        int int36 = cell22.getValue();
        boolean boolean37 = cell7.canMergeWith(cell22);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board38);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet40 = board39.getEmptyPositions();
        boolean boolean41 = board39.moveDown();
        boolean boolean42 = cell7.equals((java.lang.Object) board39);
        boolean boolean43 = cell1.equals((java.lang.Object) board39);
        boolean boolean44 = board39.isWinningBoard();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(positionSet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board3.toString();
        boolean boolean5 = board3.moveLeft();
        boolean boolean6 = board3.isFull();
        java.lang.String str7 = board3.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1L);
        boolean boolean8 = position2.equals((java.lang.Object) 10);
        boolean boolean10 = position2.equals((java.lang.Object) 2147483647);
        java.lang.String str11 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(100, 1073741824)" + "'", str11, "(100, 1073741824)");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        java.lang.String str13 = cell12.toString();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (short) 10, 10, cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = cell0.canMergeWith(cell4);
        boolean boolean8 = cell0.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long3 = board2.getScore();
        java.lang.String str4 = board2.toString();
        java.lang.String str5 = board2.toString();
        int int6 = board2.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        int int4 = cell0.getValue();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.moveRight();
        boolean boolean9 = cell0.equals((java.lang.Object) boolean8);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        int int3 = position2.row;
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean5 = position2.equals((java.lang.Object) cell4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.moveUp();
        boolean boolean9 = board6.isFull();
        boolean boolean10 = board6.moveRight();
        boolean boolean11 = cell4.equals((java.lang.Object) boolean10);
        java.lang.String str12 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int15 = cell14.getValue();
        int int16 = cell14.getValue();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int18 = cell17.getValue();
        java.lang.String str19 = cell17.toString();
        boolean boolean20 = cell14.canMergeWith(cell17);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell21 = cell4.mergeWith(cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1073741824 + "'", int15 == 1073741824);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1073741824 + "'", int16 == 1073741824);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        boolean boolean9 = board6.isLosingBoard();
        long long10 = board6.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        boolean boolean4 = cell0.isEmpty();
        boolean boolean5 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean8 = cell6.equals((java.lang.Object) (-1.0f));
        int int9 = cell6.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = cell0.mergeWith(cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
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
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        java.lang.String str9 = board6.toString();
        long long10 = board6.getScore();
        long long11 = board6.getScore();
        boolean boolean12 = board6.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: ?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, 10);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        boolean boolean6 = board4.moveDown();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean8 = board4.move(direction7);
        boolean boolean9 = position2.equals((java.lang.Object) boolean8);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        java.lang.String str2 = board1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str2, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        long long3 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        java.lang.String str3 = cell1.toString();
        java.lang.String str4 = cell1.toString();
        int int5 = cell1.getValue();
        boolean boolean6 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        boolean boolean10 = cell7.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        boolean boolean14 = board12.isFull();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        boolean boolean19 = board12.equals((java.lang.Object) board17);
        boolean boolean20 = cell7.equals((java.lang.Object) boolean19);
        int int21 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        boolean boolean25 = cell22.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        boolean boolean29 = board27.isFull();
        boolean boolean30 = board27.moveDown();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        boolean boolean34 = board27.equals((java.lang.Object) board32);
        boolean boolean35 = cell22.equals((java.lang.Object) boolean34);
        int int36 = cell22.getValue();
        boolean boolean37 = cell7.canMergeWith(cell22);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board38);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet40 = board39.getEmptyPositions();
        boolean boolean41 = board39.moveDown();
        boolean boolean42 = cell7.equals((java.lang.Object) board39);
        boolean boolean43 = cell1.equals((java.lang.Object) board39);
        boolean boolean44 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int46 = cell45.getValue();
        boolean boolean48 = cell45.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board(board49);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet51 = board50.getEmptyPositions();
        boolean boolean52 = board50.isFull();
        boolean boolean53 = board50.moveDown();
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(board54);
        boolean boolean56 = board55.isFull();
        boolean boolean57 = board50.equals((java.lang.Object) board55);
        boolean boolean58 = cell45.equals((java.lang.Object) boolean57);
        int int59 = cell45.getValue();
        ar.edu.unrc.game2048.Cell cell60 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int61 = cell60.getValue();
        boolean boolean63 = cell60.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board65 = new ar.edu.unrc.game2048.Board(board64);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet66 = board65.getEmptyPositions();
        boolean boolean67 = board65.isFull();
        boolean boolean68 = board65.moveDown();
        ar.edu.unrc.game2048.Board board69 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board70 = new ar.edu.unrc.game2048.Board(board69);
        boolean boolean71 = board70.isFull();
        boolean boolean72 = board65.equals((java.lang.Object) board70);
        boolean boolean73 = cell60.equals((java.lang.Object) boolean72);
        int int74 = cell60.getValue();
        boolean boolean75 = cell45.canMergeWith(cell60);
        ar.edu.unrc.game2048.Board board76 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board77 = new ar.edu.unrc.game2048.Board(board76);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet78 = board77.getEmptyPositions();
        boolean boolean79 = board77.moveDown();
        boolean boolean80 = cell45.equals((java.lang.Object) board77);
        java.lang.String str81 = cell45.toString();
        ar.edu.unrc.game2048.Cell cell83 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int84 = cell83.getValue();
        int int85 = cell83.getValue();
        ar.edu.unrc.game2048.Cell cell86 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int87 = cell86.getValue();
        java.lang.String str88 = cell86.toString();
        boolean boolean89 = cell83.canMergeWith(cell86);
        boolean boolean90 = cell45.canMergeWith(cell83);
        int int91 = cell83.getValue();
        boolean boolean92 = cell1.canMergeWith(cell83);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(positionSet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(positionSet51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(positionSet66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(positionSet78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "." + "'", str81, ".");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1073741824 + "'", int84 == 1073741824);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1073741824 + "'", int85 == 1073741824);
        org.junit.Assert.assertNotNull(cell86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "." + "'", str88, ".");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1073741824 + "'", int91 == 1073741824);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveUp();
        java.lang.String str5 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = cell0.canMergeWith(cell4);
        java.lang.String str8 = cell4.toString();
        java.lang.String str9 = cell4.toString();
        boolean boolean10 = cell4.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 536870912");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        boolean boolean3 = board2.moveUp();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        boolean boolean9 = cell6.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        boolean boolean13 = board11.isFull();
        boolean boolean14 = board11.moveDown();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        boolean boolean18 = board11.equals((java.lang.Object) board16);
        boolean boolean19 = cell6.equals((java.lang.Object) boolean18);
        int int20 = cell6.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(4, 2, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 2) is out of bounds for board size 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        long long5 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4L + "'", long5 == 4L);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        boolean boolean4 = board1.isFull();
        boolean boolean5 = board1.isWinningBoard();
        int int6 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board6.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        java.lang.String str10 = board9.toString();
        boolean boolean11 = board9.moveLeft();
        boolean boolean12 = board0.equals((java.lang.Object) board9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board9.getEmptyPositions();
        java.lang.Class<?> wildcardClass14 = positionSet13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        java.lang.String str3 = board0.toString();
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.isLosingBoard();
        boolean boolean8 = board1.moveDown();
        boolean boolean9 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = cell0.canMergeWith(cell4);
        java.lang.String str8 = cell4.toString();
        java.lang.String str9 = cell4.toString();
        java.lang.String str10 = cell4.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: 4?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|     |     |     |    2|?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|     |    2|     |    4|?+-----+-----+-----+-----+?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1);
        int int7 = position2.col;
        int int8 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.moveUp();
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        boolean boolean14 = position2.equals((java.lang.Object) ar.edu.unrc.game2048.Board.class);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1073741824 + "'", int7 == 1073741824);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 2048);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
        boolean boolean34 = cell18.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        int int3 = position2.row;
        int int4 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell(2048, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean9 = position7.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int10 = position7.row;
        boolean boolean12 = position7.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean13 = position2.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        int int16 = board14.getSize();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board14);
        long long18 = board14.getScore();
        boolean boolean19 = position2.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        int int22 = board21.getSize();
        int int23 = board21.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board21.getEmptyPositions();
        java.lang.String str25 = board21.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board21);
        ar.edu.unrc.game2048.Board.Direction direction27 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean28 = board26.move(direction27);
        boolean boolean29 = board14.move(direction27);
        java.lang.String str30 = board14.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 2)" + "'", str3, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str25, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction27 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction27.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str30, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveLeft();
        boolean boolean6 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveDown();
        int int3 = board0.getSize();
        boolean boolean4 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        boolean boolean14 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long18 = board17.getScore();
        java.lang.String str19 = board17.toString();
        ar.edu.unrc.game2048.Board.Direction direction20 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean21 = board17.move(direction20);
        boolean boolean22 = board1.move(direction20);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str19, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction20 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction20.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        long long5 = board4.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board4.getCell(536870912, 131072);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (536870912, 131072) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        boolean boolean2 = board1.moveUp();
        long long3 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.isFull();
        long long4 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        boolean boolean15 = cell0.isEmpty();
        boolean boolean16 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int18 = cell17.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell19 = cell0.mergeWith(cell17);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        boolean boolean4 = cell1.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveDown();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.isFull();
        boolean boolean13 = board6.equals((java.lang.Object) board11);
        boolean boolean14 = cell1.equals((java.lang.Object) boolean13);
        int int15 = cell1.getValue();
        boolean boolean16 = cell1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = cell0.mergeWith(cell1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        boolean boolean3 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(16, (-2147483648));
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean7 = position5.equals((java.lang.Object) " values, got ");
        boolean boolean9 = position5.equals((java.lang.Object) 1);
        int int10 = position5.col;
        int int11 = position5.row;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.moveUp();
        boolean boolean15 = position5.equals((java.lang.Object) boolean14);
        int int16 = position5.col;
        boolean boolean17 = position2.equals((java.lang.Object) int16);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1073741824 + "'", int10 == 1073741824);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1073741824 + "'", int16 == 1073741824);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, 10);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(2048, 10)" + "'", str3, "(2048, 10)");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("[");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: [");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1);
        int int7 = position2.col;
        int int8 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.moveUp();
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        int int13 = position2.col;
        int int14 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1073741824 + "'", int7 == 1073741824);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1073741824 + "'", int13 == 1073741824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1073741824 + "'", int14 == 1073741824);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        long long4 = board3.getScore();
        boolean boolean5 = board3.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board6.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board6.getEmptyPositions();
        java.lang.Class<?> wildcardClass9 = positionSet8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long3 = board2.getScore();
        java.lang.String str4 = board2.toString();
        java.lang.String str5 = board2.toString();
        boolean boolean6 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        java.lang.String str9 = board1.toString();
        boolean boolean10 = board1.moveLeft();
        boolean boolean11 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        int int10 = cell6.getValue();
        boolean boolean11 = cell5.canMergeWith(cell6);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        boolean boolean15 = cell12.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        boolean boolean19 = board17.isFull();
        boolean boolean20 = board17.moveDown();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        boolean boolean24 = board17.equals((java.lang.Object) board22);
        boolean boolean25 = cell12.equals((java.lang.Object) boolean24);
        int int26 = cell12.getValue();
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
        int int41 = cell27.getValue();
        boolean boolean42 = cell12.canMergeWith(cell27);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(board43);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet45 = board44.getEmptyPositions();
        boolean boolean46 = board44.moveDown();
        boolean boolean47 = cell12.equals((java.lang.Object) board44);
        boolean boolean48 = cell6.equals((java.lang.Object) board44);
        boolean boolean49 = cell6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(0, (-2147483648), cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -2147483648) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(positionSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("(100, 1073741824)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: (100, 1073741824)");
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
        boolean boolean14 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean16 = board15.hasEmptyCells();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        long long9 = board1.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int3 = board2.getSize();
        boolean boolean4 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board3.toString();
        boolean boolean5 = board3.moveUp();
        boolean boolean6 = board3.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        long long4 = board2.getScore();
        boolean boolean5 = board2.isWinningBoard();
        boolean boolean6 = cell0.equals((java.lang.Object) board2);
        boolean boolean7 = board2.moveUp();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((-1), 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.isFull();
        boolean boolean5 = board3.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveDown();
        int int3 = board0.getSize();
        boolean boolean4 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveLeft();
        int int5 = board1.getSize();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        java.lang.String str11 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean14 = cell12.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = cell8.canMergeWith(cell12);
        java.lang.String str16 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int19 = cell18.getValue();
        int int20 = cell18.getValue();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        boolean boolean24 = cell18.canMergeWith(cell21);
        boolean boolean25 = cell8.canMergeWith(cell18);
        int int26 = cell8.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(16, 2, cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (16, 2) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1073741824 + "'", int19 == 1073741824);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1073741824 + "'", int20 == 1073741824);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        int int2 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        long long4 = board3.getScore();
        boolean boolean5 = board3.moveUp();
        java.lang.String str6 = board3.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 4\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
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
        boolean boolean33 = board32.moveUp();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board32);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board32);
        ar.edu.unrc.game2048.Cell cell38 = board32.getCell(3, 0);
        boolean boolean39 = cell38.isEmpty();
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean41 = cell40.isEmpty();
        ar.edu.unrc.game2048.Cell cell42 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int43 = cell42.getValue();
        boolean boolean45 = cell42.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(board46);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet48 = board47.getEmptyPositions();
        boolean boolean49 = board47.isFull();
        boolean boolean50 = board47.moveDown();
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board51);
        boolean boolean53 = board52.isFull();
        boolean boolean54 = board47.equals((java.lang.Object) board52);
        boolean boolean55 = cell42.equals((java.lang.Object) boolean54);
        int int56 = cell42.getValue();
        boolean boolean57 = cell40.canMergeWith(cell42);
        boolean boolean58 = cell38.canMergeWith(cell40);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell59 = cell15.mergeWith(cell38);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(positionSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean9 = position7.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int10 = position7.row;
        boolean boolean12 = position7.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean13 = position2.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        int int16 = board14.getSize();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board14);
        long long18 = board14.getScore();
        boolean boolean19 = position2.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet22 = board21.getEmptyPositions();
        boolean boolean23 = board14.equals((java.lang.Object) board21);
        int int24 = board21.getSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 2)" + "'", str3, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(positionSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
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
        boolean boolean10 = board6.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board6.getCell((-1), 1073741824);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1073741824) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1L);
        boolean boolean8 = position2.equals((java.lang.Object) 100L);
        java.lang.String str9 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, 1073741824)" + "'", str9, "(100, 1073741824)");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        boolean boolean3 = board2.moveUp();
        boolean boolean4 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int5 = position2.row;
        java.lang.String str6 = position2.toString();
        int int7 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 1073741824)" + "'", str6, "(100, 1073741824)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        int int21 = position20.row;
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean23 = position20.equals((java.lang.Object) cell22);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board24.moveUp();
        boolean boolean27 = board24.isFull();
        boolean boolean28 = board24.moveRight();
        boolean boolean29 = cell22.equals((java.lang.Object) boolean28);
        java.lang.String str30 = cell22.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell31 = cell0.mergeWith(cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: 4?+-----+-----+-----+-----+?|    4|     |     |     |?+-----+-----+-----+-----+?|     |     |     |    2|?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|     |     |     |    4|?+-----+-----+-----+-----+?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = cell0.canMergeWith(cell4);
        java.lang.String str8 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        java.lang.String str11 = cell9.toString();
        java.lang.String str12 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = cell9.canMergeWith(cell13);
        boolean boolean17 = cell13.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell18 = cell4.mergeWith(cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        int int4 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        boolean boolean8 = cell5.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        boolean boolean12 = board10.isFull();
        boolean boolean13 = board10.moveDown();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board15.isFull();
        boolean boolean17 = board10.equals((java.lang.Object) board15);
        boolean boolean18 = cell5.equals((java.lang.Object) boolean17);
        boolean boolean19 = cell0.canMergeWith(cell5);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        int int22 = board21.getSize();
        int int23 = board21.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board21.getEmptyPositions();
        java.lang.String str25 = board21.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean27 = cell5.equals((java.lang.Object) board26);
        int int28 = board26.getSize();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str25, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = cell0.canMergeWith(cell4);
        java.lang.String str8 = cell4.toString();
        java.lang.String str9 = cell4.toString();
        int int10 = cell4.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        long long5 = board4.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        boolean boolean9 = board7.isFull();
        boolean boolean10 = board7.moveDown();
        boolean boolean11 = board4.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveUp();
        java.lang.String str6 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 4\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        boolean boolean2 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        java.lang.String str3 = cell1.toString();
        java.lang.String str4 = cell1.toString();
        int int5 = cell1.getValue();
        boolean boolean6 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        boolean boolean10 = cell7.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        boolean boolean14 = board12.isFull();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        boolean boolean19 = board12.equals((java.lang.Object) board17);
        boolean boolean20 = cell7.equals((java.lang.Object) boolean19);
        int int21 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        boolean boolean25 = cell22.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        boolean boolean29 = board27.isFull();
        boolean boolean30 = board27.moveDown();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        boolean boolean34 = board27.equals((java.lang.Object) board32);
        boolean boolean35 = cell22.equals((java.lang.Object) boolean34);
        int int36 = cell22.getValue();
        boolean boolean37 = cell7.canMergeWith(cell22);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board38);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet40 = board39.getEmptyPositions();
        boolean boolean41 = board39.moveDown();
        boolean boolean42 = cell7.equals((java.lang.Object) board39);
        boolean boolean43 = cell1.equals((java.lang.Object) board39);
        java.lang.String str44 = cell1.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(positionSet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2048, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        long long6 = board1.getScore();
        boolean boolean7 = board1.isFull();
        int int8 = board1.getSize();
        java.lang.Class<?> wildcardClass9 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be 0 or at least 2: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long11 = board10.getScore();
        java.lang.String str12 = board10.toString();
        java.lang.String str13 = board10.toString();
        boolean boolean14 = cell0.equals((java.lang.Object) board10);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        boolean boolean18 = board16.isFull();
        boolean boolean19 = board16.moveDown();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        boolean boolean23 = board16.equals((java.lang.Object) board21);
        java.lang.String str24 = board21.toString();
        boolean boolean25 = board21.isLosingBoard();
        boolean boolean26 = board21.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int31 = cell30.getValue();
        java.lang.String str32 = cell30.toString();
        java.lang.String str33 = cell30.toString();
        int int34 = cell30.getValue();
        boolean boolean35 = cell29.canMergeWith(cell30);
        board21.setCell((int) (short) 1, (int) (byte) 0, cell30);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell37 = cell0.mergeWith(cell30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str24, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        boolean boolean4 = board1.isFull();
        boolean boolean5 = board1.isWinningBoard();
        java.lang.Class<?> wildcardClass6 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        java.lang.String str6 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = board6.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        int int19 = cell15.getValue();
        boolean boolean20 = cell14.canMergeWith(cell15);
        board6.setCell((int) (short) 1, (int) (byte) 0, cell15);
        java.lang.String str22 = cell15.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
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
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        java.lang.String str9 = board6.toString();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = board6.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        int int19 = cell15.getValue();
        boolean boolean20 = cell14.canMergeWith(cell15);
        board6.setCell((int) (short) 1, (int) (byte) 0, cell15);
        java.lang.Class<?> wildcardClass22 = cell15.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(4, (long) 2147483647);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board.Direction direction5 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean6 = board0.move(direction5);
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str9 = board8.toString();
        java.lang.Class<?> wildcardClass10 = board8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction5 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction5.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) '#', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 35");
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
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        boolean boolean10 = cell7.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        boolean boolean14 = board12.isFull();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        boolean boolean19 = board12.equals((java.lang.Object) board17);
        boolean boolean20 = cell7.equals((java.lang.Object) boolean19);
        int int21 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        boolean boolean25 = cell22.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        boolean boolean29 = board27.isFull();
        boolean boolean30 = board27.moveDown();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        boolean boolean34 = board27.equals((java.lang.Object) board32);
        boolean boolean35 = cell22.equals((java.lang.Object) boolean34);
        int int36 = cell22.getValue();
        boolean boolean37 = cell7.canMergeWith(cell22);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 1, (int) (byte) 100, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
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
        boolean boolean15 = cell0.isEmpty();
        java.lang.String str16 = cell0.toString();
        boolean boolean17 = cell0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.isFull();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = board8.isFull();
        boolean boolean11 = board8.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board13.isFull();
        boolean boolean15 = board8.equals((java.lang.Object) board13);
        java.lang.String str16 = board13.toString();
        boolean boolean17 = board13.isLosingBoard();
        boolean boolean18 = board13.isLosingBoard();
        boolean boolean19 = board6.equals((java.lang.Object) board13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        boolean boolean4 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        boolean boolean9 = board7.isFull();
        boolean boolean10 = board7.moveDown();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isFull();
        boolean boolean14 = board7.equals((java.lang.Object) board12);
        java.lang.String str15 = board12.toString();
        boolean boolean16 = board12.isLosingBoard();
        boolean boolean17 = board12.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        java.lang.String str24 = cell21.toString();
        int int25 = cell21.getValue();
        boolean boolean26 = cell20.canMergeWith(cell21);
        board12.setCell((int) (short) 1, (int) (byte) 0, cell21);
        int int28 = cell21.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) 'a', 3, cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 3) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        boolean boolean9 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long3 = board2.getScore();
        java.lang.String str4 = board2.toString();
        boolean boolean5 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board6.moveDown();
        boolean boolean8 = board6.isWinningBoard();
        boolean boolean9 = board6.isLosingBoard();
        int int10 = board6.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Not a valid tile: '");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Not a valid tile: '");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        boolean boolean11 = board1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        boolean boolean2 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board3.toString();
        boolean boolean5 = board3.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        int int7 = board3.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Not a valid tile: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Not a valid tile: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) (-1.0f));
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        java.lang.String str7 = cell4.toString();
        boolean boolean8 = cell4.isEmpty();
        boolean boolean9 = cell0.canMergeWith(cell4);
        int int10 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1);
        int int7 = position2.col;
        int int8 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.moveUp();
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        int int13 = position2.col;
        boolean boolean15 = position2.equals((java.lang.Object) "Score: 4\n+-----+-----+-----+-----+\n|     |    2|     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1073741824 + "'", int7 == 1073741824);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1073741824 + "'", int13 == 1073741824);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(536870912);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        boolean boolean2 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board.Direction direction5 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean6 = board0.move(direction5);
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean10 = board8.move(direction9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction5 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction5.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveDown();
        boolean boolean3 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        java.lang.String str3 = board0.toString();
        java.lang.Class<?> wildcardClass4 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1L);
        boolean boolean8 = position2.equals((java.lang.Object) 10);
        boolean boolean10 = position2.equals((java.lang.Object) 2147483647);
        int int11 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1073741824 + "'", int11 == 1073741824);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean9 = position7.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int10 = position7.row;
        boolean boolean12 = position7.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean13 = position2.equals((java.lang.Object) boolean12);
        boolean boolean15 = position2.equals((java.lang.Object) "Cell cannot be null");
        int int16 = position2.col;
        java.lang.String str17 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 2)" + "'", str3, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100, 2)" + "'", str17, "(100, 2)");
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
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean13 = position11.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int14 = position11.row;
        boolean boolean16 = position11.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean17 = board6.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean18 = board6.moveRight();
        boolean boolean19 = board6.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board6.getEmptyPositions();
        boolean boolean21 = board6.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.isFull();
        boolean boolean5 = board3.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
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
        java.lang.Class<?> wildcardClass11 = cell6.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1073741824 + "'", int4 == 1073741824);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1073741824 + "'", int5 == 1073741824);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean5 = board2.move(direction4);
        boolean boolean6 = board2.moveDown();
        boolean boolean7 = board2.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board2.getCell(536870912, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (536870912, -1) is out of bounds for board size 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-2147483648), 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        int int3 = position2.row;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 2)" + "'", str5, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(4, (long) (-2147483648));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveLeft();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isLosingBoard();
        int int7 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveLeft();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isLosingBoard();
        boolean boolean7 = board1.moveUp();
        boolean boolean8 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
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
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = board6.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        int int19 = cell15.getValue();
        boolean boolean20 = cell14.canMergeWith(cell15);
        board6.setCell((int) (short) 1, (int) (byte) 0, cell15);
        int int22 = cell15.getValue();
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int24 = cell23.getValue();
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int27 = cell26.getValue();
        int int28 = cell26.getValue();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int30 = cell29.getValue();
        java.lang.String str31 = cell29.toString();
        boolean boolean32 = cell26.canMergeWith(cell29);
        boolean boolean33 = cell23.canMergeWith(cell29);
        boolean boolean34 = cell15.canMergeWith(cell29);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1073741824 + "'", int27 == 1073741824);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1073741824 + "'", int28 == 1073741824);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1073741824);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int4 = cell3.getValue();
        java.lang.String str5 = cell3.toString();
        java.lang.String str6 = cell3.toString();
        int int7 = cell3.getValue();
        boolean boolean8 = cell2.canMergeWith(cell3);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        boolean boolean12 = cell9.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        boolean boolean16 = board14.isFull();
        boolean boolean17 = board14.moveDown();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        boolean boolean21 = board14.equals((java.lang.Object) board19);
        boolean boolean22 = cell9.equals((java.lang.Object) boolean21);
        int int23 = cell9.getValue();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int25 = cell24.getValue();
        boolean boolean27 = cell24.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board29.getEmptyPositions();
        boolean boolean31 = board29.isFull();
        boolean boolean32 = board29.moveDown();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board33);
        boolean boolean35 = board34.isFull();
        boolean boolean36 = board29.equals((java.lang.Object) board34);
        boolean boolean37 = cell24.equals((java.lang.Object) boolean36);
        int int38 = cell24.getValue();
        boolean boolean39 = cell9.canMergeWith(cell24);
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board40);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board41.getEmptyPositions();
        boolean boolean43 = board41.moveDown();
        boolean boolean44 = cell9.equals((java.lang.Object) board41);
        boolean boolean45 = cell3.equals((java.lang.Object) board41);
        boolean boolean46 = cell3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell47 = cell1.mergeWith(cell3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 1073741824 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        long long6 = board1.getScore();
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.moveUp();
        long long9 = board1.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 0)" + "'", str3, "(-1, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(-1, 0)" + "'", str5, "(-1, 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(-1, 0)" + "'", str7, "(-1, 0)");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        java.lang.String str6 = board1.toString();
        boolean boolean7 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isWinningBoard();
        long long4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        boolean boolean4 = cell0.isEmpty();
        boolean boolean5 = cell0.isEmpty();
        java.lang.String str6 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        boolean boolean10 = cell7.equals((java.lang.Object) "\n");
        boolean boolean11 = cell0.canMergeWith(cell7);
        boolean boolean12 = cell7.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean13 = position11.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int14 = position11.row;
        boolean boolean16 = position11.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean17 = board6.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean18 = board6.moveRight();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell21 = board6.getCell(1073741824, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1073741824, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveLeft();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        boolean boolean12 = cell9.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        boolean boolean16 = board14.isFull();
        boolean boolean17 = board14.moveDown();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isFull();
        boolean boolean21 = board14.equals((java.lang.Object) board19);
        boolean boolean22 = cell9.equals((java.lang.Object) boolean21);
        int int23 = cell9.getValue();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int25 = cell24.getValue();
        boolean boolean27 = cell24.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board29.getEmptyPositions();
        boolean boolean31 = board29.isFull();
        boolean boolean32 = board29.moveDown();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board33);
        boolean boolean35 = board34.isFull();
        boolean boolean36 = board29.equals((java.lang.Object) board34);
        boolean boolean37 = cell24.equals((java.lang.Object) boolean36);
        int int38 = cell24.getValue();
        boolean boolean39 = cell9.canMergeWith(cell24);
        int int40 = cell24.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) 10, (int) (short) 1, cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(10, (long) 0);
        boolean boolean3 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: 0?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|     |     |     |    2|?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|     |    2|     |     |?+-----+-----+-----+-----+?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isWinningBoard();
        long long4 = board0.getScore();
        boolean boolean5 = board0.moveDown();
        boolean boolean6 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        int int7 = board1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        long long4 = board0.getScore();
        java.lang.Object obj5 = null;
        boolean boolean6 = board0.equals(obj5);
        boolean boolean7 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean9 = board0.move(direction8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
        ar.edu.unrc.game2048.Board.Position position36 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        int int37 = position36.row;
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean39 = position36.equals((java.lang.Object) cell38);
        boolean boolean40 = cell2.equals((java.lang.Object) boolean39);
        java.lang.String str41 = cell2.toString();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board3.toString();
        boolean boolean5 = board3.moveRight();
        java.lang.String str6 = board3.toString();
        boolean boolean7 = board3.moveUp();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.moveRight();
        java.lang.String str5 = board3.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (-1));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
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
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board1.getEmptyPositions();
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
        org.junit.Assert.assertNotNull(positionSet15);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1L);
        boolean boolean8 = position2.equals((java.lang.Object) 10);
        java.lang.String str9 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, 1073741824)" + "'", str9, "(100, 1073741824)");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.moveUp();
        boolean boolean6 = board1.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
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
        boolean boolean34 = board32.isFull();
        boolean boolean35 = board32.moveDown();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        boolean boolean39 = board32.equals((java.lang.Object) board37);
        boolean boolean40 = cell0.equals((java.lang.Object) boolean39);
        ar.edu.unrc.game2048.Board.Position position43 = new ar.edu.unrc.game2048.Board.Position(0, 2147483647);
        boolean boolean44 = cell0.equals((java.lang.Object) 2147483647);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board8.isFull();
        boolean boolean10 = position2.equals((java.lang.Object) board8);
        int int11 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1073741824 + "'", int11 == 1073741824);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isFull();
        java.lang.Class<?> wildcardClass7 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.isWinningBoard();
        boolean boolean7 = board1.moveUp();
        boolean boolean8 = board1.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.isLosingBoard();
        boolean boolean5 = board0.moveDown();
        java.lang.Class<?> wildcardClass6 = board0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isFull();
        java.lang.String str4 = board0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int8 = cell7.getValue();
        int int9 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        java.lang.String str12 = cell10.toString();
        boolean boolean13 = cell7.canMergeWith(cell10);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((-1), 2048, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1073741824 + "'", int8 == 1073741824);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1073741824 + "'", int9 == 1073741824);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = cell0.canMergeWith(cell4);
        java.lang.String str8 = cell0.toString();
        int int9 = cell0.getValue();
        java.lang.String str10 = cell0.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (-1));
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, -1)" + "'", str3, "(0, -1)");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveDown();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean5 = board1.move(direction4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        boolean boolean7 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean9 = position7.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int10 = position7.row;
        boolean boolean12 = position7.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean13 = position2.equals((java.lang.Object) boolean12);
        boolean boolean15 = position2.equals((java.lang.Object) "Cell cannot be null");
        int int16 = position2.col;
        int int17 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 2)" + "'", str3, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board.Direction direction5 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean6 = board0.move(direction5);
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        java.lang.String str14 = cell13.toString();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(2, 100, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction5 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction5.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        java.lang.String str4 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        int int6 = board0.getSize();
        boolean boolean7 = board0.isWinningBoard();
        long long8 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(positionSet9);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, (int) (short) -1);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, -1)" + "'", str4, "(4, -1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.moveRight();
        boolean boolean5 = board3.moveLeft();
        boolean boolean6 = board3.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveUp();
        long long6 = board0.getScore();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.moveUp();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Cell cell16 = board10.getCell(3, 0);
        boolean boolean17 = cell16.isEmpty();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        boolean boolean23 = cell20.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board25.getEmptyPositions();
        boolean boolean27 = board25.isFull();
        boolean boolean28 = board25.moveDown();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean31 = board30.isFull();
        boolean boolean32 = board25.equals((java.lang.Object) board30);
        boolean boolean33 = cell20.equals((java.lang.Object) boolean32);
        int int34 = cell20.getValue();
        boolean boolean35 = cell18.canMergeWith(cell20);
        boolean boolean36 = cell16.canMergeWith(cell18);
        boolean boolean37 = cell18.isEmpty();
        board0.setCell((int) (byte) 0, 0, cell18);
        boolean boolean39 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        long long6 = board1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        int int3 = position2.row;
        int int4 = position2.row;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        long long4 = board0.getScore();
        java.lang.Object obj5 = null;
        boolean boolean6 = board0.equals(obj5);
        boolean boolean7 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell7 = board1.getCell(3, 0);
        boolean boolean8 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell9.isEmpty();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        boolean boolean14 = cell11.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        boolean boolean18 = board16.isFull();
        boolean boolean19 = board16.moveDown();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        boolean boolean23 = board16.equals((java.lang.Object) board21);
        boolean boolean24 = cell11.equals((java.lang.Object) boolean23);
        int int25 = cell11.getValue();
        boolean boolean26 = cell9.canMergeWith(cell11);
        boolean boolean27 = cell7.canMergeWith(cell9);
        java.lang.String str28 = cell9.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 131072);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveLeft();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isLosingBoard();
        java.lang.String str7 = board1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean5 = board0.move(direction4);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell(100, 131072);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 131072) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1);
        int int7 = position2.col;
        int int8 = position2.row;
        int int9 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1073741824 + "'", int7 == 1073741824);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(1, 536870912);
        boolean boolean7 = position2.equals((java.lang.Object) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 2)" + "'", str3, "(100, 2)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int11 = board10.getSize();
        ar.edu.unrc.game2048.Board.Direction direction12 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean13 = board10.move(direction12);
        boolean boolean14 = board10.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long18 = board17.getScore();
        java.lang.String str19 = board17.toString();
        ar.edu.unrc.game2048.Board.Direction direction20 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean21 = board17.move(direction20);
        boolean boolean22 = board10.move(direction20);
        boolean boolean23 = board1.move(direction20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction12.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str19, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction20 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction20.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        boolean boolean4 = cell0.isEmpty();
        boolean boolean5 = cell0.isEmpty();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board7.getSize();
        boolean boolean9 = cell0.equals((java.lang.Object) int8);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        long long14 = board12.getScore();
        boolean boolean15 = board12.isWinningBoard();
        boolean boolean16 = cell10.equals((java.lang.Object) board12);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = cell0.mergeWith(cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(131072);
        java.lang.String str2 = cell1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "131072" + "'", str2, "131072");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2048);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        long long6 = board1.getScore();
        boolean boolean7 = board1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board1.getCell(100, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -2147483648) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) "Board size must be between 1 and 16: ");
        java.lang.String str6 = position2.toString();
        int int7 = position2.col;
        java.lang.String str8 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 2)" + "'", str6, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, 2)" + "'", str8, "(100, 2)");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        java.lang.String str48 = cell46.toString();
        java.lang.String str49 = cell46.toString();
        boolean boolean50 = cell46.isEmpty();
        boolean boolean51 = cell46.isEmpty();
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board(board52);
        int int54 = board53.getSize();
        boolean boolean55 = cell46.equals((java.lang.Object) int54);
        ar.edu.unrc.game2048.Cell cell56 = null;
        boolean boolean57 = cell46.canMergeWith(cell56);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell58 = cell38.mergeWith(cell56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 1073741824 and null");
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
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "." + "'", str48, ".");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.moveRight();
        boolean boolean5 = board3.moveLeft();
        boolean boolean6 = cell1.equals((java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(1073741824);
        boolean boolean8 = board1.equals((java.lang.Object) cell7);
        java.lang.String str9 = cell7.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1073741824" + "'", str9, "1073741824");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        long long4 = board1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.isLosingBoard();
        int int4 = board1.getSize();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveDown();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.isFull();
        boolean boolean13 = board6.equals((java.lang.Object) board11);
        java.lang.String str14 = board11.toString();
        boolean boolean15 = board11.isLosingBoard();
        boolean boolean16 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Board.Direction direction17 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean18 = board11.move(direction17);
        boolean boolean19 = board1.move(direction17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction17.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board1.getCell(131072, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (131072, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        java.lang.String str3 = cell1.toString();
        java.lang.String str4 = cell1.toString();
        int int5 = cell1.getValue();
        boolean boolean6 = cell0.canMergeWith(cell1);
        int int7 = cell1.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        boolean boolean4 = cell0.isEmpty();
        boolean boolean5 = cell0.isEmpty();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board7.getSize();
        boolean boolean9 = cell0.equals((java.lang.Object) int8);
        boolean boolean10 = cell0.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.isLosingBoard();
        boolean boolean5 = board0.moveDown();
        boolean boolean6 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-2147483648), (int) (byte) 1);
        int int3 = position2.col;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        int int7 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board7.setCell(1073741824, 0, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1073741824, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        java.lang.String str3 = board0.toString();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        boolean boolean5 = board4.isWinningBoard();
        boolean boolean7 = board4.equals((java.lang.Object) 1);
        boolean boolean8 = board4.isLosingBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        int int11 = board9.getSize();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        long long13 = board9.getScore();
        java.lang.Object obj14 = null;
        boolean boolean15 = board9.equals(obj14);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int19 = board18.getSize();
        ar.edu.unrc.game2048.Board.Direction direction20 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean21 = board18.move(direction20);
        boolean boolean22 = board18.moveDown();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long26 = board25.getScore();
        java.lang.String str27 = board25.toString();
        ar.edu.unrc.game2048.Board.Direction direction28 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean29 = board25.move(direction28);
        boolean boolean30 = board18.move(direction28);
        boolean boolean31 = board9.move(direction28);
        boolean boolean32 = board4.move(direction28);
        boolean boolean33 = board0.move(direction28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + direction20 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction20.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str27, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction28.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long3 = board2.getScore();
        java.lang.String str4 = board2.toString();
        ar.edu.unrc.game2048.Board.Direction direction5 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean6 = board2.move(direction5);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        int int12 = position11.row;
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean14 = position11.equals((java.lang.Object) cell13);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(2147483647, (-1), cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2147483647, -1) is out of bounds for board size 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction5 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction5.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, 10);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int4 = cell3.getValue();
        java.lang.String str5 = cell3.toString();
        java.lang.String str6 = cell3.toString();
        boolean boolean7 = cell3.isEmpty();
        boolean boolean8 = cell3.isEmpty();
        java.lang.String str9 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        boolean boolean13 = cell10.equals((java.lang.Object) "\n");
        boolean boolean14 = cell3.canMergeWith(cell10);
        java.lang.String str15 = cell10.toString();
        boolean boolean16 = position2.equals((java.lang.Object) str15);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        boolean boolean4 = cell0.isEmpty();
        boolean boolean5 = cell0.isEmpty();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board7.getSize();
        boolean boolean9 = cell0.equals((java.lang.Object) int8);
        ar.edu.unrc.game2048.Cell cell10 = null;
        boolean boolean11 = cell0.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        java.lang.String str14 = cell12.toString();
        java.lang.String str15 = cell12.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = cell0.mergeWith(cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        java.lang.String str4 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        boolean boolean6 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(536870912, (int) (byte) 10);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isWinningBoard();
        long long4 = board0.getScore();
        boolean boolean5 = board0.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.isFull();
        boolean boolean9 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
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
        java.lang.Class<?> wildcardClass10 = board1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean9 = position7.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int10 = position7.row;
        boolean boolean12 = position7.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean13 = position2.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        int int16 = board14.getSize();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board14);
        long long18 = board14.getScore();
        boolean boolean19 = position2.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        int int22 = board21.getSize();
        int int23 = board21.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board21.getEmptyPositions();
        java.lang.String str25 = board21.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board21);
        ar.edu.unrc.game2048.Board.Direction direction27 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean28 = board26.move(direction27);
        boolean boolean29 = board14.move(direction27);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board14.getEmptyPositions();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 2)" + "'", str3, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str25, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction27 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction27.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(positionSet30);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveUp();
        long long6 = board0.getScore();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.moveUp();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Cell cell16 = board10.getCell(3, 0);
        boolean boolean17 = cell16.isEmpty();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        boolean boolean23 = cell20.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board25.getEmptyPositions();
        boolean boolean27 = board25.isFull();
        boolean boolean28 = board25.moveDown();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean31 = board30.isFull();
        boolean boolean32 = board25.equals((java.lang.Object) board30);
        boolean boolean33 = cell20.equals((java.lang.Object) boolean32);
        int int34 = cell20.getValue();
        boolean boolean35 = cell18.canMergeWith(cell20);
        boolean boolean36 = cell16.canMergeWith(cell18);
        boolean boolean37 = cell18.isEmpty();
        board0.setCell((int) (byte) 0, 0, cell18);
        boolean boolean39 = cell18.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        boolean boolean3 = cell0.equals((java.lang.Object) "\n");
        boolean boolean4 = cell0.isEmpty();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.isFull();
        long long9 = board6.getScore();
        boolean boolean10 = cell0.equals((java.lang.Object) board6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board6.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        boolean boolean4 = cell0.isEmpty();
        boolean boolean5 = cell0.isEmpty();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board7.getSize();
        boolean boolean9 = cell0.equals((java.lang.Object) int8);
        ar.edu.unrc.game2048.Cell cell10 = null;
        boolean boolean11 = cell0.canMergeWith(cell10);
        boolean boolean12 = cell0.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int2 = cell1.getValue();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell1.canMergeWith(cell4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        java.lang.String str10 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        boolean boolean14 = cell11.equals((java.lang.Object) "\n");
        boolean boolean15 = cell11.isEmpty();
        boolean boolean16 = cell9.canMergeWith(cell11);
        boolean boolean17 = cell1.equals((java.lang.Object) cell11);
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position(1, (int) (short) 100);
        boolean boolean21 = cell1.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741824 + "'", int2 == 1073741824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1073741824 + "'", int3 == 1073741824);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.isFull();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.moveRight();
        boolean boolean5 = board3.moveLeft();
        boolean boolean6 = board3.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        int int10 = board6.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        boolean boolean25 = board20.moveRight();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, 1);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        int int6 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell7 = board1.getCell(3, 0);
        boolean boolean8 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell9.isEmpty();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        boolean boolean14 = cell11.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        boolean boolean18 = board16.isFull();
        boolean boolean19 = board16.moveDown();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        boolean boolean23 = board16.equals((java.lang.Object) board21);
        boolean boolean24 = cell11.equals((java.lang.Object) boolean23);
        int int25 = cell11.getValue();
        boolean boolean26 = cell9.canMergeWith(cell11);
        boolean boolean27 = cell7.canMergeWith(cell9);
        int int28 = cell9.getValue();
        int int29 = cell9.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (short) 100);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 100)" + "'", str3, "(1, 100)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 100)" + "'", str4, "(1, 100)");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(131072);
        board0.setCell(2, 0, cell10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board3.toString();
        boolean boolean5 = board3.moveLeft();
        boolean boolean6 = board3.isFull();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        java.lang.String str9 = cell7.toString();
        java.lang.String str10 = cell7.toString();
        java.lang.Class<?> wildcardClass11 = cell7.getClass();
        boolean boolean12 = board3.equals((java.lang.Object) cell7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board6.moveDown();
        java.lang.Class<?> wildcardClass8 = board6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("invalid board after move ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: invalid board after move ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 1);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isWinningBoard();
        long long4 = board0.getScore();
        boolean boolean5 = board0.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.isLosingBoard();
        java.lang.String str9 = board1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board6.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board6.getEmptyPositions();
        boolean boolean9 = board6.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveLeft();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1L);
        int int7 = position2.row;
        int int8 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1073741824 + "'", int8 == 1073741824);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 1073741824)" + "'", str5, "(100, 1073741824)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveUp();
        boolean boolean5 = board3.isFull();
        boolean boolean6 = board3.moveUp();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long11 = board10.getScore();
        java.lang.String str12 = board10.toString();
        java.lang.String str13 = board10.toString();
        boolean boolean14 = cell0.equals((java.lang.Object) board10);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board10.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet15);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean5 = board2.move(direction4);
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long10 = board9.getScore();
        java.lang.String str11 = board9.toString();
        ar.edu.unrc.game2048.Board.Direction direction12 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean13 = board9.move(direction12);
        boolean boolean14 = board2.move(direction12);
        boolean boolean15 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str11, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction12.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
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
        int int31 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int34 = cell33.getValue();
        java.lang.String str35 = cell33.toString();
        java.lang.String str36 = cell33.toString();
        int int37 = cell33.getValue();
        boolean boolean38 = cell32.canMergeWith(cell33);
        boolean boolean39 = cell0.canMergeWith(cell32);
        java.lang.String str40 = cell32.toString();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString(".");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) (-1.0f));
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        java.lang.String str7 = cell4.toString();
        boolean boolean8 = cell4.isEmpty();
        boolean boolean9 = cell0.canMergeWith(cell4);
        boolean boolean10 = cell4.isEmpty();
        boolean boolean12 = cell4.equals((java.lang.Object) " and ");
        java.lang.String str13 = cell4.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1);
        int int7 = position2.col;
        java.lang.String str8 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1073741824 + "'", int7 == 1073741824);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, 1073741824)" + "'", str8, "(100, 1073741824)");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = cell0.canMergeWith(cell4);
        java.lang.String str8 = cell0.toString();
        int int9 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell10.isEmpty();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        boolean boolean15 = cell12.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        boolean boolean19 = board17.isFull();
        boolean boolean20 = board17.moveDown();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        boolean boolean24 = board17.equals((java.lang.Object) board22);
        boolean boolean25 = cell12.equals((java.lang.Object) boolean24);
        int int26 = cell12.getValue();
        boolean boolean27 = cell10.canMergeWith(cell12);
        java.lang.String str28 = cell12.toString();
        boolean boolean29 = cell0.canMergeWith(cell12);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        boolean boolean4 = board1.isFull();
        boolean boolean5 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board6.moveDown();
        boolean boolean8 = board6.isWinningBoard();
        boolean boolean9 = board6.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        java.lang.String str7 = cell5.toString();
        java.lang.String str8 = cell5.toString();
        boolean boolean9 = cell5.isEmpty();
        boolean boolean10 = cell5.isEmpty();
        boolean boolean11 = board0.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board6.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        long long10 = board6.getScore();
        java.lang.Object obj11 = null;
        boolean boolean12 = board6.equals(obj11);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int16 = board15.getSize();
        ar.edu.unrc.game2048.Board.Direction direction17 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean18 = board15.move(direction17);
        boolean boolean19 = board15.moveDown();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long23 = board22.getScore();
        java.lang.String str24 = board22.toString();
        ar.edu.unrc.game2048.Board.Direction direction25 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean26 = board22.move(direction25);
        boolean boolean27 = board15.move(direction25);
        boolean boolean28 = board6.move(direction25);
        boolean boolean29 = board6.isWinningBoard();
        boolean boolean30 = board0.equals((java.lang.Object) board6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction17.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str24, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction25 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction25.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell8.isEmpty();
        boolean boolean10 = cell8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board5.setCell((int) (short) 0, 1073741824, cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 1073741824) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
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
        boolean boolean18 = cell2.isEmpty();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        boolean boolean22 = board20.isFull();
        boolean boolean23 = board20.moveDown();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board25.isFull();
        boolean boolean27 = board20.equals((java.lang.Object) board25);
        java.lang.String str28 = board25.toString();
        boolean boolean29 = board25.isLosingBoard();
        boolean boolean30 = board25.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int35 = cell34.getValue();
        java.lang.String str36 = cell34.toString();
        java.lang.String str37 = cell34.toString();
        int int38 = cell34.getValue();
        boolean boolean39 = cell33.canMergeWith(cell34);
        board25.setCell((int) (short) 1, (int) (byte) 0, cell34);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell41 = cell2.mergeWith(cell34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str28, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-2147483648), (int) (byte) 1);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-2147483648, 1)" + "'", str3, "(-2147483648, 1)");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 1);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean4 = cell3.isEmpty();
        boolean boolean6 = cell3.equals((java.lang.Object) (short) -1);
        boolean boolean7 = position2.equals((java.lang.Object) cell3);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.hasEmptyCells();
        boolean boolean8 = board1.hasEmptyCells();
        java.lang.Class<?> wildcardClass9 = board1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 2)" + "'", str3, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board1.getCell((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
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
        java.lang.String str34 = cell18.toString();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1L);
        boolean boolean8 = position2.equals((java.lang.Object) 10);
        int int9 = position2.col;
        java.lang.Class<?> wildcardClass10 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1073741824 + "'", int9 == 1073741824);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) (-2147483648));
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position(16, (-2147483648));
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.hasEmptyCells();
        boolean boolean8 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, 4);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        boolean boolean14 = board1.isLosingBoard();
        boolean boolean15 = board1.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board1.getEmptyPositions();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet16);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        boolean boolean2 = board1.isLosingBoard();
        long long3 = board1.getScore();
        boolean boolean4 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be 0 or at least 2: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board6.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        java.lang.String str10 = board9.toString();
        boolean boolean11 = board9.moveLeft();
        boolean boolean12 = board0.equals((java.lang.Object) board9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board14.moveUp();
        boolean boolean16 = board14.isLosingBoard();
        boolean boolean17 = board14.isFull();
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board9.equals((java.lang.Object) board14);
        boolean boolean20 = board14.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
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
        boolean boolean10 = board8.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int2 = cell1.getValue();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell1.canMergeWith(cell4);
        boolean boolean8 = cell1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741824 + "'", int2 == 1073741824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1073741824 + "'", int3 == 1073741824);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1L);
        boolean boolean8 = position2.equals((java.lang.Object) 10);
        int int9 = position2.col;
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.moveRight();
        boolean boolean13 = board11.moveLeft();
        boolean boolean14 = board11.moveLeft();
        int int15 = board11.getSize();
        boolean boolean16 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        boolean boolean20 = board18.moveRight();
        boolean boolean21 = board18.moveLeft();
        boolean boolean22 = board18.moveUp();
        boolean boolean23 = board11.equals((java.lang.Object) boolean22);
        boolean boolean24 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean26 = position2.equals((java.lang.Object) board25);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1073741824 + "'", int9 == 1073741824);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveDown();
        long long8 = board1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        java.lang.String str5 = board1.toString();
        int int6 = board1.getSize();
        boolean boolean7 = board1.isFull();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        boolean boolean10 = cell9.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) '4', (int) (short) 0, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) (-2147483648));
        boolean boolean3 = board2.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean8 = board6.move(direction7);
        boolean boolean9 = board6.moveDown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = cell1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        boolean boolean4 = cell0.isEmpty();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int8 = board7.getSize();
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean10 = board7.move(direction9);
        boolean boolean11 = cell0.equals((java.lang.Object) direction9);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) (-1.0f));
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        java.lang.String str7 = cell4.toString();
        boolean boolean8 = cell4.isEmpty();
        boolean boolean9 = cell0.canMergeWith(cell4);
        int int10 = cell4.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean9 = position7.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int10 = position7.row;
        boolean boolean12 = position7.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean13 = position2.equals((java.lang.Object) boolean12);
        int int14 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 2)" + "'", str3, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        long long2 = board0.getScore();
        boolean boolean3 = board0.isFull();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.isLosingBoard();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board1.getCell(1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 2147483647) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        boolean boolean4 = cell0.isEmpty();
        int int5 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = cell6.canMergeWith(cell10);
        boolean boolean14 = cell10.isEmpty();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        boolean boolean18 = board16.isFull();
        boolean boolean19 = board16.moveDown();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        boolean boolean23 = board16.equals((java.lang.Object) board21);
        java.lang.String str24 = board21.toString();
        long long25 = board21.getScore();
        long long26 = board21.getScore();
        boolean boolean27 = cell10.equals((java.lang.Object) board21);
        int int28 = cell10.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell29 = cell0.mergeWith(cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str24, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        boolean boolean2 = board0.moveDown();
        int int3 = board0.getSize();
        int int4 = board0.getSize();
        boolean boolean5 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
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
        int int47 = cell38.getValue();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1073741824 + "'", int47 == 1073741824);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board.Direction direction5 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean6 = board0.move(direction5);
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board8.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction5 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction5.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        long long3 = board1.getScore();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        boolean boolean7 = cell4.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board9.isFull();
        boolean boolean12 = board9.moveDown();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board14.isFull();
        boolean boolean16 = board9.equals((java.lang.Object) board14);
        boolean boolean17 = cell4.equals((java.lang.Object) boolean16);
        int int18 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        boolean boolean22 = cell19.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        boolean boolean26 = board24.isFull();
        boolean boolean27 = board24.moveDown();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean30 = board29.isFull();
        boolean boolean31 = board24.equals((java.lang.Object) board29);
        boolean boolean32 = cell19.equals((java.lang.Object) boolean31);
        int int33 = cell19.getValue();
        boolean boolean34 = cell4.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(board35);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet37 = board36.getEmptyPositions();
        boolean boolean38 = board36.isFull();
        boolean boolean39 = board36.moveDown();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board40);
        boolean boolean42 = board41.isFull();
        boolean boolean43 = board36.equals((java.lang.Object) board41);
        boolean boolean44 = cell4.equals((java.lang.Object) boolean43);
        boolean boolean45 = board1.equals((java.lang.Object) boolean44);
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean47 = cell46.isEmpty();
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int49 = cell48.getValue();
        boolean boolean51 = cell48.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board(board52);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet54 = board53.getEmptyPositions();
        boolean boolean55 = board53.isFull();
        boolean boolean56 = board53.moveDown();
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board58 = new ar.edu.unrc.game2048.Board(board57);
        boolean boolean59 = board58.isFull();
        boolean boolean60 = board53.equals((java.lang.Object) board58);
        boolean boolean61 = cell48.equals((java.lang.Object) boolean60);
        int int62 = cell48.getValue();
        boolean boolean63 = cell46.canMergeWith(cell48);
        ar.edu.unrc.game2048.Cell cell64 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int65 = cell64.getValue();
        java.lang.String str66 = cell64.toString();
        java.lang.String str67 = cell64.toString();
        ar.edu.unrc.game2048.Cell cell68 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean70 = cell68.equals((java.lang.Object) (-1.0f));
        boolean boolean71 = cell64.canMergeWith(cell68);
        ar.edu.unrc.game2048.Board board74 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long75 = board74.getScore();
        java.lang.String str76 = board74.toString();
        java.lang.String str77 = board74.toString();
        boolean boolean78 = cell64.equals((java.lang.Object) board74);
        boolean boolean79 = cell48.canMergeWith(cell64);
        boolean boolean80 = board1.equals((java.lang.Object) cell48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(positionSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(positionSet54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "." + "'", str66, ".");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "." + "'", str67, ".");
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str76, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str77, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1073741824 + "'", int3 == 1073741824);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        java.lang.String str3 = cell1.toString();
        java.lang.String str4 = cell1.toString();
        int int5 = cell1.getValue();
        boolean boolean6 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        boolean boolean10 = cell7.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        boolean boolean14 = board12.isFull();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board17.isFull();
        boolean boolean19 = board12.equals((java.lang.Object) board17);
        boolean boolean20 = cell7.equals((java.lang.Object) boolean19);
        int int21 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        boolean boolean25 = cell22.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        boolean boolean29 = board27.isFull();
        boolean boolean30 = board27.moveDown();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board32.isFull();
        boolean boolean34 = board27.equals((java.lang.Object) board32);
        boolean boolean35 = cell22.equals((java.lang.Object) boolean34);
        int int36 = cell22.getValue();
        boolean boolean37 = cell7.canMergeWith(cell22);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board38);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet40 = board39.getEmptyPositions();
        boolean boolean41 = board39.moveDown();
        boolean boolean42 = cell7.equals((java.lang.Object) board39);
        boolean boolean43 = cell1.equals((java.lang.Object) board39);
        boolean boolean44 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean47 = cell45.equals((java.lang.Object) (-1.0f));
        java.lang.String str48 = cell45.toString();
        boolean boolean49 = cell1.canMergeWith(cell45);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(positionSet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "." + "'", str48, ".");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.String str6 = board1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 2);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean9 = position7.equals((java.lang.Object) "A board must be written as [v1,...,v16]: ");
        int int10 = position7.row;
        boolean boolean12 = position7.equals((java.lang.Object) "Cell value cannot be negative: ");
        boolean boolean13 = position2.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        int int16 = board14.getSize();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board14);
        long long18 = board14.getScore();
        boolean boolean19 = position2.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        int int22 = board21.getSize();
        int int23 = board21.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board21.getEmptyPositions();
        java.lang.String str25 = board21.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board21);
        ar.edu.unrc.game2048.Board.Direction direction27 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean28 = board26.move(direction27);
        boolean boolean29 = board14.move(direction27);
        boolean boolean30 = board14.moveDown();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 2)" + "'", str3, "(100, 2)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str25, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction27 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction27.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        boolean boolean4 = board1.isFull();
        boolean boolean5 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveUp();
        boolean boolean6 = board0.hasEmptyCells();
        long long7 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) '4', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1073741824);
        int int2 = cell1.getValue();
        int int3 = cell1.getValue();
        java.lang.String str4 = cell1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741824 + "'", int2 == 1073741824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1073741824 + "'", int3 == 1073741824);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1073741824" + "'", str4, "1073741824");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        int int2 = board1.getSize();
        int int3 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveDown();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.hasEmptyCells();
        java.lang.String str6 = board1.toString();
        boolean boolean7 = board1.moveUp();
        boolean boolean8 = board1.moveDown();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.isFull();
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.moveDown();
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.moveUp();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str7 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 4\n+-----+-----+-----+-----+\n|    4|     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board1.getCell(131072, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (131072, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
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
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board1.equals((java.lang.Object) board6);
        java.lang.String str9 = board6.toString();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = board6.isLosingBoard();
        ar.edu.unrc.game2048.Board.Direction direction12 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean13 = board6.move(direction12);
        boolean boolean14 = board6.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction12.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveUp();
        boolean boolean6 = board0.hasEmptyCells();
        boolean boolean7 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-2147483648), (int) (byte) 1);
        int int3 = position2.col;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(-2147483648, 1)" + "'", str5, "(-2147483648, 1)");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean5 = board2.move(direction4);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        boolean boolean11 = cell8.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        boolean boolean15 = board13.isFull();
        boolean boolean16 = board13.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board18.isFull();
        boolean boolean20 = board13.equals((java.lang.Object) board18);
        boolean boolean21 = cell8.equals((java.lang.Object) boolean20);
        int int22 = cell8.getValue();
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int24 = cell23.getValue();
        boolean boolean26 = cell23.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board27);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        boolean boolean30 = board28.isFull();
        boolean boolean31 = board28.moveDown();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board32);
        boolean boolean34 = board33.isFull();
        boolean boolean35 = board28.equals((java.lang.Object) board33);
        boolean boolean36 = cell23.equals((java.lang.Object) boolean35);
        int int37 = cell23.getValue();
        boolean boolean38 = cell8.canMergeWith(cell23);
        int int39 = cell8.getValue();
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int42 = cell41.getValue();
        java.lang.String str43 = cell41.toString();
        java.lang.String str44 = cell41.toString();
        int int45 = cell41.getValue();
        boolean boolean46 = cell40.canMergeWith(cell41);
        boolean boolean47 = cell8.canMergeWith(cell40);
        int int48 = cell40.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) ' ', 0, cell40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 0) is out of bounds for board size 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (-2147483648));
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean5 = board3.moveUp();
        java.lang.Class<?> wildcardClass6 = board3.getClass();
        boolean boolean7 = position2.equals((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveUp();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.isWinningBoard();
        boolean boolean9 = board6.equals((java.lang.Object) 1);
        boolean boolean10 = board6.isLosingBoard();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        int int13 = board11.getSize();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        long long15 = board11.getScore();
        java.lang.Object obj16 = null;
        boolean boolean17 = board11.equals(obj16);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int21 = board20.getSize();
        ar.edu.unrc.game2048.Board.Direction direction22 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean23 = board20.move(direction22);
        boolean boolean24 = board20.moveDown();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        long long28 = board27.getScore();
        java.lang.String str29 = board27.toString();
        ar.edu.unrc.game2048.Board.Direction direction30 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean31 = board27.move(direction30);
        boolean boolean32 = board20.move(direction30);
        boolean boolean33 = board11.move(direction30);
        boolean boolean34 = board6.move(direction30);
        boolean boolean35 = board0.move(direction30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + direction22 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction22.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n" + "'", str29, "Score: 0\n+-----+-----+\n|     |     |\n+-----+-----+\n|    2|    2|\n+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction30 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction30.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, 4L);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.moveUp();
        boolean boolean6 = board1.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        boolean boolean8 = board1.moveRight();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
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
        boolean boolean34 = board32.isFull();
        boolean boolean35 = board32.moveDown();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean38 = board37.isFull();
        boolean boolean39 = board32.equals((java.lang.Object) board37);
        boolean boolean40 = cell0.equals((java.lang.Object) boolean39);
        java.lang.String str41 = cell0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1);
        int int7 = position2.col;
        int int8 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.moveUp();
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        int int13 = position2.col;
        int int14 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1073741824 + "'", int7 == 1073741824);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1073741824 + "'", int13 == 1073741824);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str7 = board0.toString();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        int int10 = board8.getSize();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        long long12 = board8.getScore();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board14.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board14.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board14.getEmptyPositions();
        boolean boolean18 = board14.moveLeft();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        int int22 = board21.getSize();
        int int23 = board21.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board21.getEmptyPositions();
        java.lang.String str25 = board21.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board21);
        ar.edu.unrc.game2048.Board.Direction direction27 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean28 = board26.move(direction27);
        boolean boolean29 = board14.move(direction27);
        boolean boolean30 = board8.move(direction27);
        boolean boolean31 = board0.move(direction27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str25, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction27 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction27.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (long) '#');
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean5 = board2.move(direction4);
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        long long8 = board7.getScore();
        boolean boolean9 = board7.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4L + "'", long8 == 4L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Direction cannot be null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Direction cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1);
        int int7 = position2.col;
        int int8 = position2.row;
        int int9 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1073741824 + "'", int7 == 1073741824);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1073741824 + "'", int9 == 1073741824);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-2147483648), (int) (byte) -1);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 1073741824);
        boolean boolean4 = position2.equals((java.lang.Object) " values, got ");
        boolean boolean6 = position2.equals((java.lang.Object) 1L);
        boolean boolean8 = position2.equals((java.lang.Object) 10);
        int int9 = position2.col;
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.moveRight();
        boolean boolean13 = board11.moveLeft();
        boolean boolean14 = board11.moveLeft();
        int int15 = board11.getSize();
        boolean boolean16 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        boolean boolean20 = board18.moveRight();
        boolean boolean21 = board18.moveLeft();
        boolean boolean22 = board18.moveUp();
        boolean boolean23 = board11.equals((java.lang.Object) boolean22);
        boolean boolean24 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean26 = position2.equals((java.lang.Object) board25);
        java.lang.String str27 = position2.toString();
        int int28 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1073741824 + "'", int9 == 1073741824);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(100, 1073741824)" + "'", str27, "(100, 1073741824)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1073741824 + "'", int28 == 1073741824);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int4 = cell3.getValue();
        boolean boolean6 = cell3.equals((java.lang.Object) "\n");
        boolean boolean7 = cell3.isEmpty();
        boolean boolean8 = cell1.canMergeWith(cell3);
        java.lang.String str9 = cell3.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        java.lang.String str3 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        boolean boolean3 = cell0.equals((java.lang.Object) "\n");
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean7 = cell5.equals((java.lang.Object) ", ");
        boolean boolean8 = cell0.equals((java.lang.Object) ", ");
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) (-1.0f));
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        boolean boolean7 = board4.moveLeft();
        int int8 = board4.getSize();
        boolean boolean9 = board4.isLosingBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.moveUp();
        boolean boolean16 = board4.equals((java.lang.Object) boolean15);
        boolean boolean17 = board4.moveRight();
        ar.edu.unrc.game2048.Cell cell20 = board4.getCell(1, 0);
        java.lang.String str21 = cell20.toString();
        boolean boolean22 = cell0.canMergeWith(cell20);
        java.lang.Class<?> wildcardClass23 = cell20.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1073741824, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: 1073741824");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        boolean boolean12 = board10.moveDown();
        ar.edu.unrc.game2048.Board.Direction direction13 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean14 = board10.move(direction13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board10.getEmptyPositions();
        boolean boolean16 = board1.equals((java.lang.Object) board10);
        boolean boolean17 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction13.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be between 1 and 16: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 0);
    }
}

