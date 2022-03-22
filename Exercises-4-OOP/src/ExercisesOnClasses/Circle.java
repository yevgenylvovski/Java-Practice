package ExercisesOnClasses;
// Ex: Yet New Circle Class.

public class Circle {

	private double radius;

	public Circle() {
		radius = 2.0;
	}

	public Circle(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;

	}

}
