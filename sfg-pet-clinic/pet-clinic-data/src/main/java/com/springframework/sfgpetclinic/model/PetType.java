package com.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity {
	
	
	private static final long serialVersionUID = -5704825177651988141L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
