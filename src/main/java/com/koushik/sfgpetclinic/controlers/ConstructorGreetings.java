package com.koushik.sfgpetclinic.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.koushik.sfgpetclinic.services.GreetingsService;


@Controller
public class ConstructorGreetings {

 
    private  final GreetingsService greetingsService;

    public ConstructorGreetings(@Qualifier("constructorGreetingsIMPL") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    
    public String getGreetings(){
        return this.greetingsService.sayGreetings();
    }
    
}
