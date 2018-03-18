package com.swap.Interfacedriven;

import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.StreamingOutput;

public interface ServiceProviderInterface {
	@POST
	@Produces("text/plain")
	@Consumes("text/plain")
	public StreamingOutput pay(InputStream is);
	
}
