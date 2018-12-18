package com.oca8.module8.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class PredicateTest {
	public static void filterData(ArrayList<Data> dataList, Predicate<Data> p){
	      Iterator<Data> i = dataList.iterator();
	      while(i.hasNext()){
	           if(p.test(i.next())){
	                i.remove();
	           }
	       }
	   }

	  public static void main(String[] args) {
	        ArrayList<Data> al = new ArrayList<Data>();
	        Data d = new Data(1); al.add(d);
	        d = new Data(2); al.add(d);
	        d = new Data(0); al.add(d);

	        filterData(al, p -> p.value == 0);

	        System.out.println(al);
	    }
}
