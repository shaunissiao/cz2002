package tut_2_classes_and_objects;
import java.util.Scanner;

public class DiceApp2 {

	public static void main(String[] args) {
		
		Dice[] dice = new Dice[2];
		Scanner sc = new Scanner(System.in);
		int total=0;
		
		
		for (int i=0; i<2; i++) {
			if (i==0) System.out.println("Press " + (i+1) + " to roll the first dice");
			else if (i==1) System.out.println("Press " + (i+1) + " to roll the second dice");
			int key = sc.nextInt();
			if (key==(i+1)) {
				dice[i] = new Dice(0);
				dice[i].setDiceValue();
				dice[i].printDiceValue();
				total += dice[i].getDiceValue();
			}
			
		}
		
		System.out.println("Your total number is: " + total);
	}
}

		

			
		



