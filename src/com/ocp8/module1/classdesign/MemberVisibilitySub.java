package com.ocp8.module1.classdesign;

import com.oca8.module6.inheritance.MemberVisibilityParent;

public class MemberVisibilitySub extends MemberVisibilityParent {
   public void process(MemberVisibilityParent a)
   {
//      a.i = a.i*2;
   }
   public static void main(String[] args)
   {
	   MemberVisibilityParent a = new MemberVisibilitySub();
//	   MemberVisibilityParent a = new MemberVisibilityParent();
	   MemberVisibilitySub b = new MemberVisibilitySub();
      b.process(a);
      System.out.println( a.getI() );
   }
}
