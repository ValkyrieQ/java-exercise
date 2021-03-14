package com.ikkyu.exerciseJavaPart1;

public class Exercise45 {
	public static void main(String[] args) {
		// lab9();
		lab10();
	}

	public static void lab9() {
		int count = 20;
		for (int counter = 1; counter <= count; counter++) {
			if (counter == 11) {
				System.out.println("!!! Special print: " + counter);
				continue;
			}
			System.out.println("Normal print: " + counter);
		}
	}

	public static void lab10() {
		for (int counter = 1; counter <= 10; counter++) {
			if (counter == 2)
				continue;
			System.out.println("The number is " + counter);
		}
	}
}
