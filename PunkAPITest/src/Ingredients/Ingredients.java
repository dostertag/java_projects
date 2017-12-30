/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingredients;

import Amount.Amount;

/**
 *
 * @author kdost
 */
public class Ingredients {
    private Hops hops;
    private String yeast;
    private Malts malts;
    
    public Ingredients() {
        
    }
    public Hops getHops() { return hops; }
    public void setHops(Hops hops) { this.hops = hops; }
    public String getYeast() { return yeast; }
    public void setYeast(String yeast) { this.yeast = yeast; }
    public Malts getMalts() { return malts; }
    public void setMalts(Malts malts) { this.malts = malts; }
    
}
