package com.oca8.module7.exceptions;

public class CatchTest {
	public static int[ ] getArray() {  return null;  }    
	public static void main(String[] args) {
		int index = 1;       
		try{          
			getArray()[index=2]++;       
		}       
		catch (Exception e){  
			System.out.println("test catch here");
		}  //empty catch       
		System.out.println("index = " + index);		
		
//		Exception e = null;
//		throw e;
	}
}
