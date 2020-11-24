package assignment;

import java.util.Scanner;
// calculate formula for area of a triangle = sqrt ( s(s-a)(s-b)(s-c))

public class QuestionTenb {

		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter side a of a triangle: ");
		float a = input.nextFloat();
		System.out.println("Enter side b of a triangle: ");
		float b = input.nextFloat();
		System.out.println("Enter side c of a trianlge ");
		float c = input.nextFloat();
		
		float s = (a + b + c)/2;
		
		float area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("The are of your given triangle is: " + area);
		
		input.close();
		
		
		
	}

}
