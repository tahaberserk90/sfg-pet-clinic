package com.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialties")
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
