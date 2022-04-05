package exercisesonclasses;
// Ex:  New Circle Class.

public class Circle {

	private double radius = 1.0;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
