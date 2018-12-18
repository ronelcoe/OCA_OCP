package com.ocp8.module1.classdesign;

public class PlaceHolder<K, V> {
    private K k;
    private V v;
    public PlaceHolder(K k, V v){
        this.k = k;
        this.v = v;
        
        if (k instanceof Integer && v instanceof Integer)
        	System.out.println((int)(k) + (int)(v));
        else
        	System.out.println(k.toString() + v.toString());
    }
    public K getK() { return k; }
    public static <X> PlaceHolder<X, X> getDuplicateHolder(X x){
        return new PlaceHolder<X, X>(x, x);
    }
    
    
    public static void main(String[] args) {
      PlaceHolder<String, String> ph1 = PlaceHolder.getDuplicateHolder("b"); //1
//      PlaceHolder<String, String> ph2 = PlaceHolder<String>.getDuplicateHolder("b"); //2
//      PlaceHolder<String, String> ph3 = PlaceHolder<>.getDuplicateHolder("b"); //3
//      PlaceHolder<> ph4 = new PlaceHolder<String, String>("a", "b"); //4
      PlaceHolder<?, ?> ph5 = new PlaceHolder(10, 10); //5
      PlaceHolder<?, ?> ph6 = new PlaceHolder("S", "A"); 
    }
}
