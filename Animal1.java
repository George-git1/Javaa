package com.qa.inheritance;

public abstract class Animal1 {

	private String species;
	private int legs;
	private int age;

	public void runs() {
		System.out.println("runs happily");
	}

	public void jumps() {
		System.out.println("jumps incredibly ");
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void walk() {
		// TODO Auto-generated method stub

	}

	public void woof() {
		// TODO Auto-generated method stub

	}

}
