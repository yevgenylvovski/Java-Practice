package exercises;
/*
   6.
Write a Java program to accept a number and check the number is even or not.
 Prints 1 if the number is even or 0 if the number is odd.
 */

import java.util.Scanner;

public class Num6 {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Input a number: ");
	int i = sc.nextInt();
	
	if (i % 2 == 0) {
	    System.out.println(1);
	    sc.close();
	} else {
	    System.out.println(0);
	    sc.close();
	}
    }
}
