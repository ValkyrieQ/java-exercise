package com.ikkyu.exerciseJavaPart4;

public class Exercise15Enum {
	enum Status {
		TIRED,
		HAPPY,
		ANGRY,
		SLEEPY
	}
	public static void main(String[] args) {
		Status myStatus = Status.TIRED;
		switch (myStatus) {
		case ANGRY:
			System.out.println("calm down bro~~~");
			break;
		case HAPPY:
			System.out.println("I'm happy to hear that");
			break;
		case SLEEPY:
			System.out.println("Go to sleep now!");
			break;
		case TIRED:
			System.out.println("Take a rest");
			break;
		default:
			System.out.println("What do you feel?");
		}
	}

}
