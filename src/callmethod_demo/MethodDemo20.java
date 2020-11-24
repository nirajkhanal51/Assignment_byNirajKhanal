package callmethod_demo;

import java.util.Scanner; 
public class MethodDemo20 {
	
	public static void fourfCalculator() {

	Scanner input = new Scanner(System.in); 
	
	System.out.println("Enter your two numbers"); 
	     double a = input.nextDouble();
	     double b = input.nextDouble(); 
	
	 System.out.println("Enter your operator from one of +, _, *, / : "); 
	 
	     char operator = input.next().charAt(0);
	     
	     double result; 
	     
	     input.close(); 
	     
	     switch(operator)
	     {
	     
	     case '+':
	    	 result = a + b; 
	    	 break;
	     case '-' :
	    	 result = a - b;
	    	 break;
	     case '*' :
	    	  result = a * b; 
	    	  break;
	     case '/' : 
	    	 result = a / b;
	    	 break;
	     default:
             System.out.printf("Error! operator is not correct");
             return;
	     }
	     System.out.printf("%.2f %c %.2f = %.2f", a, operator, b, result);
	}
	
	public static void main(String[] args) {

		fourfCalculator();
	}

}
