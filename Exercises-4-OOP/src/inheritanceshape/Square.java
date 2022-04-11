package inheritanceshape;

public class Square extends Rectangle {
	
	public Square() {
	}

	public Square(double side) {
		this.length = side;
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.length = side;
	}

	public Square(double side, Rectangle rectangle1) {
		super(rectangle1.getColor(), rectangle1.isFilled());
		this.length = side;
	}

	public double getSide() {
		return length;
	}

	public void setSide(double side) {
		this.length = side;
	}

	@Override
	public void setWidth(double side) {
		this.width = side;
	}

	@Override
	public void setLength(double side) {
		this.length = side;

	}

	@Override
	public String toString() {
		return "Square [" + super.toString() +"]";
	}
	
}
