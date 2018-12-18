package com.oca8.module7.exceptions;

class MyException extends Exception {}
public class ExceptionPropagation{
   public static void main(String[] args){
	   ExceptionPropagation tc = new ExceptionPropagation();
      try{
         tc.m1();
      }
      catch (MyException e){
         try { tc.m1(); } catch(Exception x) {}
      }
      finally{
         tc.m2();
//         tc.m1();
      }
   }
   public void m1() throws MyException{
	   throw new MyException();
   }
   public void m2() throws RuntimeException{
	   throw new NullPointerException();
   }
}