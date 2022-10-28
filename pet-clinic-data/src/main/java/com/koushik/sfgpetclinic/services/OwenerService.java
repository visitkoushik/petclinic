package com.koushik.sfgpetclinic.services;

  
import com.koushik.sfgpetclinic.model.Owner;

public interface OwenerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
 
}
