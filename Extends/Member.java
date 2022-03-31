package com.Inheritance.Extends;

public class Member {
	String name;
	String age;
	long mobileNum;
	String address;
	int salary;
	public Member(String name, String age, long mobileNum, String address, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNum = mobileNum;
		this.address = address;
		this.salary = salary;
	}
	public Member() {
		super();
	}
	public void name(String nm) {
		System.out.println("Name of the employer is: "+nm );
		
	}
	public void age(int ag) {
		System.out.println("The age of the employee is: "+ ag);
	}
	public void mobileNum(long num) {
		System.out.println("Mobile Number: "+ num);
		
	}
	public void address(String add,String name) {
		//name(nm);
		System.out.println("Address of the " + name +"is:"+ add);
	}
	public void salary(int sal) {
		System.out.println("Salary is: "+ sal);
		
	}

}
