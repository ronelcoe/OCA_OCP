package com.oca8.module7.exceptions;

class ExceptionTest3 {
   public static void main(String[] args) throws Exception {
      try{
         amethod();
         System.out.println("try ");
      }
      catch(Exception e){
         System.out.print("catch ");
      }
      finally   {
         System.out.print("finally ");
      }
      System.out.print("out ");
   }
   public static void amethod(){ }
}
