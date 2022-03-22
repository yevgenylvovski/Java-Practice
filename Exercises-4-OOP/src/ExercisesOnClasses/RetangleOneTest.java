package ExercisesOnClasses;

import java.util.Scanner;

public class RetangleOneTest {

	public static void main(String[] args) {
		RetangleOne a = new RetangleOne();
		Scanner scan = new Scanner(System.in);
		a.input(scan);
		a.caculateArea();
		a.caculatePerimeter();
		a.output();
	}

}
