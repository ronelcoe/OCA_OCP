package com.oca8.module3.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest extends ArrayList<String>{

	public static void main(String[] args) {
		List<String> s1 = new ArrayList<String>( );
		s1.add("a");
		s1.add("b");
		s1.add(1, "c");
		List<String> s2 = new ArrayList<String>(  s1.subList(1, 1) );
		s1.addAll(s2);
		System.out.println(s1);
		
		System.out.println(0%3);
	}

}
