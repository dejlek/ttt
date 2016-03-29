package org.lekic.ttt;

import java.util.ArrayList;

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
            move = computerMove();
        } else {
            move = humanMove();
        }
    }
    
    public boolean isValid(String argMove) {
        int x = 0 + argMove.charAt(0) - 'A';
        int y = Integer.parseInt("" + argMove.charAt(1)) - 1;
 
        return (x < 3 && x >=0 && y < 3 && y >= 0);
    }
    
    public String computerMove() { 
        return "";
    }
    
    public String humanMove() { 
        return "";
    }
    
} // Game class
