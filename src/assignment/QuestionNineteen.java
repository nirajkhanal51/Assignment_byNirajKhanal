package assignment;

//Q.19. Write a Program to accept three sides of a triangle and display which kind of triangle is formed.
import java.util.Scanner; 

public class QuestionNineteen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first side of the trianlge a: ");
		double a = input.nextDouble(); 
		
		System.out.println("Enter the second side of the triangle b: "); 
		double b = input.nextDouble();
		
		System.out.println("Enter the third side of the triangle c: ");
		double c = input.nextDouble(); 
		
		if (a == b && b == c) {
			System.out.println("The triangle according to your data is Equilateral Triangle.");} 
		else if (a == b || b == c || a == c) {
		    System.out.println("The triangle according to your data is Isosceles Triangle.");}
		else if ((Math.sqrt(a*a + b*b) == Math.sqrt(c*c)) || (Math.sqrt(b*b) == Math.sqrt(a*a + c*c))|| (Math.sqrt(c*c) == Math.sqrt(a*a + b*b)))
		{         System.out.println("The triangle according to your data is perpendicular triangle: ");}
		else if (a>0 && b>0 && c>0) {
			System.out.println("The triangle is scalene triangle.");}
		else if (a==0 || b==0 || c==0) {
			System.out.println("Invalid triangle.");}
		
		input.close();
		
	} 
		
}
			
	

	


