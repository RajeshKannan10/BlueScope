package com.bsit.webprojects.RestClient;

import java.io.File;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.media.multipart.MultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class RestClient {


	public String GetResponse() {
		String Resturl = "http://localhost:8080/RestApiDemo/rest/EmployeeService/employee";
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(Resturl);
		String Jsonresponse = target.request().accept(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println(Jsonresponse);
		return Jsonresponse;
	}

	public Response PostResponse() {

		String posturl = "http://localhost:8080/RestApiDemo/rest/EmployeeService/AddEmployee";

		Employee postemp = new Employee("vaithesh", "Analyst", 11);

		ClientConfig postconfig = new ClientConfig();
		Client postclient = ClientBuilder.newClient(postconfig);
		WebTarget posttarget = postclient.target(posturl);
		Response postresponse = posttarget.request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(postemp, MediaType.APPLICATION_JSON));
		System.out.println(postresponse.getStatus());
		System.out.println(postresponse.readEntity(String.class));
		return postresponse;
	}

	public Response postFile(File uploadfile) {
		
		String uploadurl = "http://localhost:8080/RestApiDemo/rest/EmployeeService/upload";

		Client client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();
		
		WebTarget server = client.target(uploadurl);
		
		MultiPart multipart = new MultiPart();
		
		FileDataBodyPart fileBodyPart = new FileDataBodyPart("file", uploadfile,
				MediaType.APPLICATION_OCTET_STREAM_TYPE);
		
		multipart.bodyPart(fileBodyPart);
		
		Response uploadresponse = server.request(MediaType.MULTIPART_FORM_DATA)
				.post(Entity.entity(multipart, MediaType.MULTIPART_FORM_DATA));

		if (uploadresponse.getStatus() == 200) {
			String response = uploadresponse.readEntity(String.class);
			System.out.println(response);
		}else {
			System.out.println("Response is not ok");
		}
		return uploadresponse;
	}

	public static void main(String[] args) {
		
		RestClient rc = new RestClient();
		rc.GetResponse();
		rc.PostResponse();
		File file = new File("D:\\RAJESH KANNAN.R\\git.txt");
		rc.postFile(file);

	}
}
