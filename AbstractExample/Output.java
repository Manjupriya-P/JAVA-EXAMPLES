package com.onebill.AbstractExample;

public class Output {

	public static void main(String[] args) {
		System.out.println("halena\r");
		Pet p=new Halena();//upcasting
		p.food();
		p.kind();
		p.sound();
		System.out.println("\r fighter\r");
		Pet h=new Fighter();
		h.food();
		h.kind();
		h.sound();
		//h.m1();
//becoz of upcasting we cant able to access the methods defined to subclass
//only the common methods can be defined
		Fighter downF =(Fighter) h;
		downF.m2();
		Halena downH=(Halena) p;
		downH.m1();
	
	}

}
//if we use without abstraction then we have to create a object for every
//subclass to call the methods in each sub class 
//but if we use an abstract class then just by simply upcasting we can able to
//the overrided methods