/* 1.
Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers.
Test Data:
Input firstnumber: 125
Input secondnumber: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 % 24 = 5*/

package exercises;
import java.util.Scanner;

public class Num1 {

    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	System.out.print("Input first number: ");
	int firstnumber = in.nextInt();

	System.out.print("Input second number: ");
	int secondnumber = in.nextInt();
// Important note: The second number must be bigger than 0

	int result;

	// +
	result = firstnumber + secondnumber;
	System.out.println(firstnumber + " + " + secondnumber + " = " + result);

	// -
	result = firstnumber - secondnumber;
	System.out.println(firstnumber + " - " + secondnumber + " = " + result);

	// *
	result = firstnumber * secondnumber;
	System.out.println(firstnumber + " * " + secondnumber + " = " + result);

	// /
	result = firstnumber / secondnumber;
	System.out.println(firstnumber + " / " + secondnumber + " = " + result);

	// %
	result = firstnumber % secondnumber;
	System.out.println(firstnumber + " % " + secondnumber + " = " + result);

    }

}
