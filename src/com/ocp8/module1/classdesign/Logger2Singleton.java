package com.ocp8.module1.classdesign;

public class Logger2Singleton {
	// declare the constructor private to prevent clients
	// from instantiating an object of this class directly
	private Logger2Singleton() {
	}

	// by default, this field is initialized to null
	// the static method to be used by clients to get the instance of the
	// Logger2Singleton
	// class
	private static Logger2Singleton myInstance;

	public static Logger2Singleton getInstance() {
		if (myInstance == null) {
			// this is the first time this method is called,
			// and that's why myInstance is null
			myInstance = new Logger2Singleton();
		}
		// return the same object reference any time and
		// every time getInstance is called
		return myInstance;
	}

	public void log(String s) {
		// a trivial implementation of log where
		// we pass the string to be logged to console
		System.err.println(s);
	}
	
	public static void main(String[] args) {
		System.out.println(Logger2Singleton.getInstance());
		System.out.println(Logger2Singleton.getInstance());
		
		new Thread().start();
		System.out.println(Logger2Singleton.getInstance());
		new Thread().start();
		System.out.println(Logger2Singleton.getInstance());
		new Thread().start();
		System.out.println(Logger2Singleton.getInstance());
	}
	
	class LogThread extends Thread {
		
		public void run() {
			Logger2Singleton.getInstance();
		}
	}
}
