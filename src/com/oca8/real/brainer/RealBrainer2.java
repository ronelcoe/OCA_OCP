package com.oca8.real.brainer;

public class RealBrainer2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a += (a = 4);
		b = b + (b = 5);
		System.out.println(a+ ",  "+b);


//		System.out.println(null + true); //1
//		System.out.println(true + null); //2
//		System.out.println(null + null); //3


		boolean b1 = false;
		boolean b2  = false;
		if (b2 = b1 != b2){
			System.out.println("true");
		} else{
			System.out.println("false");
		}

	}

}
