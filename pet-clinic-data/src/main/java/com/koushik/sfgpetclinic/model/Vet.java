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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @Column(name = "specialities")
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="vet_speciality",
    joinColumns = @JoinColumn(name="vet_id"),
    inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

  
   
    public List<String> getAllSpecialities() {
        List<String> aList = new ArrayList<String>(specialities.size());

        specialities.forEach(speciality->{
            aList.add(speciality.getDescription());
        });

        return aList;
    }

    
}
