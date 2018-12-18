package com.oca8.real.brainer;

public class RealBrainer4_Wrapper {

    public static void testInts(Integer obj, int var){
        obj = var++;
        obj++;
    }
    
    public static void testWrapper(Integer obj) {
    	obj += 50;
    }
    
    public static void testArray(int[] obj) {
    	obj[1] = 100;
    }
    
    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1+" "+val2);
        
        Integer val5 = new Integer(50);
        testWrapper(val5);
        System.out.println(val5);
        
        int[] arr = {1,2,3,4,5};
        testArray(arr);
        for (int x : arr) {
        	System.out.println(x);
        }
    }
}           
