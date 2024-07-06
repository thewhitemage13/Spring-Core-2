package entity;

public class DogShop implements PetService{
    @Override
    public Pet adorablePet() {
        return new Dog();
    }
}
