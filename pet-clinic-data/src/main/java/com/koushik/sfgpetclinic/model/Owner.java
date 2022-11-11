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

@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Column(name = "address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL,mappedBy ="owner" )
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

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
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
