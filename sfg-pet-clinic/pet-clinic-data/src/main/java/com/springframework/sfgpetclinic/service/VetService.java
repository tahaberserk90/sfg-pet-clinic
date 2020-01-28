package com.springframework.sfgpetclinic.service;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();

}
