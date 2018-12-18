package com.oca8.module8.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class LamdaExpression1 {

	Runnable r1 = () -> { System.out.println(this); };
	Runnable r2 = () -> { System.out.println(toString()); };
	
	public String toString() { return "Hello, world!"; }
	
	static String testData(List<String> l, Predicate<String> p) {
		String result = "not found";
		for(String s : l) {
				System.out.println("scanning... " + s);
			if(p.test(s)) {
				result = "found... " + s;
//				break;
			} 				
		}
		return result;
	}
	
	public static void main(String... args) {
		new LamdaExpression1().r1.run();
		new LamdaExpression1().r2.run();
		
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		
		System.out.println(testData(l, x -> x.equals("B")));
	}
}
