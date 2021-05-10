package com.colection.labbook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Ex3Squares {
	static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> mapsquares = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			mapsquares.put(arr[i], arr[i] * arr[i]);
		}

		return mapsquares;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5 };

		Map<Integer, Integer> numsq = getSquares(arr);

		System.out.println(numsq);
	}

}
