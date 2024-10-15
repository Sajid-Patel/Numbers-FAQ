package com.numbers;

class FactorialRecursion {

	static int findFactorial(int n) {
		int fact = 1;
		if (n >= 1) {
			fact = n * findFactorial(n - 1);
		}
		return fact;
	}

	public static void main(String[] args) {
		int n = 5;
		int factRes = findFactorial(n);
		System.out.println("Factorial  " + factRes);
	}

}
