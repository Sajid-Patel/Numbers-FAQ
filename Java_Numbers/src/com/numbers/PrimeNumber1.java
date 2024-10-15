
package com.numbers;

import java.util.Scanner;

/*
 Prime Number= The number divisible by 1 & itself 
 eg = 2, 3, 5, 7, 11, 13, etc. 
 
  Algorithm =
  Step1> Take the  number to check  the  Prime
  
  Step2> Take to for loop  to check the divisible
          Ignore 1 & number, check the middle numbers
           fact=0;
           for(int i=2;i<number;i++)
           if(number % i==0) 
           fact++;
           break;
           
   Step3> Check the factor is 0 or not
    If 0 it is Prime
    If not 0 then it is not Prime 
  
 */
class PrimeNumber1 {

	public static void main(String[] args) {

		// Step 1> Take the input from end-user

		System.out.println("Enter your number to check Prime or not");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		// Step 2> Take the for loop to check the Divisible

		int fact = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				fact++;
				break;
			}
		}

		// Step3> Check the factor is 0 or not
		if (fact == 0) {
			System.out.println("Your number is Prime");
		} else {
			System.out.println("Your number is Not Prime");
		}

		s.close();

	}

}
