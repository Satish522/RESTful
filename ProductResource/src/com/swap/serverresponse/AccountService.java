package com.swap.serverresponse;

import java.util.UUID;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "service")

public class AccountService {
	
	protected String accountholdername;
	

	public Response create(Application application)
	{
		Account account=null;
		Application applicaation=null;
		Response response=null;
		ResponseBuilder builder=null;
		
		account.setAccountholdername(application.accountholdername);
		account.setAccounttype(application.accounttype);
		account.setMinbalance(application.minbalance);
		//account.setAccountNo(UUID.randomUUID().toString());
		
		builder =response.status(201);
		builder=builder.entity(application);
		response=builder.build();
		return response.status(201).entity(application).build();
	}

}
