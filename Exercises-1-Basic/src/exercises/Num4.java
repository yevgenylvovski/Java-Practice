package exercises;
//Two numbers are entered through the keyboard.
//Write a program to find the value of one number raised to the power of another. 
//(Do not use Java built-in method).
import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Your number: "); 
	int yourNumber = sc.nextInt();
	
	Scanner n = new Scanner(System.in);
	System.out.println("Your power number: ");
	int yourPowerNumber = n.nextInt();
	int result = calculatePower(yourNumber, yourPowerNumber);
	
	System.out.print(yourNumber + " x " + yourPowerNumber + " = " + result);
    }
    private static int calculatePower(int yourNumber, int yourPowerNumber) {
	if (yourPowerNumber == 0) {
	    return 1;
	}
	return yourNumber * calculatePower(yourNumber, --yourPowerNumber);
    }
    }

