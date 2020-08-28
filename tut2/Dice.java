package tut_2_classes_and_objects;

public class Dice {
	private int valueOfDice;
	
	public Dice(int valueOfDice) {
		this.valueOfDice = valueOfDice;
	}
	
	public void setDiceValue() {
		this.valueOfDice = (int)(Math.random()*6+1);
		
	
	}
	
	public int getDiceValue() {
		return valueOfDice;
		
	}
	
	public void printDiceValue() {
		System.out.println("Current value is " + getDiceValue());
	}
}

