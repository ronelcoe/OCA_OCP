package com.oca8.module7.exceptions;

public class ExceptionTest {
	static {
	}

	public void check() {
		
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		new ExceptionTest().check();
		
		int i = 0;
	      loop :         // 1
	      {
	         System.out.println("Loop Lable line");
	         try{
	            for (  ;  true ;  i++ ){
	               if( i >5) break loop;       // 2
	            }
	         }
	         catch(Exception e){
	            System.out.println("Exception in loop.");
	         }
	         finally{
	            System.out.println("In Finally");      // 3
	         }
	      }
	}

}
