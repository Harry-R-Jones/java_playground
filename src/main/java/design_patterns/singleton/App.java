package design_patterns.singleton;

public class App {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
