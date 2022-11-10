package com.koushik.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.koushik.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long>{
    
}
