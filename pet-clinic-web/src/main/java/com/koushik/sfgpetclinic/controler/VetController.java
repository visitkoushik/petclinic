package com.koushik.sfgpetclinic.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koushik.sfgpetclinic.services.VetService;

@RequestMapping("vets")
@Controller
public class VetController {

    private final VetService vetService;

    

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }



    @RequestMapping({"","/","/index","/index.html"})
    public String listVet(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
