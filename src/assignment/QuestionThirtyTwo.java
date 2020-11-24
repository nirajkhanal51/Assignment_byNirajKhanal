package assignment;


//32. Write a Program to accept 5 values in an array and display their sum.

import java.util.Scanner; 
public class QuestionThirtyTwo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
							
		int [] arr = new int[5];
		
		
		for (int i = 0; i < 5 ; i ++) { 
			System.out.println("Enter element: ");
			arr[i] = input.nextInt(); 
			
			
		}
		int sum = 0; 
		
		for (int i = 0; i < 5 ; i ++) { 
			 
			
			sum = sum + arr[i];}
		
			
			System.out.println("The sum of the array is: " +sum );
}



	}


