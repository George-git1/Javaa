package com.qa.inheritance;

public class Monkey extends Animal1 implements WalkBehaviour, PersonalityBehaviour {
	
	private String type;
	private String jumpHeight;
	private double height;

	public void climbsBranch() {
		System.out.println("monkey climbs the tree");
	}
	
	public void eatsBanana() {
		System.out.println("mokney unpeels and eats the banana");
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getJumpHeight() {
		return jumpHeight;
	}

	public void setJumpHeight(String jumpHeight) {
		this.jumpHeight = jumpHeight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}

	
