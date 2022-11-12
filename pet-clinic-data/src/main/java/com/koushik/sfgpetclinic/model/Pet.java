package com.koushik.sfgpetclinic.model;

import java.time.LocalDate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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

    @Column(name = "visits")
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
    private Set<Visit> visits =new HashSet<>();
    

    @Override
    public String toString() {
        return "Printing Pet:   {" +
            " petID='" + getId() + "'" +
            " petType='" + getPetType() + "'" +
            ", name='" + getName() + "'" +
            ", birthDay='" + getBirthDay() + "'" +
            ", visits='" + getVisits() + "'" + 
            "}";
    }

}
