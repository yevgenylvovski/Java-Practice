package exercises;
//Write a Java program to print the area and perimeter of a circle. 
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586

import java.util.Scanner;
public class Num2 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the radius: ");
	double radius = sc.nextDouble();

	// Area = PI*radius*radius
	double area = Math.PI * (radius * radius);

	System.out.println("The area of circle is: " + area);
	// Perimeter = 2*PI*radius

	double perimeter = Math.PI * 2 * radius;
	System.out.println("Perimeter of a circle is:" + perimeter);

	sc.close();
    }

}
