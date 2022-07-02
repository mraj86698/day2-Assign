package JavaBasics;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int reverse = 0;
		int num = sc.nextInt();

		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverse);

	}

}
