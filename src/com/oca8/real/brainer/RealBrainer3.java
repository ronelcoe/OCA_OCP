package com.oca8.real.brainer;

import java.util.Stack;

public class RealBrainer3 {

	public static void main(String args[]){
		Stack s1 = new Stack ();
		Stack s2 = new Stack ();
		processStacks (s1,s2);
		System.out.println (s1 + "    "+ s2);
	}
	public static void processStacks(Stack x1, Stack x2){
		x1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
//		System.out.println(x1);
		x1.push(true);
		x2 = x1;
		System.out.println("X2 " + x2);
	}
}
