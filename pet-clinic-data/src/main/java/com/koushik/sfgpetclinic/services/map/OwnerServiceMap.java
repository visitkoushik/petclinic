package com.koushik.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.koushik.sfgpetclinic.model.Owner;
import com.koushik.sfgpetclinic.model.Pet;
import com.koushik.sfgpetclinic.services.OwenerService;
import com.koushik.sfgpetclinic.services.PetService;
import com.koushik.sfgpetclinic.services.PetTypeService;


@Service
public class OwnerServiceMap extends AbstructMapService<Owner, Long> 
implements OwenerService{

    private final PetTypeService petTypeService;
    private final PetService petService;





    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Owner save(Owner owner) {

        if(owner!=null){
            if(owner.getPets()!=null){
                owner.getPets().forEach(pet->{
                    if(pet.getId()!=null){
                        Pet savedpet = petService.save(pet);
                        pet.setId(savedpet.getId());
                    }
                    if(pet.getPetType()!=null){
                        if(pet.getPetType().getId()!=null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else{
                        throw new RuntimeException("Pet type missing");
                    }

                    
                });
            }
            return super.save(owner);
        }
        else{
            return null;
        }
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

    @Override
    public Set<Owner> findAll() {
     
        return super.findAll();
    }

}
