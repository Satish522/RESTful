package com.swap.classpathattri;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/banking")
public class NetBanking {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{mobileno}/balance")
	public float getbalance(@PathParam("mobileno")int mobileno)
	{
		return 22.4f;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{mobileno}/payees")
	public String getpayees(@PathParam("mobileno")int mobileno)
	{
		return "mobileno";
	}

}
