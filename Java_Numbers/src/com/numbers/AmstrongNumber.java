package com.numbers;

import java.util.Scanner;

/*
 Amstrong Number = The sum of power of each digit is equals to give number
   153 = 1^3 + 5^3 + 3^3
          1  + 125 + 27 = 153
          
   1634 = 1^4 + 6^4 + 3^4 + 4^4
           1  + 1296 + 81 + 256 = 1634
           
           
  Algorithm=
  
	Step 1> Take the number from end user
	
	Step 2> Count the number o digits
	           Take the while loop, remove the last digit count++
	           
	Step 3> Take the while loop to perform power values
	       a] Get the last digit    ---- digit=number%10
	       b] Make the power Math.power(digit,count) store into sum
	       c] Remove the last digit ---- number=number/10
	       d] Above process repeat all digits
	       
	Step 4> Check the sum & given number
	       a] Both are same - Amstrong Number
	       b] Both are not same - Not Amstrong Number 
   
 */
class AmstrongNumber {

	public static void main(String[] args) {

		System.out.println("Enter number to check Amstrong or Not");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		int temp1 = number;

		int temp2 = number;

		// Calculate the number of digits
		int count = 0;
		while (temp1 != 0) {
			temp1 = temp1 / 10;
			count++;
		}

		// Take while loop to perform power values

		int sum = 0;
		while (temp2 != 0) {
			int digit = temp2 % 10;

			// Math.pow(digit, count)---default value is double so typecast it to int
			sum = sum + (int) Math.pow(digit, count);
			temp2 = temp2 / 10;
		}

		// Check the sum with given number
		if (sum == number) {
			System.out.println("Entered number is Amstrong");
		} else {
			System.out.println("Entered number is Not Amstrong");
		}
	}

}
