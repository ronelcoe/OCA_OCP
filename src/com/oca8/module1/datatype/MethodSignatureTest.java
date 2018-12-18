package com.oca8.module1.datatype;

public class MethodSignatureTest {

    public static void main(String[] args) throws Exception {
    	MethodSignatureTest t = new MethodSignatureTest();
         int i = t.getLoad();
         double d = t.getLoad();
         System.out.println( i + d );
    }

    public int getLoad() {
        return 1;
    }

//    public double getLoad(){ 
//        return 3.0;
//    }
}
