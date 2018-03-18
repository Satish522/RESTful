package com.swap.pathsegment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

@Path("/cars")
public class PathsegmentClass {

	    @GET
	    @Path("{brand}/{model}")
	    @Produces(MediaType.TEXT_PLAIN)
	    public String getCars(@PathParam("brand") String brand,
	                            @PathParam("model") PathSegment car){

	        String model = car.getPath();
	        System.out.println(model);
	        String color = car.getMatrixParameters().getFirst("min");
	        
	        System.out.println("brand: " + brand);
	        System.out.println("model: " + model);
	        System.out.println("color: " + color);

	        return "Brand:"+brand+","+"model:"+model+","+"color:"+color;
	    }
	    


}
