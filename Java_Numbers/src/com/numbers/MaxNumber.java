package com.numbers;

class MaxNumber {

	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 2;
		int num3 = -1;
		if (num1 >= num2 && num1 >= num3)
			System.out.println(num1 + " is the maximum number.");
		else if (num2 >= num1 && num2 >= num3)
			System.out.println(num2 + " is the maximum number.");
		else
			System.out.println(num3 + " is the maximum number.");
	}

}
