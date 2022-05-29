package com.bridgelabz.empwageproblem;

public class EmpWageTotalWorkingHoursForMonth {

	// UC-6 Employee Wage Total Working Hours for a month
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;
	public static final int FULL_DAY_HR = 8;
	public static final int PART_DAY_HR = 8;
	public static final int DAYS_PER_MONTH = 20;

	static int days = 1;
	static int workingHours = 0;
	static int totalHours = 0;

	public static int getWorkingHours() {
		double empCheck = Math.floor(Math.random() * 10) % 3;
		switch ((int) empCheck) {
		case 0:
			workingHours = FULL_DAY_HR;
			break;
		case 1:
			workingHours = PART_DAY_HR;
			break;
		default:
			workingHours = 0;
			break;
		}
		return workingHours;
	}

	public static void main(String[] args) {
		while (days <= DAYS_PER_MONTH && totalHours <= 100) {
			totalHours = (totalHours + getWorkingHours());
			if (getWorkingHours() != 0) {
				days++;
			}
		}
		System.out.println("Employee Wage Per Month: " + (EMP_WAGE_PER_HR * totalHours));

	}

}
