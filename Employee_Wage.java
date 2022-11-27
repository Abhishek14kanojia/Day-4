
package com.day4;

public class Employee_Wage {

	public static final int  Part_Time = 1;
	public static final int Full_Time = 2;
	public static final int Wage_Per_Hour = 20;
	
	public static void main(String[] args) {
		
		int EmpHrs = 0;
		int EmpWage = 0;
		
	
		int empCheck = (int) (Math.floor(Math.random()*10)%3);
		
		switch (empCheck) {
		case Part_Time:
			EmpHrs = 4;
			System.out.println("Employee Present in Part Time :");
			EmpWage = EmpHrs * Wage_Per_Hour;
			System.out.println("Part time wage is : " + EmpWage);
			break;
			
		case Full_Time:
			EmpHrs = 8;
			System.out.println("Employee Present in Full Time :");
			EmpWage = EmpHrs * Wage_Per_Hour;
			System.out.println("Full time wage is : " + EmpWage);
			break;
			
		default:
			EmpHrs = 0;
			System.out.println("Employee not Present in Full Time :");
			EmpWage = EmpHrs * Wage_Per_Hour;
			System.out.println("Employee not Present : " + EmpWage);
	
		}
		
		
		
	}
	
}
