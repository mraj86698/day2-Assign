package JavaBasics;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, i, sum = 0;

		System.out.print(" Enter the Number : ");
		number = sc.nextInt();

		for (i = 1; i <= number; i++) {
			sum = sum + i;
		}

		System.out.println("\n The Sum of Natural Numbers " + number + " = " + sum);

	}

}
