package exercises;

// Write a program to calculate the sum of first 10 natural number.
// 1+2+3+4+5+6+7+8+9+10
public class Num2 {
    public static void main(String[] args) {
	int i = 1;
	int sum = 0;
	for (i = 1; i <= 10; i++) {
	    sum = sum + i;
	}
	System.out.println("Sum: " + sum);
    }

}
