package com.oca8.module8.api;

interface Account{
	public default String getId(){
		return "0000";
	}
}

interface PremiumAccount extends Account{
//	String g	etId();

	default String getId(){
		return "1111"; }
}

class A implements Account {
	public static void main(String[] args) {
		System.out.println(new A().getId());
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
}