package com.multidiemensioncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedHashset2D {

	static List list2d() {

		ArrayList<ArrayList<String>> names = new ArrayList<ArrayList<String>>();

		names.add(new ArrayList<String>(Arrays.asList("Rajesh", "vaithesh", "john")));
		names.add(new ArrayList<String>(Arrays.asList("kamal", "vimal")));

		return names;

	}

	public Map nestedmap() {

		HashMap<String, HashMap<Integer, String>> mapping = new HashMap<String, HashMap<Integer, String>>();

		HashMap<Integer, String> innermap = new HashMap<Integer, String>();
		innermap.put(1, "rajesh");
		innermap.put(2, "john");

		HashMap<Integer, String> innermap1 = new HashMap<Integer, String>();
		innermap1.put(3, "gopi");
		innermap1.put(4, "skanda");

		mapping.put("Group", innermap);
		mapping.put("Group2", innermap1);

		return mapping;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(list2d());

		LinkedHashset2D obj = new LinkedHashset2D();

		System.out.println(obj.nestedmap());

	}

}
