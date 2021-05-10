package com.colection.labbook;

import java.util.HashMap;
import java.util.Map;

public class Ex4medals {
	static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> medal) {
		Map<Integer, String> studmedal = new HashMap<>();

		for (Map.Entry<Integer, Integer> entry : medal.entrySet()) {
			if (entry.getValue() > 90) {
				studmedal.put(entry.getKey(), "Gold");
			} else if (entry.getValue() >= 80 && entry.getValue() < 90) {
				studmedal.put(entry.getKey(), "Silver");
			} else if (entry.getValue() >= 70 && entry.getValue() < 80) {
				studmedal.put(entry.getKey(), "Bronze");
			}
		}

		return (HashMap<Integer, String>) studmedal;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> stumarks = new HashMap<>();

		stumarks.put(101, 81);
		stumarks.put(102, 60);
		stumarks.put(103, 73);
		stumarks.put(104, 94);
		stumarks.put(105, 86);
		stumarks.put(106, 53);
		stumarks.put(107, 46);
		stumarks.put(108, 95);
		stumarks.put(109, 92);
		stumarks.put(110, 78);

		Map<Integer, String> stumedal = getStudents(stumarks);

		System.out.println(stumedal);
	}

}
