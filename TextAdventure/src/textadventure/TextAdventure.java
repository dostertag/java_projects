/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import textadventure.TextInterface.TextInterface;

/**
 *
 * @author kdost
 */
public class TextAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextInterface currentGame = new TextInterface();
        currentGame.start();
    }
    
}
