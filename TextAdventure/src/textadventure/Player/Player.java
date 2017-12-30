/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure.Player;

/**
 *
 * @author kdost
 */
public class Player extends LivingThing {
    
    private String name;
    private static final int PLAYER_DAMAGE = 20;
    private static final double CHANCE_TO_HIT = 0.6;
    private boolean isDefending;
    
    public Player(String name) {
        super(PLAYER_DAMAGE, CHANCE_TO_HIT);
        this.name = name;
        isDefending = false;
    } 
    public String getName() {
        return name;
    }
    public void defend() {
        isDefending = true;
    }
}
