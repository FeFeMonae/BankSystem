package com.lq.bank.model;

public class Customer {
	
	private int id;
	private int customersAge;
	
	private String firstName, lastName;
	
	private Branch branch;
	
	
	public Customer(int id, int customersAge, String firstName, String lastName, Branch branch) {
		super();
		this.id = id;
		this.customersAge = customersAge;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		
	}


	public Customer(int customersAge, String firstName, String lastName, Branch branch) {
		super();
		this.customersAge = customersAge;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
	}
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public int getCustomersAge() {
		return customersAge;
	}

	public void setCustomersAge(int customersAge) {
		this.customersAge = customersAge;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
}