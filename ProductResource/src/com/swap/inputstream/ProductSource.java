package com.swap.inputstream;

import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductSource {
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String add_product(InputStream in) throws IOException
	{
		int c=0;
		StringBuffer buffer=null;
		buffer=new StringBuffer();
		
		if((c=in.read())!= (-1))
		{
			buffer.append((char)c);
		}
		return buffer.toString();
		
	}

}
