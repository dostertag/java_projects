/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingredients;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kdost
 */
public class Hops {
    private List<Hop> hops;
    public Hops() {
        this.hops = new ArrayList<>();
    }
    public void addHop(Hop hop) { hops.add(hop); }
    public List<Hop> getHops() { return hops; }
    public void setHops(List<Hop> hops) { this.hops = hops; }
}
