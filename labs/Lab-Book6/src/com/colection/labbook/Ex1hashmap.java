package com.colection.labbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex1hashmap {
	static List<Entry<String, String>> getValues(HashMap<String, String> map) {
		List<Entry<String, String>> entries = new ArrayList<Map.Entry<String, String>>(map.entrySet());
		Collections.sort(entries, new Comparator<HashMap.Entry<String, String>>() {
			public int compare(HashMap.Entry<String, String> a, HashMap.Entry<String, String> b) {
				return Integer.compare(a.getKey().compareTo(b.getKey()), 0);
			}
		});
		return entries;

	}

	public static void main(String[] args) {
		HashMap<String, String> cap = new HashMap<>();
		cap.put("INDIA", "DELHI");
		cap.put("US", "WASHINGTON");
		cap.put("UK", "LONDON");
		cap.put("JAPAN", "TOKYO");
		cap.put("FRANCE", "PARIS");

		List<Entry<String, String>> list = getValues(cap);
		Iterator<Entry<String, String>> i = list.iterator();
		while (i.hasNext()) {
			Entry<String, String> values = i.next();
			System.out.println(values);
		}

	}

}
