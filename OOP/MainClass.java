import animalia.Animal;
import animalia.Mammal;
import animalia.Elephant;

public class MainClass {
    public static void main(String[] args) {
        Mammal elephant = new Elephant();
        elephant.eat();
        elephant.breath();
        elephant.travel();
        elephant.reproduce();
    }
}