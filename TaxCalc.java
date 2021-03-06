package com.qa.helloworld;

public class TaxCalc {

	public static void main(String[] args) {
		
		System.out.println(exactAmount(10000));
	}

	public static double salaryTax(double a) {

		if (a < 15000) {
			return 0;

		} else if (a < 20000) {
			return 0.1;

		} else if (a < 30000) {
			return 0.15;
		} else if (a < 45000) {
			return 0.2;
		} else {
			return 0.25;
		}
	}

	public static double taxAmount(double b) {
		
		if (b< 15000 ) {
			return 0;
		}
		
		else if (b< 20000) {
			return 0.1 * b;
			
		}
		
		else if (b< 30000) {
			return 0.15 * b;
		}
		else if (b< 45000) {
			return 0.2 * b;
	
		}
		else {
				return 0.25 * b; 
		}
	}

	public static double exactAmount(double salary) {
			return salary - taxAmount(salary);
	}
}