package exercises;
import java.util.Scanner;
/*
 * Write a Java program that takes 3 numbers as input to calculate and print the
 * average of the numbers.
 */
public class Num3 {
   
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Input first number: ");
	int num1 = sc.nextInt();

	System.out.print("Input second number: ");
	int num2 = sc.nextInt();

	System.out.print("Input third number: ");
	int num3 = sc.nextInt();

	System.out.println("Average of three numbers is: " + (num1 + num2 + num3) / 3);

	sc.close();
    }
}
