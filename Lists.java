package com.qa.helloworld;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Lists {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("League");
		names.add("CS");
		names.add("WOW");
		names.add("COD");
		names.add("Classic");
		names.add("Fortnite");
		names.add("Fifa");

		System.out.println(names);
		System.out.println(names.get(2));

		names.set(1, "Counter Strike");
		names.set(3, "World of Warcraft");
		System.out.println(names);

		for (String name : names) {
			System.out.println(name);

		}
		{
			names.remove(2);
			names.remove(4);
			names.remove(1);
			System.out.println(names);

		}
		{
			names.add(" Bannana");
			names.add("Fruit");
			names.add("Pear");

			Collections.sort(names);
			System.out.println(names);

			Collections.reverse(names);
			System.out.println(names);

			Collections.swap(names, 3, 4);
			System.out.println(names);

			

			System.out.println(names.size());

		}
	}
}
