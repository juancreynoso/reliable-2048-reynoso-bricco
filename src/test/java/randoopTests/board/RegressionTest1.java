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
        boolean boolean1 = board0.isWinningBoard();
        boolean boolean2 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = board1.getCell(0, 0);
        java.lang.String str5 = board1.toString();
        ar.edu.unrc.game2048.Board.Direction direction6 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean7 = board1.move(direction6);
        boolean boolean8 = board1.isLosingBoard();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.moveUp();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell(0, (int) (byte) 0);
        java.lang.String str17 = cell16.toString();
        int int18 = cell16.getValue();
        int int19 = cell16.getValue();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.isFull();
        ar.edu.unrc.game2048.Cell cell25 = board21.getCell(0, (int) (byte) 0);
        java.lang.String str26 = cell25.toString();
        int int27 = cell25.getValue();
        int int28 = cell25.getValue();
        java.lang.String str29 = cell25.toString();
        int int30 = cell25.getValue();
        java.lang.String str31 = cell25.toString();
        boolean boolean32 = cell16.canMergeWith(cell25);
        int int33 = cell25.getValue();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board34);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board35.getEmptyPositions();
        boolean boolean37 = board35.isLosingBoard();
        boolean boolean38 = board35.moveUp();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board35);
        boolean boolean40 = cell25.equals((java.lang.Object) board39);
        boolean boolean41 = board1.equals((java.lang.Object) board39);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction6 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction6.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        java.lang.String str4 = board0.toString();
        java.lang.Class<?> wildcardClass5 = board0.getClass();
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveUp();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveRight();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean6 = board1.moveDown();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        boolean boolean10 = board9.moveDown();
        boolean boolean11 = board9.moveDown();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
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
        int int27 = cell26.getValue();
        java.lang.Object obj28 = null;
        boolean boolean29 = cell26.equals(obj28);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell30 = cell20.mergeWith(cell26);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        java.lang.String str6 = cell5.toString();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        java.lang.String str9 = cell5.toString();
        int int10 = cell5.getValue();
        int int11 = cell5.getValue();
        int int12 = cell5.getValue();
        java.lang.String str13 = cell5.toString();
        boolean boolean14 = cell5.isEmpty();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board22.isFull();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board27);
        boolean boolean29 = board28.isFull();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell(0, (int) (byte) 0);
        boolean boolean33 = cell26.canMergeWith(cell32);
        boolean boolean34 = cell20.canMergeWith(cell26);
        boolean boolean35 = cell26.isEmpty();
        boolean boolean36 = cell5.canMergeWith(cell26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell(0, (int) (byte) 0);
        boolean boolean12 = cell5.canMergeWith(cell11);
        java.lang.Class<?> wildcardClass13 = cell5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        boolean boolean16 = board9.isFull();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board9);
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
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        long long5 = board1.getScore();
        boolean boolean6 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell7 = null;
        // The following exception was thrown during execution in test generation
        try {
            board4.setCell((int) (byte) 10, 0, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        boolean boolean6 = board1.equals((java.lang.Object) "0|[1-9][0-9]{0,5}");
        boolean boolean7 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = board9.getCell(0, 0);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) board9);
        boolean boolean15 = board9.moveLeft();
        boolean boolean16 = board9.isLosingBoard();
        int int17 = board9.getSize();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        boolean boolean13 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (int) ' ');
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell6 = board3.getCell(0, 0);
        boolean boolean7 = board3.isFull();
        boolean boolean8 = cell1.equals((java.lang.Object) board3);
        boolean boolean9 = board3.moveUp();
        boolean boolean10 = board3.moveLeft();
        java.lang.String str11 = board3.toString();
        int int12 = board3.getSize();
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str11, "Score: 4\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell6 = board3.getCell(0, 0);
        boolean boolean7 = board3.isFull();
        boolean boolean8 = cell1.equals((java.lang.Object) board3);
        boolean boolean9 = board3.moveDown();
        boolean boolean10 = board3.isLosingBoard();
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        int int7 = board6.getSize();
        boolean boolean8 = board6.isLosingBoard();
        boolean boolean9 = board6.moveUp();
        java.lang.Class<?> wildcardClass10 = board6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        int int5 = board1.getSize();
        boolean boolean6 = board1.moveDown();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.String str3 = board2.toString();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        boolean boolean7 = board5.isFull();
        boolean boolean8 = board5.moveDown();
        int int9 = board5.getSize();
        java.lang.String str10 = board5.toString();
        ar.edu.unrc.game2048.Board.Direction direction11 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean12 = board5.move(direction11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        boolean boolean16 = board14.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction18 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean19 = board14.move(direction18);
        boolean boolean20 = board5.move(direction18);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean23 = board21.isWinningBoard();
        int int24 = board21.getSize();
        ar.edu.unrc.game2048.Board.Direction direction25 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean26 = board21.move(direction25);
        boolean boolean27 = board5.move(direction25);
        boolean boolean28 = board2.move(direction25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+\n|     |    2|\n+-----+-----+\n|     |    2|\n+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+\n|     |    2|\n+-----+-----+\n|     |    2|\n+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction11.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction18.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + direction25 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction25.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        long long5 = board4.getScore();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isLosingBoard();
        boolean boolean4 = board1.moveUp();
        long long5 = board1.getScore();
        boolean boolean6 = board1.isLosingBoard();
        boolean boolean7 = board1.isWinningBoard();
        boolean boolean8 = board1.moveLeft();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board9.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet16);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 0);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (short) 100);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        boolean boolean47 = board1.moveLeft();
        boolean boolean48 = board1.moveDown();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell(0, (int) (byte) 0);
        boolean boolean21 = cell14.canMergeWith(cell20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        boolean boolean25 = board23.isFull();
        boolean boolean26 = board23.moveDown();
        boolean boolean27 = board23.isWinningBoard();
        boolean boolean28 = board23.moveLeft();
        boolean boolean29 = board23.isWinningBoard();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell(0, (int) (byte) 0);
        boolean boolean37 = cell35.equals((java.lang.Object) 100.0f);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board38);
        boolean boolean40 = board39.isFull();
        ar.edu.unrc.game2048.Cell cell43 = board39.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(board39);
        boolean boolean45 = cell35.equals((java.lang.Object) board44);
        boolean boolean46 = board23.equals((java.lang.Object) board44);
        boolean boolean47 = cell14.equals((java.lang.Object) board23);
        boolean boolean48 = board6.equals((java.lang.Object) cell14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (short) 10);
        boolean boolean12 = position10.equals((java.lang.Object) 10.0f);
        int int13 = position10.col;
        boolean boolean15 = position10.equals((java.lang.Object) 0);
        int int16 = position10.row;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        ar.edu.unrc.game2048.Cell cell21 = board18.getCell(0, 0);
        java.lang.String str22 = board18.toString();
        long long23 = board18.getScore();
        boolean boolean24 = position10.equals((java.lang.Object) board18);
        boolean boolean25 = board1.equals((java.lang.Object) position10);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        int int28 = board27.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board27.getEmptyPositions();
        boolean boolean30 = board1.equals((java.lang.Object) board27);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str22, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getSize();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean5 = board0.move(direction4);
        boolean boolean7 = board0.equals((java.lang.Object) "]");
        boolean boolean8 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.moveDown();
        boolean boolean6 = board1.moveUp();
        boolean boolean7 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.moveLeft();
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
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(0, 10, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        java.lang.String str6 = board1.toString();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean8 = board1.move(direction7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        boolean boolean12 = board10.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board10.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction14 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean15 = board10.move(direction14);
        boolean boolean16 = board1.move(direction14);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board17.isWinningBoard();
        int int20 = board17.getSize();
        ar.edu.unrc.game2048.Board.Direction direction21 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean22 = board17.move(direction21);
        boolean boolean23 = board1.move(direction21);
        java.lang.Class<?> wildcardClass24 = board1.getClass();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction14.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + direction21 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction21.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isLosingBoard();
        long long7 = board1.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        int int10 = board9.getSize();
        boolean boolean11 = board9.moveLeft();
        long long12 = board9.getScore();
        boolean boolean13 = board9.isFull();
        java.lang.String str14 = board9.toString();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board15.isWinningBoard();
        int int18 = board15.getSize();
        ar.edu.unrc.game2048.Board.Direction direction19 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean20 = board15.move(direction19);
        boolean boolean21 = board9.move(direction19);
        boolean boolean22 = board1.move(direction19);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board25.getEmptyPositions();
        boolean boolean27 = board25.isFull();
        boolean boolean28 = board25.moveDown();
        int int29 = board25.getSize();
        boolean boolean30 = board25.isLosingBoard();
        long long31 = board25.getScore();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board32);
        int int34 = board33.getSize();
        boolean boolean35 = board33.moveLeft();
        long long36 = board33.getScore();
        boolean boolean37 = board33.isFull();
        java.lang.String str38 = board33.toString();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board39);
        boolean boolean41 = board39.isWinningBoard();
        int int42 = board39.getSize();
        ar.edu.unrc.game2048.Board.Direction direction43 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean44 = board39.move(direction43);
        boolean boolean45 = board33.move(direction43);
        boolean boolean46 = board25.move(direction43);
        boolean boolean47 = board25.isFull();
        boolean boolean48 = board1.equals((java.lang.Object) boolean47);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + direction19 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction19.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str38, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + direction43 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction43.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        boolean boolean18 = board9.hasEmptyCells();
        boolean boolean19 = board9.moveLeft();
        boolean boolean20 = board9.moveDown();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(131072, 0);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        int int16 = cell5.getValue();
        int int17 = cell5.getValue();
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
        java.lang.String str41 = cell29.toString();
        java.lang.String str42 = cell29.toString();
        boolean boolean43 = cell5.canMergeWith(cell29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        int int6 = cell5.getValue();
        int int7 = cell5.getValue();
        int int8 = cell5.getValue();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 10);
        java.lang.String str12 = position11.toString();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell(0, 0);
        boolean boolean18 = position11.equals((java.lang.Object) cell17);
        int int19 = cell17.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = cell5.mergeWith(cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(97, 10)" + "'", str12, "(97, 10)");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board1.getEmptyPositions();
        java.lang.String str5 = board1.toString();
        boolean boolean6 = board1.isWinningBoard();
        boolean boolean7 = board1.isLosingBoard();
        boolean boolean8 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean5 = board0.move(direction4);
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board16);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board16);
        ar.edu.unrc.game2048.Board.Direction direction23 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean24 = board16.move(direction23);
        boolean boolean25 = board1.move(direction23);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + direction23 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction23.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell5 = board1.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isLosingBoard();
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        boolean boolean12 = board10.isFull();
        boolean boolean13 = board10.moveDown();
        int int14 = board10.getSize();
        boolean boolean15 = board10.isLosingBoard();
        long long16 = board10.getScore();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        int int19 = board18.getSize();
        boolean boolean20 = board18.moveLeft();
        long long21 = board18.getScore();
        boolean boolean22 = board18.isFull();
        java.lang.String str23 = board18.toString();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean26 = board24.isWinningBoard();
        int int27 = board24.getSize();
        ar.edu.unrc.game2048.Board.Direction direction28 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        boolean boolean29 = board24.move(direction28);
        boolean boolean30 = board18.move(direction28);
        boolean boolean31 = board10.move(direction28);
        boolean boolean32 = board1.move(direction28);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(board35);
        boolean boolean37 = board36.isFull();
        ar.edu.unrc.game2048.Cell cell40 = board36.getCell(0, (int) (byte) 0);
        java.lang.String str41 = cell40.toString();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell cell45 = board42.getCell(1, 0);
        boolean boolean46 = cell40.canMergeWith(cell45);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(board47);
        boolean boolean49 = board48.isFull();
        ar.edu.unrc.game2048.Cell cell52 = board48.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board(board48);
        boolean boolean54 = board48.moveLeft();
        long long55 = board48.getScore();
        boolean boolean56 = cell45.equals((java.lang.Object) long55);
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board58 = new ar.edu.unrc.game2048.Board(board57);
        boolean boolean59 = board58.isFull();
        ar.edu.unrc.game2048.Cell cell62 = board58.getCell(0, (int) (byte) 0);
        java.lang.String str63 = cell62.toString();
        int int64 = cell62.getValue();
        int int65 = cell62.getValue();
        ar.edu.unrc.game2048.Board board66 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board67 = new ar.edu.unrc.game2048.Board(board66);
        boolean boolean68 = board67.isFull();
        ar.edu.unrc.game2048.Cell cell71 = board67.getCell(0, (int) (byte) 0);
        java.lang.String str72 = cell71.toString();
        int int73 = cell71.getValue();
        int int74 = cell71.getValue();
        java.lang.String str75 = cell71.toString();
        int int76 = cell71.getValue();
        java.lang.String str77 = cell71.toString();
        boolean boolean78 = cell62.canMergeWith(cell71);
        boolean boolean79 = cell45.equals((java.lang.Object) cell62);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(10, 2, cell45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 2) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str23, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction28.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(cell62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "." + "'", str63, ".");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(cell71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "." + "'", str72, ".");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "." + "'", str75, ".");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "." + "'", str77, ".");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
        ar.edu.unrc.game2048.Board.Direction direction34 = ar.edu.unrc.game2048.Board.Direction.UP;
        boolean boolean35 = board31.move(direction34);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell38 = board31.getCell(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + direction34 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction34.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean5 = board0.move(direction4);
        boolean boolean6 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean8 = board7.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isFull();
        boolean boolean4 = board1.moveDown();
        boolean boolean5 = board1.isWinningBoard();
        boolean boolean6 = board1.moveLeft();
        boolean boolean7 = board1.isWinningBoard();
        java.lang.String str8 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 4\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, (int) (short) 0);
    }
}

