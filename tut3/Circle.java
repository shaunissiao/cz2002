package point;

public class Circle extends Point{
	protected double radius;
	
	
	public Circle(int x, int y, double rad) {
		super(x, y); this.radius = rad;
	}
	
	public void setRadius(double rad) {
		this.radius = rad;
	}
	
	
	public double getRadius() {
		return this.radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(getRadius(), 2);
	}
	
}
