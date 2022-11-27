
package com.day4;

public class Employee_Wage {

	public static void main(String[] args) {
		
		int Full_Time = 1;
		int Wage_Per_Hour = 20;
		int EmpHrs = 0;
		int EmpWage = 0;
		
		
		double empCheck = Math.floor(Math.random()*10)%2;
		
		if(empCheck == Full_Time) {
			System.out.println("Employee is Present");
			EmpHrs = 8;
			EmpWage = EmpHrs * Wage_Per_Hour;
			System.out.println("EmpWage is : " + EmpWage);
		}else {
			System.out.println("Employee is not Present");
			EmpHrs = 0;
			EmpWage = EmpHrs * Wage_Per_Hour;
			System.out.println("EmpWage is : " + EmpWage);

		} 
	}
	
}
