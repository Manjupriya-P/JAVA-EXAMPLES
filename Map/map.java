package com.onebill.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		HashMap<String,Long> map = new HashMap<>();
		map.put("manju", 12345l);
		map.put("hello", 2345l);
		map.put("hi", 9876l);
		Set<Entry<String, Long>> eset = map.entrySet();
		Iterator<Entry<String, Long>> iterator = eset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("++++++++++++++++++++");
		Set<String> keySet = map.keySet();
		for(String name:map.keySet()) {
			System.out.println(map.get(name)+"===="+name);
		}
		System.out.println(map.get("manju"));
		

		
	}

}
