package com.swap.Interfacedriven;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.StreamingOutput;

public class MasterService implements ServiceProviderInterface{
	@Path("/master")
	@Override
	public StreamingOutput pay(InputStream is) {

		return new StreamingOutput()
				{

					@Override
					public void write(OutputStream arg0) throws IOException, WebApplicationException {

						StringBuilder builder=new StringBuilder();
						builder.append("<tranction><tx-no>47</tx-no><status>sucessfull</status></tranction>");
						}
			
				};
	}

}
