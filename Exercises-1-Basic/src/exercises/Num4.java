package exercises;

/*
 * Two numbers are entered through the keyboard.
 *  Write a program to find the value of one number raised to the power of another. 
 *  (Do not use Java built-in method).
 */
public class Num4 {

    public static void main(String[] args) {
	int i = 1;
	int num = 3;
	int raise = 2;

	for (i = 1; i <= raise; i++) {
	    num = num * i;
	}
	System.out.println(num);
    }

}
