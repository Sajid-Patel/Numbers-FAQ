package com.numbers;

import java.util.Scanner;

/*
  Strong Number=
  Sum of factorial of each digit is equal to given number
  145= 1! + 4! + 5!
      =1+ (4*3*2*1) + (5*4*3*2*1)
      =1+24+120
      =145
 
 Algorithm=
 Step 1> Take number from End User
 
 Step 2> Take while loop, num!=0
            a. Take first digit number%10
            b. Perform the factorial operation using for-loop
            c. Factorial operation value stored in sum
            d.Remove the first digit   number/10
            e. Above process repeated for all digits
             
 Step 3> Sum of factorial of each digit is equal to give
          i. OK :STRONG NUMBER
          ii. NOT OK : NOT STRONG NUMBER
               
 */
class StrongNumber {

	public static void main(String[] args) {

		// Step 1>
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number to check STRONG NUMBER...");
		int number = s.nextInt();

		int temp = number;

		int sum = 0;
		while (number != 0) {
			// Get the first digit
			int digit = number % 10;

			// Find the factorial of given Digit
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}

			// Add the factorial value to sum
			sum = sum + fact;

			// Remove the Last Digit
			number = number / 10;
		}

		if (sum == temp) {
			System.out.println("Your number is STRONG NUMBER");
		} else {
			System.out.println("Your number is NOT STRONG NUMBER");
		}

	}

}
