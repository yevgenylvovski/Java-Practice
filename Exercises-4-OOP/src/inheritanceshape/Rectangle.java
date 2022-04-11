package inheritanceshape;

public class Rectangle extends Shape {

	 double width = 1.0;
	 double length = 1.0;

	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

		public Rectangle(double width, double length, Shape shape1) {
		super(shape1.getColor(), shape1.isFilled());
		this.width = width;
		this.length = length;
	}

		public Rectangle(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (length + width) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle [" + super.toString() + ", width=" + width + ", length=" + length + "]";
	}


}
