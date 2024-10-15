package com.number_swapping;

class bitwiseXOR {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Original values befor swaping = " + a + ',' + b);

		// Logic 4] = use bitwise XOR (^) operator -converts to binary format
		a = a ^ b; // 10^20=30
		b = a ^ b; // 30^20=10
		a = a ^ b; // 30^10=20
		System.out.println("3] Values after swaping = " + a + ',' + b);

	}

}
