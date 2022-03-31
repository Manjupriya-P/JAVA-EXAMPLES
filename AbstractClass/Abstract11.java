package com.onebill.AbstractClass;

 public abstract class Abstract11 {
	 int x;
	 static int y;
	 //y can be accessed via the class name itself since static
	 //to call the x we need to have a constructor
	 public Abstract11(int x) {
		
			this.x = x;
		}
	 
	abstract void m1();
	
	
	void m2() {
		System.out.println("this is a non abstract method");
	}

}
