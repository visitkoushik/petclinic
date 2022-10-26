package com.koushik.sfgpetclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nService")
public class I18nGreetingsEnglishService implements GreetingsService{

    @Override
    public String sayGreetings() {
        
        return "Hello World";
    }


    
}
