package com.onebill.Thread;

public class Wife extends Thread {
	Account account;

	public Wife(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("wife");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(6);
		System.out.println("priority of wife: " +Thread.currentThread().getPriority());
		for(int i=0;i<100;i++) {
			account.withdraw(100);
		}
	}


}
