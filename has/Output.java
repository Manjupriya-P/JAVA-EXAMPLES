package com.onebill.has;

public class Output {

	public static void main(String[] args) {
		Battery obj1 = new Battery();
		System.out.println(obj1);
		obj1.type = "lithium";
		obj1.capacity = 25000;
		Screen obj2 = new Screen();
		obj2.resolution = 2045;
		obj2.type = "amalode";
		Rom obj3 = new Rom();
		obj3.type = "ssd";
		obj3.frequency = "12ghz";
		HAS OBJ = new HAS();
		OBJ.Brand = "acer";
		OBJ.price = 150000d;
		System.out.println(obj3);
	
		
		OBJ.battery=obj1;//
		OBJ.rom=obj3;
		OBJ.screen=obj2;
		System.out.println(OBJ);
		

	}

}
