package exercises;

/* 1.
Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

public class Num1 {

    public static void main(String[] args) {

	int firstnumber = 200;
	int secondnumber = 50;
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
