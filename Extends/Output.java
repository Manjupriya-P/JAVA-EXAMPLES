package com.Inheritance.Extends;

public class Output {

	public static void main(String[] args) {
		Employee obj=new Employee();
		System.out.println("For the Employee");
		obj.name("neha");
		obj.age(23);
		obj.mobileNum(98234567);
		obj.address("nehru Nagar","neha");
		obj.specialization("EEE");
		obj.department("Instrumentation");
		System.out.println("\r=======================================\r");

		Manager obj1=new Manager();
		System.out.println("For the Manager");
		obj1.name("monikaa");
		obj1.age(25);
		obj1.mobileNum(987654321);
		obj1.address("Ammapet Sathya Nagar","monikaa");
		obj1.specialization("ECE");
		obj1.department("technical");
	}

}
