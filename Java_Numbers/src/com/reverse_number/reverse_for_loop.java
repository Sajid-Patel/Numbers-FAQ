package com.reverse_number;
//Reverse a number using algorithm---IMP
import java.util.Scanner;

class reverse_for_loop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int number = s.nextInt();

		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Reverse of entered number is = " + rev);
	}

}
