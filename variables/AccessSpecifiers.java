package com.access.variables;

public class AccessSpecifiers {
	public int x=10;
	protected int y=20;
	int z=30;
	private int a=40;

	public static void main(String[] args) {
		AccessSpecifiers obj = new AccessSpecifiers();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.a);
		}

}
