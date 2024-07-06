package org.thewhitemage13;

import entity.CatShop;
import entity.DogShop;
import entity.JavaClassConfiguration;
import entity.PetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaClassConfiguration.class);

        JavaClassConfiguration config = applicationContext.getBean(JavaClassConfiguration.class);

        PetService service  = applicationContext.getBean(PetService.class);

        PetService serviceCat = applicationContext.getBean(CatShop.class);

        PetService serviceDog = applicationContext.getBean(DogShop.class);
    }
}