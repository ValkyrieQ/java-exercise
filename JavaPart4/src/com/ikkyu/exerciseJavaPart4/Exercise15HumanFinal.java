package com.ikkyu.exerciseJavaPart4;

public class Exercise15HumanFinal extends AbstractEarthling {
	public String firstname;
	public String lastname;
	public int age;
	
	// Declare final property
	public final String msg = "I'm a human";
	
	// Declare final method
	public final void say() {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Exercise15HumanFinal human = new Exercise15HumanFinal("John", "Martin", 47);
		human.move();
		human.eat();
		
		human.say();
	}
	
	public Exercise15HumanFinal() {
		firstname = "Anonymous";
		lastname = "Anonymous";
		age = 0;
	}
	
	public Exercise15HumanFinal(String firstnameInput, String lastnameInput, int ageInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		age = ageInput;
	}

	@Override
	public void move() {
		System.out.println("Run!!!");
	}

	@Override
	public void eat() {
		System.out.println("Very hungry");
	}
}
