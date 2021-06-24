package com.qa.helloworld;

public class BlackJack {

	public static void main(String[] args) {

		play(2, 10);
		play(1, 2);
		play(20, 21);
		play(14, 15);
		play(24, 22);
		play(23, 10);
		play(24, 12);

	}

	public static void play(int card1, int card2) {

		if (card1 <= 21 && card1 > card2) {
			System.out.println(card1);
		}

		else if (card1 < card2 && card2 > 21 && card1 < 21) {
			System.out.println(card1);
		} else if (card2 <= 21) {
			System.out.println(card2);
		} else {
			System.out.println(0);
		}

	}

}