package Shreya;

import java.util.Scanner;

public class Powern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, power, result = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Base number : ");
		number = s.nextInt();
		System.out.println("Enter Power for the number : ");
		power = s.nextInt();
		for (int i = 1; i <= power; i++) {
			result = result * number;
		}
		System.out.println("The result value is : " + result);

	}
}
