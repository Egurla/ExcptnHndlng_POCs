package com.excptnhndlng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExpmThrows {
	public static void findFile() throws IOException{
		// code that may produce IOException
		/*
		 * File newFile=new File("test.txt"); FileInputStream stream=new
		 * FileInputStream(newFile);
		 */
		throw new IOException("File not found");
	}

	public static void main(String[] args) {
		try {
			ExpmThrows.findFile();
		} catch (IOException e) {
			System.out.println("in catch black--->" + e.getMessage());
		}
	}
}
