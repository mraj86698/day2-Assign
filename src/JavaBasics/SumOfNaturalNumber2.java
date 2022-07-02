package JavaBasics;

import java.util.Scanner;

public class SumOfNaturalNumber2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number, i = 1, sum = 0;

		System.out.print(" Enter the Number : ");
		number = sc.nextInt();

		while (i <= number) {
			sum = sum + i;
			i++;
		}

		System.out.println("\n The Sum of Natural Numbers " + number + " = " + sum);
	}
}
