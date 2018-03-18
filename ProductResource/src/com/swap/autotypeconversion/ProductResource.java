package com.swap.autotypeconversion;

import javax.ws.rs.Path;

@Path("/product")
public class ProductResource {
	
	public String gettype(ProductCode productcode)
	{
		return "catagory="+productcode.getCatagory()+"productId="+productcode.getProductId();
	}

}
