package ar.edu.unrc.game2048;

import java.util.Scanner;

/**
 * Command-line interface for the 2048 game.
 * 
 * This class handles user input and displays the board state.
 * It demonstrates how to use the Board class and its methods.
 */
public class MainCLI {
    private final Board board;
    private final Scanner scanner;
    private boolean congratulated = false;
    
    public MainCLI() {
        this(new Board(Board.DEFAULT_SIZE, seed()));
    }

    /**
     * Starts the game from a given board instead of a random one.
     *
     * @param board the initial board
     */
    public MainCLI(Board board) {
        this.board = board;
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Main game loop.
     */
    public void play() {
        System.out.println("=== 2048 Game ===");
        System.out.println("Controls: W(up), S(down), A(left), D(right), Q(quit)");
        System.out.println();
        
        while (true) {
            displayBoard();
            
            // Congratulate only once: the board stays winning after 2048 is reached
            if (board.isWinningBoard() && !congratulated) {
                congratulated = true;
                System.out.println("🎉 Congratulations! You reached 2048! 🎉");
                System.out.println("You can continue playing or quit.");
            }
            
            if (board.isLosingBoard()) {
                System.out.println("💀 Game Over! No more moves available. 💀");
                System.out.println("Final score: " + board.getScore());
                break;
            }
            
            System.out.print("Enter move: ");
            // Found by the time-based fuzzing campaign: when stdin ended without
            // "q", nextLine() threw NoSuchElementException. End of input now quits.
            if (!scanner.hasNextLine()) {
                System.out.println();
                System.out.println("End of input. Final score: " + board.getScore());
                break;
            }
            String input = scanner.nextLine().trim().toUpperCase();
            
            if (input.equals("Q")) {
                System.out.println("Thanks for playing! Final score: " + board.getScore());
                break;
            }
            
            Board.Direction direction = direction(input);
            if (direction == null) {
                System.out.println("Invalid input! Use W, A, S, D, or Q.");
                continue;
            }
            boolean moved = board.move(direction);

            if (moved) {
                System.out.println("Tile moved!");
            } else {
                System.out.println("No tiles moved. Try a different direction.");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    /**
     * The direction of a move key (W, A, S, D), or null if the key is not a move.
     */
    private static Board.Direction direction(String key) {
        switch (key) {
            case "W": return Board.Direction.UP;
            case "S": return Board.Direction.DOWN;
            case "A": return Board.Direction.LEFT;
            case "D": return Board.Direction.RIGHT;
            default:  return null;
        }
    }

    /**
     * Displays the current board state.
     */
    private void displayBoard() {
        System.out.println(board);
    }

    /**
     * Seed of a new random game: a new one on every run, or -Dseed=N to replay a game.
     */
    private static long seed() {
        return Long.getLong("seed", System.nanoTime());
    }

    /**
     * Runs the game. An optional argument gives the initial board, e.g.
     * "[0,0,0,0,4,2,0,0,0,0,0,0,2,2,2,2]"; without it the board is random.
     */
    public static void main(String[] args) {
        Board board;
        try {
            board = args.length > 0 ? Board.fromString(args[0]) : new Board(Board.DEFAULT_SIZE, seed());
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid board: " + e.getMessage());
            System.exit(2);
            return;
        }
        MainCLI game = new MainCLI(board);
        game.play();
    }
}
