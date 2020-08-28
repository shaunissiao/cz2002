package tut_2_classes_and_objects;
import java.util.Scanner;

public class DiceApp {

	public static void main(String[] args) {
		
		Dice dice1, dice2;
		dice1 = new Dice(0);
		dice2 = new Dice(0);
		int total=0;
		
		while (true) {
			System.out.println("Press 1 to roll the first dice");
			Scanner sc = new Scanner(System.in);
			
			int key = sc.nextInt();
			
			if (key==1) {
				dice1.setDiceValue();
				dice1.printDiceValue();
				total += dice1.getDiceValue();
			}
				

			System.out.println("Press 2 to roll the first dice");
			key = sc.nextInt();
			
			if (key==2) {
				dice2.setDiceValue();
				dice2.printDiceValue();
				total += dice2.getDiceValue();
			}
			System.out.println("Your total number is: " + total);
		}
		
		
	}
			
		

}


