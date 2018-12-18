package com.oca8.module7.exceptions;

public class ExceptionTest2 {

    public static void main(String[] args) {
    	ExceptionTest2 tc = new ExceptionTest2();
        try {
        	tc.myMethod();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    
    public void myMethod() throws Exception  {
        yourMethod();
    }
    
    public void yourMethod() throws Exception  {
        throw new Exception();
    }    
}
