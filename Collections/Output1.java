package com.onebill.Collections;
import java.util.*;
public class Output1 {

	public static void main(String[] args) {
		Employee obj1 = new Employee(1, "manju","trainee", 30000);
		Employee obj2 = new Employee(2, "priya","trainee", 30000);
		Employee obj3 = new Employee(3, "jayashree","trainee", 30000);
		Employee obj4 = new Employee(4, "nehaa","trainee", 30000);
		
//		System.out.println(obj1);
//		System.out.println(obj2);
		System.out.println("===============================");
		ArrayList<Employee> Listofemployees=new ArrayList<>();
		Listofemployees.add(obj1);
		Listofemployees.add(obj3);
		Listofemployees.add(obj4);
		Listofemployees.add(obj2);
		System.out.println(Listofemployees);
		System.out.println("++++++++++++++++++++++");
		for(int i=0;i<Listofemployees.size();i++) {
			System.out.println(Listofemployees.get(i));
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		for(Employee employee:Listofemployees) {
			System.out.println(employee);
		}
		
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		
		Iterator<Employee> obj = Listofemployees.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		
		
		
	}
	

}
