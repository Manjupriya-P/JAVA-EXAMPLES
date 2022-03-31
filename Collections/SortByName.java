package com.onebill.Collections;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
