package com.onebill.Collections;
import java.util.List;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(60);
		System.out.println(list);
		
		 List li=new ArrayList();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		
		System.out.println(li);
		list.addAll(li);
		System.out.println(li);
		ArrayList l=new ArrayList();
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		System.out.println(l);
		
		
		
		l.remove(3);
		l.remove(2);
		System.out.println(l);
		
		
		
	}

}
