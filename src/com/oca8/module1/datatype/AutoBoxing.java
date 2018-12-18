package com.oca8.module1.datatype;

public class AutoBoxing {
	 public static Integer wiggler(Integer x){
	       Integer y = x + 10;
	       x++;
	       System.out.println(x);
	       return y;
	    }
	public static void main(String[] args) {
		Integer dataWrapper = new Integer(5);
		Integer value = wiggler(dataWrapper);
		System.out.println(dataWrapper+value);
	}

}
