package com.removingxml;

import org.springframework.stereotype.Component;

//@Component("firstStudent")
public class Student {

	private Address address;
	
	public void study() {
		this.address.display();
		System.out.println("Student is studying..");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Address address) {
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
		return "Student [address=" + address + "]";
	}
	
	
	
}
