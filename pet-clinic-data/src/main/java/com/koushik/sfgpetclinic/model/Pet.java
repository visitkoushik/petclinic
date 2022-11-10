package com.koushik.sfgpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name ="owner_id")
    private Owner owner;


    @Column(name="name")
    private String name;

    @DateTimeFormat(pattern = "dd-MMM-yy")
    @Column(name = "birth_date")
    private LocalDate birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public PetType getPetType() {
        return this.petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

}
