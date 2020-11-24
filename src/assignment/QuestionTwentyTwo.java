package assignment;

import java.util.Scanner;

//Write a program to print the table of given number.


public class QuestionTwentyTwo {

	public static void main(String[] args) {
		
          Scanner input = new Scanner(System.in); 
          System.out.println("Enter your number to get table: ");
          int n = input.nextInt(); 
          
                    
          for (int i = 1; i <= 10; i++) {
        	  
        	  int m = n * i; 
        	  
        	  System.out.println( n+ " * " + i + " = " + m); 
        	  
        	  input.close();
          }
	}

}
