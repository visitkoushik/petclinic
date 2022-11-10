package com.koushik.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.koushik.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long>{
    
}
