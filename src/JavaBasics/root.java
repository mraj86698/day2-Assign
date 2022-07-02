package JavaBasics;

import java.util.Scanner;

public class root {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a, b and c to find the roots of the equation");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		float root1 = (float) (-b + Math.sqrt(Math.pow(b, 2)) - 4 * a * c) / 2 * a;
		float root2 = (float) (-b - Math.sqrt(Math.pow(b, 2)) - 4 * a * c) / 2 * a;
		System.out.println("The roots of the quadratic equation " + a + "^2+" + b + "x+" + c + " = " + root1 + "," + root2);
		sc.close();

	}
}