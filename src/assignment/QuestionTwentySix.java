package assignment;

//Q.26. Write a Program to reverse the given number. //123 => 321
import java.util.Scanner; 

public class QuestionTwentySix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the number that you want to reverse: " ); 
		
		int originalNumber = input.nextInt(); //456
		
		int reverseNumber = 0; 
		
		System.out.println("The original number is: " + originalNumber); 
		
		while (originalNumber != 0) {
			
			int temp = originalNumber % 10;  
			reverseNumber = (reverseNumber * 10) + temp; 
			originalNumber = originalNumber / 10;
			
		}
		System.out.println("The reverse number is: " + reverseNumber); 
		

	}

}
