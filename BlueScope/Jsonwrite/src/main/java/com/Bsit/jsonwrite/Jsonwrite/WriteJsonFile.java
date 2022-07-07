package com.Bsit.jsonwrite.Jsonwrite;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("Name", "Rajesh");
		jsonObject.put("Company", "BSIT");
		jsonObject.put("Id", "BSIT.r");
		
//		JSONArray jsonarray = new JSONArray();
//		
//		jsonObject.put("Name", "vaithesh");
//		jsonObject.put("Company", "BSIT");
//		jsonObject.put("Id", "BSIT.r");
	
		JSONArray jsonarray = new JSONArray();
		jsonarray.add("Moblile: 123456789");
		
		jsonObject.put("Contact", jsonarray);
		
		try {
			FileWriter writer = new FileWriter("D:\\Pavithra\\PracticeJavaProgram\\Jsonwrite\\Detail.json");
			writer.write(jsonObject.toJSONString());
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file created sucessfully");
		

	}

}
