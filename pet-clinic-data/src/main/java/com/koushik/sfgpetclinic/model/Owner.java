package com.koushik.sfgpetclinic.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Owner extends Person {
    private Set<Pet> pets=new HashSet<>();

    public Set<Pet> getPets() {
        return pets;
    }

    public List<String> getAllPetsName(){
        List<String> aList = new ArrayList<String>(pets.size());

        pets.forEach(pet->{
            aList.add(pet.getName()+"-"+pet.getPetType().getName());
        });

        return aList;
    }
    
    
}
