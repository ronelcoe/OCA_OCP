package com.oca8.module8.api;

public class String_test {
	
	int x = 10;
	int y = x;
	
	{ y += x; }

	public static void main(String[] args) { 
		String s = null;
		System.out.println(s+"test");
		
		System.out.println(new String_test().y);
		
		switch (s="d") {
		case "e": System.out.println("e nga"); break;
		case "d": System.out.println("d nga");
			default : break;
		}
		
		
		System.out.println("String".replace('g','G') == "String".replace('g','G'));
		System.out.println("String".replace('g','G')=="StrinG");
		System.out.println("String".replace('g','g')=="String");
		
		System.out.println("1234".replace('1', '9'));
		
		System.out.println("substring: " + "123456".substring(3,5));
		
		String str1 = "Java";
		String[] str2 = {"J", "a", "v", "a"};
		String str3 = "";
		
		for(String x : str2) {
			str3 = str3 + x;
		}	
		
		System.out.println(str1 == str3);
		System.out.println(str1.hashCode() + " " + str3.hashCode());
		System.out.println(str1.equals(str3));
	}
}
