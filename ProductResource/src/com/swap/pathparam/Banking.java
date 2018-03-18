package com.swap.pathparam;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/banking/{mobileNo}/{balance}")
public class Banking {
	
	@PathParam("mobileNo")
	private int mobileNo;
	private int balance;
	


	public Banking(@PathParam("balance")int balance)
	{
		
		this.balance=balance;
		System.out.println("balance"+balance);
	}
	
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/account")
	public String getAccount()
	{
		return mobileNo+""+balance;
		
	}
	
	
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/balance")
	public int getBalance()
	{
		return balance;
	}

}
