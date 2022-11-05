package com.koushik.sfgpetclinic.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koushik.sfgpetclinic.services.OwenerService;

@RequestMapping("owners")
@Controller
public class OwnerController {


    private final OwenerService owenerService;

    public OwnerController(OwenerService owenerService) {
        this.owenerService = owenerService;
    }

    @RequestMapping({"","/","/index","/index.html","/find"})
    public String listOwner(Model model){
        model.addAttribute("owners", this.owenerService.findAll());
        return "owner/index.html";
    }

}
