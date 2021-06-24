package com.qa.helloworld;

public class Arrays {

	public static void main(String[] args) {

		int[] bArray;
		bArray = new int[10];
		

		for (int i = 0; i < bArray.length; i++) {
			bArray[i] = i;
			System.out.println((bArray[i]));
		
		}
		for (int i = 0; i < bArray.length; i++) {
			bArray[i] *= 10;
			System.out.println(bArray[i]);
		}
	}
}
