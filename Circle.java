package tut_2_classes_and_objects;

public class Circle {
	private double radius; // radius of circle
	private static final double PI = 3.14159;
	
	// constructor
	public Circle(double rad) {
		radius = rad;
	}
	
	// mutator method � set radius
	public void setRadius(double rad) {
		radius = rad;
	}
	
	
	// accessor method � get radius
	public double getRadius() {
		return radius;
	}
	
	
	// calculate area
	public double area() {
		return PI*Math.pow(radius, 2);
	}
	
	
	// calculate circumference
	public double circumference() {
		return 2*PI*radius;
	}
	
	
	
	// print area
	public void printArea() {
		System.out.println("Area of circle\n" + "Radius: " + radius + "\nArea: " + area());
		
	}
	// print circumference
	
	
	public void printCircumference() {
		System.out.println("Circumference of circle\n" + "Radius: " + radius + "\nCircumference: " + circumference());

	
	}

}
