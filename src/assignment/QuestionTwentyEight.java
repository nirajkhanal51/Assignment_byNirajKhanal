package assignment;
//Question 28: 
//Write a program in a single class having the following functions.
//isPrimenumber(int)
//firstNthPrime(int )
//allPrimebetween(int start , int  end)

import java.util.Scanner;

public class QuestionTwentyEight {

	
	public static void main(String[] args) {
		
	     Scanner input = new Scanner(System.in);
	     System.out.println("Enter your number: "); 
	     int x = input.nextInt();
	     
	     if ((x > 1) && ((x % 2 == 1) || (x % 3 == 2)) )
	     { System.out.println("The number " + x  + " you entered is a prime number.");}
	     else
	     {System.out.println("The number " + x + " you entered is not a prime number.");}
	     
	     { QuestionTwentyEight.findNthPrime();} 

	}
	// find first Nth prime number 
	
	public static void findNthPrime() {
		int a = 1;
		if  ((a > 1) && (a % 2 == 1)) 
		{System.out.println("The first prime number is" + a); }
		
		
		
	}

}
