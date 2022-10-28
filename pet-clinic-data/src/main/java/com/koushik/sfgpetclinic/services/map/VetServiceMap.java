package com.koushik.sfgpetclinic.services.map;

import com.koushik.sfgpetclinic.model.Vet;
import com.koushik.sfgpetclinic.services.CrudService;

public class VetServiceMap extends AbstructMapService<Vet, Long> 
implements CrudService<Vet,Long>{

    @Override
    public Vet findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Vet save(Vet Vet) {
        return super.save(Vet.getId(), Vet);
    }

    @Override
    public void delete(Vet Vet) {
        super.delete(Vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    

    
}
