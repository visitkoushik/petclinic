package com.koushik.sfgpetclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("I18nService")
public class i18nGreetingsSpanishService implements GreetingsService{

    @Override
    public String sayGreetings() {
        
        return "Holla Mundo";
    }


    
}
