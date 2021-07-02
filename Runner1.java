package com.qa.inheritance;

public class Runner1 {
	public static void main(String[] args) {
		Animal1 a = new Dog1();
		
		Dolphin dolphin = new Dolphin();
		dolphin.dives();
		
		Monkey monkey = new Monkey();
		monkey.eatsBanana();
		
		Fish fish = new Fish();
		fish.swimsAway();
		fish.getScales();
		
		Animal1 b = new Dog1();
		b.jumps();
	
		
		WalkBehaviour walkBehaviour = (WalkBehaviour) a;
		walkBehaviour.walkBehaviour();
		
		PersonalityBehaviour personalityBehaviour = new Dog1();
		personalityBehaviour.personalityBehaviour();
		
		PersonalityBehaviour personalityBehaviour1 = new Dolphin();
		personalityBehaviour1.personalityBehaviour();
		
		WalkBehaviour walkBehaviour1 = (WalkBehaviour) dolphin;
		walkBehaviour1.walkBehaviour();
		
		
	}
	
}
