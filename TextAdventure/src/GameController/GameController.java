/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameController;

import java.util.ArrayList;
import java.util.List;
import textadventure.Player.Enemy;
import textadventure.Player.Player;

/**
 *
 * @author kdost
 */
public class GameController {
    private List<Enemy> enemies;
    private List<Player> players;
    
    public GameController() {
        enemies = new ArrayList<>();
        players = new ArrayList<>();
    }
    public void round() {
        playerTurns();
        enemyTurns();
    }
    public void createPlayer(String name) {
        Player newPlayer = new Player(name);
        players.add(newPlayer);
    }
    public void createEnemies(int numEnemys) {
        for(int i = 0; i < numEnemys; i++) {
            Enemy e = new Enemy();
            enemies.add(e);
        }
    }
    private void playerTurns() {
        
    }

    private void enemyTurns() {
    }
    public String getPlayers() {
        String temp = "";
        for(Player p : players) {
            temp += p.getName() + ": Health: " + p.getHealth() + "\n";
        }
        return temp;
    }
}
