package com.ocp8.module1.classdesign;

import java.util.HashSet;
import java.util.Set;


public class EqualsTest {

	public static void main(String[] args) {
		Nearly n1 = new Nearly("aaa");
		Nearly n2 = new Nearly("aaa");
		String s = "-";
		if(n1.equals(n2))
			s += "1";
		
		if(n1 == n2)
			s += "2";
		
		Set<Nearly> set = new HashSet<Nearly>();
		set.add(n1);
		set.add(n2);
		System.out.println(s + " " + set.size());
	}

}

class Nearly {
	String value;

	Nearly(String v) {
		value = v;
	}

	public int hasCode() {
		return 1;
	}
	
//	public boolean equals(Object o) {
//		return true;
//	}
//
//	public boolean equals(Nearly n) {
//		if(value.charAt(0) == n.value.charAt(0))
//			return true;
//		return false;
//	}
}
