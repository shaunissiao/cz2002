package tut3;
import java.util.Scanner;
public class VendingMachine {
	Scanner sc = new Scanner(System.in);
	
	// constructor
	public VendingMachine() {}
	
	
	
	// get the drink selection, and return the cost of the drink
	public double selectDrink() {
		double drinkCost=0;
		int choice;
		choice = sc.nextInt();
		switch (choice) {
			case 1: 
				drinkCost = 3;
				break;
			
			case 2: 
				drinkCost = 1;
				break;
			
			case 3: 
				drinkCost = 5;
				break;
		}
	
		return drinkCost;
		
	}
	
	
	
	
	// insert the coins and returns the amount inserted
	public double insertCoins(double drinkCost) {
		double amount = 0, total=0;
		char choice;
		System.out.println("Please insert coins:\r\n" + 
				"========== Coins Input ===========\r\n" + 
				"|Enter 'Q' for ten cents input |\r\n" + 
				"|Enter 'T' for twenty cents input|\r\n" +
				"|Enter 'F' for fifty cents input |\r\n" +
				"|Enter 'N' for a dollar input |\r\n" + 
				"==================================");
	
		
		while (total<drinkCost) {
			choice = sc.next().charAt(0);
			switch (choice) {
			case 'Q':
				amount=0.1;
				break;
			
			case 'T':
				amount=0.2;
				break;
				
			case 'F':
				amount=0.5;
				break;
				
			case 'N':
				amount=1;
				break;
			}
			
			total+=amount;
			System.out.print("Coins inserted: ");
			System.out.printf("%.2f\n", total);
		}
		
		return total;
	}
	
	
	
	// check the change and print the change on screen
	public void checkChange(double amount, double drinkCost) {
		double change;
		change = amount - drinkCost;
		System.out.println("Change: $" + String.format("%.2f", change));
	}
	
	
	
	// print the receipt and collect the drink
	public void printReceipt(){
		System.out.println("Please collect your drink\n" + "Thank you!!");
	}

}
