package com.ikkyu.exerciseJavaPart3;

public class Exercise132EmployeeClass {

	public String firstname;
	public String lastname;
	public String position;
	private int salary;

	public static void main(String[] args) {
		Exercise132EmployeeClass emp = new Exercise132EmployeeClass("MgrFn", "MgrLN", 40000, "Manager");
		emp.checkPosition();
	}
	
	public Exercise132EmployeeClass(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		position = positionInput;
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
	
	public void checkPosition() {
		System.out.println("My Position is " + position);
	}
	
	


}
