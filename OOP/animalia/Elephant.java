package animalia;

import animalia.Mammal;

public class Elephant extends Mammal {
    private String name;

    public Elephant() {
        super("Elephant");
        this.name = "Elephant";
    }

    public void eat() {
        System.out.println(this.name + " eats plants");
    }
    public void breath() {
        System.out.println(this.name + " breathes air");
    }
    public void travel() {
        System.out.println(this.name + " travels by walk");
    }
}
