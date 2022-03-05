package Shreya;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Integer value you want to check:");
		a = s.nextLine();
		int n = a.length();
		for (int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b))
		// if(ab)
		{
			System.out.println("The value is palindrome.");
		} else {
			System.out.println("The value is not palindrome.");
		}

	}

}
