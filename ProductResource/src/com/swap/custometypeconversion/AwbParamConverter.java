package com.swap.custometypeconversion;

import javax.ws.rs.Path;
import javax.ws.rs.ext.ParamConverter;

public class AwbParamConverter implements ParamConverter<AwbNo>{
	
	int branchCode=0;
	int refNo=0;
	AwbNo awbno=null;
	
	@Override
	public AwbNo fromString(String param) {
		
		branchCode=Integer.parseInt(param.substring(4,6));
		refNo=Integer.parseInt(param.substring(6,param.length()));
		awbno=new AwbNo(branchCode,refNo);
		return awbno;
	}

	@Override
	public String toString(AwbNo awbno) {

		return ""+awbno.getBranchCode()+""+awbno.getRefNo()+"";
	}

}
