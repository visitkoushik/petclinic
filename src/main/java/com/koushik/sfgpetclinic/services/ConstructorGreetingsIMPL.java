package com.koushik.sfgpetclinic.services; 
import org.springframework.stereotype.Service;

 
@Service
public class ConstructorGreetingsIMPL implements GreetingsService {

    @Override
    public String sayGreetings() {
      
        return "Hello World - ConstructorGreetingsIMPL";
    }

}
