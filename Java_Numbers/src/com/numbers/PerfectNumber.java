package com.numbers;

import java.util.Scanner;

/*PerfectNumber= Sum of factors of no. is is given no. 
   6=1+2+3
	28=1+2+4+7+14
	
	Factors= remainder should be 0
	
	Algorithm=
	Step 1>Take no. from end user
	Step 2>Take for-loop
	             check the factor & remainder,
	             If remainder is 0 take sum
	
	Step 3>Check the sum & given no.
	             If both are same- PERFECT
	             If both are not same- NOT PERFECT
*/

class PerfectNumber {

	public static void main(String[] args) {

		// Step 1>
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number to check PERFECT...");
		int number = s.nextInt();

		// Step 2>
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}

		// Step 3>
		if (number == sum) {
			System.out.println("Given number is PERFECT");
		}

		else {
			System.out.println("Given number is NOT PERFECT");
		}

	}

}
