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
    
} // Game class
