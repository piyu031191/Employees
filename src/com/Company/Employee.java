package com.Company;

public class Employee {

	public static void main(String[] args) {
		double present =Math.floor(Math.random()*2);
		double partTime =Math.floor(Math.random()*2);
		int wages; 
		int val=0;
		

		if(present == 1) {
     	   if(partTime == 1) {
	              val=1;
	            	  
			
     	   }
     	   else {
	    	      val=2;
	    	      
     	   }
		} 
		else {
             val=0;
             
		}
		
		switch(val) {
		
		case 0:
	         wages=0 * 20;
	   		System.out.println("Employee is absent with wages = " + wages);		
	   	
	   		
		case 1:
			
			wages=160 * 20;
	   		System.out.println("Employee is present & PartTime  with wages = " + wages);
	   		
		case 2:
			wages=160 * 20;
	   		System.out.println("Employee is present & FullTime  with wages = " + wages);
			
		
		
		
		
		
		
		}
	}
}
