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
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.UP;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.UP));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ar.edu.unrc.game2048.Board board0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((-1), (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell8 = board5.getCell((int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 1, (int) '#', cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cell8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("(32, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: (32, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        java.lang.Class<?> wildcardClass8 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = position2.equals((java.lang.Object) board4);
        boolean boolean7 = board4.moveLeft();
        java.lang.Class<?> wildcardClass8 = board4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board1.getCell(97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 0) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board1.getCell((int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 52) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean6 = board5.moveRight();
        boolean boolean7 = board5.moveLeft();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell14 = board11.getCell((int) (byte) 1, (int) (byte) 1);
        board5.setCell((int) (short) 10, 0, cell14);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) 'a', (int) 'a', cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell14);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 100);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        boolean boolean8 = board6.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell8 = board1.getCell((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        boolean boolean2 = board0.moveDown();
        boolean boolean3 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = position2.equals((java.lang.Object) board4);
        boolean boolean7 = board4.moveLeft();
        boolean boolean8 = board4.moveUp();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.Class<?> wildcardClass7 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean10 = board9.moveRight();
        boolean boolean11 = board9.moveLeft();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell18 = board15.getCell((int) (byte) 1, (int) (byte) 1);
        board9.setCell((int) (short) 10, 0, cell18);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(52, (int) (byte) -1, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        boolean boolean9 = board1.moveLeft();
        boolean boolean10 = board1.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 97) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell((int) (short) 10, 0, cell10);
        java.lang.Class<?> wildcardClass12 = cell10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        int int6 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getScore();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean13 = board12.moveRight();
        boolean boolean14 = board12.moveLeft();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell21 = board18.getCell((int) (byte) 1, (int) (byte) 1);
        board12.setCell((int) (short) 10, 0, cell21);
        ar.edu.unrc.game2048.Cell cell25 = board12.getCell((int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(0, (int) (short) 100, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(cell25);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("(0, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: (0, 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 100);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board1.getCell((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        boolean boolean5 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean10 = board9.moveRight();
        boolean boolean11 = board9.moveLeft();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell18 = board15.getCell((int) (byte) 1, (int) (byte) 1);
        board9.setCell((int) (short) 10, 0, cell18);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) 'a', (int) (short) 10, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 10) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((-1), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board1.repOk();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.lang.Class<?> wildcardClass3 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (-1));
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        int int5 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell(32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        boolean boolean8 = board6.moveRight();
        boolean boolean9 = board6.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = board4.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean10 = position2.equals((java.lang.Object) board9);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board9.getCell((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 0) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.moveUp();
        int int8 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board0.getCell((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        boolean boolean9 = board1.moveLeft();
        boolean boolean10 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (byte) 1, (int) (byte) 1);
        board4.setCell((int) (short) 10, 0, cell13);
        board0.setCell(0, (int) (byte) 0, cell13);
        java.lang.Class<?> wildcardClass16 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.isWinningBoard();
        int int7 = board1.getScore();
        boolean boolean8 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = position2.equals((java.lang.Object) board4);
        int int7 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board5.hasEmptyCells();
        boolean boolean7 = board5.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean10 = position8.equals((java.lang.Object) 1);
        java.lang.String str11 = position8.toString();
        int int12 = position8.col;
        int int13 = position8.col;
        boolean boolean14 = board1.equals((java.lang.Object) int13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(52, -1)" + "'", str11, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell3 = board0.getCell((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getScore();
        java.lang.Class<?> wildcardClass5 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(52);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean9 = board8.moveRight();
        boolean boolean10 = board8.moveLeft();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell((int) (byte) 1, (int) (byte) 1);
        board8.setCell((int) (short) 10, 0, cell17);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) -1, (int) (byte) 10, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell17);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        boolean boolean7 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) '4');
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 52)" + "'", str3, "(10, 52)");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean13 = board12.moveRight();
        boolean boolean14 = board12.moveLeft();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell21 = board18.getCell((int) (byte) 1, (int) (byte) 1);
        board12.setCell((int) (short) 10, 0, cell21);
        board8.setCell(0, (int) (byte) 0, cell21);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(97, (int) (short) 100, cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 100) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cell21);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.isWinningBoard();
        boolean boolean7 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        boolean boolean2 = board0.moveDown();
        boolean boolean3 = board0.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board0.getCell(52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board5.getCell(97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 100) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        int int6 = board5.getScore();
        java.lang.Class<?> wildcardClass7 = board5.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.isLosingBoard();
        boolean boolean7 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("(10, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: (10, 52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        java.lang.Class<?> wildcardClass3 = positionSet2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) '#', (long) (byte) -1);
        boolean boolean10 = board1.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        boolean boolean7 = board4.moveUp();
        boolean boolean8 = board4.moveLeft();
        boolean boolean9 = board4.moveRight();
        boolean boolean10 = board4.moveUp();
        boolean boolean11 = board4.moveDown();
        boolean boolean12 = position2.equals((java.lang.Object) board4);
        int int13 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getScore();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.Class<?> wildcardClass9 = board8.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass6 = positionSet5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.isWinningBoard();
        int int7 = board1.getScore();
        boolean boolean8 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        int int12 = board10.getScore();
        boolean boolean13 = board10.moveLeft();
        boolean boolean14 = board10.isWinningBoard();
        boolean boolean15 = board1.equals((java.lang.Object) board10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean15 = board14.moveRight();
        boolean boolean16 = board14.moveLeft();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = board20.getCell((int) (byte) 1, (int) (byte) 1);
        board14.setCell((int) (short) 10, 0, cell23);
        board10.setCell(0, (int) (byte) 0, cell23);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 10, 97, cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell23);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell11 = board8.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell(4, 0, cell11);
        boolean boolean13 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board2.getCell(32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 32) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getSize();
        boolean boolean4 = board1.moveRight();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean9 = board8.moveRight();
        boolean boolean10 = board8.moveLeft();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell((int) (byte) 1, (int) (byte) 1);
        board8.setCell((int) (short) 10, 0, cell17);
        ar.edu.unrc.game2048.Cell cell21 = board8.getCell((int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((-1), 1, cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(cell21);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        int int6 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board1.isWinningBoard();
        java.lang.Class<?> wildcardClass10 = board1.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) '4');
        int int3 = position2.row;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', (long) 0);
        boolean boolean3 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveRight();
        boolean boolean6 = board1.moveLeft();
        int int7 = board1.getSize();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        boolean boolean7 = board4.repOk();
        boolean boolean8 = board4.isLosingBoard();
        boolean boolean9 = board4.moveLeft();
        boolean boolean10 = position2.equals((java.lang.Object) boolean9);
        int int11 = position2.row;
        java.lang.String str12 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, 1)" + "'", str12, "(1, 1)");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.moveUp();
        boolean boolean8 = board1.isFull();
        boolean boolean10 = board1.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (long) 100);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (-1));
        java.lang.String str6 = position5.toString();
        boolean boolean7 = board2.equals((java.lang.Object) str6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board2.getCell((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(32, -1)" + "'", str6, "(32, -1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board5.isLosingBoard();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = board5.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        int int6 = board1.getScore();
        boolean boolean7 = board1.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 4) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        boolean boolean8 = board6.moveRight();
        boolean boolean9 = board6.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        boolean boolean7 = board4.moveUp();
        boolean boolean8 = board4.moveLeft();
        boolean boolean9 = board4.moveRight();
        boolean boolean10 = board4.moveUp();
        boolean boolean11 = board4.moveDown();
        boolean boolean12 = position2.equals((java.lang.Object) board4);
        boolean boolean13 = board4.moveUp();
        ar.edu.unrc.game2048.Cell cell16 = null;
        // The following exception was thrown during execution in test generation
        try {
            board4.setCell(32, (int) (short) 1, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("(97, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: (97, 10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        boolean boolean5 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (byte) 1, (int) (byte) 1);
        board4.setCell((int) (short) 10, 0, cell13);
        board0.setCell(0, (int) (byte) 0, cell13);
        boolean boolean16 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.Class<?> wildcardClass18 = board17.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board5.isLosingBoard();
        boolean boolean7 = board5.moveUp();
        boolean boolean8 = board5.repOk();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getScore();
        boolean boolean5 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board5.isLosingBoard();
        boolean boolean7 = board5.moveRight();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int11 = position10.col;
        int int12 = position10.col;
        java.lang.String str13 = position10.toString();
        int int14 = position10.row;
        boolean boolean15 = board5.equals((java.lang.Object) int14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(52, -1)" + "'", str13, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '#');
        boolean boolean2 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("(1, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: (1, 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (byte) 1, (int) (byte) 1);
        board4.setCell((int) (short) 10, 0, cell13);
        board0.setCell(0, (int) (byte) 0, cell13);
        boolean boolean16 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board0);
        int int18 = board17.getSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.isWinningBoard();
        boolean boolean5 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position(97, 10);
        boolean boolean9 = board1.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board1.isWinningBoard();
        boolean boolean10 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getSize();
        boolean boolean4 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        java.lang.String str5 = position2.toString();
        int int6 = position2.col;
        int int7 = position2.col;
        int int8 = position2.row;
        java.lang.Class<?> wildcardClass9 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, -1)" + "'", str5, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        boolean boolean5 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', (int) (byte) 10);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveRight();
        boolean boolean6 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass7 = board1.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, 10);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, 10)" + "'", str3, "(97, 10)");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.repOk();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = board4.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = board4.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) board4);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveDown();
        int int8 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        boolean boolean7 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '#');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean3 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean9 = board8.moveRight();
        boolean boolean10 = board8.moveLeft();
        boolean boolean11 = board8.moveDown();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell18 = board15.getCell((int) (byte) 1, (int) (byte) 1);
        board8.setCell(4, 0, cell18);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) -1, 1, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean2 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        int int6 = board1.getScore();
        java.lang.Class<?> wildcardClass7 = board1.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', (int) (byte) 10);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        int int7 = board4.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = board4.isWinningBoard();
        int int10 = board4.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) int10);
        int int12 = position2.col;
        java.lang.String str13 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(97, 10)" + "'", str13, "(97, 10)");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (long) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board3.moveLeft();
        boolean boolean5 = board3.isWinningBoard();
        boolean boolean6 = board3.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board3.getEmptyPositions();
        boolean boolean8 = board2.equals((java.lang.Object) board3);
        boolean boolean9 = board3.moveRight();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(16, 52);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        boolean boolean8 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell12 = board1.getCell(10, (int) '4');
        boolean boolean13 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board5.isLosingBoard();
        boolean boolean7 = board5.moveUp();
        boolean boolean8 = board5.repOk();
        boolean boolean9 = board5.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = board4.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = position2.equals((java.lang.Object) board4);
        java.lang.String str10 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 100);
        boolean boolean14 = position2.equals((java.lang.Object) position13);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(52, -1)" + "'", str10, "(52, -1)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        boolean boolean8 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.repOk();
        boolean boolean9 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        boolean boolean5 = board1.moveUp();
        boolean boolean6 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board6.getCell(4, 16);
        boolean boolean12 = board6.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board0.getCell(32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board5.moveLeft();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = board4.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = board4.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) board4);
        boolean boolean11 = board4.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
        int int2 = board1.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board1.getCell((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        boolean boolean5 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean10 = board9.moveRight();
        boolean boolean11 = board9.moveLeft();
        boolean boolean12 = board9.moveUp();
        boolean boolean13 = board9.moveLeft();
        boolean boolean14 = board9.moveRight();
        boolean boolean15 = board9.moveUp();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean20 = board19.moveRight();
        boolean boolean21 = board19.moveLeft();
        boolean boolean22 = board19.moveDown();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell29 = board26.getCell((int) (byte) 1, (int) (byte) 1);
        board19.setCell(4, 0, cell29);
        board9.setCell(4, (int) '4', cell29);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(0, (int) 'a', cell29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 97) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cell29);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        boolean boolean8 = board1.isWinningBoard();
        boolean boolean9 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board1.isWinningBoard();
        boolean boolean10 = board1.isFull();
        int int11 = board1.getScore();
        boolean boolean12 = board1.moveRight();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        java.lang.String str6 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|    2|\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 4\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(52, -1)" + "'", str6, "(52, -1)");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(16, 4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("(52, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: (52, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (byte) 1, (int) (byte) 1);
        board4.setCell((int) (short) 10, 0, cell13);
        board0.setCell(0, (int) (byte) 0, cell13);
        boolean boolean16 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean20 = board19.moveRight();
        boolean boolean21 = board19.moveLeft();
        boolean boolean22 = board19.moveUp();
        boolean boolean23 = board19.moveLeft();
        boolean boolean24 = board17.equals((java.lang.Object) board19);
        boolean boolean25 = board17.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell((int) (short) 10, 0, cell10);
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 0, (int) (short) 10);
        boolean boolean15 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(positionSet17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) '4');
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 52)" + "'", str3, "(10, 52)");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.moveLeft();
        int int5 = board0.getSize();
        int int6 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        int int6 = position2.col;
        java.lang.String str7 = position2.toString();
        java.lang.String str8 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((-1), (int) (short) 1);
        int int12 = position11.col;
        boolean boolean13 = position2.equals((java.lang.Object) position11);
        int int14 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, -1)" + "'", str7, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(52, -1)" + "'", str8, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.row;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, 10);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean8 = board7.moveRight();
        boolean boolean9 = board7.moveLeft();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell16 = board13.getCell((int) (byte) 1, (int) (byte) 1);
        board7.setCell((int) (short) 10, 0, cell16);
        board3.setCell(0, (int) (byte) 0, cell16);
        boolean boolean19 = position2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell((int) (short) 10, 0, cell10);
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = cell14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) ' ', 1);
        boolean boolean11 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean4 = board3.moveDown();
        boolean boolean5 = board1.equals((java.lang.Object) board3);
        boolean boolean6 = board3.repOk();
        boolean boolean7 = board3.moveDown();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell((int) (short) 10, 0, cell10);
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 0, (int) (short) 10);
        boolean boolean15 = board1.moveLeft();
        boolean boolean16 = board1.moveLeft();
        boolean boolean17 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.repOk();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean13 = board12.moveRight();
        boolean boolean14 = board12.moveLeft();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell22 = board19.getCell((int) (byte) 1, (int) (byte) 1);
        board12.setCell(4, 0, cell22);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean28 = board27.moveRight();
        boolean boolean29 = board27.moveLeft();
        boolean boolean30 = board27.moveUp();
        boolean boolean31 = board27.moveLeft();
        boolean boolean32 = board27.moveRight();
        boolean boolean33 = board27.moveUp();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveRight();
        boolean boolean39 = board37.moveLeft();
        boolean boolean40 = board37.moveDown();
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell47 = board44.getCell((int) (byte) 1, (int) (byte) 1);
        board37.setCell(4, 0, cell47);
        board27.setCell(4, (int) '4', cell47);
        board12.setCell(16, (int) (short) 10, cell47);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (short) 10, (int) (short) 100, cell47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cell47);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', (long) (-1));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.Class<?> wildcardClass6 = board1.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (-1));
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board3.isWinningBoard();
        boolean boolean5 = board3.moveDown();
        boolean boolean6 = position2.equals((java.lang.Object) boolean5);
        java.lang.Class<?> wildcardClass7 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        boolean boolean5 = board1.moveLeft();
        int int6 = board1.getSize();
        boolean boolean7 = board1.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        java.lang.String str5 = position2.toString();
        java.lang.String str6 = position2.toString();
        java.lang.String str7 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int11 = position10.col;
        int int12 = position10.col;
        int int13 = position10.row;
        boolean boolean14 = position2.equals((java.lang.Object) position10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, -1)" + "'", str5, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(52, -1)" + "'", str6, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, -1)" + "'", str7, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        int int8 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        int int2 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass7 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) '#');
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.repOk();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(16);
        boolean boolean2 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) '4', (long) (byte) -1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) ' ');
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        int int3 = position2.row;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (byte) 10);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        int int8 = board1.getScore();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean4 = board3.moveDown();
        boolean boolean5 = board1.equals((java.lang.Object) board3);
        boolean boolean6 = board3.repOk();
        boolean boolean7 = board3.moveRight();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean8 = board7.moveRight();
        int int9 = board7.getScore();
        int int10 = board7.getSize();
        boolean boolean11 = position2.equals((java.lang.Object) board7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, -1)" + "'", str5, "(52, -1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.Class<?> wildcardClass7 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        java.lang.Class<?> wildcardClass8 = board1.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveDown();
        boolean boolean12 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        boolean boolean2 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board1.getCell(97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, -1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board5.moveLeft();
        boolean boolean7 = board5.repOk();
        boolean boolean8 = board5.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell11 = board8.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell(4, 0, cell11);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean17 = board16.moveRight();
        boolean boolean18 = board16.moveLeft();
        boolean boolean19 = board16.moveUp();
        boolean boolean20 = board16.moveLeft();
        boolean boolean21 = board16.moveRight();
        boolean boolean22 = board16.moveUp();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean27 = board26.moveRight();
        boolean boolean28 = board26.moveLeft();
        boolean boolean29 = board26.moveDown();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell36 = board33.getCell((int) (byte) 1, (int) (byte) 1);
        board26.setCell(4, 0, cell36);
        board16.setCell(4, (int) '4', cell36);
        board1.setCell(16, (int) (short) 10, cell36);
        boolean boolean40 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getSize();
        boolean boolean5 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = board4.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean10 = position2.equals((java.lang.Object) board9);
        java.lang.String str11 = position2.toString();
        java.lang.String str12 = position2.toString();
        int int13 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(52, -1)" + "'", str11, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(52, -1)" + "'", str12, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (-1));
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean10 = board9.moveRight();
        int int11 = board9.getScore();
        boolean boolean12 = board9.repOk();
        boolean boolean13 = board9.isLosingBoard();
        boolean boolean14 = board9.moveLeft();
        boolean boolean15 = position7.equals((java.lang.Object) boolean14);
        boolean boolean16 = position2.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, -1)" + "'", str3, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        int int7 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board1.isWinningBoard();
        boolean boolean10 = board1.hasEmptyCells();
        boolean boolean11 = board1.moveLeft();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = board4.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean10 = position2.equals((java.lang.Object) board9);
        java.lang.String str11 = position2.toString();
        java.lang.String str12 = position2.toString();
        int int13 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(52, -1)" + "'", str11, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(52, -1)" + "'", str12, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        int int6 = position2.col;
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int10 = position9.col;
        int int11 = position9.col;
        java.lang.String str12 = position9.toString();
        int int13 = position9.row;
        boolean boolean14 = position2.equals((java.lang.Object) int13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(52, -1)" + "'", str12, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board1.isWinningBoard();
        boolean boolean10 = board1.isFull();
        int int11 = board1.getScore();
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 10, 35);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(cell14);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.repOk();
        boolean boolean7 = board1.repOk();
        boolean boolean8 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (long) (-1));
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean3 = board1.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveUp();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = board4.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = board4.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) board4);
        int int11 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getScore();
        boolean boolean9 = board1.isWinningBoard();
        int int10 = board1.getScore();
        ar.edu.unrc.game2048.Cell cell13 = null;
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(0, 97, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 97) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board6.hasEmptyCells();
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean4 = board3.moveDown();
        boolean boolean5 = board1.equals((java.lang.Object) board3);
        int int6 = board3.getScore();
        boolean boolean7 = board3.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveLeft();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        boolean boolean6 = board4.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, 4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = board4.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = position2.equals((java.lang.Object) board4);
        int int10 = position2.row;
        java.lang.String str11 = position2.toString();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(52, -1)" + "'", str11, "(52, -1)");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: 4\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|    2|\n+-----+-----+-----+-----+\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: 4?+-----+-----+-----+-----+?|     |     |    2|     |?+-----+-----+-----+-----+?|     |     |     |    4|?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|     |     |    4|    2|?+-----+-----+-----+-----+?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveUp();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean12 = board11.moveRight();
        boolean boolean13 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell20 = board17.getCell((int) (byte) 1, (int) (byte) 1);
        board11.setCell((int) (short) 10, 0, cell20);
        board7.setCell(0, (int) (byte) 0, cell20);
        boolean boolean23 = board7.isLosingBoard();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean25 = board1.equals((java.lang.Object) board7);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean28 = board27.moveRight();
        boolean boolean29 = board27.moveLeft();
        boolean boolean30 = board27.moveUp();
        boolean boolean31 = board27.moveLeft();
        boolean boolean32 = board27.moveRight();
        boolean boolean33 = board27.moveUp();
        boolean boolean34 = board27.moveDown();
        boolean boolean35 = board1.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.moveUp();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean12 = board11.moveRight();
        boolean boolean13 = board11.moveLeft();
        boolean boolean14 = board11.moveDown();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell21 = board18.getCell((int) (byte) 1, (int) (byte) 1);
        board11.setCell(4, 0, cell21);
        board1.setCell(4, (int) '4', cell21);
        boolean boolean24 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveRight();
        boolean boolean6 = board1.moveUp();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        int int12 = board10.getScore();
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = board10.equals(obj13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean16 = board15.hasEmptyCells();
        boolean boolean17 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board15.getCell(4, 16);
        board1.setCell((int) '#', 0, cell20);
        java.lang.Class<?> wildcardClass22 = cell20.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean3 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean5 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(97, (int) (byte) 1, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.moveRight();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board1.getCell((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 97) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        int int6 = position2.col;
        int int7 = position2.row;
        java.lang.String str8 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(52, -1)" + "'", str8, "(52, -1)");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = position2.equals((java.lang.Object) board4);
        java.lang.String str7 = position2.toString();
        int int8 = position2.row;
        int int9 = position2.row;
        int int10 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, -1)" + "'", str7, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(16, (long) (byte) 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.isWinningBoard();
        java.lang.String str6 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 4\n+-----+-----+-----+-----+\n|    4|     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.isLosingBoard();
        int int7 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        java.lang.String str5 = position2.toString();
        int int6 = position2.col;
        int int7 = position2.col;
        int int8 = position2.row;
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board10.moveLeft();
        int int13 = board10.getScore();
        boolean boolean14 = board10.isWinningBoard();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean16 = position2.equals((java.lang.Object) board15);
        java.lang.String str17 = position2.toString();
        int int18 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, -1)" + "'", str5, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(52, -1)" + "'", str17, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 1);
        java.lang.String str14 = position13.toString();
        int int15 = position13.row;
        boolean boolean16 = board10.equals((java.lang.Object) int15);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean22 = board21.moveLeft();
        boolean boolean23 = board21.repOk();
        int int24 = board21.getSize();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean30 = board29.moveRight();
        boolean boolean31 = board29.moveLeft();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell38 = board35.getCell((int) (byte) 1, (int) (byte) 1);
        board29.setCell((int) (short) 10, 0, cell38);
        board25.setCell(0, (int) (byte) 0, cell38);
        boolean boolean41 = board21.equals((java.lang.Object) cell38);
        board10.setCell((int) (short) 0, (int) (short) 1, cell38);
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell((int) (byte) 100, (int) '4', cell38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 52) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0, 1)" + "'", str14, "(0, 1)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        boolean boolean6 = board4.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveRight();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean12 = board11.moveLeft();
        boolean boolean13 = board11.repOk();
        int int14 = board11.getSize();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean20 = board19.moveRight();
        boolean boolean21 = board19.moveLeft();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell28 = board25.getCell((int) (byte) 1, (int) (byte) 1);
        board19.setCell((int) (short) 10, 0, cell28);
        board15.setCell(0, (int) (byte) 0, cell28);
        boolean boolean31 = board11.equals((java.lang.Object) cell28);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) 100, 10, cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 10) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getScore();
        boolean boolean9 = board1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        boolean boolean8 = board1.moveUp();
        boolean boolean9 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', 0);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean12 = board11.repOk();
        int int13 = board11.getSize();
        boolean boolean14 = board11.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board11.getCell((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 10) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        boolean boolean7 = board5.moveDown();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        boolean boolean7 = board4.moveUp();
        boolean boolean8 = board4.moveLeft();
        boolean boolean9 = board4.moveRight();
        boolean boolean10 = board4.moveUp();
        boolean boolean11 = board4.moveDown();
        boolean boolean12 = position2.equals((java.lang.Object) board4);
        boolean boolean14 = board4.equals((java.lang.Object) false);
        boolean boolean15 = board4.isFull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getScore();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell15 = board12.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board12);
        int int17 = board16.getScore();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(35, (int) 'a', cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 97) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(cell20);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getSize();
        java.lang.Class<?> wildcardClass4 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board5.isLosingBoard();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = board5.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.moveRight();
        int int7 = board1.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        boolean boolean8 = board1.isFull();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean13 = board12.moveRight();
        boolean boolean14 = board12.moveLeft();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell22 = board19.getCell((int) (byte) 1, (int) (byte) 1);
        board12.setCell(4, 0, cell22);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean28 = board27.moveRight();
        boolean boolean29 = board27.moveLeft();
        boolean boolean30 = board27.moveUp();
        boolean boolean31 = board27.moveLeft();
        boolean boolean32 = board27.moveRight();
        boolean boolean33 = board27.moveUp();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveRight();
        boolean boolean39 = board37.moveLeft();
        boolean boolean40 = board37.moveDown();
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell47 = board44.getCell((int) (byte) 1, (int) (byte) 1);
        board37.setCell(4, 0, cell47);
        board27.setCell(4, (int) '4', cell47);
        board12.setCell(16, (int) (short) 10, cell47);
        board1.setCell((int) (short) 10, 0, cell47);
        boolean boolean52 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, (int) (short) 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, 0);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean3 = board2.isFull();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) '4');
        int int7 = position6.row;
        boolean boolean8 = board2.equals((java.lang.Object) int7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(32, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getSize();
        boolean boolean4 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, 10L);
        int int3 = board2.getScore();
        java.lang.Class<?> wildcardClass4 = board2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.isWinningBoard();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board1.getCell(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean4 = board3.moveDown();
        boolean boolean5 = board1.equals((java.lang.Object) board3);
        boolean boolean6 = board3.repOk();
        boolean boolean7 = board3.isFull();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean13 = board12.moveLeft();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean17 = board16.moveRight();
        boolean boolean18 = board16.moveLeft();
        boolean boolean19 = board16.moveDown();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell26 = board23.getCell((int) (byte) 1, (int) (byte) 1);
        board16.setCell(4, 0, cell26);
        boolean boolean28 = board12.equals((java.lang.Object) cell26);
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell(32, (int) (byte) -1, cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, -1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        int int7 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board0.getCell((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell19 = board16.getCell((int) (byte) 1, (int) (byte) 1);
        board10.setCell((int) (short) 10, 0, cell19);
        board1.setCell(0, (int) '#', cell19);
        int int22 = board1.getScore();
        boolean boolean23 = board1.isWinningBoard();
        boolean boolean24 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        int int6 = board1.getScore();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell10 = board1.getCell(52, 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cell10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board5.isLosingBoard();
        boolean boolean7 = board5.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '#');
        boolean boolean2 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(4, (long) 32);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', (int) (byte) 10);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        int int7 = board4.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = board4.isWinningBoard();
        int int10 = board4.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) int10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean14 = board13.moveRight();
        int int15 = board13.getScore();
        boolean boolean16 = board13.moveLeft();
        boolean boolean17 = board13.isFull();
        boolean boolean18 = position2.equals((java.lang.Object) board13);
        boolean boolean19 = board13.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) ' ');
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        int int6 = board1.getSize();
        boolean boolean7 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        boolean boolean7 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        boolean boolean5 = board1.isLosingBoard();
        int int6 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveRight();
        boolean boolean6 = board1.moveUp();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        int int12 = board10.getScore();
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = board10.equals(obj13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean16 = board15.hasEmptyCells();
        boolean boolean17 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board15.getCell(4, 16);
        board1.setCell((int) '#', 0, cell20);
        boolean boolean22 = board1.hasEmptyCells();
        boolean boolean23 = board1.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.isWinningBoard();
        int int7 = board1.getScore();
        boolean boolean8 = board1.moveLeft();
        boolean boolean9 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) '#');
        boolean boolean10 = board1.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (byte) 1, (int) (byte) 1);
        board4.setCell((int) (short) 10, 0, cell13);
        board0.setCell(0, (int) (byte) 0, cell13);
        boolean boolean16 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean18 = board0.moveUp();
        boolean boolean19 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) -1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass8 = positionSet7.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveDown();
        boolean boolean3 = board1.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean8 = board7.moveRight();
        boolean boolean9 = board7.moveLeft();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell16 = board13.getCell((int) (byte) 1, (int) (byte) 1);
        board7.setCell((int) (short) 10, 0, cell16);
        ar.edu.unrc.game2048.Cell cell20 = board7.getCell((int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((-1), (int) (byte) 10, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(cell20);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        int int7 = board6.getSize();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        boolean boolean6 = board4.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) (byte) 0);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = position2.equals((java.lang.Object) board4);
        boolean boolean7 = board4.moveLeft();
        int int8 = board4.getSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean6 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(32);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        java.lang.String str5 = position2.toString();
        java.lang.String str6 = position2.toString();
        int int7 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = position2.equals((java.lang.Object) board13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, -1)" + "'", str5, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(52, -1)" + "'", str6, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (byte) 1, (int) (byte) 1);
        board4.setCell((int) (short) 10, 0, cell13);
        board0.setCell(0, (int) (byte) 0, cell13);
        boolean boolean16 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean18 = board0.moveUp();
        boolean boolean19 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, 10L);
        int int3 = board2.getScore();
        boolean boolean4 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.moveLeft();
        boolean boolean9 = board1.moveDown();
        boolean boolean10 = board1.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell15 = board12.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean16 = board12.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board12.getEmptyPositions();
        boolean boolean18 = board1.equals((java.lang.Object) board12);
        int int19 = board1.getSize();
        int int20 = board1.getScore();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(35);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.moveLeft();
        int int5 = board0.getSize();
        boolean boolean6 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.repOk();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.moveUp();
        java.lang.String str8 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|     |    2|     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 4\n+-----+-----+-----+-----+\n|    4|     |    2|     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = position2.equals((java.lang.Object) board4);
        java.lang.String str7 = position2.toString();
        int int8 = position2.row;
        int int9 = position2.row;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell14 = board11.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board11);
        int int16 = board11.getScore();
        boolean boolean17 = board11.moveUp();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) (short) 1, (long) ' ');
        boolean boolean21 = board20.moveRight();
        boolean boolean22 = board11.equals((java.lang.Object) board20);
        boolean boolean23 = board20.moveUp();
        boolean boolean24 = position2.equals((java.lang.Object) board20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, -1)" + "'", str7, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = board4.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean10 = position2.equals((java.lang.Object) board9);
        boolean boolean11 = board9.moveUp();
        boolean boolean12 = board9.isFull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (long) (short) 1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.isLosingBoard();
        int int7 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board10.moveLeft();
        boolean boolean13 = board10.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell20 = board17.getCell((int) (byte) 1, (int) (byte) 1);
        board10.setCell(4, 0, cell20);
        // The following exception was thrown during execution in test generation
        try {
            board5.setCell((int) (short) 10, (int) (short) 100, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell20);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (byte) 1, (int) (byte) 1);
        board4.setCell((int) (short) 10, 0, cell13);
        board0.setCell(0, (int) (byte) 0, cell13);
        boolean boolean16 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean18 = board17.moveRight();
        java.lang.String str19 = board17.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str19, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = board4.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean10 = position2.equals((java.lang.Object) board9);
        java.lang.String str11 = position2.toString();
        java.lang.String str12 = position2.toString();
        java.lang.String str13 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(52, -1)" + "'", str11, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(52, -1)" + "'", str12, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(52, -1)" + "'", str13, "(52, -1)");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 10, (long) 97);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(12);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.isLosingBoard();
        boolean boolean10 = board1.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        int int6 = position2.col;
        java.lang.String str7 = position2.toString();
        java.lang.String str8 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((-1), (int) (short) 1);
        int int12 = position11.col;
        boolean boolean13 = position2.equals((java.lang.Object) position11);
        boolean boolean15 = position11.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, -1)" + "'", str7, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(52, -1)" + "'", str8, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        boolean boolean8 = board1.repOk();
        boolean boolean9 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        boolean boolean2 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.isLosingBoard();
        boolean boolean10 = board1.isFull();
        boolean boolean11 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        int int5 = board0.getSize();
        boolean boolean6 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(16, (long) (byte) -1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(97, (long) 12);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveDown();
        boolean boolean3 = board1.hasEmptyCells();
        boolean boolean4 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.isWinningBoard();
        boolean boolean8 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        int int6 = board1.getScore();
        boolean boolean7 = board1.moveUp();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (short) 1, (long) ' ');
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board1.equals((java.lang.Object) board10);
        boolean boolean13 = board10.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board10.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet14);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        int int6 = board1.getScore();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean11 = position9.equals((java.lang.Object) 1);
        java.lang.String str12 = position9.toString();
        java.lang.String str13 = position9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) position9);
        boolean boolean15 = board1.moveLeft();
        boolean boolean16 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(52, -1)" + "'", str12, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(52, -1)" + "'", str13, "(52, -1)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        boolean boolean4 = board0.repOk();
        boolean boolean5 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', (int) (byte) 10);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell8 = board5.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean10 = board5.moveRight();
        boolean boolean11 = board5.isFull();
        boolean boolean12 = board5.isWinningBoard();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Cell cell16 = board5.getCell(10, (int) '4');
        boolean boolean17 = position2.equals((java.lang.Object) board5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, 10)" + "'", str3, "(97, 10)");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (byte) 1, (int) (byte) 1);
        board4.setCell((int) (short) 10, 0, cell13);
        board0.setCell(0, (int) (byte) 0, cell13);
        boolean boolean16 = board0.repOk();
        int int17 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getSize();
        boolean boolean4 = board1.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 1);
        java.lang.String str11 = position10.toString();
        int int12 = position10.row;
        boolean boolean13 = board7.equals((java.lang.Object) int12);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean19 = board18.moveLeft();
        boolean boolean20 = board18.repOk();
        int int21 = board18.getSize();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean27 = board26.moveRight();
        boolean boolean28 = board26.moveLeft();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell35 = board32.getCell((int) (byte) 1, (int) (byte) 1);
        board26.setCell((int) (short) 10, 0, cell35);
        board22.setCell(0, (int) (byte) 0, cell35);
        boolean boolean38 = board18.equals((java.lang.Object) cell35);
        board7.setCell((int) (short) 0, (int) (short) 1, cell35);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) 1, (int) 'a', cell35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 97) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(0, 1)" + "'", str11, "(0, 1)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.isWinningBoard();
        boolean boolean8 = board0.moveUp();
        boolean boolean9 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, 10L);
        int int3 = board2.getScore();
        boolean boolean4 = board2.moveLeft();
        boolean boolean5 = board2.isLosingBoard();
        int int6 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(52, (long) (byte) 0);
        boolean boolean3 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell11 = board8.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell(4, 0, cell11);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean17 = board16.moveRight();
        boolean boolean18 = board16.moveLeft();
        boolean boolean19 = board16.moveUp();
        boolean boolean20 = board16.moveLeft();
        boolean boolean21 = board16.moveRight();
        boolean boolean22 = board16.moveUp();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean27 = board26.moveRight();
        boolean boolean28 = board26.moveLeft();
        boolean boolean29 = board26.moveDown();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell36 = board33.getCell((int) (byte) 1, (int) (byte) 1);
        board26.setCell(4, 0, cell36);
        board16.setCell(4, (int) '4', cell36);
        board1.setCell(16, (int) (short) 10, cell36);
        boolean boolean40 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        boolean boolean5 = board4.moveLeft();
        boolean boolean6 = board4.isWinningBoard();
        boolean boolean7 = board4.moveDown();
        boolean boolean8 = board0.equals((java.lang.Object) boolean7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (-1));
        int int3 = position2.row;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean6 = board5.moveRight();
        int int7 = board5.getScore();
        int int8 = board5.getScore();
        boolean boolean9 = board5.moveUp();
        boolean boolean10 = position2.equals((java.lang.Object) boolean9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveRight();
        boolean boolean6 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell((int) (short) 10, 0, cell10);
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 0, (int) (short) 10);
        boolean boolean15 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        boolean boolean4 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (long) 100);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (-1));
        java.lang.String str6 = position5.toString();
        boolean boolean7 = board2.equals((java.lang.Object) str6);
        int int8 = board2.getSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(32, -1)" + "'", str6, "(32, -1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean12 = board11.moveRight();
        boolean boolean13 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell20 = board17.getCell((int) (byte) 1, (int) (byte) 1);
        board11.setCell((int) (short) 10, 0, cell20);
        board7.setCell(0, (int) (byte) 0, cell20);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) ' ', 12, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 12) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell20);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (byte) 1, (int) (byte) 1);
        board4.setCell((int) (short) 10, 0, cell13);
        board0.setCell(0, (int) (byte) 0, cell13);
        boolean boolean16 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean20 = board19.moveRight();
        boolean boolean21 = board19.moveLeft();
        boolean boolean22 = board19.moveUp();
        boolean boolean23 = board19.moveLeft();
        boolean boolean24 = board17.equals((java.lang.Object) board19);
        boolean boolean25 = board17.moveDown();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (long) 16);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getScore();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean8 = board7.moveRight();
        int int9 = board7.getScore();
        int int10 = board7.getScore();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean12 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean14 = board7.repOk();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean17 = board16.moveUp();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell22 = board19.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean24 = board19.moveRight();
        boolean boolean25 = board16.equals((java.lang.Object) board19);
        boolean boolean26 = board7.equals((java.lang.Object) boolean25);
        boolean boolean27 = board1.equals((java.lang.Object) boolean25);
        boolean boolean28 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board6.moveRight();
        int int8 = board6.getScore();
        boolean boolean9 = board6.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board6.getEmptyPositions();
        boolean boolean11 = position2.equals((java.lang.Object) positionSet10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        boolean boolean7 = board4.repOk();
        boolean boolean8 = board4.isLosingBoard();
        boolean boolean9 = board4.moveLeft();
        boolean boolean10 = position2.equals((java.lang.Object) boolean9);
        int int11 = position2.row;
        int int12 = position2.col;
        int int13 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveUp();
        int int7 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.moveUp();
        boolean boolean9 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        boolean boolean2 = board1.moveDown();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean8 = board7.moveRight();
        int int9 = board7.getScore();
        boolean boolean10 = board7.repOk();
        boolean boolean11 = board7.isLosingBoard();
        boolean boolean12 = board7.moveLeft();
        boolean boolean13 = position5.equals((java.lang.Object) boolean12);
        int int14 = position5.row;
        int int15 = position5.col;
        java.lang.String str16 = position5.toString();
        boolean boolean17 = board1.equals((java.lang.Object) position5);
        boolean boolean18 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(1, 1)" + "'", str16, "(1, 1)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        int int6 = position2.col;
        java.lang.String str7 = position2.toString();
        java.lang.String str8 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((-1), (int) (short) 1);
        int int12 = position11.col;
        boolean boolean13 = position2.equals((java.lang.Object) position11);
        java.lang.Class<?> wildcardClass14 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, -1)" + "'", str7, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(52, -1)" + "'", str8, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', (int) (byte) 10);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        int int7 = board4.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = board4.isWinningBoard();
        int int10 = board4.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) int10);
        int int12 = position2.col;
        int int13 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        boolean boolean8 = board1.isFull();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean13 = board12.moveRight();
        boolean boolean14 = board12.moveLeft();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell22 = board19.getCell((int) (byte) 1, (int) (byte) 1);
        board12.setCell(4, 0, cell22);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean28 = board27.moveRight();
        boolean boolean29 = board27.moveLeft();
        boolean boolean30 = board27.moveUp();
        boolean boolean31 = board27.moveLeft();
        boolean boolean32 = board27.moveRight();
        boolean boolean33 = board27.moveUp();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveRight();
        boolean boolean39 = board37.moveLeft();
        boolean boolean40 = board37.moveDown();
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell47 = board44.getCell((int) (byte) 1, (int) (byte) 1);
        board37.setCell(4, 0, cell47);
        board27.setCell(4, (int) '4', cell47);
        board12.setCell(16, (int) (short) 10, cell47);
        board1.setCell((int) (short) 10, 0, cell47);
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board((int) (short) 1, (long) ' ');
        boolean boolean55 = board54.moveRight();
        boolean boolean56 = board1.equals((java.lang.Object) board54);
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        int int6 = board1.getScore();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.Class<?> wildcardClass8 = board7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(12, (long) (byte) -1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(16);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveRight();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        int int12 = board10.getScore();
        boolean boolean13 = board10.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board10.getEmptyPositions();
        boolean boolean15 = board10.isFull();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean20 = board19.moveRight();
        boolean boolean21 = board19.moveLeft();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell28 = board25.getCell((int) (byte) 1, (int) (byte) 1);
        board19.setCell((int) (short) 10, 0, cell28);
        board10.setCell(0, (int) '#', cell28);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(16, (int) (byte) -1, cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (16, -1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cell28);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (-1));
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean7 = position5.equals((java.lang.Object) 1);
        java.lang.String str8 = position5.toString();
        int int9 = position5.col;
        int int10 = position5.col;
        int int11 = position5.row;
        int int12 = position5.row;
        boolean boolean13 = position2.equals((java.lang.Object) int12);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean16 = board15.moveRight();
        int int17 = board15.getScore();
        int int18 = board15.getScore();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean21 = board15.equals((java.lang.Object) board20);
        int int22 = board15.getSize();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean24 = board15.isLosingBoard();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean26 = board25.repOk();
        ar.edu.unrc.game2048.Board.Position position29 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int30 = position29.col;
        int int31 = position29.col;
        int int32 = position29.row;
        int int33 = position29.col;
        java.lang.String str34 = position29.toString();
        java.lang.String str35 = position29.toString();
        boolean boolean36 = board25.equals((java.lang.Object) str35);
        int int37 = board25.getScore();
        boolean boolean38 = position2.equals((java.lang.Object) int37);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(52, -1)" + "'", str8, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(52, -1)" + "'", str34, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(52, -1)" + "'", str35, "(52, -1)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
        java.lang.Class<?> wildcardClass2 = board1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.moveLeft();
        boolean boolean9 = board1.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board1.getEmptyPositions();
        boolean boolean12 = board1.moveUp();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 97) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(16, 1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.moveLeft();
        int int7 = board1.getScore();
        boolean boolean8 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board.Position position14 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 1);
        java.lang.String str15 = position14.toString();
        int int16 = position14.row;
        boolean boolean17 = board11.equals((java.lang.Object) int16);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean23 = board22.moveLeft();
        boolean boolean24 = board22.repOk();
        int int25 = board22.getSize();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean31 = board30.moveRight();
        boolean boolean32 = board30.moveLeft();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell39 = board36.getCell((int) (byte) 1, (int) (byte) 1);
        board30.setCell((int) (short) 10, 0, cell39);
        board26.setCell(0, (int) (byte) 0, cell39);
        boolean boolean42 = board22.equals((java.lang.Object) cell39);
        board11.setCell((int) (short) 0, (int) (short) 1, cell39);
        board1.setCell((int) (short) 1, 35, cell39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, 1)" + "'", str15, "(0, 1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board.Position position3 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 1);
        java.lang.String str4 = position3.toString();
        int int5 = position3.row;
        boolean boolean6 = board0.equals((java.lang.Object) int5);
        boolean boolean7 = board0.isWinningBoard();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 1)" + "'", str4, "(0, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getScore();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', (int) (byte) 10);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        int int7 = board4.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = board4.isWinningBoard();
        int int10 = board4.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) int10);
        java.lang.String str12 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(97, 10)" + "'", str12, "(97, 10)");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.repOk();
        int int9 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell((int) (short) 10, 0, cell10);
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 0, (int) (short) 10);
        boolean boolean15 = board1.moveLeft();
        boolean boolean16 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        int int6 = board1.getScore();
        boolean boolean7 = board1.isLosingBoard();
        boolean boolean8 = board1.isFull();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean3 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean5 = board4.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board4.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveDown();
        int int7 = board1.getSize();
        java.lang.Class<?> wildcardClass8 = board1.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        boolean boolean5 = board1.moveLeft();
        int int6 = board1.getSize();
        boolean boolean7 = board1.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        boolean boolean6 = board4.moveLeft();
        boolean boolean7 = board4.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        boolean boolean8 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board9.moveRight();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: Score: 0?+-----+-----+-----+-----+?|     |     |     |     |?+-----+-----+-----+-----+?|     |     |     |    2|?+-----+-----+-----+-----+?|     |     |     |    2|?+-----+-----+-----+-----+?|     |     |     |    2|?+-----+-----+-----+-----+?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveRight();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        int int6 = board5.getScore();
        boolean boolean7 = board5.isLosingBoard();
        boolean boolean8 = board5.moveLeft();
        int int9 = board5.getSize();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean3 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board6.moveRight();
        boolean boolean8 = board6.moveLeft();
        boolean boolean9 = board6.moveDown();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell16 = board13.getCell((int) (byte) 1, (int) (byte) 1);
        board6.setCell(4, 0, cell16);
        boolean boolean18 = board2.equals((java.lang.Object) cell16);
        boolean boolean19 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.moveUp();
        boolean boolean8 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.moveUp();
        boolean boolean9 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = board4.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = position2.equals((java.lang.Object) board4);
        boolean boolean10 = board4.moveLeft();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        boolean boolean6 = board4.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        int int5 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell((int) (short) 10, 0, cell10);
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 0, (int) (short) 10);
        boolean boolean15 = board1.moveLeft();
        boolean boolean16 = board1.moveLeft();
        boolean boolean17 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board1.moveLeft();
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.isFull();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (long) (short) 10);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(97);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean10 = board9.moveDown();
        boolean boolean11 = board7.equals((java.lang.Object) board9);
        boolean boolean12 = board7.repOk();
        ar.edu.unrc.game2048.Cell cell15 = board7.getCell(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) '#', (int) '#', cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell15);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', (long) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.isLosingBoard();
        boolean boolean5 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell((int) (short) 10, 0, cell10);
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 0, (int) (short) 10);
        boolean boolean15 = board1.moveLeft();
        boolean boolean16 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), (int) (short) 1);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(-1, 1)" + "'", str4, "(-1, 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(-1, 1)" + "'", str5, "(-1, 1)");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (-1));
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.isWinningBoard();
        boolean boolean7 = board5.moveDown();
        boolean boolean8 = board5.moveUp();
        boolean boolean9 = position2.equals((java.lang.Object) board5);
        int int10 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, -1)" + "'", str3, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(32, -1)" + "'", str4, "(32, -1)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        boolean boolean6 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean12 = board11.moveRight();
        int int13 = board11.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board11.getEmptyPositions();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board9.equals((java.lang.Object) boolean15);
        boolean boolean17 = board9.moveDown();
        boolean boolean18 = board9.moveUp();
        boolean boolean19 = board9.isFull();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board6.moveRight();
        int int8 = board6.getScore();
        boolean boolean9 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean12 = board10.equals((java.lang.Object) 100.0d);
        boolean boolean13 = board1.equals((java.lang.Object) board10);
        boolean boolean14 = board10.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 16);
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(35, 32);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveRight();
        int int7 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a', (long) 0);
        boolean boolean6 = position2.equals((java.lang.Object) 'a');
        int int7 = position2.row;
        java.lang.String str8 = position2.toString();
        int int9 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(1, 1)" + "'", str8, "(1, 1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        int int5 = board1.getSize();
        boolean boolean6 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 16);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, (int) (byte) 100);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (short) -1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        int int6 = position2.col;
        int int7 = position2.row;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean13 = board12.moveRight();
        boolean boolean14 = board12.moveLeft();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell21 = board18.getCell((int) (byte) 1, (int) (byte) 1);
        board12.setCell((int) (short) 10, 0, cell21);
        board8.setCell(0, (int) (byte) 0, cell21);
        boolean boolean24 = position2.equals((java.lang.Object) cell21);
        int int25 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean8 = board1.repOk();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveUp();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell16 = board13.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean18 = board13.moveRight();
        boolean boolean19 = board10.equals((java.lang.Object) board13);
        boolean boolean20 = board1.equals((java.lang.Object) boolean19);
        boolean boolean21 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        int int6 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        boolean boolean8 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = position2.equals((java.lang.Object) board4);
        boolean boolean7 = board4.repOk();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean10 = board9.moveRight();
        int int11 = board9.getScore();
        int int12 = board9.getScore();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = board13.isLosingBoard();
        boolean boolean15 = board13.moveUp();
        boolean boolean16 = board13.repOk();
        boolean boolean17 = board4.equals((java.lang.Object) board13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, 10);
        boolean boolean4 = position2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getScore();
        boolean boolean9 = board1.isWinningBoard();
        boolean boolean10 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = board1.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveDown();
        boolean boolean8 = board1.moveRight();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean13 = board12.moveRight();
        int int14 = board12.getScore();
        int int15 = board12.getScore();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean18 = board12.equals((java.lang.Object) board17);
        ar.edu.unrc.game2048.Cell cell21 = board12.getCell((int) ' ', 1);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) -1, (int) (short) 10, cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveRight();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.moveLeft();
        boolean boolean10 = board1.moveRight();
        boolean boolean11 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean3 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean9 = board8.moveRight();
        int int10 = board8.getScore();
        boolean boolean11 = board8.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board8.getEmptyPositions();
        boolean boolean13 = board8.isFull();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean18 = board17.moveRight();
        boolean boolean19 = board17.moveLeft();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell26 = board23.getCell((int) (byte) 1, (int) (byte) 1);
        board17.setCell((int) (short) 10, 0, cell26);
        board8.setCell(0, (int) '#', cell26);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(4, (int) (short) 1, cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell26);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = position2.equals((java.lang.Object) board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean12 = board11.moveRight();
        boolean boolean13 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell20 = board17.getCell((int) (byte) 1, (int) (byte) 1);
        board11.setCell((int) (short) 10, 0, cell20);
        board7.setCell(0, (int) (byte) 0, cell20);
        boolean boolean23 = board7.isLosingBoard();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean25 = position2.equals((java.lang.Object) board7);
        java.lang.String str26 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(52, -1)" + "'", str26, "(52, -1)");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveUp();
        boolean boolean3 = board1.isWinningBoard();
        java.lang.Class<?> wildcardClass4 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveRight();
        boolean boolean6 = board1.moveUp();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        int int12 = board10.getScore();
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = board10.equals(obj13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean16 = board15.hasEmptyCells();
        boolean boolean17 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board15.getCell(4, 16);
        board1.setCell((int) '#', 0, cell20);
        int int22 = board1.getSize();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        int int3 = position2.row;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean6 = board5.moveRight();
        boolean boolean7 = board5.moveLeft();
        boolean boolean8 = board5.moveUp();
        boolean boolean9 = board5.moveUp();
        boolean boolean10 = board5.isLosingBoard();
        boolean boolean11 = position2.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveRight();
        boolean boolean6 = board1.moveUp();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        int int12 = board10.getScore();
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = board10.equals(obj13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean16 = board15.hasEmptyCells();
        boolean boolean17 = board15.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board15.getCell(4, 16);
        board1.setCell((int) '#', 0, cell20);
        boolean boolean23 = board1.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.isWinningBoard();
        int int7 = board1.getScore();
        boolean boolean8 = board1.isWinningBoard();
        boolean boolean9 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        int int6 = position2.col;
        java.lang.String str7 = position2.toString();
        int int8 = position2.row;
        int int9 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, -1)" + "'", str7, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean9 = board8.moveRight();
        int int10 = board8.getScore();
        int int11 = board8.getSize();
        boolean boolean12 = board5.equals((java.lang.Object) board8);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.isWinningBoard();
        int int7 = board1.getScore();
        boolean boolean8 = board1.isWinningBoard();
        boolean boolean9 = board1.moveUp();
        int int10 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (long) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board3.moveLeft();
        boolean boolean5 = board3.isWinningBoard();
        boolean boolean6 = board3.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board3.getEmptyPositions();
        boolean boolean8 = board2.equals((java.lang.Object) board3);
        boolean boolean9 = board2.moveDown();
        int int10 = board2.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.isWinningBoard();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (long) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board3.moveLeft();
        boolean boolean5 = board3.isWinningBoard();
        boolean boolean6 = board3.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board3.getEmptyPositions();
        boolean boolean8 = board2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean14 = board13.moveLeft();
        boolean boolean15 = board13.repOk();
        int int16 = board13.getSize();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean22 = board21.moveRight();
        boolean boolean23 = board21.moveLeft();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell30 = board27.getCell((int) (byte) 1, (int) (byte) 1);
        board21.setCell((int) (short) 10, 0, cell30);
        board17.setCell(0, (int) (byte) 0, cell30);
        boolean boolean33 = board13.equals((java.lang.Object) cell30);
        board2.setCell(35, 0, cell30);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (long) 100);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.moveLeft();
        boolean boolean8 = board6.isWinningBoard();
        boolean boolean9 = board6.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board6.getEmptyPositions();
        boolean boolean11 = board5.equals((java.lang.Object) board6);
        boolean boolean12 = board2.equals((java.lang.Object) board5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell((int) (short) 10, 0, cell10);
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 0, (int) (short) 10);
        boolean boolean15 = board1.moveLeft();
        boolean boolean16 = board1.moveLeft();
        boolean boolean17 = board1.hasEmptyCells();
        boolean boolean18 = board1.moveLeft();
        boolean boolean19 = board1.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell22 = board1.getCell((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 100);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        boolean boolean2 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        int int4 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        int int6 = board1.getScore();
        boolean boolean7 = board1.moveUp();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (short) 1, (long) ' ');
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board1.equals((java.lang.Object) board10);
        boolean boolean13 = board10.moveUp();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board10);
        java.lang.String str15 = board14.toString();
        java.lang.String str16 = board14.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str15, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str16, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, 100);
        boolean boolean9 = position2.equals((java.lang.Object) 100);
        int int10 = position2.col;
        int int11 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        boolean boolean4 = board0.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell11 = board8.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean13 = board8.moveRight();
        boolean boolean14 = board8.isFull();
        boolean boolean15 = board8.isWinningBoard();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell19 = board8.getCell(10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 10, (int) (short) 100, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell19);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean4 = board3.moveDown();
        boolean boolean5 = board1.equals((java.lang.Object) board3);
        boolean boolean6 = board1.repOk();
        boolean boolean7 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        boolean boolean8 = position2.equals((java.lang.Object) (-1.0f));
        int int9 = position2.row;
        int int10 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, -1)" + "'", str5, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell((int) (short) 10, 0, cell10);
        ar.edu.unrc.game2048.Cell cell14 = board1.getCell((int) (short) 0, (int) (short) 10);
        boolean boolean15 = board1.moveLeft();
        boolean boolean16 = board1.moveLeft();
        boolean boolean17 = board1.hasEmptyCells();
        boolean boolean18 = board1.moveLeft();
        boolean boolean19 = board1.isWinningBoard();
        boolean boolean20 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        boolean boolean6 = board4.moveLeft();
        boolean boolean7 = board4.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 1);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (long) ' ');
        boolean boolean3 = board2.isFull();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean4 = board3.moveDown();
        boolean boolean5 = board1.equals((java.lang.Object) board3);
        boolean boolean6 = board3.repOk();
        boolean boolean7 = board3.isLosingBoard();
        boolean boolean8 = board3.moveRight();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, 100L);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), (int) (short) 1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        int int6 = board4.getScore();
        boolean boolean7 = board4.repOk();
        boolean boolean8 = board4.isLosingBoard();
        boolean boolean9 = board4.moveDown();
        boolean boolean10 = board4.moveDown();
        boolean boolean11 = board4.repOk();
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean15 = board14.moveRight();
        int int16 = board14.getScore();
        boolean boolean17 = board14.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board14.getEmptyPositions();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean24 = board23.moveRight();
        boolean boolean25 = board23.moveLeft();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell32 = board29.getCell((int) (byte) 1, (int) (byte) 1);
        board23.setCell((int) (short) 10, 0, cell32);
        board14.setCell(0, (int) '#', cell32);
        boolean boolean35 = position2.equals((java.lang.Object) 0);
        java.lang.String str36 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(-1, 1)" + "'", str36, "(-1, 1)");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '#');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean3 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean12 = board11.repOk();
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int16 = position15.col;
        int int17 = position15.col;
        int int18 = position15.row;
        int int19 = position15.col;
        java.lang.String str20 = position15.toString();
        java.lang.String str21 = position15.toString();
        boolean boolean22 = board11.equals((java.lang.Object) str21);
        boolean boolean23 = board11.moveLeft();
        boolean boolean24 = board11.isLosingBoard();
        int int25 = board11.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(52, -1)" + "'", str20, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(52, -1)" + "'", str21, "(52, -1)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean8 = board1.repOk();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveUp();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell16 = board13.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean18 = board13.moveRight();
        boolean boolean19 = board10.equals((java.lang.Object) board13);
        boolean boolean20 = board1.equals((java.lang.Object) boolean19);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board1);
        int int22 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.moveUp();
        boolean boolean8 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isFull();
        boolean boolean11 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        boolean boolean2 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 0);
        int int3 = position2.col;
        int int4 = position2.col;
        java.lang.Object obj5 = null;
        boolean boolean6 = position2.equals(obj5);
        java.lang.String str7 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(-1, 0)" + "'", str7, "(-1, 0)");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board9.moveDown();
        boolean boolean11 = board9.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        boolean boolean7 = board4.moveUp();
        boolean boolean8 = board4.moveLeft();
        boolean boolean9 = board4.moveRight();
        boolean boolean10 = board4.moveUp();
        boolean boolean11 = board4.moveDown();
        boolean boolean12 = position2.equals((java.lang.Object) board4);
        java.lang.String str13 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, 1)" + "'", str13, "(1, 1)");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, 10L);
        int int3 = board2.getScore();
        boolean boolean4 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, 52);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getScore();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) 1);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getScore();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board6.repOk();
        boolean boolean8 = board6.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean3 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board6.moveRight();
        boolean boolean8 = board6.moveLeft();
        boolean boolean9 = board6.moveDown();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell16 = board13.getCell((int) (byte) 1, (int) (byte) 1);
        board6.setCell(4, 0, cell16);
        boolean boolean18 = board2.equals((java.lang.Object) cell16);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board2.getEmptyPositions();
        boolean boolean20 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) '#', (-1L));
        boolean boolean3 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.repOk();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.moveLeft();
        int int7 = board1.getScore();
        boolean boolean8 = board1.moveLeft();
        boolean boolean9 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        int int6 = position2.col;
        java.lang.String str7 = position2.toString();
        java.lang.String str8 = position2.toString();
        int int9 = position2.col;
        int int10 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, -1)" + "'", str7, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(52, -1)" + "'", str8, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.repOk();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.moveUp();
        boolean boolean8 = board0.moveLeft();
        boolean boolean9 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.moveDown();
        boolean boolean7 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveUp();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        java.lang.String str5 = position2.toString();
        java.lang.String str6 = position2.toString();
        java.lang.String str7 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 4);
        boolean boolean11 = position2.equals((java.lang.Object) 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, -1)" + "'", str5, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(52, -1)" + "'", str6, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, -1)" + "'", str7, "(52, -1)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        boolean boolean9 = board1.moveLeft();
        boolean boolean10 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        int int8 = board7.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        boolean boolean6 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        boolean boolean8 = board1.moveRight();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.repOk();
        int int5 = board2.getSize();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell19 = board16.getCell((int) (byte) 1, (int) (byte) 1);
        board10.setCell((int) (short) 10, 0, cell19);
        board6.setCell(0, (int) (byte) 0, cell19);
        boolean boolean22 = board2.equals((java.lang.Object) cell19);
        ar.edu.unrc.game2048.Board.Position position27 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int28 = position27.col;
        int int29 = position27.col;
        int int30 = position27.row;
        int int31 = position27.col;
        int int32 = position27.row;
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveRight();
        boolean boolean39 = board37.moveLeft();
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell46 = board43.getCell((int) (byte) 1, (int) (byte) 1);
        board37.setCell((int) (short) 10, 0, cell46);
        board33.setCell(0, (int) (byte) 0, cell46);
        boolean boolean49 = position27.equals((java.lang.Object) cell46);
        board2.setCell(0, 0, cell46);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        int int4 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        int int6 = board1.getScore();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        boolean boolean11 = position9.equals((java.lang.Object) 1);
        java.lang.String str12 = position9.toString();
        java.lang.String str13 = position9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) position9);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(52, -1)" + "'", str12, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(52, -1)" + "'", str13, "(52, -1)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean12 = board11.repOk();
        int int13 = board11.getSize();
        boolean boolean14 = board11.isFull();
        boolean boolean15 = board11.isWinningBoard();
        int int16 = board11.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (long) (-1));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.moveUp();
        boolean boolean6 = board1.isLosingBoard();
        int int7 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean8 = board7.moveUp();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean15 = board10.moveRight();
        boolean boolean16 = board7.equals((java.lang.Object) board10);
        boolean boolean17 = position2.equals((java.lang.Object) boolean16);
        java.lang.String str18 = position2.toString();
        int int19 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, -1)" + "'", str5, "(52, -1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(52, -1)" + "'", str18, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean9 = board1.isWinningBoard();
        boolean boolean10 = board1.isFull();
        int int11 = board1.getScore();
        boolean boolean12 = board1.moveLeft();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(10, (long) 100);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(52, (int) (short) 100);
        int int3 = position2.row;
        java.lang.Class<?> wildcardClass4 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell11 = board8.getCell((int) (byte) 1, (int) (byte) 1);
        board1.setCell(4, 0, cell11);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean17 = board16.moveRight();
        boolean boolean18 = board16.moveLeft();
        boolean boolean19 = board16.moveUp();
        boolean boolean20 = board16.moveLeft();
        boolean boolean21 = board16.moveRight();
        boolean boolean22 = board16.moveUp();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean27 = board26.moveRight();
        boolean boolean28 = board26.moveLeft();
        boolean boolean29 = board26.moveDown();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell36 = board33.getCell((int) (byte) 1, (int) (byte) 1);
        board26.setCell(4, 0, cell36);
        board16.setCell(4, (int) '4', cell36);
        board1.setCell(16, (int) (short) 10, cell36);
        int int40 = board1.getSize();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveRight();
        boolean boolean7 = board1.isFull();
        boolean boolean8 = board1.isWinningBoard();
        boolean boolean9 = board1.repOk();
        boolean boolean10 = board1.moveDown();
        boolean boolean11 = board1.moveRight();
        boolean boolean12 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = position2.equals((java.lang.Object) board4);
        boolean boolean7 = board4.repOk();
        boolean boolean8 = board4.repOk();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.moveLeft();
        boolean boolean7 = board4.moveUp();
        boolean boolean8 = board4.moveLeft();
        boolean boolean9 = board4.moveRight();
        boolean boolean10 = board4.moveUp();
        boolean boolean11 = board4.moveDown();
        boolean boolean12 = position2.equals((java.lang.Object) board4);
        int int13 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (long) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board3.moveLeft();
        boolean boolean5 = board3.isWinningBoard();
        boolean boolean6 = board3.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board3.getEmptyPositions();
        boolean boolean8 = board2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board10.moveLeft();
        int int13 = board10.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board10.getEmptyPositions();
        boolean boolean15 = board3.equals((java.lang.Object) board10);
        boolean boolean16 = board10.isWinningBoard();
        boolean boolean17 = board10.repOk();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
        int int2 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell8 = board5.getCell((int) (byte) 1, (int) (byte) 1);
        boolean boolean9 = board5.moveRight();
        boolean boolean10 = board5.moveUp();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean15 = board14.moveRight();
        int int16 = board14.getScore();
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = board14.equals(obj17);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean20 = board19.hasEmptyCells();
        boolean boolean21 = board19.isFull();
        ar.edu.unrc.game2048.Cell cell24 = board19.getCell(4, 16);
        board5.setCell((int) '#', 0, cell24);
        boolean boolean26 = board5.hasEmptyCells();
        boolean boolean27 = board1.equals((java.lang.Object) board5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 0, (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getScore();
        boolean boolean3 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.moveLeft();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.hasEmptyCells();
        java.lang.Class<?> wildcardClass7 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        boolean boolean4 = board1.isWinningBoard();
        boolean boolean5 = board1.isLosingBoard();
        boolean boolean6 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (long) 100);
        boolean boolean10 = board1.equals((java.lang.Object) (byte) 100);
        boolean boolean11 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.row;
        int int6 = position2.col;
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = board7.moveLeft();
        boolean boolean9 = board7.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board7.getEmptyPositions();
        boolean boolean11 = position2.equals((java.lang.Object) positionSet10);
        java.lang.String str12 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(52, -1)" + "'", str12, "(52, -1)");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean3 = board2.isFull();
        boolean boolean4 = board2.isLosingBoard();
        boolean boolean5 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = ar.edu.unrc.game2048.Board.fromString("(-1, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A board must be written as [v1,...,v16]: (-1, 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (-1));
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = position2.equals((java.lang.Object) board4);
        boolean boolean7 = board4.repOk();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(97);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean15 = board14.moveDown();
        boolean boolean16 = board12.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = board20.getCell((int) (byte) 1, (int) (byte) 1);
        board14.setCell(16, 0, cell23);
        // The following exception was thrown during execution in test generation
        try {
            board8.setCell(16, (int) (short) -1, cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (16, -1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell23);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.moveUp();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = board9.moveRight();
        boolean boolean15 = board9.isFull();
        boolean boolean16 = board9.isWinningBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Cell cell20 = board9.getCell(10, (int) '4');
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(1, (long) 0);
        boolean boolean26 = board25.moveLeft();
        boolean boolean27 = board25.repOk();
        int int28 = board25.getSize();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean34 = board33.moveRight();
        boolean boolean35 = board33.moveLeft();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell42 = board39.getCell((int) (byte) 1, (int) (byte) 1);
        board33.setCell((int) (short) 10, 0, cell42);
        board29.setCell(0, (int) (byte) 0, cell42);
        boolean boolean45 = board25.equals((java.lang.Object) cell42);
        board9.setCell(12, 16, cell42);
        board1.setCell((int) (short) 10, (int) (short) 0, cell42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
        int int2 = board1.getSize();
        boolean boolean3 = board1.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean8 = board7.moveRight();
        boolean boolean9 = board7.moveLeft();
        boolean boolean10 = board7.moveDown();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell((int) (byte) 1, (int) (byte) 1);
        board7.setCell(4, 0, cell17);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean23 = board22.moveRight();
        boolean boolean24 = board22.moveLeft();
        boolean boolean25 = board22.moveUp();
        boolean boolean26 = board22.moveLeft();
        boolean boolean27 = board22.moveRight();
        boolean boolean28 = board22.moveUp();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean33 = board32.moveRight();
        boolean boolean34 = board32.moveLeft();
        boolean boolean35 = board32.moveDown();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell42 = board39.getCell((int) (byte) 1, (int) (byte) 1);
        board32.setCell(4, 0, cell42);
        board22.setCell(4, (int) '4', cell42);
        board7.setCell(16, (int) (short) 10, cell42);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) -1, 32, cell42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 32) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(cell42);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (-1));
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, -1)" + "'", str3, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveRight();
        int int3 = board1.getScore();
        int int4 = board1.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean7 = board1.equals((java.lang.Object) board6);
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean12 = board11.moveUp();
        boolean boolean13 = board11.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) (short) 100);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (byte) 1, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board6.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board6.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, (long) (byte) 0);
    }
}

