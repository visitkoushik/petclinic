package com.koushik.sfgpetclinic.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vets")
public class Vet extends Person {

    @Column(name = "specialities")
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="vet_speciality",
    joinColumns = @JoinColumn(name="vet_id"),
    inverseJoinColumns = @JoinColumn(name="speciality_id"))
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
