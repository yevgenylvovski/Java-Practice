package inheritanceshape;

public class Circle extends Shape {
	double radius = 1.0;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle(double radius, Shape shape1) {
		super(shape1.getColor(), shape1.isFilled());
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

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [" + super.toString() + ", radius=" + radius + "]";
	}
}
