package com.onebill.beingclass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Output {

	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(1, "manju", "trainee", 10000),
				new Employee(2, "priya", "tester", 15000), new Employee(4, "jayashree", "lead", 25000),
				new Employee(3, "neha", "analyst", 20000));
//		Stream<Employee> stream = asList.stream();
//		Comparator<Employee> com = (o1,o2)->{
//			return (int)(o1.getSalary()-o2.getSalary());
//		};
//		Optional<Employee> max = stream.max(com);
//		System.out.println(max);
		asList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		double max=0;
		for(int i =0;i<asList.size();i++) {
			if(asList.get(i).getSalary()>max) {
				max=asList.get(i).getSalary();
				
			}
			
		}System.out.println(max);

	}

}
