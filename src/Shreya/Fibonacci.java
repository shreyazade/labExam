package Shreya;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 1, c, number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		number = s.nextInt();
		System.out.println("" + a + "\n" + b);
		for (int i = 2; i <= number; i++) {
			c = a + b;
			System.out.println("" + c);
			a = b;
			b = c;
		}
	}
}
