package com.Inheritance.Extends;

public class Manager extends Member {
	String specialization;
	String department;
	public Manager() {
		super();
	}
	public Manager(String name, String age, long mobileNum, String address, int salary, String specialization,
			String department) {
		super(name, age, mobileNum, address, salary);
		this.specialization = specialization;
		this.department = department;
	}
	public void specialization(String spl) {
		System.out.println("the specialization of Member is "+spl);
	}
	public void department(String dpt) {
		System.out.println("the department of employee is "+ dpt);
	}

}
