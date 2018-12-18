package com.oca8.module8.api;

public class MyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing now at MyResource");
	}

}
