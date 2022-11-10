package com.koushik.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.Speciality;
import com.koushik.sfgpetclinic.repositories.SpecialityRepository;
import com.koushik.sfgpetclinic.services.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialityJPAService implements SpecialityService{
    

    private final SpecialityRepository specialityRepository;

    public SpecialityJPAService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Speciality findById(Long id) {
        
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality t) {
        return specialityRepository.save(t);
    }

    @Override
    public Set<Speciality> findAll() { 
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public void delete(Speciality t) {
        specialityRepository.delete(t);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }

    
}
