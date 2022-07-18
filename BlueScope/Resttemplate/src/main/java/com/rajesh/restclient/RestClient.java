package com.rajesh.restclient;


import java.util.Arrays;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


public class RestClient {
	
	private static final String Get_all_detailurl = "https://710ea35e-2398-457e-a68a-0fd0b4f8808b.mock.pstmn.io/Employee";
	
	static RestTemplate resttemplate = new RestTemplate();
	
	public static void Getall_detail() {
		
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_ATOM_XML));
		HttpEntity<String> entity = new HttpEntity<String>("Employee",header);
//		ResponseEntity<String> getall = resttemplate.exchange(Get_all_detailurl,HttpMethod.GET, entity,String.class)
		String getall = resttemplate.exchange(Get_all_detailurl,HttpMethod.GET, entity,String.class).getBody();
		System.out.println(getall);
	}

	public static void main(String[] args)  {
		Getall_detail();
		
		
	}

}
