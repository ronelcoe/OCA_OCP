package com.oca8.module6.inheritance;

public class Child extends Parent {

	public void method() {
		System.out.println("Child method");
	}
	
	public void method2() {
		System.out.println("Child method");
	}
	
	protected void testProected() {
		System.out.println("testProected child method");
	}
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.testProected();
	}
}
