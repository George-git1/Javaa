package com.qa.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(add(5, 10));
		System.out.println(multiply(10, 2));
		System.out.println(subtract(10, 8));
		System.out.println(divide(2, 4));
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public static String divide(double num1, double num2) {
		String result;
		if (num1 < num2) {
			result = "" + num1 / num2;
			return result;
		} else {
			result = "The divison cannot be performed";
			return result;

		}

	}
}
