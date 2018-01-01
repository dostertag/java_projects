package productandinventory.userInterface;

import java.io.Reader;
import java.util.Scanner;

public class TextUserInterface {
	private Scanner reader;
	private static final String HEADER = "====DANIEL's INVENTORY APP====\n\n";
	private static final String[] MENU_LIST = { "See what's on hand", "See products we carry", "Add an item to the possible items list", "Make a sale", "Exit" };
	
	public TextUserInterface() {
		reader = new Scanner(System.in);
	}
	
	public void start() {
		boolean exit = false;
		String userInput = "";
		System.out.println(HEADER);
		while(!exit) {
			printMenuList();
			switch(userInput) {
			case "1":
				checkInventory();
				break;
			case "2":
				seeProducts();
				break;
			case "3":
				addItem();
				break;
			case "4":
				purchase();
				break;
			case "5":
				exit = true;
			default:
				System.out.println("Sorry, I didn't recognize that input.  Try again");
				break;
			}
		}
	}
	private void purchase() {
		// TODO Auto-generated method stub
		
	}

	private void addItem() {
		// TODO Auto-generated method stub
		
	}

	private void seeProducts() {
		// TODO Auto-generated method stub
		
	}

	private void checkInventory() {
		// TODO Auto-generated method stub
		
	}

	public static void printMenuList() {
/*		String listToSingleString = String.join("\n", MENU_LIST);
		System.out.println(listToSingleString);*/
		for(int i = 0; i < MENU_LIST.length; i++) {
			System.out.println((i + 1) + " " + MENU_LIST[i]);
		}
	}
}
