package JavaBasics;

import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a, b and c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("The output of a+b*c = "+(a+b+c));
		System.out.println("The output of c+a/b = "+(c+a/b));
		System.out.println("The output of a%b+c = "+(a%b+c));
		System.out.println("The output of a*b+c = "+(a*b+c));
		System.out.printf("Max integer: %d%n", Math.max(a,b));
        System.out.printf("Min integer: %d%n", Math.min(a,b));
		sc.close();
	}

}
