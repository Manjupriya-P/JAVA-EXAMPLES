package com.onebill.AbstractExample;

public class Fighter extends Pet {

	@Override
	void food() {
		System.out.println("eats rice");
		
	}

	@Override
	void sound() {
		System.out.println("sounds pit pit");
	}

	@Override
	void kind() {
		System.out.println("fish");	
	}
	public void m2() {
		System.out.println("remains in the bowl");
	}

	

}
