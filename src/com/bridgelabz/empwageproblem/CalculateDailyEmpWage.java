package com.bridgelabz.empwageproblem;

public class CalculateDailyEmpWage {

	public static void main(String[] args) {
		
		//UC-2 Calculate daily employee wage
		int IS_FULL_TIME = 1;
		int EMP_WAGE_PER_HR = 20;
		int FULL_DAY_HR = 8;
		int empWage = 0;
		int empHrs = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			empHrs = FULL_DAY_HR;
		} else {
			empHrs = 0;
		}

		empWage = empHrs * EMP_WAGE_PER_HR;
		System.out.println("Employee Wage Per Day: " + empWage);

	}

}
