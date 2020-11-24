package assignment;


//Question 13: Write a program to print the number entered by the user only if the number entered is negative.

import java.util.Scanner; 

public class QuestionThirteen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int x = input.nextInt(); 
		
		if (x < 0) {
			System.out.println("Your entered negative number: " + x);
		}
		
		input.close();

	}

}
