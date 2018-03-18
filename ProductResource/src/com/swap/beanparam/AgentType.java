package com.swap.beanparam;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/agent")
public class AgentType {
	
	@PathParam("name")
	String name;
	@QueryParam("roll")
	int roll;
	@MatrixParam("marks")
	double marks;
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@PathParam("/{name}")
	public AgentType getInfo(@BeanParam AgentType agenttype)
	{
		return agenttype;
		
	}
	

}
