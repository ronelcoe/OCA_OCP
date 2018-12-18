package com.oca8.module6.inheritance;

public class ThreeConst {

	public ThreeConst(int x) {
		System.out.println("in int const: " + x);
	}
	
	public ThreeConst(double x) {
		System.out.println("in double const: " + x);
	}
	
	void setAge(int x) {
		System.out.println("in int: " + x);
	}
	
	void setAge(double x) {
		System.out.println("in double: " + x);
	}
	
	void setAge(byte x) {
		System.out.println("in byte: " + x);
	}
	
	void setAge(long x) {
		System.out.println("in long: " + x);
	}

	void setAge(float x) {
		System.out.println("in float: " + x);
	}
	
	public static void main(String[] args) {
		new ThreeConst(0).setAge(8682L);
	}
}
