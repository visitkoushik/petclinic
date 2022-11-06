package com.koushik.sfgpetclinic.services.map;

import com.koushik.sfgpetclinic.model.PetType;
import com.koushik.sfgpetclinic.services.CrudService;

public class PetTypeServiceMap extends AbstructMapService<PetType,Long> 
implements CrudService<PetType,Long>{
    

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
