package com.reverse_number;

import java.util.Scanner;

/*Reverse a number using string_builder
Convert a int to string using String Builder and then reverse it
*/
class reverse_string_builder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int number = s.nextInt();

		StringBuilder sbl = new StringBuilder();
		sbl.append(number);
		StringBuilder rev = sbl.reverse();

		System.out.println("Reverse of entered number is = " + rev);

	}

}
