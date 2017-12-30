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
public class Malts {
    private String name;
    private Amount amount;
    
    public Malts(String name, Amount amount) {
        this.name = name;
        this.amount = amount;
    } 
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public Amount getAmount() { return this.amount; }
    public void setAmount(Amount amount) { this.amount = amount; }
}
