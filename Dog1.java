package com.qa.inheritance;

public class Dog1 extends Animal1 implements WalkBehaviour, PersonalityBehaviour{

	private String name;
	private int teeth;
	private String color;
	
	public Dog1() {
		super();
	}
	
	
		
	
	
	@Override
	public void walk() {
		System.out.println("Loud woof");
	}
	
	public void dribbles() {
		System.out.println("dribbles all over");
	}

	public String getName() {
		return name;
	}
	
	public void personalityBehaviour() {
		System.out.println("The dog's personality is excentric");
	}
	
	public void walkBehaviour() {
		System.out.println("The dog waddles");
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeeth() {
		return teeth;
	}

	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
