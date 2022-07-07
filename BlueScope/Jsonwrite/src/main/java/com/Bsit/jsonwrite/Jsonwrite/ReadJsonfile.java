package com.Bsit.jsonwrite.Jsonwrite;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonfile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();
		
		File file = new File("Employee1.json");
		
//		String json = "{\"name\": \"Rajesh\",\r\n"
//				+ "\"id\": \"BSIT01\",\r\n"
//				+ "\"roll\": \"analyst\"}";
		try {
			Map<String, String> mapobj = mapper.readValue(file, Map.class);
			
			System.out.println(mapobj);
		
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
