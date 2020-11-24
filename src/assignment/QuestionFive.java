package assignment;

import java.util.Scanner;

// Q5. Write a program to find the area of a circle, rectangle, and triangle.
public class QuestionFive {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double PI = Math.PI; 
		
		System.out.print("Enter the radius for circle: ");
		float radius = input.nextInt();
		
		float Acircle = (float) (PI * (radius * radius));
		System.out.println("Area of the circle with radius " + radius + " is " + Acircle);
		
				
		System.out.print("Enter the length of rectangle : ");
		float length = input.nextInt();
		System.out.print("Enter the breadth of rectangle : ");
		float breadth = input.nextInt();
		
		float Arectangle = length * breadth; 
		
		System.out.println("Area of the rectangle is: " + Arectangle);
		
		System.out.println("Enter the hb for triangle: ");
		float hb      = input.nextInt();
		
		System.out.println("Enter the base for triangle: ");
		float b       = input.nextInt();
		float Atriangle = (hb * b) /2;
		
		System.out.println("The area of a triangle is: " +Atriangle);
		
		input.close();
		
		
		
		
	}

}
