package JavaBasics;

import java.util.Scanner;

public class MonthValidation {

	public static void main(String[] args) {
		
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		if(month>=3 &&	month<=6) {
			if((month==3 && day>20) ||(month==6 && day<20) ){
				System.out.println("valid");
			}
			else {
				System.out.println("invalid");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
