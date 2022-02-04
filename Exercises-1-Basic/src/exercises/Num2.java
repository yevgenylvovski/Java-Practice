package exercises;
/*
 * Write a program to calculate the sum of first 10 natural number.
 */
public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum = 0; 
		for (i=1;i<=10;i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum: " + sum);
	}

}
