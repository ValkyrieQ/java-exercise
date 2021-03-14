package com.ikkyu.exerciseJavaPart1;

public class Exercise3 {
	public static void main(String[] args) {
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("i = " + i);

		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println("i = " + i);

		float float1 = 12.53f;

		if ((float1 > 10f) && (float1 < 15f)) {
			System.out.println("True");
		}

		char uniChar = '\u0050';

		if ((uniChar == 'N') || (uniChar == 'P')) {
			System.out.println("This character is " + uniChar);
		}

	}
}
