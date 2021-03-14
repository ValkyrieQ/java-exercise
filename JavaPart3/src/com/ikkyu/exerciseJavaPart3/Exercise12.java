package com.ikkyu.exerciseJavaPart3;

public class Exercise12 {

	public static void main(String[] args) {
		Employee emp = new Employee("EmpFirstname", "EmpLastname", 15000);
		CEO ceo = new CEO("CeoFirstname", "CeoLastname", 50000);
		
		System.out.println(emp);
		System.out.println(ceo);
		
		Programmer programmer = new Programmer("PgmFirstname", "PgmLastname", 35000);
		System.out.println("Programmer salary is " + programmer.getSalary());
		
		Programmer pgmAnonymous = new Programmer();
		System.out.println(pgmAnonymous);
		
		Programmer pgmOnlyName = new Programmer("PgmFN", "PgmLN");
		System.out.println(pgmOnlyName);
	}

}
