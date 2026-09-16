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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 0);
        int int3 = position2.row;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(97, 0)" + "'", str5, "(97, 0)");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board3.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 0);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell3 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 1, (int) (short) 0, cell3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        boolean boolean2 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        int int2 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        java.lang.Class<?> wildcardClass3 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, (int) ' ');
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2048 + "'", int3 == 2048);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.lang.String str4 = board0.toString();
        int int5 = board0.getSize();
        boolean boolean6 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        java.lang.Class<?> wildcardClass2 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) (byte) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        java.lang.String str5 = board0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        boolean boolean3 = board0.hasEmptyCells();
        int int4 = board0.getSize();
        ar.edu.unrc.game2048.Cell cell7 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(0, (int) (byte) 1, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 0);
        int int3 = position2.row;
        int int4 = position2.row;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        boolean boolean3 = board0.moveDown();
        java.lang.Object obj4 = null;
        boolean boolean5 = board0.equals(obj4);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell(97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        boolean boolean3 = board0.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board0.getCell(2048, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.moveUp();
        ar.edu.unrc.game2048.Cell cell8 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 100, (int) (short) 0, cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, 1);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 1)" + "'", str3, "(10, 1)");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveRight();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, (int) ' ');
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board3.moveRight();
        boolean boolean5 = board3.moveUp();
        boolean boolean6 = position2.equals((java.lang.Object) boolean5);
        int int7 = position2.row;
        java.lang.String str8 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2048 + "'", int7 == 2048);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(2048, 32)" + "'", str8, "(2048, 32)");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, 1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 0);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position(2048, (int) ' ');
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.moveRight();
        boolean boolean8 = board6.moveUp();
        boolean boolean9 = position5.equals((java.lang.Object) boolean8);
        int int10 = position5.row;
        boolean boolean11 = position2.equals((java.lang.Object) position5);
        int int12 = position5.row;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2048 + "'", int10 == 2048);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        int int5 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        boolean boolean3 = board0.moveDown();
        java.lang.Object obj4 = null;
        boolean boolean5 = board0.equals(obj4);
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 4);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        boolean boolean2 = board0.moveUp();
        int int3 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.lang.Class<?> wildcardClass4 = positionSet3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, (int) ' ');
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board3.moveRight();
        boolean boolean5 = board3.moveUp();
        boolean boolean6 = position2.equals((java.lang.Object) boolean5);
        int int7 = position2.row;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        boolean boolean9 = board8.moveRight();
        boolean boolean10 = position2.equals((java.lang.Object) boolean9);
        int int11 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2048 + "'", int7 == 2048);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        java.lang.String str3 = board0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board0.getCell(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        boolean boolean2 = board0.moveUp();
        java.lang.String str3 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveRight();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        boolean boolean3 = board2.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board2.getEmptyPositions();
        boolean boolean5 = board2.moveUp();
        boolean boolean6 = board2.moveLeft();
        boolean boolean7 = board0.equals((java.lang.Object) board2);
        java.lang.Class<?> wildcardClass8 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', (-1));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        int int5 = board0.getSize();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, (int) (short) 10);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        boolean boolean2 = board0.moveLeft();
        ar.edu.unrc.game2048.Cell cell5 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(0, (int) (byte) 1, cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        boolean boolean2 = board0.moveUp();
        int int3 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        java.lang.String str3 = board0.toString();
        boolean boolean4 = board0.isWinningBoard();
        int int5 = board0.getSize();
        boolean boolean6 = board0.moveLeft();
        int int7 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        int int3 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 100);
        boolean boolean2 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 0);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position(2048, (int) ' ');
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.moveRight();
        boolean boolean8 = board6.moveUp();
        boolean boolean9 = position5.equals((java.lang.Object) boolean8);
        boolean boolean10 = position2.equals((java.lang.Object) boolean9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str5 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 10);
        boolean boolean2 = board1.isWinningBoard();
        boolean boolean3 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2048);
        int int2 = board1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2048 + "'", int2 == 2048);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 0);
        int int3 = position2.row;
        int int4 = position2.row;
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str5 = board4.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        java.lang.String str3 = board0.toString();
        boolean boolean4 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) 1);
        ar.edu.unrc.game2048.Board.Direction direction3 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean4 = position2.equals((java.lang.Object) direction3);
        org.junit.Assert.assertTrue("'" + direction3 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction3.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        int int5 = board0.getSize();
        boolean boolean6 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveLeft();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        java.lang.Class<?> wildcardClass6 = positionSet5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveRight();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = board3.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean7 = board3.isLosingBoard();
        boolean boolean8 = board0.equals((java.lang.Object) boolean7);
        boolean boolean9 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, 1);
        int int3 = position2.col;
        boolean boolean5 = position2.equals((java.lang.Object) 97);
        java.lang.String str6 = position2.toString();
        int int7 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(10, 1)" + "'", str6, "(10, 1)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        int int2 = board0.getScore();
        boolean boolean3 = board0.moveDown();
        int int4 = board0.getSize();
        java.lang.Class<?> wildcardClass5 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isLosingBoard();
        boolean boolean2 = board0.moveUp();
        java.lang.Class<?> wildcardClass3 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 0);
        int int3 = position2.row;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 0);
        java.lang.String str7 = position2.toString();
        int int8 = position2.col;
        int int9 = position2.col;
        int int10 = position2.row;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(2048);
        boolean boolean13 = position2.equals((java.lang.Object) 2048);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(97, 0)" + "'", str7, "(97, 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

