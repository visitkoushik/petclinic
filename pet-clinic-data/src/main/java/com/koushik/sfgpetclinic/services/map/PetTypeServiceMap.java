package com.koushik.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.PetType;
import com.koushik.sfgpetclinic.services.PetTypeService;

@Service
public class PetTypeServiceMap extends AbstructMapService<PetType,Long> 
implements PetTypeService{
    

    @Override
    public PetType findById(Long id) {
        return this.findById(id);
    }

    @Override
    public PetType save(PetType Pet) {
        return super.save(Pet);
    }

    @Override
    public void delete(PetType Pet) {
        super.delete(Pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    
}
