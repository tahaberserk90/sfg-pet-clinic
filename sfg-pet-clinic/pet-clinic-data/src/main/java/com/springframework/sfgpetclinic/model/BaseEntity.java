package com.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	
	
	private static final long serialVersionUID = 258002725935322340L;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	 

}
