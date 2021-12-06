package oop.animal_farm;

import java.util.ArrayList;
import java.util.List;

public class AnimalSanctuary {
    private Dog bernie = new Dog();
    private Dog bernice =new Dog();
    private Fox rick = new Fox();
    private Fox rita = new Fox();
    private List<Fox> foxesInTheSanctuary = new ArrayList<>();
    private List<Animal> animalsInTheSanctuary = new ArrayList<>();

    public AnimalSanctuary() {
        foxesInTheSanctuary.add(this.rick);
        foxesInTheSanctuary.add(this.rita);

        animalsInTheSanctuary.add(rick);
        animalsInTheSanctuary.add(bernie);

    }

    private List<Fox> foxesInSanctuary(){
    return null;
    }
}
