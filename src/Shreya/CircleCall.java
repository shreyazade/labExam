package Shreya;

import java.util.Scanner;

class Circle {
	private int radius;
	public float circum, area;

	public void setData(int r) {
		radius = r;
		circum = (float) (2 * 3.14 * r);
		area = (float) (3.14 * r * r);
	}

	public void getData() {
		System.out.println("Circle : ");
		System.out.println("Circumference : " + circum + "\nArea : " + area);
	}
}

class CircleCall {
	public static void main(String[] args) {
		Circle cir = new Circle();
		int r;
		System.out.println("Enter the radius of the circle r : ");
		Scanner xyz = new Scanner(System.in);
		r = xyz.nextInt();

		cir.setData(r);
		cir.getData();
	}
}
