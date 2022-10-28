package com.koushik.sfgpetclinic.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControler {
    

    @RequestMapping({"","/","index","index.html","home","home.html"})
    public String inddex(){

        return "index";
    }


}
