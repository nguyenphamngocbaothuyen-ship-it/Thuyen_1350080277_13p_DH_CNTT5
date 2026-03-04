package Buoi7;

public class Animal {
    public void makeSound(){
        System.out.println("Tieng cua con vat....");
    }
}
class Pig extends Animal {
    @Override
    public void makeSound(){
        System.out.println("un in");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("meo meo");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("gau gau");
    }
}
class Bird extends Animal {
    @Override
    public void makeSound(){
        System.out.println("chit chit");
    }
}
