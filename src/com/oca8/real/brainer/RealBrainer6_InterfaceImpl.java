package com.oca8.real.brainer;

public class RealBrainer6_InterfaceImpl extends A{
	int fi = 15;
	public final static void main(String[] args){
		RealBrainer6_InterfaceImpl b = new RealBrainer6_InterfaceImpl();
		b.fi = 20;
		System.out.println(b.fi);
		System.out.println(  (  (A) b  ).fi  );
	}
}

class A {
	final int fi = 10;
}