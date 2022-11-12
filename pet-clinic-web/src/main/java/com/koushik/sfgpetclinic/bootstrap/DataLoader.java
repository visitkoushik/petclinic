package com.koushik.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.koushik.sfgpetclinic.model.Owner;
import com.koushik.sfgpetclinic.model.Pet;
import com.koushik.sfgpetclinic.model.PetType;
import com.koushik.sfgpetclinic.model.Speciality;
import com.koushik.sfgpetclinic.model.Vet;
import com.koushik.sfgpetclinic.model.Visit;
import com.koushik.sfgpetclinic.services.OwenerService;
import com.koushik.sfgpetclinic.services.PetService;
import com.koushik.sfgpetclinic.services.PetTypeService;
import com.koushik.sfgpetclinic.services.SpecialityService;
import com.koushik.sfgpetclinic.services.VetService;
import com.koushik.sfgpetclinic.services.VisitService; 


@Component
public class DataLoader implements CommandLineRunner{


    private final OwenerService owenerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;
    /**
     * 
     */
    @Autowired// Not reuired aft spring 4.2
    public DataLoader(
        OwenerService owenerService,
        VetService vetService,
        PetTypeService petTypeService,
        SpecialityService specialityService,
        VisitService visitService) {
            this.owenerService = owenerService;
            this.vetService = vetService;
            this.petTypeService = petTypeService;
            this.specialityService = specialityService;
            this.visitService = visitService;
    }


    @Override
    public void run(String... args) throws Exception {
        
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType dogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType catPetType = petTypeService.save(cat);

        PetType rat = new PetType();
        rat.setName("Rat");
        PetType ratPetType = petTypeService.save(rat);


        Speciality speciality1 = new Speciality();
        speciality1.setDescription("Radiology");
        Speciality radioLogy = specialityService.save(speciality1);

        Speciality speciality2 = new Speciality();
        speciality2.setDescription("Dentistry");
        Speciality dentistry = specialityService.save(speciality2);

        Speciality speciality3 = new Speciality();
        speciality3.setDescription("Surgery");
        Speciality surgery = specialityService.save(speciality3);


 
        
        
        Owner owner1 = new Owner();
        // owner1.setId(1L);
        owner1.setFirstName("Koushik");
        owner1.setLastName("Majumder");
        owner1.setAddress("SubhashGram");
        

        Owner owner3 = Owner.builder().address("Naktala").id(4L)
        .firstName("Bubun").lastName("Banerjee").build();


        Pet petCat = new Pet();
        petCat.setPetType(catPetType);
        petCat.setName("Mao");
        petCat.setOwner(owner1);
        petCat.setBirthDay(LocalDate.now());
        owner1.getPets().add(petCat);
        owenerService.save(owner1);


        Owner owner2 = new Owner();
        // owner2.setId(2L);
        owner2.setFirstName("Kuntal");
        owner2.setLastName("Chakraborty");
        owner2.setAddress("BijoyGar");
        
        Pet petDog = new Pet();
        petDog .setPetType(dogPetType);
        petDog .setName("BhouBhou");
        petDog.setBirthDay(LocalDate.of(2019, 3, 12));
        petDog.setOwner(owner2);
        owner2.getPets().add(petDog);
        owenerService.save(owner2);

        Pet petRat = new Pet();
        petRat .setPetType(ratPetType);
        petRat .setName("Bambi");
        petRat.setBirthDay(LocalDate.of(2019, 3, 12));
        petRat.setOwner(owner3);
        owner3.getPets().add(petRat);
        owenerService.save(owner3);
        
        // System.out.println(petCat.toString());
        Visit catVisit = new Visit();
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Snizzy Kitty");
        catVisit.setPet(petCat);
        visitService.save(catVisit);
        // System.out.println(catVisit.toString());
        
        System.out.println("Loaded Owner");

        Vet vet1 =new Vet();
        // vet1.setId(1L);
        vet1.setFirstName("Pooja");
        vet1.setLastName("Dey");
        vet1.getSpecialities().add(radioLogy);
        vet1.getSpecialities().add(surgery);
        vetService.save(vet1);

        Vet vet2 =new Vet();
        // vet2.setId(2L);
        vet2.setFirstName("Pooja");
        vet2.setLastName("Kaberia");
        vet2.getSpecialities().add(dentistry);
        vet2.getSpecialities().add(surgery);
        vetService.save(vet2);

        System.out.println(owner1);

    }
    
}
