package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> name = new ArrayList<Object>();
		
		name.add("Rajesh");
		name.add(10);
		name.add(27);
		name.add("karaikal");
		
		Map<String,Object> detail = new LinkedHashMap<String,Object>();
		detail.put("Name",name.set(0, name));
		detail.put("Roll NO", name.set(1, name));
		detail.put("Age",name.set(2, name));
		detail.put("Area", name.set(3, name));

		System.out.println(detail);
		
		for (Map.Entry<String,Object> objects : detail.entrySet()) {
			System.out.println(objects);
			
		}
		
		
		

	}

}
