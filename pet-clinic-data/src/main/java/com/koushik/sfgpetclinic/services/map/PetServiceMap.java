package com.koushik.sfgpetclinic.services.map;

import com.koushik.sfgpetclinic.model.Pet; 
import com.koushik.sfgpetclinic.services.PetService;

public class PetServiceMap extends AbstructMapService<Pet, Long> 
implements PetService{

    @Override
    public Pet findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Pet save(Pet Pet) {
        return super.save(Pet);
    }

    @Override
    public void delete(Pet Pet) {
        super.delete(Pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    

    
}
