package exercises;

import java.util.Scanner;

public class Num4 {
/*
  4.
Write a Java program to swap two variables.
For example:
int secondNum = 3;
int firstNum = 5;

After the execution of your program you should get:
int secondNum = 5;
int firstNum = 3;
 */
	public static void main(String[] args) {
	    int x, y, z;
	    Scanner in = new Scanner(System.in);

	    System.out.println("Input firstNum: ");
	    x = in.nextInt();
	    System.out.println("Input secondNum: ");
	    y = in.nextInt();

	    z = x;
	    x = y;
	    y = z;

	    System.out.println("Swap two variables: " + x + " and " + y);
	   }
	 
	}


