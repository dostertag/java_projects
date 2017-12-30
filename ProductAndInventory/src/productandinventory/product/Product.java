/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productandinventory.product;

/**
 *
 * @author kdost
 */
public class Product {
    
    private int id;
    private double price;
    private String name;
    private String description;
    
    public Product(int id, double price, String name, String description) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Product(int id, double price) {
        this(id, price, "", "");
    }
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
