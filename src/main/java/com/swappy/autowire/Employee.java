package com.swappy.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

//	private int eId;
//	private String eName;
	
	@Autowired
	@Qualifier("address2")
	private Address address;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(Address address) {
		super();
		this.address = address;
	}



	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	
	
}
