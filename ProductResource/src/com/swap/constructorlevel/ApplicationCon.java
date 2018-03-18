package com.swap.constructorlevel;

import org.glassfish.jersey.server.ResourceConfig;

@javax.ws.rs.ApplicationPath("/api/*")
public class ApplicationCon extends ResourceConfig{
	public ApplicationCon()
	{
		register(new NetBanking(22));
	}
	

}
