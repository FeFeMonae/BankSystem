package com.lq.bank.model;

import com.lq.bank.enums.AccountType;

public class Account {
	
	private int acctId;
	
	private String label;
	
	private AccountType type;
	
	private Branch branch;
	
	private Customer customer;
	
	
	public Account(int acctId, String label, AccountType type, Branch branch, Customer customer) {
		super();
		this.acctId = acctId;
		this.label = label;
		this.type = type;
		this.branch = branch;
		this.customer = customer;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getAcctId() {
		return acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	

	
	}
