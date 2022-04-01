package exercisesonclasses;
////Ex: The Rectangle Class (other solution)

import java.util.Scanner;

public class RetangleOne {
	private float length;
	private float width;
	private float area;
	private float perimeter;

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

	public float getArea() {
		return area;
	}

	public float getPerimeter() {
		return perimeter;
	}

	public RetangleOne() {
	}

	public void input(Scanner scan) {
		System.out.print("Please input number of length: ");
		length = Float.parseFloat(scan.nextLine());

		System.out.print("Please input number of width: ");
		width = Float.parseFloat(scan.nextLine());
	}

	public void caculateArea() {
		this.area = length * width;
	}

	public void caculatePerimeter() {
		this.perimeter = (length + width) * 2;
	}

	public void output() {
		System.out.println("Retangle area is " + area);
		System.out.println("Retangle perimeter is " + perimeter);
	}

}
