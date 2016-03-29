package org.lekic.ttt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class contains the main entry point.
 * @author dejan
 */
public class Main {
    
    public static void main(String args[]) {
        System.out.println("Initial code...");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("'human' (default), or 'computer', or 'quit' to exit: ");
        boolean done = false;
        
        while (!done) {
            String player = keyboard.next();
            
            if ("quit".equals(player)) {
                System.out.println("Exiting the tic-tac-toe game. Good bye!");
                System.exit(0);
            }
            
            if ("human".equals(player) || "computer".equals(player)) {
                Game game = new Game(player);
                game.makeMove();
                done = true;
            }
        } // while
    } // main() method
    
} // Main class
