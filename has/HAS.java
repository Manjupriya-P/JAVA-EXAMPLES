package com.onebill.has;

public class HAS {
	String Brand;
	double price;
	Rom rom;//we create a class for non primitive datatype and using it as class
	Screen screen;
	Battery battery;
//Battery is a datatype and battery is a variable

	@Override
	public String toString() {
		return "HAS [Brand=" + Brand + ", price=" + price + ", rom=" + rom + ", screen=" + screen + ", battery="
				+ battery + "]";
	}

}
