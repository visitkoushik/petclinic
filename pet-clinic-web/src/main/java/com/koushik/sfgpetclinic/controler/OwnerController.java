package com.koushik.sfgpetclinic.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owners")
@Controller
public class OwnerController {
    @RequestMapping({"","/","/index","/index.html"})
    public String index(){

        return "owner/index.html";
    }

}
