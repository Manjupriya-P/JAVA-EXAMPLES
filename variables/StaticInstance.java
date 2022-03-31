package com.access.variables;

public class StaticInstance {
	static int y = 20;
	int x = 10;

	public static void main(String[] args) {

		StaticInstance obj1 = new StaticInstance();
		System.out.println(obj1.x);//10
		System.out.println(obj1.y);//20
		
		StaticInstance obj2 = new StaticInstance();
		obj2.x=100;
		obj2.y=2000;
		System.out.println(obj2.x+"  "+ obj1.x);
		System.out.println(obj2.y+"   "+obj1.y);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
	
	}

}
