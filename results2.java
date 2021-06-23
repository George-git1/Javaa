package com.qa.helloworld;

public class results2 {

	// methods
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

	public static String passMark(int bio, int chem, int phys) {
		String result;
		double percentage = (100 * (bio + chem + phys)) / 450;
		if (percentage >= 60) {
			result = "Nice job you passed with ";
			return result + percentage;
		} else {
			result = " You failed with ";
			return result + percentage;
		}
	}

	public static String bioMark(int biologyScore) {
		String result;

		if (biologyScore >= 90) {
			result = "Nice marks on bio with ";
			return result + biologyScore;
		} else {
			result = "failure on bio with ";
			return result + biologyScore;

		}
	}

	public static String chemMark(int chemistryScore) {
		String result;

		if (chemistryScore >= 90) {
			result = "Nice marks on chem with ";
			return result + chemistryScore;
		} else {
			result = "failure on chemistry with ";
			return result + chemistryScore;
		}
	}

	public static String physMark(int physicsScore) {
		String result;

		if (physicsScore >= 90) {
			result = "Nice marks on phys with ";
			return result + physicsScore;
		} else {
			result = "failure on phys with ";
			return result + physicsScore;
		}

	}

	


	private static int bio(int chem, int phys) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		int biologyScore = 95;
		int chemistryScore = 120;
		int physicsScore = 30;
		System.out.println(displayResults(biologyScore, chemistryScore, physicsScore));
		System.out.println("PERCENTAGE\r\n" + percentageResults(biologyScore, chemistryScore, physicsScore) + "%");
		System.out.println(passMark(biologyScore, chemistryScore, physicsScore) + "%");
		System.out.println(bioMark(biologyScore) + " \r\n" + chemMark(chemistryScore) + "  \r\n" + physMark(physicsScore));
		
	}

}
