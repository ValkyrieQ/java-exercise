package com.ikkyu.exerciseJavaPart3;

public class Exercise103 {

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("Emp_FN1", "Emp_LN1", 15000);
		employees[1] = new Employee("Emp_FN2", "Emp_LN2", 30000);
		employees[2] = new Employee("Emp_FN3", "Emp_LN3", 70000);

		for (Employee emp : employees)
			System.out.println(emp);
	}
}
