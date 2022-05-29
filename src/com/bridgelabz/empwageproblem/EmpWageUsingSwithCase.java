package com.bridgelabz.empwageproblem;

public class EmpWageUsingSwithCase {
	
	//UC-4 Employee Wage Using Swith Case
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;
	public static final int FULL_DAY_HR = 8;
	public static final int PART_DAY_HR = 8;

	public static void main(String[] args) {

		int empHrs = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;

		switch ((int) empCheck) {
		case IS_PART_TIME:
			empHrs = PART_DAY_HR;
			break;
		case IS_FULL_TIME:
			empHrs = FULL_DAY_HR;
			break;
		default:
			empHrs = 0;
		}

		int empWage = empHrs * EMP_WAGE_PER_HR;
		System.out.println("Employee Wage: " + empWage);

	}

}
