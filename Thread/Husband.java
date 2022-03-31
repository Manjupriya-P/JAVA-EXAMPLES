package com.onebill.Thread;

public class Husband extends Thread {
	Account account;

	public Husband(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("husband");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(3);
		System.out.println("priority of hus: "+Thread.currentThread().getPriority());
		for(int i=0;i<100;i++) {
			account.withdraw(100);
		}
	}

	
}
