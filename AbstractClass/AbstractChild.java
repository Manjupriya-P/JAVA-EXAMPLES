package com.onebill.AbstractClass;

public class AbstractChild extends Abstract11 {
	//since supercls have constructor we need to have here also
	public AbstractChild(int x) {
		super(x);
	}
	@Override
	void m1() {
		System.out.println("this is overrided abstract method");
		System.out.println("to call x(ins var) we need to have a constructor in a abst clss " + x);
		
		
	}
	

}
