package com.excptnhndlng;

public class InvalidProException extends Exception {

	static String str1;
	public InvalidProException(String errMassege) {
		super(errMassege);
		InvalidProException.excepString();
		str1=errMassege;
	}
	
	   public static String excepString(){ 
		return ("InvalidProExceptionException Occurred: "+str1);
	   }
}
