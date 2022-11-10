package com.koushik.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.Speciality;
import com.koushik.sfgpetclinic.services.SpecialityService;

@Service
public class SpecialityMapService extends AbstructMapService<Speciality,Long> 
implements SpecialityService{
    @Override
    public Speciality findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Speciality save(Speciality Pet) {
        return super.save(Pet);
    }

    @Override
    public void delete(Speciality Pet) {
        super.delete(Pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Speciality> findAll() {
      
        return super.findAll();
    }

}
