package assignment;
// Q.8. Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.

import java.util.Scanner;

public class QuestionEight {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your temperature in Fahrenheit: ");
		float x = input.nextFloat(); 
		float Ctemp =  (float) (x-32)*5/9;
		
		System.out.println("Your temperature in celcius is:" + Ctemp);
		
		System.out.println("Enter your temperature in Celcius: ");
		float y = input.nextFloat();
		float Ftemp = (float) (y/5 * 9) + 32;
		
		System.out.println("Your temperature in Fahrenheit is: " +Ftemp);
		
		input.close();
	}

}
