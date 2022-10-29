package com.koushik.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.Owner; 
import com.koushik.sfgpetclinic.services.OwenerService;


@Service
public class OwnerServiceMap extends AbstructMapService<Owner, Long> 
implements OwenerService{

    @Override
    public Owner findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        // TODO Auto-generated method stub
        return null;
    }


}
