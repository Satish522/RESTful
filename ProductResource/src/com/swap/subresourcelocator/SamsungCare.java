package com.swap.subresourcelocator;

import javax.inject.Singleton;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/samsung")
public class SamsungCare {
	
	private MobileCare mobileCare;
	private HomeApplianceCare homeApplianceCare;
	
	public SamsungCare() {
		
		mobileCare = new MobileCare();

		homeApplianceCare = new HomeApplianceCare();
	}
	
	@Path("/{productType}")
	public Object getProductType(@PathParam("productType")String productType)
	{
		if (productType.equals("mobile")) {
			return mobileCare;
		} else if (productType.equals("home-appliances")) {
			return homeApplianceCare;
		}
		return null;
		
	}



}
