package exercises;
/*
  v)
        1
       222
      33333
     4444444
    555555555
 */
public class Number8Shape4 {
    public static void main(String[] args) {
	int number = 1;
	while (number <= 5) {
	    for (int i = 1; i <= number; i++)
		System.out.print(i);
	    System.out.println();
	    number++;
	}
    }
}
