package assignment;

//24. Write a program to print the factorial number of given numbers.

import java.util.Scanner; 

public class QuestionTwentyFour {
	
	public int findFactorial( int i, int f) {
		 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number to get factorial; ");
		
		int n = input.nextInt();
		
		for (i = 1;  i  <= n; i ++){
		
		   f = f * i; 	
		System.out.println("The factorial for the given number " + n + " is " +f); 
		}
		return 1;
		
		
		}

	public static void main(String[] args) {
		
			
		QuestionTwentyFour obj = new QuestionTwentyFour(); 
		 obj.findFactorial( 0,1); 
				

	}

}
