package assignment;

//Question 18. Write a program to display the largest number from given three values.

import java.util.Scanner; 

public class QuestionEighteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter your number a: ");
		int a = input.nextInt();
		System.out.println("Enter your number b: ");
		int b = input.nextInt();
		System.out.println("Enter your number c: ");
		int c = input.nextInt(); 
		
		if (a > b && a > c) {
		System.out.println("Your greatest number is: " + a ); }
		if (b > a && b > c) {
		System.out.println("Your greatest number is: " + b); }
		if (c > a && c > b ) {
		System.out.println("Your greatest number is: "  + c); }
		
input.close(); 
	}

}
