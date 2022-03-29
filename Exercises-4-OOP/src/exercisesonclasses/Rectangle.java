package ExercisesOnClasses;
//Ex: The Rectangle Class.

public class Rectangle {
	private float length = 5.6f;
	private float width = 7.8f;
	private double area;
	private double perimeter;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (length + width) * 2;
	}

	public Rectangle(float f, float g) {

	}

	public Rectangle() {

	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + area + ", perimeter=" + perimeter + "]";
	}
	
	
}
