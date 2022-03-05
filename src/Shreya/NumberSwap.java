package Shreya;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st no a : ");
		a = s.nextInt();
		System.out.println("Enter 2nd no b : ");
		b = s.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping a : " + a + "\nAfter swapping b : " + b);

	}
}
