package exercise;
/*
 * Write a Java program to find the maximum and minimum value of an array.
Example,
Input: An array of integers [2 , 5 , 1, 4, 10].
Output: Min=1 , Max=10.
 */
public class Number7OtherSolution {

    public static void main(String[] args) {
	int[] arr = { 2, 5, 1, 4, 10 };
	int min = arr[0];
	int max = arr[0];

	for (int i = 1; i < arr.length; i++) {

	    if (min > arr[i]) {
		min = arr[i];
	    }	
	    
	    
	    if (max < arr[i]) {
		    max = arr[i];
	    }
	}
	    System.out.println("Min: " + min);
	    System.out.println("Max: " + max);

	}
    }
