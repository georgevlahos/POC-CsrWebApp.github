package com.cof.crs.csradmin.model;

import java.util.Date;

public class Csr 
{
	String firstName;
	String lastName;
	String id;
	Date lastActiveDateTime;
	
	public Csr(String firstName, String lastName, String id)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getLastActiveDateTime() {
		return lastActiveDateTime;
	}

	public void setLastActiveDateTime(Date lastActiveDateTime) {
		this.lastActiveDateTime = lastActiveDateTime;
	}
}
