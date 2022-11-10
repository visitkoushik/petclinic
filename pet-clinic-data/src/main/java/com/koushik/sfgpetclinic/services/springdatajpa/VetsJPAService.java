package com.koushik.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.Vet;
import com.koushik.sfgpetclinic.repositories.VetRepository;
import com.koushik.sfgpetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetsJPAService implements VetService{

    private final VetRepository vetRepository;



    public VetsJPAService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }



    @Override
    public Vet findById(Long id) {
         
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet t) {
        
        return vetRepository.save(t);
    }

    @Override
    public Set<Vet> findAll() {
         Set<Vet> vets = new HashSet<>();
         vetRepository.findAll().forEach(vets::add);

         return vets;
    }

    @Override
    public void delete(Vet t) {
      vetRepository.delete(t);
        
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
    
}
