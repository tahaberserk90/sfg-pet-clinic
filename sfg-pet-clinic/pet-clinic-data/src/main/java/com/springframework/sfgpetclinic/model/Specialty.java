package com.springframework.sfgpetclinic.model;

public class Specialty extends BaseEntity {

	private static final long serialVersionUID = -7957289983296747192L;

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
