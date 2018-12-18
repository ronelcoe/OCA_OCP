package com.oca8.real.brainer;

public class RealBrainerTest {

	public static int m1(int i){
		return ++i;
	}
	
	public static void main(String[] args) {


			int k = m1(args.length);
			k += 3 + ++k;
			System.out.println(k);


			int[] a = { 1, 2, 3, 4 };       
			int[] b = { 2, 3, 1, 0 };       
			System.out.println( a [ (a = b)[3] ] );    

//			System.out.println(null + true); //1    
//			System.out.println(true + null); //2    
//			System.out.println(null + null); //3


			int c = 0;
			A: for(int i2 = 0; i2 < 2; i2++){
				B: for(int j = 0; j < 2; j++){
					C: for(int k2 = 0; k2 < 3; k2++){
						c++;
						if(k2>j) break;
					}
				}
			}
			System.out.println(c);
	}

}
