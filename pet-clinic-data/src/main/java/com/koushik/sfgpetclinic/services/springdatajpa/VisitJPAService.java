package com.koushik.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.Visit;
import com.koushik.sfgpetclinic.repositories.VisitRepository;
import com.koushik.sfgpetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitJPAService implements VisitService{


    private final VisitRepository visitRepository;


    public VisitJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }



    @Override
    public Visit findById(Long id) {
         
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit t) {
        
        return visitRepository.save(t);
    }

    @Override
    public Set<Visit> findAll() {
       Set<Visit> visits = new HashSet<>();
       visitRepository.findAll().forEach(visits::add);
       return visits;
    }

    @Override
    public void delete(Visit t) {
        
        visitRepository.delete(t);
        
    }

    @Override
    public void deleteById(Long id) {
        
        visitRepository.deleteById(id);
    }
    
}
