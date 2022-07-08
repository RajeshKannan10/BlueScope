package com.restapi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;


@Path("/EmployeeService")
public class RestApi {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@QueryParam("name")String name,@QueryParam("roll")String roll,@QueryParam("id")int id) {
		
		Employee employee = new Employee(name,roll,id);
		System.out.println("Details:"+ employee);
		return employee;
	}
	
	@GET
	@Path("/employee")
	@Produces(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.TEXT_PLAIN)
	public Employee getEmployee() {
		Employee employee = new Employee("Rajesh", "Analyst", 10);
		System.out.println(employee);
//		return employee.toString();
		return employee;
	}
	
	
	@POST
	@Path("/AddEmployee")
	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.TEXT_PLAIN)
	public Employee addemployee(Employee employee) {
		return employee;
	}

	
	@POST
	@Path("/upload")
	@Produces(MediaType.MULTIPART_FORM_DATA)
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadfile(@FormDataParam("file") InputStream Inputfile,
			@FormDataParam("file") FormDataContentDisposition filedetail) throws IOException {
		
		String filepath = "D://RAJESHKANNAN.R";
		
		File apifile = new File(filepath + filedetail.getFileName());
		int read = 0;
		byte[] byt = new byte[1024];
		
		try {
			FileOutputStream fos = new FileOutputStream(apifile);
			while((read = Inputfile.read(byt)) != -1) {
				fos.write(byt, 0, read);
				fos.flush();
				fos.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.ok("File upload successfully").build();
	}
	
	@GET
	@Path("/downloadpath")
	@Produces("text/plain")
	public Response downloadfile() {
		
		File file = new File("D:\\RAJESH KANNAN.R\\DEMOdownload.txt");
		ResponseBuilder response = Response.ok((Object)file);
		Response responevalue = response.header("content-disposition","attachment; filename = DEMOdownload.txt").build();
		return responevalue;
		
	}
	
	

}
