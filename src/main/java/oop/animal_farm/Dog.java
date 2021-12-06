package oop.animal_farm;

public class Dog extends Animal implements Canine{
    public Dog() {
        super(4);
    }

    @Override
    public String eat() {
        return "kibble";
    }

    @Override
    public String sound() {
        return "woof";
    }

    @Override
    public String hunt() {
        return null;
    }

    @Override
    public String run(String speed) {
        return null;
    }

    @Override
    public String tricks() {
        return null;
    }
}
