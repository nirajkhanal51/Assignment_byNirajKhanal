package assignment;

import java.util.Scanner;

//Question14. Write a program to relate two integers entered by the user using = =or > or < sign.

public class QuestionFourteen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first number x: ");
		double x = input.nextDouble(); 
		System.out.println("Enter your second number y: ");
		double y = input.nextDouble(); 
		
		if (x == y) {
			System.out.println("The both numbers x and y you entered are equal.");}
			
			else	if (x < y) {
			System.out.println("The first number x is lesser than the second number y."); }
			else    if (x > y) {
	        System.out.println("The first number x is greater than the secoond number y."); }
		
	input.close();		
			
	}
		
		
	}
