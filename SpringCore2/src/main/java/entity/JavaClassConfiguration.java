package entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class JavaClassConfiguration {

    @Bean
    @Primary
    public PetService petService() {
        return new CatShop(new Toy("mouse"));
    }

    @Bean
    public PetService petServiceDog() {
        return new DogShop();
    }
}
