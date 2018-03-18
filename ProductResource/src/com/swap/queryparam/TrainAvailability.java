package com.swap.queryparam;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/train")
public class TrainAvailability {
	/*@GET

@Produces(MediaType.TEXT_PLAIN)
	
	public int trainSeats(@QueryParam("train-no")int trainNo)
	{
		return trainNo;
		
	}*/
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{train-no}")
	public int balance(@PathParam("train-no")int trainNo)
	{
		return trainNo;
		//return Response.status(200).entity(trainNo).build();
		
	}
}
