package com.number_swapping;

class operators1 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Original values befor swaping = " + a + ',' + b);
		// Logic 2] = use operator " + " & " - " without usings Third variable
		a = a + b; // 10+20=30
		b = a - b; // 30-20=10
		a = a - b; // 30-10=20
		System.out.println("2] Values after swaping = " + a + ',' + b);
	}

}
