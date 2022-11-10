package com.koushik.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.koushik.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{
    
}
