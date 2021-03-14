package com.ikkyu.exerciseJavaPart4;

public abstract class AbstractEarthling {
	public int i = 1;

	public abstract void move();
	public abstract void eat();

	// Remember : Non-abstract methods are also allowed
	public void stand() {
		System.out.println("Stand Still...");
	}
}
