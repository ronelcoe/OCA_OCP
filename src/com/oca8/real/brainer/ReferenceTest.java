package com.oca8.real.brainer;

public class ReferenceTest {
  public static void main(String[] args){
     Object obj1 = new Object();
     Object obj2 = obj1;
     if( obj1.equals(obj2) ) System.out.println("true");
     else  System.out.println("false");
     
     System.out.println("hashCode: " + obj1.hashCode() + " " + obj2.hashCode());
     System.out.println(obj1 == obj2);
     
     String str1 = "java";
     String[] str2 = {"j", "a", "v", "a"};
     String str3 = "";
     
     for (String s : str2) {
    	 str3 = str3 + s;
     }
     
     System.out.println("==: " + str3 + " == " + str1 + " : " + str3.hashCode() + " == " + str1.hashCode() + " : " + (str3 == str1));
     System.out.println(".equals: " + str1.equals(str3));
  }
}
