package com.ikkyu.exerciseJavaPart3;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		int temp = 123;
	}
	
	
	public void hello() {
		System.out.println("Hello " + firstname);
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "My name is " + firstname + " " + lastname + ", My salary = " + getSalary();
	}
}
