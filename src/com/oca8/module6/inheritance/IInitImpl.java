package com.oca8.module6.inheritance;

import static com.oca8.module1.datatype.DatatypeTest.*;
public class IInitImpl implements IInit{

	public static void main(String[] args) {

		IInitImpl s = new IInitImpl();  //1
		int j = s.thevalue;       //2
		int k = IInit.thevalue;    //3
		int l = thevalue;         //4
		
		System.out.println(j + " " + k + " " + l);
		
		System.out.println(TEST_VALUE);
	}
}

