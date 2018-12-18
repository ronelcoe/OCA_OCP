package com.oca8.module6.inheritance;

class B extends A{
//	int j;
//	public B(int x, int y) { super(x);  this.j = y; }
//	B(int z ) { this(z, z); }
//	B(int y ) { super(y*2 ); j = y; }
	
/*
	int i =   4;
	   public static void main(String[] args){
	      A a = new B();
	      a.print();
	   }
	   void print() { System.out.println("dito" + i); }
	   
	   */
	
	 protected void methodA(){
	      System.out.println("sub - MethodA");
	   }
	   public void methodB(){
	      System.out.println("sub - MethodB");
	   }
	   public static void main(String args[]){
	      A b=new B(); //1
	      b.methodA(); //2
//	      b.methodB(); //3
	   }
}