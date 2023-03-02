package day26overriding;

public class Animal {
    public void eat(){
        System.out.println("Animals eat...");
    }
    public void drink (){
        System.out.println("Animals drink...");
    }
    public Animal create(){
        return new Animal();

    }
}
