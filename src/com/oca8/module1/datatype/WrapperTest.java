package com.oca8.module1.datatype;

public class WrapperTest extends Object {

	public static void main(String[] args) {

      Integer i = new Integer(1) ;
      Long m = new Long(1);
      if( i.equals(m)) System.out.println("equal");   // 1
      else System.out.println("not equal");
      
      System.out.println(i instanceof Integer);
      
      Boolean b = false;
      System.out.println(b instanceof Boolean);
	}

}
