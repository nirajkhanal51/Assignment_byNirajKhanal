package assignment;

//Q.3 Write a program to find sum and average of two numbers input by User (using Scanner class).

//Java program to read data of various types using Scanner class.

// importing scanner function
import java.util.Scanner;
// below two lines of codes are standard syntax to run as class 
public class QuestionThree {
	public static void main(String [] args) {
		 //declaring the input variable with standard predefined object
		Scanner input = new Scanner(System.in);
		
		//direction to input price of first item
		System.out.println("Price of first Item: ");
		
		//declaring number variable for price input for the first item
		long a = input.nextLong();
		
		//direction to input price of first item
		System.out.println("Price of second Item: ");
		
		//declaring number variable for price input for the second item
		long b = input.nextLong();
		
		//direction to input price of third item
		System.out.println("Price of third Item: ");
		
		//declaring number variable for price input for the third item
		long c = input.nextLong();
		
		input.close();
				
		//getting sum of all input numbers or getting total price of all the items
		long sum = a + b + c;
		System.out.println("Sum of " + a + ", " + b + " and " + c + " is: "  + sum );
		System.out.println("Your total amount is: " +sum );
		
		//taking away 5% from total amount since senior discount of 5% is available
		long discount = (long) (sum*0.95);
		System.out.println("Congratulation! You are eligible for senior discount. Your total is now: " + discount);
		System.out.println("Do you want to checkout? Please click the following link: ");
	
		//getting the average of input number
		long avg = sum/3;
		//printing out the average number or average price of each item
		System.out.println("You paid $" + avg + " in average for each item.");
		
		        
		    } 
		
		}


