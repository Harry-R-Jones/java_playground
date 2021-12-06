package oop.animal_farm;

public interface Canine {
    int legs = 4;
    String diet = "carnivore";

    String hunt();
    String run(String speed);
    String tricks();

//    default String wagTail(){
//        return "waggy waggy";
//    }
}
