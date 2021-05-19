package com.excptnhndlng;

public class ExmpTry {
	public static void main(String args[])
	   {
		int a[]=new int[10];
	      try{
	        
	        //Array has only 10 elements
	        a[11] = 9;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	    	  
	         System.out.println ("ArrayIndexOutOfBounds");
	      }
	      finally {
			System.out.println("finally block");
		}
	      
	      try{
	    		 int num=Integer.parseInt ("XYZ") ;
	    		 System.out.println(num);
	    	      }catch (Exception e) {
					System.out.println(e);
				}
	   }
}
