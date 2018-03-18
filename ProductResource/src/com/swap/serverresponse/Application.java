package com.swap.serverresponse;

public class Application {
	protected String accountholdername;
	protected String accounttype;
	protected int balance;
	protected String branch;
	protected float minbalance;
	
	public float getMinbalance() {
		return minbalance;
	}
	public void setMinbalance(float minbalance) {
		this.minbalance = minbalance;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public String setAccountholdername(String accountholdername) {
		return accountholdername;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	

}
