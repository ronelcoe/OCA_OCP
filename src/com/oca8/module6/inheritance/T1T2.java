package com.oca8.module6.inheritance;



//Filename: TestClass.java
class TestClass implements T1, T2{
   public void m1(){}
   public static void main(String[] args) {
	   System.out.println(T1.VALUE);
   }
}
interface T1{
   int VALUE = 1;
   public abstract void m1();
}
interface T2{
   int VALUE = 2;
   void m1();
}
