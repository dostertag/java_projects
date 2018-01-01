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
import productandinventory.userInterface.TextUserInterface;
import productandinventory.userInterface.textUserInterface;

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
    	TextUserInterface textInterface = new TextUserInterface();
    	textInterface.start();
    }
    
}
