package entity;

public class Dog extends Pet{
    @Override
    public String speak() {
        return "Bark!!!";
    }

    @Override
    public Toy toy() {
        return null;
    }
}
