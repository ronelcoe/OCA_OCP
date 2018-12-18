package com.oca8.module8.api;

public class StringTest2 {

	public static void main(String[] args) {
		String lang1 = "Java";
		String lang2 = "JaScala";
		String returnValue1 = lang1.substring(0,1);
		String returnValue2 = lang2.substring(0,1);
		System.out.println(returnValue1 == returnValue2);
		System.out.println(returnValue1.equals(returnValue2));
	}

}
