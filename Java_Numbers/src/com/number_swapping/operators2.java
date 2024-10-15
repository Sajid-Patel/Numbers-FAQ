package com.number_swapping;

class operators2 {

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("Original values befor swaping = " + a + ',' + b);

		// Logic 3] = use operator " * " & " / " without usings Third variable
		// here a & b should not b zero
		a = a * b; // 10*20=200
		b = a / b; // 200/20=10
		a = a / b; // 200/10=20
		System.out.println("3] Values after swaping = " + a + ',' + b);
	}

}
