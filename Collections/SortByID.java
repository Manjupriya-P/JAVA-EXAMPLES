package com.onebill.Collections;

import java.util.Comparator;

public class SortByID implements Comparator<Employee> {

	
	

	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

}
