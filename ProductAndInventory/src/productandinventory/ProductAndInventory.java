/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productandinventory;

import Inventory.InventoryItems;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import productandinventory.product.Product;

/**
 *
 * @author kdost
 */
public class ProductAndInventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InventoryItems test = new InventoryItems();
        test.addProductToInventory(new Product(1, 2.50, "taco", "lovely tacos"));
        test.addProductToInventory(new Product(2, 3.50, "pizza", "lovely pizza"));
        test.addProductToInventory(new Product(3, 4.50, "burger", "lovely burger"));
        test.printInventory();
        test.saveInventory();
        // ObjectMapper mapper = new ObjectMapper();
    }
    
}
