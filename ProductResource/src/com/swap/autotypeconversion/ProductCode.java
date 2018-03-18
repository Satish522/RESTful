package com.swap.autotypeconversion;

public class ProductCode {
	protected int  catagory;
	protected int productId;
	
	public int getCatagory() {
		return catagory;
	}
	public void setCatagory(int catagory) {
		this.catagory = catagory;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	@Override
	public String toString() {
		return "ProductCode [catagory=" + catagory + ", productId=" + productId + "]";
	}
	
	public ProductCode( String productcode) {
		String c=null;
		String d=null;
	
		c=productcode.substring(0,1);
		d=productcode.substring(2,productcode.length());
		
		
		catagory = Integer.parseInt(c);
		productId=Integer.parseInt(c);
		
		
	}
	
	

}
