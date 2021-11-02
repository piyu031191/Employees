package com.Company;

public class Employee {

	public static void main(String[] args) {
		double present =Math.floor(Math.random()*2);
		int wages;
		if(present == 1) {
			wages = 160;
     	   System.out.println("Employee is present and  Wages is :->  " + wages);
		} 
		else {
			wages = 0;
	     	   System.out.println("Employee is absent and  Wages is :->  " + wages);
		}
	}
}
