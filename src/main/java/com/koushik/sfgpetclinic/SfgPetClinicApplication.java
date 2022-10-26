package com.koushik.sfgpetclinic;

 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.koushik.sfgpetclinic.controlers.ConstructorGreetings;
import com.koushik.sfgpetclinic.controlers.I18nControler; 

@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgPetClinicApplication.class, args);
		
		// ConstructorGreetings constructorGreetings = (ConstructorGreetings)ctx.getBean("constructorGreetings");

		// System.out.println(constructorGreetings.getGreetings());
		
		I18nControler constructorGreetings = (I18nControler)ctx.getBean("i18nControler");

		System.out.println(constructorGreetings.getGreetings());


	}

}
