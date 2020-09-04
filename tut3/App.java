package point;

public class App {

	public static void main(String[] args) {
		
		Point p = new Point(1, 5);
		System.out.println("The point is at " + p.toString() + "\n");
		
		
		Circle c = new Circle(3, 3, 5);
		System.out.println("The area of cirlce is " + c.area());
		System.out.println("The point is at " + c.toString() + "\n");
		
		Cylinder cyl = new Cylinder(3, 3, 5, 7);
		System.out.println("The area of cylinder is " + cyl.area());
		System.out.println("The volume of cylinder is " + cyl.volume());
		System.out.println("The point is at " + cyl.toString());
		
	}

}
