package com.lab17;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean cont = true;
		int num;
		String userInput;

		System.out.println("Let's locate some primes!");
		System.out.println("This application will find you any prime, in order, from first prime number on.");

		do {

			int userNum = Validator.getInt(scan, "Which prime number are you looking for?", 1);
			int n = scan.nextInt();

			int result = getNthPrime(n);
			System.out.println("the prime number is " + result);

			System.out.println("Do you want to continue? (y/n)");
			userInput = scan.next();
		} while (userInput.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
	}

	public static int getNthPrime(int num) {
		int nthPrime = 1;
		int startingPrime = 2;

		while (nthPrime != num) {
			startingPrime++;

			if (isPrime(startingPrime)) {
				nthPrime++;
			}
		}

		return 0;
	}

	public static boolean isPrime(int num) {
		// check if n is a multiple of 2, if yes then number is not a prime num
		if (num > 2 && num % 2 == 0)
			return false;
		// check the odds,and increase by 2 each time
		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
