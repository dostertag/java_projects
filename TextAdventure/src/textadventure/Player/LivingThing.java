/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure.Player;

import java.util.Random;

/**
 *
 * @author kdost
 */
public abstract class LivingThing {
    int health;
    private int strength;
    private int dex;
    private int magicPoints;
    private boolean stillAlive;
    private double chanceToHit;
    private Random rand;
    private boolean defend;
    
    public LivingThing(int strength, double chanceHit) {
        health = 100;
        this.strength = 50;
        dex = 10;
        magicPoints = 10;
        stillAlive = true;
        chanceToHit = chanceHit;
        rand = new Random();
    }
    public boolean attack(LivingThing thing) {
        double thisChance = rand.nextDouble();
        return thisChance <= this.chanceToHit;
    } 
    public int takeDamage(int damage) {
        if(!this.defend) {
            if(health - damage > 0) {
                health -= damage;
            } else {
                health = 0;
                die();
            }  
        }
        return health;
    }
    
    public boolean isAlive() {
        return stillAlive;
    }
    void die() {
        stillAlive = false;
    }
    public int getHealth() {
        return health;
    }
    public double getThaco() {
        return chanceToHit;
    }
    public int getStrength() {
        return strength;
    }
    public void defend(boolean value) {
        defend = value;
    }
}
