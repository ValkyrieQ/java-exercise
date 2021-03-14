package com.ikkyu.exerciseJavaPart4;

public class Programmer extends Employee implements IWebsiteCreator {
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
	
	public Programmer() {
		super("Anonymous", "Anonymous", 9000);
	}
	
	public Programmer(String firstnameInput, String lastnameInput) {
		this();
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
	}
	
	public void createWebsite(String template, String titleName) {
		System.out.println("Create Website!");
	}
	
	public void installWindows(String version, String productKey) {
		System.out.println("Install Windows");
	}
}
