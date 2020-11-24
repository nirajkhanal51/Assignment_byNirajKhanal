package callmethod_demo;

import java.util.Scanner;

public class MethodDemo21 {

	public  static void findDayofWeek() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the day number");

		int d = input.nextInt();

		input.close();

		switch (d) {

		}
	}

	public static void main(String[] args) {
		
		MethodDemo21 obj = new MethodDemo21();		
		MethodDemo21.findDayofWeek();

	}

}
