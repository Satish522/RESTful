package com.swap.constructorlevel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/net/{mobileno}/{ifscCode}")
public class NetBanking {
		public int mobileno;
		public int ifscCode;

		public  NetBanking(@PathParam("{mobileno}")int mobileno)
		 {
			 this.mobileno=mobileno;
			 System.out.println("isfcCode:"+ifscCode);
			 
		 }

		
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		@Path("/balance")
		public float getbalance()
		{
			return 10.4f;
		}
		
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		@Path("/payees")
		public String getpayees()
		{
			return "mobileno22";
		}


}
