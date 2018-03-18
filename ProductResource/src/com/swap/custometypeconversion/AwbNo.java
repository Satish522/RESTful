package com.swap.custometypeconversion;


public class AwbNo {
	protected int branchCode;
	protected int refNo;
	
	public AwbNo(int branchCode, int refNo) {
		
		this.branchCode = branchCode;
		this.refNo = refNo;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public int getRefNo() {
		return refNo;
	}

	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}
	

}
