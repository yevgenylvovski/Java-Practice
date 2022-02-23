package exercises;

/*
  iv)
        *  (5-1)
       ** (5-2)
      ***
    *****
  *******
*********
 */
public class Number5Shape3 {
    public static void main(String[] args) {
	int number = 1;
	while (number <= 5) {
	    for (int j = 1; j <= 5 - number; j++) {
		System.out.print(" ");
	    }
	    for (int i = 1; i <= number; i++) {
		System.out.print("*");
	    }
	    
	    System.out.println();
	    number++;
	}
    }
}
