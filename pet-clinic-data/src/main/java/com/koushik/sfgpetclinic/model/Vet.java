package com.koushik.sfgpetclinic.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

   
    public List<String> getAllSpecialities() {
        List<String> aList = new ArrayList<String>(specialities.size());

        specialities.forEach(speciality->{
            aList.add(speciality.getDescription());
        });

        return aList;
    }

    
}
