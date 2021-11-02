package com.Company;

public class Employee {

	public static void main(String[] args) {
		double present =Math.floor(Math.random()*2);
		double partTime =Math.floor(Math.random()*2);
		int wages; 

		if(present == 1) {
     	   if(partTime == 1) {
	
			wages=160;
	   		System.out.println("Employee is present & PartTime  with wages = " + wages);
     	   }
     	   else {
	    	wages=160;
	   		System.out.println("Employee is present & FullTime  with wages = " + wages);
     	   }
		} 
		else {
	         wages=0;
	   		System.out.println("Employee is absent with wages = " + wages);		}
	}
}
