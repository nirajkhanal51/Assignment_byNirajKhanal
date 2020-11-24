package assignment;

//Question.15.Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)]

import java.util.Scanner;

public class QuestionFifteen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	         
	     System.out.println("Enter your number: " );
	     int a = input.nextInt();
	    	     
	     if (a <= 128 && a >= 0) {
	    	 char c = (char) a;
	    	 System.out.println("Corressponding ASCII code is: "  + c );
	     }
	     
	
	
	input.close();
	}

}
