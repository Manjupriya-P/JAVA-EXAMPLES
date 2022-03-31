package com.loop.methods;

public class Meth {

	
		// TODO Auto-generated method stub
		static void mul(int a,int b) {
			int mul=a*b;
			System.out.println("using void");
			
			System.out.println(mul);
			return;
			}
		static float add(float x,float y){
			System.out.println("using float i.e, datatype");
			float add=x+y;
			return add;
		}
		public static void main(String[] args) {
			 Meth.mul(1,2);
			 float d=Meth.add(5f,10f);
			 System.out.println(d);
			 			
			

		}
}
