package com.pao.csv;

public class ChallengeDemo {

	/**
	 *  Print integers 1 to N, 
	 *  but print "Fizz" if an integer is divisible by 3, 
	 *  "Buzz" if an integer is divisible by 5, and "FizzBuzz" if an integer is divisible by both 3 and 5
	 */
	private static void print(int n) {
		if (n < 1) return ;
		for (int i = 1; i <= n; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + " : FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println(i + " : Fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + " : Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		print(0);
		print(1);
		print(30);
	}
}
