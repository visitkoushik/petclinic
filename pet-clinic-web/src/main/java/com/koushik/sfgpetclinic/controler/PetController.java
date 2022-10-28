package com.koushik.sfgpetclinic.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("pets")
@Controller
public class PetController {
    @RequestMapping({"","/","/index","/index.html"})
    public String inddex(){

        return "pets/index";
    }
}
