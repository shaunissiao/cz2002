package tut3;

public class VendingMachineApp {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		System.out.println("====== Vending Machine ======\r\n" + 
				"|1. Buy Beer ($3.00) |\r\n" + 
				"|2. Buy Coke ($1.00) |\r\n" + 
				"|3. Buy Green Tea ($5.00) |\r\n" + 
				"|============================");
		System.out.println("Please enter selection:");
		double drinkCost = vm.selectDrink();
		double amount = vm.insertCoins(drinkCost);
		vm.checkChange(amount, drinkCost);
		vm.printReceipt();
	}

}
