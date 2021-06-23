package com.qa.helloworld;

public class Results {
	// methods

	public static int passMark(int bio, int chem, int phys) {
		
		int passMark = (60);
		
		if number = (bio + chem + phys < 60);
		
		System.out.println("Fail");
		}else if(number>60)

	{
		System.out.println("Pass");
	}return passMark;
	}

	public static String displayResults(int bio, int chem, int phys) {
		String results = "SCORES\r\n";
		results += "Biology: " + bio + "/150\r\n";
		results += "Chemistry: " + chem + "/150\r\n";
		results += "Physics: " + phys + "/150\r\n";
		results += "Total: " + (bio + chem + phys) + "/450\r\n";
		return results;
	}

	public static double percentageResults(int bio, int chem, int phys) {
		
		double percentage = (100 * (bio + chem + phys)) / 450;
		return percentage;
	}

	public static void main(String[] args) {
		int biologyScore = 100;
		int chemistryScore = 112;
		int physicsScore = 137;
		System.out.println(displayResults(biologyScore, chemistryScore, physicsScore));
		System.out.println("PERCENTAGE\r\n" + percentageResults(biologyScore, chemistryScore, physicsScore) + "%");
		System.out.println("Pass Mark\r\n" + passMark(biologyScore, chemistryScore, physicsScore) + "%");
	}

	public static int total(int num) {
		return num = 450;
	}
}
