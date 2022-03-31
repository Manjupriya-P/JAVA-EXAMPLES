package com.onebill.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Output3 {

	public static void main(String[] args) {
		Employee obj1 = new Employee(1, "manju", "trainee", 30000);
		Employee obj2 = new Employee(2, "priya", "trainee", 30000);
		Employee obj3 = new Employee(3, "jayashree", "trainee", 30000);
		Employee obj4 = new Employee(4, "nehaa", "trainee", 30000);

		ArrayList<Employee> Listofemployees = new ArrayList<>();
		Listofemployees.add(obj4);
		Listofemployees.add(obj2);
		Listofemployees.add(obj1);
		Listofemployees.add(obj3);
		// System.out.println(Listofemployees);
		Collections.sort(Listofemployees);
		Iterator<Employee> obj = Listofemployees.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}

	}

}
