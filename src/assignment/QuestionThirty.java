package assignment;

import java.util.Scanner;

public class QuestionThirty {

	public static void fibonacciSeries() {
		
						
		        System.out.println("Enter the numbers you want in the sequence:");
		        Scanner input = new Scanner(System.in);
		        int desiredNum = input.nextInt();
		       
		        int x = 0; 
		        int y = 0; 
		        
		        System.out.print("Fibonacci Series of your desired number: "+desiredNum+" numbers:");

		        int i=1;
		        while(i<=desiredNum)
		        {
		            System.out.print(x + " ");
		            int z = x + y;
		            x = y;
		            y = z;
		            i++;
		        
		        }
	}
	
	public static void main(String[] args) {
		
		fibonacciSeries();
		
		
	}
	
}
