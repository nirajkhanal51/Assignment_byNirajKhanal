package assignment;

//Q.23.Write a Program to sum 1 to nth natural numbers.

import java.util.Scanner; 

public class QuestionTwentythree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: "); 
		int n = input.nextInt();
		
		int sum = 0; 
		
		for (int i = 1; i <= n; i++ ) {   
			
			sum = sum + i; }
			
		System.out.println("The sum of natural numbers up to " + n +  " is: " + sum ); 
			input.close(); 
		}
		

	}


