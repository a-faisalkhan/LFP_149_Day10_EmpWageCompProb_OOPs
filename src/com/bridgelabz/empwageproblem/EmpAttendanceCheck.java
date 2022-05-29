package com.bridgelabz.empwageproblem;

public class EmpAttendanceCheck {

	public static void main(String[] args) {
		System.out.println("-------Welcome to Employee Wage Computation Program-------");

		// UC1 - Employee Attendance Check
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}

	}

}
