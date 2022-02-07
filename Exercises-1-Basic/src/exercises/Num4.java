package exercises;

import java.util.Scanner;

/*
 * Two numbers are entered through the keyboard.
 *  Write a program to find the value of one number raised to the power of another. 
 *  (Do not use Java built-in method).
 */
public class Num4 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Input number: ");
	int number = sc.nextInt();

	System.out.print("Input raise number: ");
	int raise = sc.nextInt();

	int i = 1;

	for (i = 1; i <= raise; i++) {
	    number = number * i;
	}
	System.out.println(number);

	sc.close();

    }

}
