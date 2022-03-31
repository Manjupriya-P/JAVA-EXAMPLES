package com.onebill.Collections;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;

public class Output4 {

	public static void main(String[] args) {
		Employee obj1 = new Employee(1, "manju", "trainee", 31000);
		Employee obj2 = new Employee(2, "priya", "trainee", 30000);
		Employee obj3 = new Employee(3, "jayashree", "trainee", 32000);
		Employee obj4 = new Employee(4, "nehaa", "trainee", 33000);
		ArrayList<Employee> Listofemployees = new ArrayList<>();
		Listofemployees.add(obj1);
		Listofemployees.add(obj3);
		Listofemployees.add(obj4);
		Listofemployees.add(obj2);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the type of sorting:");
		String s=sc.next();
		switch(s){
			case"id":
				SortByID o2 = new SortByID();
				Collections.sort(Listofemployees, o2);
				break;
			case"name":
				SortByName o1 = new SortByName();
				Collections.sort(Listofemployees, o1);
				break;
			case"salary":
				SortBYSalary o3 = new SortBYSalary();
				Collections.sort(Listofemployees, o3);
				break;
		}
		Iterator<Employee> obj = Listofemployees.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
			
		}

		
		
			
				

		
		
		
		
		
		
		


	}

}
