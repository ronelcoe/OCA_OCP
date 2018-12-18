package com.oca8.module6.inheritance;

public class TwoInterfaceImpl implements I1, I2 {
	public void m1() { System.out.println("Hello"); }
	public static void main(String[] args) {
		TwoInterfaceImpl tc = new TwoInterfaceImpl();
		( (I1) tc).m1();
		System.out.println(((I1) tc).VALUE);
	}
}	

interface I1{
	int VALUE = 1;
	void m1();
}
interface I2{
	int VALUE = 2;
	void m1();
}
