package exercise;
//Write a Java program to copy an array by iterating the array.
//Example,
//Input: An array of integers [2 , 5 , 1, 4, 10].
//Output: a new array with the same values - [2 , 5 , 1, 4, 10].

public class Number5 {

	public static void main(String[] args) {
		int a[] = { 2, 5, 1, 4, 10 };
		int[] b = new int[a.length];
		b = a;

		System.out.print("Content of a[] ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\nContent of b[] ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
