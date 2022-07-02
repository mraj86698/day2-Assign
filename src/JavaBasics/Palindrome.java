package JavaBasics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String number, reverse = ""; // Objects of String class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a palindrome");
		number = sc.nextLine();
		int length = number.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + number.charAt(i);
		if (number.equals(reverse))
			System.out.println("Entered number is a Palindrome.");
		else
			System.out.println("Entered number isn't a Palindrome.");

	}

}
