package com.number_swapping;

class third_variable {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Original values befor swaping = " + a + ',' + b);

		// Logic 1] = Third variable
		int c = a;
		a = b;
		b = c;
		System.out.println("1] Values after swaping = " + a + ',' + b);
	}

}
