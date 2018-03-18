package com.swap.pathparam;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api/*")
public class BankApplication extends Application 
{
	int balance;
	private Banking objects;

	public BankApplication() {
		objects = new Banking(balance);

	}
	
	public  Banking getSingleton() {
		System.out.println(objects);
		return objects;
	}


	



}
