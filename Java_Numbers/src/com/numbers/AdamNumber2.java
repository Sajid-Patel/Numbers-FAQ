package com.numbers;
/*
  rnsq = Reverse number square
  rnsqr = Reverse number square reverse 
 */
import java.util.Scanner;

class AdamNumber2 {

	// This method is taking the Number as a input & returns the reverse
	public static int reverseNumber(int number) {
		int reverse = 0;
		while (number != 0) {
			int digit = number % 10; // get the last digit
			reverse = reverse * 10 + digit; // add the data to reverse
			number = number / 10; // remove last digit
		}

		return reverse;

	}

	public static void main(String[] args) {

		// Take number from end user
		System.out.println("Enter number to check Amstrong or Not");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		// Square the given number
		int square = number * number;

		// Reverse the given number
		int reverse = AdamNumber2.reverseNumber(number);

		// Square the reverse number
		int rnsq = reverse * reverse;

		// Reverse number square reverse
		int rnsqr = AdamNumber2.reverseNumber(rnsq);

		// Check Adam
		if (rnsqr == square) {
			System.out.println("Entered number is Adam Number");
		} else {
			System.out.println("Entered number is Not Adam Number");
		}

	}

}
