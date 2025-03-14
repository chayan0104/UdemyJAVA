package com.demoApi.javaTrainee;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.expression.spel.ast.RealLiteral;

public class Life {
	public static void main(String[] args) {
		// Not so important
		ArrayList<String> tempStuff = new ArrayList<>(Arrays.asList("Social Media", "Shows", "Unimportant"));
		tempStuff.clear();
		System.out.println("Removed from heart: " + (tempStuff.isEmpty()) + " | Removed from brain: " + (tempStuff == null));

		// Important ones
		ArrayList<String> impStuff = new ArrayList<>(Arrays.asList("Family", "Health", "Mine"));
		// Correct index and string comparison
		if (impStuff.get(2).equals("Mine")) {
			System.out.println("Needed,what's mine");
			System.out.println("Anyway,what really matters are:");
			for (String item : impStuff) {
				System.out.println("- " + item);
			}

		} else {
			System.out.println("not needed,if not mine");
		}
	}
}
