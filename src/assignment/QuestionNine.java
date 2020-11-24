package assignment;

import java.util.Scanner;

//Q.9. Write a program that converts pounds into kg. The program prompts the user to enter a number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].


public class QuestionNine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight in Kg: ");
		float Wkg = input.nextFloat();
		
		float Wpounds = (float) (Wkg * 2.2); 
		
		System.out.println("Your weight in pounds is: " + Wpounds);
		
		System.out.println("Enter your wieght in lbs: ");
		float Wlb = input.nextFloat();
		
		float WeightKg = (float) (Wlb/2.2);
		
		System.out.println("Your weight in pound is: " + WeightKg);
		input.close();
	}

	
}
