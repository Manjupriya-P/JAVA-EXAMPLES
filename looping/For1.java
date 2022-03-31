package com.loop.looping;

public class For1 {
	
	public static void main(String[] args) {
	int i=0;
	// TODO Auto-generated method stub
	for(System.out.println("initialization");i<10;System.out.println("increment"))
	{
			System.out.println(i);
			i++;
	}
	for(System.out.println("initialization");i<10;System.out.println("increment"))
			{
		if(i%2==0) {
					System.out.println(i);
					i++;
		}
			}
	}
}