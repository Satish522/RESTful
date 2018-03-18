package com.swap.subresourcelocator;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api/*")
public class ApplicationCare extends Application{
	private Set<Object> singletons;
	private Set <Class<Object>> classes;
	
	public ApplicationCare() {
		singletons = new HashSet();
		
	}
	

	@Override
	public Set<Object> getSingletons() {
		singletons.add(new SamsungCare());
		return singletons;
	}

}
