package additional_junit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Spartan spartan1 = new Spartan(1,"Manish","Java", LocalDate.now());
        Spartan spartan2 = new Spartan(2,"Kieran","Java", LocalDate.now());

    SpartanRepository.addSpartan(spartan1);
    SpartanRepository.addSpartan(spartan2);

    if (SpartanRepository.findSpartan(2).isPresent()) {
        System.out.println("no spartan");
    } else {
        System.out.println(SpartanRepository.findSpartan(2).get().getName());
    }
    }
}
