package com.koushik.sfgpetclinic.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("vets")
@Controller
public class VetController {


    @RequestMapping({"","/","/index","/index.html"})
    public String inddex(){

        return "vets/index";
    }
}
