package assignment;

//Q 7. Write a program that reads the radius and length of a cylinder and computes volume.

import java.util.Scanner;

public class QuestionSeven {
	public static void main(String [] Args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the radius of your cylinder: ");
		float r = input.nextFloat();
		System.out.println("Enter the length of your cylinder: ");
		float l = input.nextFloat();
		
		float Vcylinder = (float) (3.14 * r * r * l);
		
		System.out.println("The volume of your cylinder is: " +Vcylinder);
		
		input.close();
		
	}

}
