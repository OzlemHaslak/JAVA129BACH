package day26overriding;

public class Cat extends Mammal {


    public void meow() {
        System.out.println("Cats meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void drink() {
        System.out.println("Cat drink");
    }

    @Override
    public Animal create() {
        return new Cat();
    }
}
