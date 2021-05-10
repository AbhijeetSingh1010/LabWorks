package com.capg.Ex1;

import java.util.Scanner;

import com.capg.Ex1.AgeException1;

public class Ex1AgeException1 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		sc.close();
		System.out.println();
		try {
			vote(age);
		} catch (AgeException1 e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("Main ends");
	}

	static void vote(int age) throws AgeException1 {
		if (age < 15) {
			AgeException1 e = new AgeException1();
			throw e;
		} else {
			System.out.println("No Exception : Age entered is above 15:");
		}
	}

}
