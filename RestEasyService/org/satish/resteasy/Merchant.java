package org.satish.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;


@Path("/merchant")
public class Merchant  {
	
	@GET
	@Path("/books")
	public String getBooks() {
		System.out.println("Invoke getBooks method");
		return "Invoke getBooks method";
	}
}
