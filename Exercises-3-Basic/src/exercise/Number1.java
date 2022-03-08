package exercise;
//Write a Java program to sum the values of an array.

//
//Example,
//Input: An array of integers [2 , 5 , 1, 4, 10]
//Output: should be the sum of all the values: 2 + 5 + 1 + 4 + 10 = 22.
//

public class Number1 {

    public static void main(String[] args) {
	int[] arr = new int[] { 2, 5, 1, 4, 10 };
	int sum = 0;
	for (int i = 0; i < arr.length; i++) {
	    sum = sum + arr[i];
	}
	System.out.println("Sum of all the value: " + sum);
    }

}
