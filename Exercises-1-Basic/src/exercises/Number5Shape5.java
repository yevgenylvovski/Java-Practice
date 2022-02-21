package exercises;
/*
  vi)
        1
       212  
      32123
     4321234 space + left + 1 + right
    543212345
 */
public class Number5Shape5 {
    public static void main(String[] args) {
	String record = "";
	String result = "";
	String space = "";
	String left = "";
	String right = "";
	int number = 1;
	while(number <= 5){
	    space = "";
	    left = "";
	    right = "";
	    for(int s = 1; s<= (5 - number); s++)space += " ";
	    for(int l = number; l >= 2; l--)left += l;
	    for(int r = 2; r<= number; r++)right += r;
	    record = space + left + "1" + right + "\n";
	    result = result + record;
	    number++;
	}
	System.out.println(result);
    }
}
