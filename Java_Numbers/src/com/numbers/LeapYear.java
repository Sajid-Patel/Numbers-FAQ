package com.numbers;

class LeapYear {

	public static void main(String[] args) {
		int num = 2024;
		if ((num % 400 == 0) || (num % 100 != 0) && (num % 4 == 0)) {
			System.out.println("Leap Year");

		} else {
			System.out.println("Not Leap Year");

		}

	}

}
