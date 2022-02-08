package exercises;

import java.util.Scanner;

/*
 * Write a program that prompts the user to input a positive integer.
 *  It should then print the multiplication table of that number. 
 */
public class Num3 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Your number: ");
	int Yournumber = sc.nextInt();

	int i = 1;
	int result = Yournumber*i;
	
	for (i = 1; i <= 10; i++) {
	    System.out.printf("%d*%d=%d", Yournumber, i, result).println();
	}
	sc.close();
    }
}
