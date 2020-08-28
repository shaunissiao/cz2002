package tut_2_classes_and_objects;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		int option;
		System.out.println(
				"==== Circle Computation =====\r\n" + 
				"|1. Create a new circle      |\r\n" + 
				"|2. Print Area               |\r\n" + 
				"|3. Print circumference      |\r\n" + 
				"|4. Quit                     |\r\n" + 
				"=============================");
		
		
		System.out.println("Choose option (1-3):");
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		Circle circle = new Circle(0);
		
		while (option < 4) {
			
			switch (option){
				case 1: 
					System.out.println("Enter the radius to compute the area and circumference");
					double rad = sc.nextDouble();
					circle.setRadius(rad);
					System.out.println("A new circle is created");
					break;		
				case 2:
					circle.printArea();
					break;
				case 3:
					circle.printCircumference();
					break;
				
			}
			System.out.println("Choose option (1-3):");
			option = sc.nextInt();
		}
		System.out.print("Thank you!!");
		
	}

}
