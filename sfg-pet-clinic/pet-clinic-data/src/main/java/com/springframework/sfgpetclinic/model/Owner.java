package com.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "owners")
public class Owner extends Person {

	private static final long serialVersionUID = -8890955797798081468L;
	
	private String address;
	private String city;
	private String telephone;
	
	@Builder
	public Owner(Long id,String firstName, String lastName,String address, String city, String telephone, Set<Pet> pets) {
		super(id, firstName, lastName);
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pets = pets;
	}


	@OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
	private Set<Pet> pets=new HashSet<>();

	
}
