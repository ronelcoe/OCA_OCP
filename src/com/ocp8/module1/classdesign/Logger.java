package com.ocp8.module1.classdesign;

public class Logger {
	private Logger() {
		// private constructor
	}

	public static class LoggerHolder {
		public static Logger logger = new Logger();
	}

	public static Logger getInstance() {
		return LoggerHolder.logger;
	}

	public void log(String s) {
		// log implementation
		System.err.println(s);
	}
	
	public String toString() {
		return "hash code: " + Logger.getInstance().hashCode();
	}
	
	public static void main(String[] args) {
		System.out.println(Logger.getInstance());
		System.out.println(Logger.getInstance());
		System.out.println(Logger.getInstance());
	}
}
