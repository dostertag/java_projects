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
public class Enemy extends LivingThing {
    
    private static final int ENEMY_DAMAGE = 15;
    private static final double CHANCE_TO_HIT = 0.5;

    public Enemy() {
        super(ENEMY_DAMAGE, CHANCE_TO_HIT);
    }
}
