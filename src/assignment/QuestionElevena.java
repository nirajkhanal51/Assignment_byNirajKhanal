package assignment;

import java.util.Scanner;

public class QuestionElevena {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt(); 
		System.out.println("Before swapping the number is: " + a);
		System.out.println("Before swapping the number is: " + b);
		
		int temp = a;
		       a = b;
		       b = temp; 
		    		 
		       System.out.println("After swapping the number is: " + a);
		       System.out.println("After swapping the number is: " + b);
		       
		       input.close();
	}

}
