package callmethod_demo;
// Find whether your year is leap year using your own method.
import java.util.Scanner; 

public class MethodDemo17 {
	
	public static void FindLeapYear() {
Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter your year: ");
		
		int year = input.nextInt(); 
		
		input.close(); 
		
		if (year % 2 == 0) 
		{ System.out.println("The year you entered is a leap year");} 
		
		else
		{ System.out.println("The year you entered is not a leap year");}
		
	}

	public static void main(String[] args) {
		
		FindLeapYear();
		
		}

	}


