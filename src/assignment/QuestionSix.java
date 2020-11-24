package assignment;

import java.util.Scanner;

//Q6. Write a program to find the perimeter of a circle, triangle, and rectangle.
public class QuestionSix {
	public static void main(String [] Args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the radius value for your circle: ");
		float radius = input.nextFloat();
		
		float Pcircle = (float) (2 * 3.14 * radius);
		
		System.out.println("The perimeter of the circle is: " +Pcircle);
		
		System.out.println("Enter measurement for your first side of your triangle: ");
		float x = input.nextFloat();
		
		System.out.println("Enter measurement for your second side of your triangle: ");
		float y = input.nextFloat();
		
		System.out.println("Enter measurement for your third side of your triangle: ");
		float z = input.nextFloat();
		
		float Ptriangle = (float) x + y + z;
		
		System.out.println("The perimeter of your triangle is: " +Ptriangle);
		
		System.out.println("Enter the length of your rectangle: ");
		float l = input.nextFloat();
		
		System.out.println("Enter the breadth of your rectangle: ");
		float b = input.nextFloat();
		
		float Prectangle = (float) (2 * l) + (2 * b);
		
		System.out.println("The perimeter of your rectangle is: " +Prectangle);
		
		input.close();
		
	}

}
