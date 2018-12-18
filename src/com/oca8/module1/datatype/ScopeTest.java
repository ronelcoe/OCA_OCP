package com.oca8.module1.datatype;

public class ScopeTest {

   static int x = 5;
   public static void main(String[] args){
      int x  = ( x=3 ) * 4;  // 1
      System.out.println(x);
      
      System.out.println(DatatypeTest.TEST_VALUE);
   }
}
