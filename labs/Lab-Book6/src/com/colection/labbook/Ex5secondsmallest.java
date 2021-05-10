package com.colection.labbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex5secondsmallest {
	static int getSecondSmallest(int[] arr) {
		List<Integer> sc = new ArrayList<Integer>();
		for (int a : arr) {
			sc.add(a);
		}
		Collections.sort(sc);
		return sc.get(1);
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int secsmall = getSecondSmallest(arr);

		System.out.println(secsmall);
	}

}
