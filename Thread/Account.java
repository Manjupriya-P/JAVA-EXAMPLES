package com.onebill.Thread;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	public void withdraw(int amount) {
		if(amount<balance) {
			balance=balance-amount;
		}
	}
	public void deposit(int amount) {
		balance=balance+amount;
	}
	public void getbalance() {
		System.out.println("balance is:"+balance);
	}
	

}
