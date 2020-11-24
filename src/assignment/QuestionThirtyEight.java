package assignment;

import java.util.Scanner;

//Q.38. Write a program to check whether a given string is palindrome or not.


public class QuestionThirtyEight {

	private static String x1;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//StringBuilder x1 = new StringBuilder("NOON");
		System.out.println("Enter your word to check if it is a palindrome word: ");
		 String x1 = input.nextLine();
		 	
		String x2 = new StringBuffer(x1).reverse().toString();
		
			if (x1.equalsIgnoreCase(x2)) {
			
			System.out.println(x1 + " is a palindrome word.");
		}
		
		else {System.out.println(x1 + " is not a palindrome word.");}
	}

}
