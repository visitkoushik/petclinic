package com.koushik.sfgpetclinic.services;

import java.util.Set;

import com.koushik.sfgpetclinic.model.Pet;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet vet);
    Set<Pet> findAll();
}
