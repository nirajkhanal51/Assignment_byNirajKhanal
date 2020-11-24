package assignment;

import java.util.Scanner;

public class QuestionElevenb {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt(); 
		System.out.println("Before swapping a is: " + a);
		System.out.println("Before swapping b is: " + b);
		
		 b = a + b;
		 a = b - a;
		 b = b - a;
		        
		    		 
		       System.out.println("After swapping the number a is: " + a);
		       System.out.println("After swapping the number b is: " + b);
		       
		       input.close();
		
	}

}
