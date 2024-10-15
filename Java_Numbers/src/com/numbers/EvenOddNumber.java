package com.numbers;

import java.util.Scanner;

class EvenOddNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to check Even or Odd");
		int number = s.nextInt();

		if (number % 2 == 0) {
			System.out.println("Even");

		} else {
			System.out.println("Odd");
		}
	}

}
