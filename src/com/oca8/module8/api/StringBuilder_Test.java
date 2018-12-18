package com.oca8.module8.api;

public class StringBuilder_Test {

	public static void main(String[] args) {
		String s = "aabbaacbc";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(new StringBuilder().capacity());
		System.out.println(sb.append(true));
		System.out.println(sb.capacity());
		
		System.out.println(new StringBuilder("world").insert(0, "hello ").toString());
		System.out.println("hello".concat(" world"));
		
		String fullPhoneNumber = "833-879-4321";
		System.out.println(new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString()); 
		
		StringBuilder b1 = new StringBuilder("snorkler");
		StringBuilder b2 = new StringBuilder("yoodler");
		
//		System.out.println(b1.insert(0, "abc"));
		
		b1.append(b2.substring(2, 5).toUpperCase());
		System.out.println(b1);
		System.out.println(b2);
		
		b2.insert(3, b1.append("a"));
		System.out.println(b1);
		System.out.println(b2);
		
		b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
		System.out.println(b1);  //snoyoosnorklerODLadlerfalseklerODLa
		System.out.println(b2); //yoosnorklerODLadlerfalse
	}

}
