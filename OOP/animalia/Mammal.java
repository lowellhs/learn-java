package animalia;
import animalia.Animal;

public abstract class Mammal implements Animal {
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breath();
    public abstract void travel();
    public void reproduce() {
        System.out.println(this.name + " gives birth");
    }
}