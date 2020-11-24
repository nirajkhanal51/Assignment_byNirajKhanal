package assignment;

//12.	Write a program to accept the age, name, and nationality of the person and display those values in good format.

import java.util.Scanner; 

public class QuestionTwelve {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); 
		
		System.out.println("Enter name of the person: ");
		String name = input.nextLine(); 
		System.out.println("Enter nationality of the person: ");
		String nationality = input.nextLine();
		System.out.println("Enter age of the person: ");
		String age = input.nextLine(); 
		
		System.out.println("===================================");
		
		System.out.println("The name of the person is: " + name);
		System.out.println(" The nationality of the person is: " +nationality);
		System.out.println(" The age of the person is: " + age);
		
		System.out.println("===================================");
		
		input.close();

	}

}
