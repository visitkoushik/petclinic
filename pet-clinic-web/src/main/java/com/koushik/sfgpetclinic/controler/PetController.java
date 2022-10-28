package com.koushik.sfgpetclinic.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
    @RequestMapping({"/pets","/pets/index","/pets/index.html"})
    public String inddex(){

        return "pets/index";
    }
}
