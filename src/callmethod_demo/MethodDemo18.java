package callmethod_demo;

import java.util.Scanner;

//Write a program to display the largest number from given three values.

public class MethodDemo18 {
	
	public static void FindGreatestNumber() { 
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter your numbers:" );
		
		int a = input.nextInt(); 
		int b = input.nextInt(); 
		int c = input.nextInt();
		
		if (a > b && a > c)
		{ System.out.println("The number " + a +  " is the greatest number of all.");}
		
		else if (b > a && b > c)
		{ System.out.println("The number " + b + " is the greatest number of all.");}
		
		else if (c > a && c > b)
		{System.out.println("The number " + c + " is the greatest number of all.");}
		
		input.close();	
	}

	public static void main(String[] args) {
		FindGreatestNumber();

	}

}
