/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amount;

/**
 *
 * @author kdost
 */
public class Amount {
    private String unit;
    private double value;
    
    public Amount(String unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }
    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }
}
