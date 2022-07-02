package JavaBasics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String reverse = "";
		String num = sc.nextLine();
		int length = num.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + num.charAt(i);
		System.out.println(reverse);

	}

}
