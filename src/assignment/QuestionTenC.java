package assignment;

import java.util.Scanner;

//calculate the formula  -b-(sqrt.b2-4ac)/2a

public class QuestionTenC {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); 
		
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		System.out.println("Enter c: ");
		double c = input.nextDouble();
		
		double x = (double) (- b + (Math.sqrt(b*b - 4*a*c))/ (2*a));
		
		System.out.println("The calculated value is: " + x);
		
		input.close();

	}

}
