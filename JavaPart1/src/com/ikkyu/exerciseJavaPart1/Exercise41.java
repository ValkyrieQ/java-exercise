package com.ikkyu.exerciseJavaPart1;

public class Exercise41 {
	public static void main(String[] args) {
		int score = 35;
		boolean isHandSome = false;
		if (isHandSome) {
			System.out.println("Good");
		} else {
			if (score >= 80)
				System.out.println("Good");
			else if ((score >= 50) && (score < 80))
				System.out.println("normal");
			else
				System.out.println("fail");
		}
	}
}
