package com.numbers;

//Print all Prime number from 1 to 100
class PrimeNumber2 {

	public static void main(String[] args) {

		System.out.println("Print all Prime Numbers from 1-100");

		for (int i = 1; i <= 100; i++) {
			// i will print 1-100

			// Prime number logic starts
			int n = i;
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(n);
			}

		}

	}

}
