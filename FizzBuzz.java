package com.qa.helloworld;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(14);
	}

	public static void fizzBuzz(int a) {

		if ((a % 3 == 0) && (a % 5 == 0)) {
			System.out.println("Fizz Buzz");
		}

		else if (a % 3 == 0) {
			System.out.println("Fizz");
		} else if (a % 5 == 0) {
			System.out.println("Buzz");

		} else {
			System.out.println(a);

		}
	}
}