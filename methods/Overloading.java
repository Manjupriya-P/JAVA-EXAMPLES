package com.loop.methods;

public class Overloading {
			static void add(int x,int y) {
			System.out.println("2 arguments "+ (x+y));	}
//diff no of argument
		static void add(int x,int y,int z) {
			System.out.println("3 arguments" + (x+y+z));
		}
//diff type of argument
		static void add(int x,double y) {
			System.out.println("diff arguments"+ (x+y));
		}
// diff sequence
		static void add(double x,int y) {
			System.out.println("diff sequence" + (x+y));
		}
		public static void main(String[] args) {
			Overloading.add(3, 2);
			Overloading.add(3, 2,1);
			Overloading.add(3, 4d);
			Overloading.add(3d, 2);
		
		
			
		}

}
