package entity;

public class Cat extends Pet{
    private Toy toy;

    public Cat(Toy toy){this.toy = toy;}

    @Override
    public String speak() {
        return "meow!";
    }

    @Override
    public Toy toy() {
        return toy;
    }
}
