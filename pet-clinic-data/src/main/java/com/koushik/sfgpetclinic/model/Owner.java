package com.koushik.sfgpetclinic.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
// @AllArgsConstructor
// @Builder

@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Column(name = "address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL,mappedBy ="owner" )
    private Set<Pet> pets=new HashSet<>();


    @Builder
    public Owner(Long id,String firstName,String lastName,String address) {
        super(id,firstName,lastName);
        this.address = address;
        // this.pets = pets;
    }
     
    public List<String> getAllPetsName(){
        List<String> aList = new ArrayList<String>(pets.size());

        pets.forEach(pet->{
            aList.add(pet.getName()+"-"+pet.getPetType().getName());
        });

        return aList;
    }

   
    @Override
    public String toString() {
        return "{" +
            "ID = "+getId()+","+
            " FirstName='" + getFirstName() + "'" +
            " LastName='" + getLastName() + "'" +
            " address='" + getAddress() + "'" +
            ", pets='" + getPets() + "'" +
            "}";
    }


}
