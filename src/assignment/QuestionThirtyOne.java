package assignment;

import java.util.Scanner;


public class QuestionThirtyOne {

	
	public static void findSeries() {
		
		
		System.out.print("Enter your number of rows you want : ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = 0;
		int i = 0;
					  
		for(i=1;i<=a;i++)
		{
		for( b=1 ; b<=i; b++)
		System.out.print(b);

		System.out.println("");}
			    }
		
	   public static void main(String[] args) {

		   findSeries();
	}
	}
