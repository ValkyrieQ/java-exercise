package com.ikkyu.exerciseJavaPart4;

public class Exercise15Human extends AbstractEarthling {

	public String firstname;
	public String lastname;
	public int age;
	
	public static void main(String[] args) {
		Exercise15Human human = new Exercise15Human("John", "Martin", 47);
		human.move();
		human.eat();
	}
	
	public Exercise15Human() {
		firstname = "Anonymous";
		lastname = "Anonymous";
		age = 0;
	}
	
	public Exercise15Human(String firstnameInput, String lastnameInput, int ageInput) {
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
