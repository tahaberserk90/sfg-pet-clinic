package com.springframework.sfgpetclinic.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity {
	
	private static final long serialVersionUID = 2609819976981306460L;
	private String firstName;
	private String lastName;
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

}
