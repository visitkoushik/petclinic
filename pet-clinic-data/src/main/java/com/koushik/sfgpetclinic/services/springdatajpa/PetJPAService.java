package com.koushik.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.Pet;
import com.koushik.sfgpetclinic.repositories.PetRepository;
import com.koushik.sfgpetclinic.services.PetService;


@Service
@Profile("springdatajpa")
public class PetJPAService implements PetService{


    private final PetRepository petRepository;


    public PetJPAService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    @Override
    public Pet findById(Long id) {
        return this.petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet t) {
        
        return this.petRepository.save(t);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets =new HashSet<>();
         this.petRepository.findAll().forEach(pets::add);
         return pets;
    }

    @Override
    public void delete(Pet t) {
       this.petRepository.delete(t);
        
    }

    @Override
    public void deleteById(Long id) {
        this.petRepository.deleteById(id);
    }
    
}
