package com.oca8.module8.api;

public class RecursiveInstantiation {
	
//	RecursiveInstantiation ri2 = new RecursiveInstantiation();
	
	String_test st = new String_test();
	public RecursiveInstantiation() {
		System.out.println("instantiating...");
	}
	
	public static void main(String[] args) {
		RecursiveInstantiation ri = new RecursiveInstantiation();
	}

}
