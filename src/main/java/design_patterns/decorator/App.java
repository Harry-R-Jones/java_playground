package design_patterns.decorator;

import design_patterns.decorator.Sides.Salad;
import design_patterns.decorator.pizzas.Italian;

public class App {
    public static void main(String[] args) {
        Italian italian = new Italian();
        System.out.println(italian.getDescription() + " Cost: " + italian.getCost());

        Salad salad = new Salad(italian);
        System.out.println(salad.getDescription()+ " Cost: " + salad.getCost());
    }
}
