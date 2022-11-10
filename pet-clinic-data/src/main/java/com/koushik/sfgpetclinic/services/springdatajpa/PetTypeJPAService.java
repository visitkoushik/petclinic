package com.koushik.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.PetType;
import com.koushik.sfgpetclinic.repositories.PetTypeRepository;
import com.koushik.sfgpetclinic.services.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeJPAService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;


    public PetTypeJPAService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public PetType findById(Long id) {
       
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType t) {
        
        return petTypeRepository.save(t);
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();

        petTypeRepository.findAll().forEach(petTypes::add);

        return petTypes;
    }

    @Override
    public void delete(PetType t) {
       petTypeRepository.delete(t);
        
    }

    @Override
    public void deleteById(Long id) {
         petTypeRepository.deleteById(id);
        
    }
    
}
