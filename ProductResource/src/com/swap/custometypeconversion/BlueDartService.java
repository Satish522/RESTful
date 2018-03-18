package com.swap.custometypeconversion;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bluedart")
public class BlueDartService {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/status/{awbno}")
	public String getStatus(@PathParam("awbno")AwbNo awbno)
	{
		return "the branch is"+awbno.getBranchCode()+"the refno is"+awbno.getRefNo();
		
	}

}

