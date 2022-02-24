package exercises;

import java.util.Scanner;

public class Num5 {
    /*
     * 5. Write a java program that compares two given numbers, and prints the
     * relation between them >, < , =. For example, Input: 5 , 10 Your program
     * should print "5 < 10"
     */
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int number1; 
	int number2;
	System.out.print("Input first number: ");
	number1 = input.nextInt(); 

	System.out.print("Input second number: "); 
	number2 = input.nextInt();  

	if (number1 > number2) {
	    System.out.printf("%d > %d\n", number1, number2);
	}
	if (number1 < number2) {
	    System.out.printf("%d < %d\n", number1, number2);
	}
	if (number1 == number2) {
	    System.out.printf("%d = %d\n", number1, number2);
	}
    }

}
