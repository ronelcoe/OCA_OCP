package com.oca8.module8.api;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {

	public static void main(String[] args) throws Exception {
		try (FileReader fr = new FileReader("D:\\DEV_Workspace\\eclipse\\testFileReader.txt"); 
				BufferedReader br = new BufferedReader(fr);) {
			System.out.println("In try");
			String currentLine;
			while((currentLine = br.readLine()) != null)
				System.out.println(currentLine);
		}
	}

}
