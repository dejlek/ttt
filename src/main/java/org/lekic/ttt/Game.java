package org.lekic.ttt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The "Game" class contains the game logic and the data.
 * 
 * @author dejan
 */
public class Game {
    private final String[] players; /// Player names("computer" and "human")
    private final ArrayList<String> history; /// Move history
    private int nextPlayerID; /// The ID of the player who should play next move.
    private final char[][] board; /// The board
    
    /**
     * The default constructor.
     * @param argFirst Name of the player to play first ("computer" or "human").
     */
    public Game(String argFirst) {
        players = new String[2];
        if ("human".equals(argFirst)) {
            players[0] = "human";
            players[1] = "computer";
        } else {
            players[0] = "computer";
            players[1] = "human";
        }
        nextPlayerID = 1; /// Initialised to 1 so when we flip it, it becomes 0.
        history = new ArrayList<>();
        board = new char[][] {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    } // Game constructor
    
    /**
     * Use this method to get the ID of the player that should play next.
     * 
     * @return 0 (first) or 1 (second) player.
     */
    public int next() {
        nextPlayerID = 1 - nextPlayerID;
        return nextPlayerID;
    }
    
    /**
     * Either does a computer move (calls the computerMove method), or asks user to input a new move by calling the
     * humanMove() method.
     */
    public void makeMove() {
        int pid = next(); // get ID of the player who should make move
        String move = "";
        if ("computer".equals(players[pid])) {
            computerMove();
        } else {
            humanMove();
        }
    }
    
    public int getX(String argMove) {
        return 0 + argMove.charAt(0) - 'A';
    }
    
    public int getY(String argMove) {
        return Integer.parseInt("" + argMove.charAt(1)) - 1;
    }
    
    public boolean isValid(String argMove) {
        int x = getX(argMove);
        int y = getY(argMove);
 
        return (x < 3 && x >=0 && y < 3 && y >= 0);
    }
    
    /**
     * Makes a move.
     * @param argMove 
     */
    public void move(String argMove) {
        char what = nextPlayerID == 0 ? 'X' : 'O';
        int x = getX(argMove);
        int y = getY(argMove);
        board[x][y] = what;
        history.add(argMove);
    }
    
    public void computerMove() { 
        // if computer first, we start with "A1" move.
        if (history.isEmpty()) {
            move("A1");
        }
    }
    
    public void humanMove() { 
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        String move = "";
        while (!done) {
            System.out.println("Your move: ");
            move = keyboard.next();
            Game.checkQuit(move); // check whether we should exit prematurely

            if (isValid(move)) {
                done = true;
                move(move);
            }
        } // while
    }
    
    public static void checkQuit(String argInput) {
        if ("quit".equals(argInput)) {
            System.out.println("Exiting the tic-tac-toe game. Good bye!");
            System.exit(0);
        }
    }
    
} // Game class
