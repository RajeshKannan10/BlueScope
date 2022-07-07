package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> obj = new ArrayList<Object>();
		obj.add("cars");
		obj.add(10);
		obj.add('R');
		obj.add(0.25);
		
		System.out.println(obj);
		
		for (int i = 0; i < obj.size(); i++) {
			Object iterate = obj.get(i);
			System.out.println(iterate);
		}
		

	}

}
