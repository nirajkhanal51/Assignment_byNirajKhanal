package assignment;

//Q.27. Write a Program to sum each digit of given number as well as product
import java.util.Scanner;
public class QuestionTwentySeven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	      System.out.print("Input an integer: ");
	      int d = input.nextInt();
		  System.out.println("The sum is " + sumDigits(d));
	    }

	 public static int sumDigits(long n) {
			int result = 0;
			
			while(n > 0) {
				result += n % 10;
				n /= 10;
			}
			
			return result;
		}
		
	 }
