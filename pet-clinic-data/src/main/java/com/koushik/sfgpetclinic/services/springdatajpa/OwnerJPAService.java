package com.koushik.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.Owner;
import com.koushik.sfgpetclinic.repositories.OwnerRepository;
import com.koushik.sfgpetclinic.repositories.PetRepository;
import com.koushik.sfgpetclinic.repositories.PetTypeRepository;
import com.koushik.sfgpetclinic.services.OwenerService;

@Profile("springdatajpa")
@Service
public class OwnerJPAService implements OwenerService {


    private final OwnerRepository ownerRepository;
    private final PetTypeRepository petTypeRepository;
    private final PetRepository petRepository;


    public OwnerJPAService(OwnerRepository ownerRepository, PetTypeRepository petTypeRepository, PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.petTypeRepository = petTypeRepository;
        this.petRepository = petRepository;
    }
     
 


    @Override
    public Owner findById(Long id) {
        
        // Optional<Owner> optionalOwner = ownerRepository.findById(id);
        // if(optionalOwner.isPresent()){
        //     return optionalOwner.get();
        // }
      

        // return null;
//~
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner t) {
        
        return ownerRepository.save(t);
    }

    @Override
    public Set<Owner> findAll() {
         
        Set<Owner> owners = new HashSet<>();

        ownerRepository.findAll().forEach(owners::add);
        
        return owners;

    }

    @Override
    public void delete(Owner t) {
        ownerRepository.delete(t);
        
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        
        return ownerRepository.findByLastName(lastName);
    }
    
}
