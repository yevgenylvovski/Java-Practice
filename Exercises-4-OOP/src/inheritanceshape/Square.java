package inheritanceshape;

public class Square extends Rectangle {

	double side;

	public Square() {

	}

	public Square(double side) {
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;

	}

	public Square(double side, Rectangle rectangle1) {
		super(rectangle1.getColor(), rectangle1.isFilled());
		this.side = side;

	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void setWidth(double side) {
		this.side = side;
	}

	@Override
	public void setLength(double side) {
		this.side = side;

	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", width=" + width + ", length=" + length + ", color=" + color + ", filled="
				+ filled + "]";
	}

}
