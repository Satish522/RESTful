package com.swap.matrixparam;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//RestEasy Supported..............(1)


@Path("/agent")
public class AgentType {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/properties/{loc}/{size}")
	public String getProperties(@PathParam("loc")String location,@PathParam("size")int size,@MatrixParam("loc")String area,@MatrixParam("size")int sqrt)
	{
		return "location:"+location +","+"size:"+size+","+"area:"+area+"sqrt:"+sqrt;
		
	}
	



}
