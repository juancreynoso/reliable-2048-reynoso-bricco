package ar.edu.unrc.game2048;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainCLITest {

    /** Plays a game from {@code board} with the given keys and returns everything printed. */
    private static String play(String board, String keys) {
        InputStream in = System.in;
        PrintStream out = System.out;
        ByteArrayOutputStream printed = new ByteArrayOutputStream();
        try {
            System.setIn(new ByteArrayInputStream(keys.getBytes()));
            System.setOut(new PrintStream(printed));
            new MainCLI(Board.fromString(board)).play();
        } finally {
            System.setIn(in);
            System.setOut(out);
        }
        return printed.toString();
    }

    private static int count(String text, String word) {
        return text.split(word, -1).length - 1;
    }

    // Found by the fuzzing campaign with the game model: once 2048 was on the board,
    // the congratulations were printed again on every turn.
    @Test
    public void theWinMessageIsShownOnlyOnce() {
        String output = play("[1024,1024,0,0,0,0,0,0,0,0,0,0,0,0,0,0]", "a\nd\na\nd\nq\n");

        assertEquals(1, count(output, "Congratulations"));
    }

    // Found by the time-based fuzzing campaign: the game crashed when the input
    // ended without "q".
    @Test
    public void theGameEndsNormallyWhenTheInputEndsWithoutQ() {
        String output = play("[2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]", "d\n");

        assertTrue(output.contains("End of input"));
    }

    @Test
    public void invalidKeysDoNotMoveTheBoard() {
        String output = play("[2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]", "x\nq\n");

        assertTrue(output.contains("Invalid input"));
        assertEquals(2, count(output, "Score: 0"));
    }
}
