package com.numbers;

import java.util.Scanner;

/*
 Fibonacci Series = Sum of last two numbers become next number 
 eg = 0 1 1 2 3 5 8 13 21...
 
  n1=0 
  n2=1
  sum=n1+n2
   
        0      1     1      2  
        n1     n2   sum
               n1   n2     sum
               
               next iteration
               n2 becomes n1    n1=n2;
               sum becomes n2   n2=sum;

 */
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to print Fibonacci Series");
		int number = s.nextInt();

		int n1 = 0;
		int n2 = 1;
		int sum = n1 + n2;
		System.out.print(n1 + " " + n2 + " ");

		for (int i = 3; i <= number; i++) {
			sum = n1 + n2;
			System.out.print(sum + " ");
			n1 = n2;
			n2 = sum;
		}

		s.close();
	}
}
