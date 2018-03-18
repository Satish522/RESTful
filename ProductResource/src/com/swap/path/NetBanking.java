package com.swap.path;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/netbanking/{mobileno}")
public class NetBanking {
	@PathParam("{mobileno}")
	public int mobileno;


	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/balance")
	public float getbalance()
	{
		return 11.4f;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/payees")
	public String getpayees()
	{
		return "mobileno2";
	}


}
