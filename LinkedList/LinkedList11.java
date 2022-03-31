package com.onebill.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList11 {

	public static void main(String[] args) {
LinkedList<Integer> obj = new LinkedList<>();
obj.add(12);
obj.add(13);
obj.add(14);
obj.add(16);
obj.add(17);
Iterator<Integer> iobj = obj.iterator();
Collections.sort(obj);
for(Integer name:obj) {
	System.out.println(name);
}

	}

}
