package com.oca8.module6.inheritance;

class A{
	//	   int i;
	//	   public A(int x) { this.i = x; }

	A() {  print();   }
	void print() { System.out.println("A"); }

	protected void methodA(){
		System.out.println("base - MethodA");
	}
}