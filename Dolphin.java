package com.qa.inheritance;

public class Dolphin extends Animal1 implements WalkBehaviour, PersonalityBehaviour {

	private String location;
	private int age;
	private String size;
	
	public void sqout() {
		System.out.println("Water spouts everywhere");
	
	}
	
	public void dives() {
		System.out.println("incredibly the dolphin dives");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void personalityBehaviour() {
		System.out.println("The dolphin is happy and friendly");
		
	}

	@Override
	public void walkBehaviour() {
		System.out.println("The dolphin cannot walk");
		
	}
	
}
