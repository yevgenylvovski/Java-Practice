package exercises;

import java.util.Scanner;
// Write a program that prompts the user to input a positive integer.
// It should then print the multiplication table of that number.  
public class Num3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Your number: ");
	int yourNumber = sc.nextInt();
	
	for (int i = 1; i <= 10; i++) {
	    int result = yourNumber * i;
	    System.out.println(yourNumber + "x" + i + "=" + result);
	}
	sc.close();
    }
}
