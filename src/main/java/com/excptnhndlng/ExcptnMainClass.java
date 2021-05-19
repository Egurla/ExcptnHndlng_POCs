package com.excptnhndlng;

public class ExcptnMainClass {
	
public static void main(String[] args) {
	ExcptnMainClass obj = new ExcptnMainClass();
    try
    {
        obj.productWeightCheck(60);
    }
    catch (InvalidProException ex)
    {
        System.out.println("Caught the exception");
        System.out.println(ex.getMessage());
    }
    finally {
		System.out.println("finally block");
		
	}
}

public void productWeightCheck(int weight) throws InvalidProException {
	if(weight<100){
		throw new InvalidProException("InvalidProExceptionException");
	}
	
}

}

