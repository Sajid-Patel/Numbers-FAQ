package com.number_swapping;

class single_statement {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Original values befor swaping = " + a + ',' + b);
        
		// Logic 5] = Single Statement
		b = a + b - (a = b); // here execution starts from right to left
		System.out.println("3] Values after swaping = " + a + ',' + b);
	}

}
