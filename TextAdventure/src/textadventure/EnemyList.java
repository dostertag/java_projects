/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import java.util.ArrayList;
import java.util.List;
import textadventure.Player.Enemy;

/**
 *
 * @author kdost
 */
public class EnemyList {
    private int numEnemies;
    private List<Enemy> enemyList;
    
    public EnemyList() {
        enemyList = new ArrayList<>();
    }
    public void populateEnemies(int numEnemies) {
        this.numEnemies = numEnemies;
        for(int i = 0; i < this.numEnemies; i++) {
            enemyList.add(new Enemy());
        }
    }
    public int getNumberOfEnemies() {
        return enemyList.size();
    }
    public List<Enemy> getEnemies() {
        return this.enemyList;
    }
    @Override
    public String toString() {
        String enemees = "";
        for(int i = 0; i < enemyList.size(); i++) {
            Enemy temp = enemyList.get(i);
            enemees += "Enemy " + (i + 1) + "\t\tRemaining Health: " + temp.getHealth() + "\n";
        }
        return enemees;
    }
    public boolean enemyIsAlive() {
        return enemyList.stream().anyMatch((e) -> (e.isAlive()));
    }
    public Enemy getEnemy(int index) {
        return enemyList.get(index - 1);
    }
}
