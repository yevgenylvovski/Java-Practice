package inheritanceshape;

public class Test {

	public static void main(String[] args) {
		Shape shape1 = new Shape("red", true);
		System.out.println(shape1);

		Circle circle1 = new Circle(1.0, shape1);
		System.out.println(circle1);

		Rectangle retangle1 = new Rectangle(1.0, 1.0, shape1);
		System.out.println(retangle1);

		Square square2 = new Square(1.0, retangle1);
		System.out.println(square2);
	}

}
