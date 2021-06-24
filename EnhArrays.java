package com.qa.helloworld;

public class EnhArrays {

	public static void main(String[] args) {

		String sentence[] = { "The", "words", "of", "this", "loop" };
		for (String word : sentence) {
			;
			System.out.println(word);
			System.out.println(isOdd(51)); {
			
			}

		}

		int[] numArray;
		numArray = new int[20];
		
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i;
			System.out.println((numArray[i]));
			
		}

		for (int i : numArray) {
			if (isEven(i)) {
				i *= i * i;
			} else {
				i *= i;
			}
			System.out.println(i);
		}
	}
	
	public static boolean isOdd (int num) {
		if (num%2 == 0) {
			return true;
		} else { 
				return false;
		}
	}

	private static boolean isEven(int num) {
		return (num % 2 == 0);
		
	}
}
