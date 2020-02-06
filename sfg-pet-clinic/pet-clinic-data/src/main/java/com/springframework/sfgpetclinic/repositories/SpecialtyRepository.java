package com.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.sfgpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {

}
