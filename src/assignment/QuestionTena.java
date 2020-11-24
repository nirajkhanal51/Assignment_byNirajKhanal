package assignment;

import java.util.Scanner;

//Calculate velocity s by using Newton's Formula s = ut + 1/2 at2
/*Where s is speed of object at given point o time,  u is initial velocity, t is time in second, 
and a is rate of change of velocity */
public class QuestionTena {

	public static void main(String[] args) {
		
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the initial velocity u: " );
		double u = input.nextDouble();
		System.out.println("Enter the time in second t: ");
		double t = input.nextDouble();
		System.out.println("Enter the rate of change of velocity a: ");
		double a = input.nextDouble();
		
		double s = (u * t) + ((1/2) * a * Math.pow(t, 2));
		
		System.out.println("The object will gain the speed at the given time will be: " + s);
		
		System.out.println(Math.pow(5, 2));
		System.out.println("Just trying to use math power function:" + Math.pow(5,2));
		System.out.println("Trying to calculate power function giving data type: " + (double) Math.pow(5,2));
		input.close();
	}

}
