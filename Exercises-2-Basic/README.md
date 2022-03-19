# Exercises 2 - Basic

1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. <br>
   Test Data: <br>
   Input first number: 125 <br>
   Input second number: 24 <br>
   Expected Output : <br>
   125 + 24 = 149 <br>
   125 - 24 = 101 <br>
   125 x 24 = 3000 <br>
   125 / 24 = 5 <br>
   125 mod 24 = 5 <br>

https://www.w3resource.com/java-exercises/basic/java-basic-exercise-6.php

```java
import java.util.Scanner;
 
public class Exercise1 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
 
  System.out.println(num1 + " + " + num2 + " = " + 
  (num1 + num2));
   
  System.out.println(num1 + " - " + num2 + " = " + 
  (num1 - num2));
   
  System.out.println(num1 + " x " + num2 + " = " + 
  (num1 * num2));
   
  System.out.println(num1 + " / " + num2 + " = " + 
  (num1 / num2));
 
  System.out.println(num1 + " mod " + num2 + " = " + 
  (num1 % num2));
 }
 
}
```
<br>

2. Write a Java program to print the area and perimeter of a circle. Go to the editor <br>
   Test Data: <br>
   Radius = 7.5 <br>
   Expected Output <br>
   Perimeter is = 47.12388980384689 <br>
   Area is = 176.71458676442586 <br>

https://www.w3resource.com/java-exercises/basic/java-basic-exercise-11.php

```java
public class Exercise2 {
 
   private static final double radius = 7.5;

    public static void main(String[] args) {

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
```
<br>

3. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 

https://www.w3resource.com/java-exercises/basic/java-basic-exercise-12.php

```java
import java.util.Scanner;
 
public class Exercise3 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
  System.out.print("Input third number: ");
  int num3 = in.nextInt();
   
  System.out.print("Input fourth number: ");
  int num4 = in.nextInt();
  
  System.out.print("Enter fifth number: ");
  int num5 = in.nextInt();
   
   
  System.out.println("Average of five numbers is: " + 
   (num1 + num2 + num3 + num4 + num5) / 5);
 }
}
```
<br>

4. Write a Java program to swap two variables. <br>
   For example:<br>
   int secondNum = 3; <br>
   int firstNum = 5; <br>
   <br>
   After the execution of your program you should get: <br>
   int secondNum = 5; <br>
   int firstNum = 3; <br>

https://www.w3resource.com/java-exercises/basic/java-basic-exercise-15.php

```java
public class Exercise4 {
 
 public static void main(String[] args) {
     
   int a, b, temp;
   a = 15;
   b = 27;
   System.out.println("Before swapping : a, b = "+a+", "+ + b);
   temp = a;
   a = b;
   b = temp;   
   System.out.println("After swapping : a, b = "+a+", "+ + b);
 }
 }
```
<br>

5. Write a Java program to compare two numbers.

https://www.w3resource.com/java-exercises/basic/java-basic-exercise-32.php

```java
import java.util.Scanner;
public class Exercise5 {
 public static void main( String args[] )    
    {
        // create Scanner to obtain input from command window       
        Scanner input = new Scanner(System.in);
        int number1; // first number to compare       
        int number2; // second number to compare  
      
        System.out.print( "Input first integer: " ); // prompt        
        number1 = input.nextInt(); // read first number from user   
 
        System.out.print( "Input second integer: " ); // prompt        
        number2 = input.nextInt(); // read second number from user               
        
        if ( number1 == number2 ) {
            System.out.printf("%d == %d\n", number1, number2);
        }    
        if ( number1 != number2 ) {
            System.out.printf( "%d != %d\n", number1, number2 );
        }
        if ( number1 < number2 ) {
            System.out.printf( "%d < %d\n", number1, number2 );
        }
        if ( number1 > number2 ) {
            System.out.printf( "%d > %d\n", number1, number2 );
        }
        if ( number1 <= number2 ) {
            System.out.printf( "%d <= %d\n", number1, number2 );
        }
        if ( number1 >= number2 ) {         
            System.out.printf( "%d >= %d\n", number1, number2 );
        }
    }
  }
```
<br>

6. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. <br>
   Sample Output: <br>
   Input a number: 20 <br>                                                    
   Output: 1 <br>

https://www.w3resource.com/java-exercises/basic/java-basic-exercise-49.php

```java
import java.util.*;
 public class Exercise6 {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 System.out.print("Input a number: ");
     int n = in.nextInt(); 
            if (n % 2 == 0) {
                System.out.println(1); 
               }
			else {
                System.out.println(0); 
              }
     }
}
```
<br>

7. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. Go to the editor
   
<pre>
Sample Output:
Divided by 3:                                                          
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

Divided by 5:                                                          
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
95,

Divided by 3 & 5:                                                      
15, 30, 45, 60, 75, 90,
</pre>

https://www.w3resource.com/java-exercises/basic/java-basic-exercise-50.php

```java
public class Exercise50 {
    	public static void main(String args[]) {
		System.out.println("\nDivided by 3: ");		
		for (int i=1; i<100; i++) {
			if (i%3==0) 
			System.out.print(i +", ");			
		}			
				
		System.out.println("\n\nDivided by 5: ");
		for (int i=1; i<100; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}
				
		System.out.println("\n\nDivided by 3 & 5: ");			
		for (int i=1; i<100; i++) {
			if (i%3==0 && i%5==0) System.out.print(i +", ");			
		}
		System.out.println("\n");
  }
}
```
