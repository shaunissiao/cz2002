package point;

public class Cylinder extends Circle {
	protected double height;
	
	public Cylinder(int x, int y, double rad, double height) {
		super(x, y, rad); this.height = height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double getHeight() {
		return this.height;
	}
	
	
	public double area() {
		return 2 * super.area() + 2 * Math.PI * getRadius() * getHeight();
	}
	
	public double volume() {
		return super.area() * getHeight();
	}
	
}
