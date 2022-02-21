package exercises;

/*
  iii)
	

     *
    **
   ***
  ****
 *****

 */
public class Number5Shape6 {

    public static void main(String[] args) {
	int number = 1;
	while (number <= 5) {
	    for (int i = 1; i <= 5 - number; i++)
		System.out.print(" ");
	    for (int j = 1; j <= number; j++)
		System.out.print("*");
	    number++;
	    System.out.println();
	}
    }
}
