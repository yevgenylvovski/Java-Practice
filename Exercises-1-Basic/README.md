# Exercises 1 - Basic
/*
   ii)

*
**
***
****
*****

 */
public class Number6Shape2 {

	public static void main(String[] args) {
		int number = 1;

		while (number <= 5) {
			for (int i = 1; i <= number; i++)
				System.out.print("*");
			
			System.out.println();number++;
      }
	}
}
