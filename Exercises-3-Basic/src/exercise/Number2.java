package exercise;

//Write a Java program to calculate the average value of array elements.
//Example,
//Input: an array of integers [2, 5 , 1, 4, 10]
//Output: should be the average value: (2 + 5 + 1 + 4 + 10) / 5 = 4.4.
public class Number2 {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 5, 1, 4, 10 };

		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		double average = sum / 5;
		System.out.println("Average value: " + average);
	}
	
}
