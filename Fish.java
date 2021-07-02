package com.qa.inheritance;

public class Fish extends Animal1 implements WalkBehaviour, PersonalityBehaviour {

	private String scales;
	private String pattern;
	private int age;
	
	public void opensGills() {
		System.out.println("fish opens its gills");
	}
	
	public void swimsAway() {
		System.out.println("fish swims away from shark");
	}

	public String getScales() {
		System.out.println("Yellow scales");
		return scales;
		
	}

	public void setScales(String scales) {
		this.scales = scales;
		
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
