package callmethod_demo;

import java.util.Scanner;
//19. Write a Program to accept three sides of a triangle and display which kind of triangle is formed.

public class MethodDemo19 {

	public static void TypeofTriangles() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter sides of your triangle: ");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if ((a == b) && (b == c)) {
			System.out.println("Your triangle is equilateral triangle.");
		}

		else if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Your triangle is isosceles triangle.");
		}

		else {
			System.out.println("Your triangle is scalene triangle.");
		}
	}

	public static void main(String[] args) {
		TypeofTriangles();

	}

}
