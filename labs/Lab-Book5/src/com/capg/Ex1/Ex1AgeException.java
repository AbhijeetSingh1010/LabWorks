package com.capg.Ex1;

import java.util.Scanner;

import com.corejava.lab5.Ex1.AgeException;

public class Ex1AgeException {

	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println();
         Scanner sc=new Scanner(System.in);
 		System.out.println("Enter Age : ");
 		int age=sc.nextInt();
 		sc.close();
 		System.out.println();
		try {
		vote(age);
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
		System.out.println();
		System.out.println("Main ends");
	}
 static void vote(int age) throws AgeException{
	if(age<15)
	{
		AgeException e = new AgeException();
		throw e;
	}
	else {
		System.out.println("No Exception : Age entered is above 15:");
	}
}

	}


