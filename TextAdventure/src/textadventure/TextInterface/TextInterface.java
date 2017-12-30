/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure.TextInterface;

import GameController.GameController;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import textadventure.EnemyList;
import textadventure.Player.Enemy;
import textadventure.Player.Player;

/**
 *
 * @author kdost
 */
public class TextInterface {
    private Scanner reader = new Scanner(System.in);
    private List<Player> players;
    private EnemyList enemyList;
    private GameController game;
    
    public TextInterface() {
        players = new ArrayList<>();
        enemyList = new EnemyList();
        
    }

    public void start() {
        String temp1 = "";
        String temp2 = "";
        int temp3 = 0;
        System.out.println("Welcome to test arena!");
        System.out.println("Currently, only one round will be played");
        System.out.print("Enter the first player name: ");
        temp1 = reader.nextLine();
        System.out.print("Enter the second player name: ");
        temp2 = reader.nextLine();
        players.add(new Player(temp1));
        players.add(new Player(temp2));
        System.out.print("How many enemies?: ");
        temp3 = reader.nextInt();
        enemyList.populateEnemies(temp3);
        System.out.println("<---------- Match begins! ---------->");
        System.out.println("<----------------------------------->");
        // System.out.println(enemyList);
        play();
    }
    private void play() {
        int currentRound = 1;
        while(playersAlive() && enemyList.enemyIsAlive()) {
            System.out.println("");
            System.out.println("************* Round " + currentRound + " ************");
            System.out.println("");
            round();
            currentRound++;
        }        
    }
    private void round() {
        System.out.println(enemyList);
        playerTurns();
        enemyTurns();
    }
    private boolean playersAlive() {
        for(Player p : players) {
            if(p.isAlive()) {
                return true;
            }
        }
        return false;
    }
    private void playerTurns() {
        for(Player p : players) {
            System.out.println("<-------------- " + p.getName() + "'s Turn --------->");
            int playerChoice = 0;
            System.out.print(p.getName() + ": Attack: 1 Defend: 2 ");  
            playerChoice = reader.nextInt();
            if(playerChoice == 1) {
                p.defend(false);
                playerAttack(p);
            } else {
                p.defend(true);
            }
        }
    }
    private void enemyTurns() {
        List<Enemy> someList = enemyList.getEnemies();
        Random rand = new Random();
        for (Enemy e : someList) {
            Player tempPlayer = players.get(rand.nextDouble() > 0.5 ? 0 : 1);
            if(e.attack(tempPlayer)) {
                tempPlayer.takeDamage(e.getStrength());
                System.out.println("Enemy attacked " + tempPlayer.getName() + " for " +
                                    e.getStrength() + " damage!");
            }
            // System.out.println(e.attack(players.get(rand.nextDouble() > 0.5 ? 1 : 2)));
        }
    }
    private void playerAttack(Player p) {
        System.out.print("Attack which enemy?: ");
        int attackThis = reader.nextInt();
        Enemy attackedEnemy = this.enemyList.getEnemy(attackThis);
        if(p.attack(attackedEnemy)) {
            attackedEnemy.takeDamage(p.getStrength());
            System.out.println("Hit! Enemy took " + p.getStrength() + " damage!");
        } else {
            System.out.println("Miss!");
        }
    }

    private void playerDefend(Player p) {
        
    }
}
