package com.oca8.module5.encapsulation;

public class MemberVariableTest {

	private int myValue = 0;

	public void showOne(int myValue){
		myValue = myValue;
		System.out.println(this.myValue);
	}

	public void showTwo(int myValue){
		this.myValue = myValue;
		System.out.println(this.myValue);
	}    
	public static void main(String[] args) {
		MemberVariableTest ct = new MemberVariableTest();
		ct.showOne(100);
		ct.showTwo(200);
	}

}
