
package com.day4;

public class Employee_Wage {

	public static void main(String[] args) {
		
		int Full_Time = 1;
		
		double empCheck = Math.floor(Math.random()*10)%2;
		
		if(empCheck == Full_Time) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is not Present");
		}
	}
	
}
