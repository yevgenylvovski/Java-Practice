package exercise;
//Write a Java program to test if an array contains a specific value.
//Example,
//Input: An array of integers [2 , 5 , 1, 4, 10]   ,  4
//Output: Should print "Yes", as the array contains the number 4.
//
//Input: An array of integers [2 , 5 , 1, 4, 10]   ,  3
//Output: Should print "No", as the array does not contain the number 3.

public class Number3 {

    public static void main(String[] args) {

	int[] arr = { 2, 5, 1, 4, 10 };
	boolean isFound = false;
	int num = 4;
	for(int i = 0; i < arr.length; i++) {
    	    if (arr[i] == num) {
    	        isFound = true;
    	        break;
	    }
	}
	
	if (isFound = true) {
    	   System.out.println("Yes");
    	}
    	else {
    	   System.out.println("No");
    	}   
}
    }
    