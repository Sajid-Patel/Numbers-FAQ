package com.numbers;

/*
 Palindrome Number= 
 Given number=121
 Reverse number= 121
 
 Algorithm=
  
	Step 1>Take number from end user

    Step 2> Take the while: number!=0
         a] get the last digit  number%10
         b] store into reverse 
         c] remove the last digit number/10
         d] the above process is repeated for all digits
         
     Step 3> Check given number and reverse number   
 */
import java.util.Scanner;

class PalindromeNumber {

	public static void main(String[] args) {
		// Take number from end user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to check Palindrome Number");
		int number = s.nextInt();

		int temp = number;

		// Take while loop read every digit store into reverse variable
		int reverse = 0;
		while (number != 0) {
			int digit = number % 10; // get last digit
			reverse = reverse * 10 + digit; // store into reverse

			number = number / 10; // remove the last digit

		}
          
		//print the reverse of entered number
		System.out.println("Reverse no is " + reverse);
		
		// Check given number and reverse number
		if (temp == reverse) {
			System.out.println("Entered number is Palindrome Number ");
		} else {
			System.out.println("Entered number is Not Palindrome Number ");
		}
	}

}
