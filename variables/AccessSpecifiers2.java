package com.access.variables;
public class AccessSpecifiers2   {
	public static void main(String[] args) {
		 AccessSpecifiers obj = new AccessSpecifiers();
		 System.out.println(obj.x);//accessed anywhere
		 System.out.println(obj.y);//accessed only if there is a relation
		 System.out.println(obj.z);//can be accessed within the package
		// System.out.println(obj.a);cant be accessed
		 // AccessSpecifiers2 obj2 = new AccessSpecifiers2();
		  //System.out.println(obj.x);//accessed anywhere
		//	System.out.println(obj.y);//accessed only if there is a relation
			//System.out.println(obj.z);//can be accessed within the package
}
//for same package we can access public default and protected  variables
}
