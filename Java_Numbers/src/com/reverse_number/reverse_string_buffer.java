package com.reverse_number;

import java.util.Scanner;

/*Reverse a number using string_buffer
  Convert a int to string using String Buffer and then reverse it
 */
class reverse_string_buffer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int number = s.nextInt();

		StringBuffer sb = new StringBuffer(String.valueOf(number));
		StringBuffer rev = sb.reverse();

		System.out.println("Reverse of entered number is = " + rev);
	}

}
