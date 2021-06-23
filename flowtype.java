package com.qa.helloworld;

public class flowtype {
	public static void main(String[] args) {
		System.out.println(method1(15, 7, false));
	
	}
	public static String method1 (int num1, int num2, boolean booli) {
		String result;
		if(booli) {
			result = " " + (num1 + num2);
			return result;
		} else {
			return result = "" + num1 * num2;
		}
	}
	}
	