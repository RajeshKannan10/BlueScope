package collectionsdemo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NestedMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Map<Integer,String>> outermap = new HashMap<>();
		
		Map<Integer,String> innermap = new HashMap<>();
		
		innermap.put(01, "Rajesh");
		innermap.put(02, "john");
		innermap.put(03, "skanda");
		
		Map<Integer,String> innermap1 = new HashMap<>();
		innermap1.put(04, "vaithesh");
		innermap1.put(05, "kannan");
		
		outermap.put("Set1", innermap);
		outermap.put("Set2", innermap1);
		
		Map<Integer, String> obj = outermap.get("Set1");
		String name = obj.get(01);
		System.out.println(name);
		
		List<Map<String,Map<Integer,String>>> mapobj = new LinkedList<>();
		mapobj.add(outermap);
		System.out.println(mapobj);
		
	}
	
	

}
