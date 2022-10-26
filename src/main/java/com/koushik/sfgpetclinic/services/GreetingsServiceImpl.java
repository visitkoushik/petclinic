package com.koushik.sfgpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingsServiceImpl implements GreetingsService {

    @Override
    public String sayGreetings() {
      
        return "Hello World - GreetingsServiceImpl";
    }

    
}
