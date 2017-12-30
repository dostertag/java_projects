/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import productandinventory.product.Product;

/**
 *
 * @author kdost
 */
public class InventoryItems {
    private Map<Product, Integer> inventory;
    private static final String PATH = "src/";
    
    public InventoryItems() {
        inventory = new HashMap<>();
    }
    public void addProductToInventory(Product product) {
        if(inventory.containsKey(product)) {
            inventory.put(product, inventory.get(product) + 1);
        } else {
            inventory.put(product, 1);
        }
    }
    public Integer getQuantity(Product product) {
        return inventory.get(product);
    }
    public void sellProduct(Product product) {
        if(inventory.get(product) - 1 >= 0) {
            inventory.put(product, inventory.get(product) - 1);
        }
    }
    public void setOnHand(Product product, Integer quantity) {
        inventory.put(product, quantity);
    }
    public void printInventory() {
        for(Product p : inventory.keySet()) {
            System.out.println(p.getName() + ": " + Integer.toString(inventory.get(p)));
        }
    }
    public boolean saveInventory() throws IOException {
        String stringToFile = "";
        ObjectMapper mapper = new ObjectMapper();
        final ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        for(Product p : inventory.keySet()) {
            stringToFile += mapper.writeValueAsString(p);
        }
//        mapper.writeValue(stringToFile, inventory);
        
        System.out.println(stringToFile);
        return true;
    }
}
