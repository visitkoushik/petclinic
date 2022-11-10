package com.koushik.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.koushik.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long>{
    
}
