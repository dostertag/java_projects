/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingredients;

import Amount.Amount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kdost
 */
public class Malt {
    private List<Malts> malt;
    
    public Malt() {
        this.malt = new ArrayList<>();
    }
    public List<Malts> getMalt() {
        return malt;
    }
    public void setMalt(List<Malts> malts) {
        this.malt = malts;
    }
}
