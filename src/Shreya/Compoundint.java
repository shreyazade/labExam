package Shreya;

import java.util.Scanner;

public class Compoundint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principle;
		float time;
		float interest, compound;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Principle Amount : ");
		principle = s.nextInt();
		System.out.println("Enter the time period (in years) : ");
		time = s.nextFloat();
		System.out.println("Enter the Interest (in % by 100 for example: 10% in '0.1') ");
		interest = s.nextFloat();
		// Math.pow((1+interest), time);
		compound = (float) (principle * (Math.pow((1 + interest), time) - 1));
		System.out.println("Compound interest : " + compound);

	}
}
