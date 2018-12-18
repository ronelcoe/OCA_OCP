package com.oca8.real.brainer;

public class RealBrainer5_Precedence {

	public static void main(String[] args) {

		boolean b1 = false;
		boolean b2 = false;
//		if (b2 != b1 = !b2){
		if (b2 != b1){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}

}
