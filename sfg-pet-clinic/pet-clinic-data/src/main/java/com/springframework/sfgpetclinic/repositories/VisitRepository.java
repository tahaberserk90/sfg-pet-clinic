package com.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
