package exercises;
//Two numbers are entered through the keyboard.
//Write a program to find the value of one number raised to the power of another. 
//(Do not use Java built-in method).

public class Num4 {
    public static void main(String[] args) {
	int power = 3;
	int number = 2;
	int result = calculatePower(2, 3);
	System.out.print(number + " raised to power " + power + " is : ");
	System.out.print(result);
    }
    private static int calculatePower(int number, int power) {
	if (power == 0) {
	    return 1;
	}
	return number * calculatePower(number, --power);
    }
}
