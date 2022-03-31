package com.onebill.Collections;

import java.util.Arrays;

public class IncreaseCapacity {
	private Object[] array;
	private int size;
	int position;
	public IncreaseCapacity(int size) {
	
		this.size = size;
		array =new Object[size];
	}
	public IncreaseCapacity() {
		array =new Object[size];
		
	}
	public void add(Object obj) {
		if(position>=size) {
			increasecapacity();
		}
		array[position]=obj;
		position++;
	}
	private void increasecapacity() {
		this.size=((size*3)/2)+1;
		Object[] temp;//declaring temp array
		temp=new Object[size];//equalising array size
		for(int i=0;i<array.length;i++) {
			temp[i]=array[i];
		}
		array=temp;
	}
		
		public void test() {
			System.out.println(Arrays.toString(array));
		
	}
	

	
}
