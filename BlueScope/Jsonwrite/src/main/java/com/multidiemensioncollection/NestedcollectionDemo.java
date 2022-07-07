package com.multidiemensioncollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NestedcollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Map<String, Map<Integer, String>>> nested = new ArrayList<Map<String, Map<Integer, String>>>();

		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(01, "rajesh");
		lhm.put(02, "vaithesh");

		Map<Integer, String> lhm1 = new LinkedHashMap<Integer, String>();
		lhm1.put(03, "john");
		lhm1.put(04, "Skanda");

		Map<String, Map<Integer, String>> HM = new HashMap<String, Map<Integer, String>>();
		HM.put("Employee", lhm);

		Map<String, Map<Integer, String>> HM1 = new HashMap<String, Map<Integer, String>>();
		HM.put("Employee1", lhm1);

		nested.add(HM);
		nested.add(HM1);

		System.out.println("Size of List is: "+nested.size());
		
		System.out.println(nested);

		for (int i = 0; i < nested.size(); i++) {
			System.out.println(nested.get(i));

		}

	}

}
