package oop.animal_farm;

public class Fox extends Animal implements Canine{

    public Fox() {
        super(4);
    }

    @Override
    public String eat() {
        return "anything";
    }

    @Override
    public String sound() {
        return "Screech";
    }

    public static void main(String[] args) {
        Fox labRat = new Fox();
        System.out.println(labRat.sound());
    }

    @Override
    public String hunt() {
        return "looks through bins";
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
