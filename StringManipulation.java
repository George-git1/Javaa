package com.qa.helloworld;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str1 = "Today it is sunny";
		String str2 = "Yesterday it was raining";
		System.out.println(str1 + ", " + str2);
		System.out.println(str1.toUpperCase()+ ", " + str2.toUpperCase());
		
		String subString = str1.substring(0, 11);
		String subString2 = str2.substring(16, 24);
		System.out.println(subString.toUpperCase() + subString2.toUpperCase());
		string();
		string2();
		string3();
		string4();
		
	}
	
	
		public static void string() {
			String str1 = "String manipulation";
			int stringLength = str1.length();
			System.out.println("String Length is " + stringLength);
					
		}
		
		public static void string2() {
			String str1 = "String vertical";
			System.out.println(str1.substring(0,6));
			System.out.println(str1.substring(7,15));
			
		}
		
		public static void string3() {
			String str1 = "String reverse";
			System.out.println(str1.substring(7, 14));
			System.out.println(str1.substring(0,6));
		}
		
		public static void string4() {
			String str1 = "Good day";
			String str2 = "Bad day";
			System.out.println(str1.equals(str2));
			
		}
}


	