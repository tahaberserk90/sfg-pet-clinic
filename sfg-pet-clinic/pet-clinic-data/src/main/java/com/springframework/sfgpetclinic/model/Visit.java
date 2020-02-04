package com.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {

	private static final long serialVersionUID = -491682663371207524L;
	private LocalDate date;
	private Pet pet;
	private String description;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
