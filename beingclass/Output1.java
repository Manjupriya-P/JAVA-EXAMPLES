package com.onebill.beingclass;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Output1 {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(1, "manju", "trainee", 100000),
				new Employee(2, "priya", "tester", 15000), new Employee(4, "jayashree", "lead", 25000),
				new Employee(3, "neha", "analyst", 20000));
		//Employee emp = new Employee();
		System.out.println("any match in stream");
		System.out.println("implementation detailed of anymatch");
		Predicate<Employee> p = (emp)->{
			return emp.getName()=="jayashree";
		};
		boolean anyMatch = asList.stream().anyMatch(p);
		System.out.println(anyMatch);
		
		System.out.println("brief anymatch");
		boolean anyMatch2 = asList.stream().anyMatch(emp->emp.getName()=="Manju");
		System.out.println(anyMatch2);
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		System.out.println("filter in stream");
		List<Employee> collect = asList.stream().filter(emp1-> emp1.getSalary()>25000).collect(Collectors.toList());
		System.out.println(collect);
		
		
		System.out.println("###############################################\n");
		System.out.println("implementtion of filter");
		Predicate<Employee> q =(emp2)->{
			return emp2.getSalary()>250000;
		};
		  //collect(Collectors.toList());
		
		
		
		
		
		
	}

	

}
