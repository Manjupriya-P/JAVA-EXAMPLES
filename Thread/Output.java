package com.onebill.Thread;

public class Output {
	public static void main(String[] args) {
		Account account = new Account(100000);
		Husband husband = new Husband(account);
		Wife wife=new Wife(account);
		System.out.println(Thread.currentThread().getName());
		husband.start();
		
		wife.start();
		
		try {
			Thread.sleep(1000);
			account.getbalance();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}
	

}
