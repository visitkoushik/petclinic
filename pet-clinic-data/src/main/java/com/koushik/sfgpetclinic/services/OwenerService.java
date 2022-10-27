package com.koushik.sfgpetclinic.services;

import java.util.Set;

import com.koushik.sfgpetclinic.model.Owner;

public interface OwenerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
