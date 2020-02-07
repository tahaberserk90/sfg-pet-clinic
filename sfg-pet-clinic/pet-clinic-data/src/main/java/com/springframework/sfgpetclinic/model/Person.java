package com.springframework.sfgpetclinic.model;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {
	
	private static final long serialVersionUID = 2609819976981306460L;
	private String firstName;
	private String lastName;
	
	public Person(Long id,String firstName, String lastName) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	

}
