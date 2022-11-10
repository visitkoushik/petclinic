package com.koushik.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.koushik.sfgpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long>{
    
}
