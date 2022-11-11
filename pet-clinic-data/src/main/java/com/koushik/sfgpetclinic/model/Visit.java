package com.koushik.sfgpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    @DateTimeFormat(pattern = "dd-MMM-yy")
    private LocalDate date;

    @Column(name="description")
    private String description;


    @ManyToOne()
    @JoinColumn(name="pet_id")
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "{" +
            " date='" + getDate() + "'" +
            ", description='" + getDescription() + "'" +
           
            "}";
    }

}
