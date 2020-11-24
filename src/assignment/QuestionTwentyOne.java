package assignment;

//Program to input the number of (1...7) and translate to its equivalent name of the day of the week.

import java.util.Scanner;

public class QuestionTwentyOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the day number: ");
		int d = input.nextInt();

		System.out.println(displayName(d));

		input.close();

	}

	public static String displayName(int d) {
		String xday = "";
		switch (d) {
		case 1:
			xday = "Sunday";
			break;
		case 2:
			xday = "Monday";
			break;
		case 3:
			xday = "Tuesday";
			break;
		case 4:
			xday = "Wednesday";
			break;
		case 5:
			xday = "Thursday";
			break;
		case 6:
			xday = "Friday";
			break;
		case 7:
			xday = "Saturday";
		}
		return xday;
	}

}
