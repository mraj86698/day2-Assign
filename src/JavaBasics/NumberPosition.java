package JavaBasics;

import java.util.Scanner;

public class NumberPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		int thousands, hundreds, tens, ones;

		ones = number % 10;
		tens = (number / 10) % 10;
		hundreds = (number / 100) % 10;
		thousands = number / 1000;
		System.out.println("Ones= " + ones + " Tens = " + tens + " Hundreds = " + hundreds + " Thousands= " + thousands);

	}

}
