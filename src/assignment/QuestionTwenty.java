package assignment;

import java.util.Scanner;

public class QuestionTwenty {

	
		    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");

	        // nextDouble() reads the next double from the keyboard
	        double first = input.nextDouble();
	        double second = input.nextDouble();

	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = input.next().charAt(0);

	        double result;
	        
	        input.close();

	        switch(operator)
	        {
	            case '+':
	                result = first + second;
	                break;

	            case '-':
	                result = first - second;
	                break;

	            case '*':
	                result = first * second;
	                break;

	            case '/':
	                result = first / second;
	                break;

	            
	            default:
	                System.out.printf("Error! operator is not correct");
	                return;
	                
	                
	        }

	        System.out.printf("%.2f %c %.2f = %.2f", first, operator, second, result);
	        
	    }
	}
