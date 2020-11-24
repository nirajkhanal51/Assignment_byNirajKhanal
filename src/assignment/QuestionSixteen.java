package assignment;

//Question16: Write a program to find the given number is even or odd.
import java.util.Scanner; 

public class QuestionSixteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first number a: ");
		int a = input.nextInt(); 
		
		if (a % 2 == 0) {
			System.out.println("The number you entered is even.");}
		else {
			System.out.println("The number you entered is odd.");
		}
		
input.close();
	}

}
