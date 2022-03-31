package com.loop.looping;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
		while (i < 10) {
			if (i % 2 == 0) {
				System.out.println(i);
				i++;
			}
			System.out.println("hello");
		}
		System.out.println("hi");
		 
		}	
		
		}
//always define relational operators(limit) in while condition and 
//define conditions in if statement
//becoz here during first time execution while is true and if also true so i is incremented
//then while is true but if is not true so i is not printed afterwards and during each while 
//loop execution hello is printed
// the hi print is never executed since while loop is never ending

