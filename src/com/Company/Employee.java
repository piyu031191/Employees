package com.Company;

public class Employee {

	public static void main(String[] args) {
		double present =Math.floor(Math.random()*2);
		if(present == 1) {
     	   System.out.println("Employee is present");
		} 
		else {
     	   System.out.println("Employee is absent");
		}
	}
}
