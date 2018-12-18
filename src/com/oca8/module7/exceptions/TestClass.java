package com.oca8.module7.exceptions;

import java.io.IOException;

import com.oca8.module6.inheritance.Simulator;

public class TestClass {

	public static void methodX() throws Exception {
		throw new AssertionError();
	}  

	public void check() {
		throw new SecurityException();
	}

	public static void main(String[] args) {
//		try{
//			methodX();
//		}
//		catch(Exception e) {
//			System.out.println("EXCEPTION");
//		}

		TestClass s = new TestClass();
		s.check();
	}
}

