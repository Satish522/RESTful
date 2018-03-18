package com.swap.serverresponse;

import java.util.UUID;

public class Account {
	protected String accountholdername;
	protected String accounttype;
	protected float minbalance;
	protected String branch;
	protected UUID accountNo;
	
	public String getAccountholdername() {
		return accountholdername;
	}


	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}


	public void setMinbalance(float minbalance) {
		this.minbalance = minbalance;
	}


	public UUID getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(UUID uuid) {
		this.accountNo = accountNo;
	}


	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public float getMinbalance() {
		return minbalance;
	}
	public void setMinbalance(int minbalance) {
		this.minbalance = minbalance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}



	
	

}
