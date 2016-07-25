package com.rav.jaxrs.ex1.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rav.jaxrs.ex1.entity.Customer;


@Path("json/customer")
public class JSONService {
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(){
		
		return new Customer(1,"ravindu","panadura");
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCustomer(Customer c){
		return Response.status(201).entity("customer " + c.getName() + " created sucessfully!").build();
	}
}
