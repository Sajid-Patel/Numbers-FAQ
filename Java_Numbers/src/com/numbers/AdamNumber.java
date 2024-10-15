package com.numbers;
/*Lengthy core - 2 times while loop is repeated so to overcome this
 declare one while loop in method and call that method----> package com.numbers; ---- AdamNumber2
 
 */
import java.util.Scanner;

/*
 Adam Number= Initial number square is equal to reverse number square reverse
 12^2--->144
 21^2--->441
 
 Algorithm=
  
	Step 1>Take the input from end user
	
	Step 2>Square the number
	
	Step 3>Reverse the given number
	     a]Get the last digit     %10
	     b]add the reverse number *10
	     c]remove the last digit  /10
	
	Step 4>Square the reverse number
	
	Step 5>Reverse the Square data
	
	Step 6>Initial number square is equal to reverse number square reverse
	
  
 */
class AdamNumber {

	public static void main(String[] args) {
		// Take number from end user
		System.out.println("Enter number to check Amstrong or Not");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		// Square the given number
		int square = number * number;

		// Reverse the given number
		int reverse = 0;
		while (number != 0) {
			int digit = number % 10; // get the last digit
			reverse = reverse * 10 + digit; // add the data to reverse
			number = number / 10;
		}
		
		/*
		  rnsq = Reverse number square
		  rnsqr = Reverse number square reverse 
		 */
		
		
		// Square the reverse number
		int rnsq = reverse * reverse;

		// Reverse number square reverse
		int rnsqr = 0;
		while (rnsq != 0) {
			int digit = rnsq % 10;
			rnsqr = rnsqr * 10 + digit;
			rnsq = rnsq / 10;
		}

		// Check Adam
		if (rnsqr == square) {
			System.out.println("Entered number is Adam Number");
		} else {
			System.out.println("Entered number is Not Adam Number");
		}

	}

}
