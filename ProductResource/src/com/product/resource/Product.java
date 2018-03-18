package com.product.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/product")
public class Product {
	@GET
	@Produces("text/plain")

	public float getBalance(@QueryParam("mobile-no")String mobileNo)
	{
		return 234.4f;
	}
		
}	
