package com.koushik.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.koushik.sfgpetclinic.model.Owner;
import com.koushik.sfgpetclinic.model.Vet;
import com.koushik.sfgpetclinic.services.OwenerService;
import com.koushik.sfgpetclinic.services.VetService;
import com.koushik.sfgpetclinic.services.map.OwnerServiceMap;
import com.koushik.sfgpetclinic.services.map.VetServiceMap;


@Component
public class DataLoader implements CommandLineRunner{


    private final OwenerService owenerService;
    private final VetService vetService;

    /**
     * 
     */
    public DataLoader() {
        owenerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }


    @Override
    public void run(String... args) throws Exception {
        
        
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Koushik");
        owner1.setLastName("Majumder");
        owenerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Kuntal");
        owner1.setLastName("Chakraborty");
        owenerService.save(owner2);

        System.out.println("Loaded Owner");

        Vet vet1 =new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Pooja");
        vet1.setLastName("Dey");
        vetService.save(vet1);

        Vet vet2 =new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Pooja");
        vet2.setLastName("Kaberia");

        vetService.save(vet2);

        System.out.println("Loaded Vet");
    }
    
}
