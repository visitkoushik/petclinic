package com.koushik.sfgpetclinic.controlers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.koushik.sfgpetclinic.services.GreetingsService;

@Controller
public class I18nControler {
    
    private final GreetingsService greetingsService;
    public I18nControler(@Qualifier("I18nService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreetings(){
        return this.greetingsService.sayGreetings();
    }


    
}
