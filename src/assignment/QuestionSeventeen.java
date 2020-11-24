package assignment;


//Question 17: Write a program to calculate leap year.
/*The year is leap year if it is even number, one if condition is enough but we will use multiple if statements to */

import java.util.Scanner;

public class QuestionSeventeen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your year: ");
		int x = input.nextInt(); 
		
		if (x % 2 == 0) {
			System.out.println(  x   + " is a leap year");}
		else { System.out.println( x  + " is not a leap year");   }
		
		input.close(); 
	}

}
