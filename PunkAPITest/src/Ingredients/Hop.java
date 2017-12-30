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
class Hop {
    private Amount amount;
    private String name;
    private String attribute;
    private String add;
    
    public Hop(Amount amount, String name, String attribute, String add) {
        this.amount = amount;
        this.name = name;
        this.attribute = attribute;
        this.add = add;
    }
    public void setAmount(Amount amount) {
        this.amount = amount;
    }
    public Amount getAmount() { return this.amount; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setAttribute(String attribute) { this.attribute = attribute; }
    public String getAttribute() { return attribute; }
    public String getAdd() { return this.add; }
    public void setAdd(String add) { this.add = add; }
}
 
