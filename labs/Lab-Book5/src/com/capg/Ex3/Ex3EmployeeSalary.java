package com.capg.Ex3;

import java.util.Scanner;

import com.capg.Ex1.AgeException1;

public class Ex3EmployeeSalary {

	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Salary : ");
		int Salary = sc1.nextInt();
		sc1.close();
		System.out.println();
		try {
			salary(Salary);
		} catch (EmployeesException e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("Main ends");
	}

	static void salary(int s) throws EmployeesException {
		if (s < 3000) {
			EmployeesException e = new EmployeesException();
			throw e;
		} else {
			System.out.println("No Exception = Salary is above 3000 :");
		}
	}

}
