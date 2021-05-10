package com.capg.Ex2;

import com.capg.Ex2.Ex1NameException;

public class FullName {

	public static void main(String[] args) {
		String fname = null;
		String lname = null;
		System.out.println("Main starts");
		System.out.println();

		fname = "Arpit";
		lname = "Jain";

		System.out.println();
		try {
			name(fname, lname);
		} catch (Ex1NameException e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("Main ends");
	}

	static void name(String fname, String lname) throws Ex1NameException {
		String Fullname = null;

		if (fname == null && lname == null) {
			Ex1NameException e = new Ex1NameException();
			throw e;
		} else {
			Fullname = fname + " " + lname;
			System.out.println("No Exception : Full Name of employee is : " + Fullname);
		}
	}

}
