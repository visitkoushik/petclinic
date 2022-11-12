package com.koushik.sfgpetclinic.model;

import javax.persistence.Entity;
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
@Table(name="pet_types")
public class PetType extends BaseEntity {

    private String name;

   
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            " name='" + getName() + "'" +
            "}";
    }

}
