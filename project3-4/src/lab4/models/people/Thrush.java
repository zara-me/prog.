package lab4.models.people;

import lab4.interfaces.Singable;

/**
 * Represents the thrush (дрозд) that sings cheerfully to comfort Eliza.
 */
public class Thrush extends Person implements Singable {
    public Thrush(String name, double mass) {
        super(name, Sex.MALE, mass); // assuming a male bird for simplicity
    }

    @Override
    public String speak() {
        // Thrush does not speak, but sings instead.
        return "";
    }

    @Override
    public void sing() {
        System.out.println(getName() + " поёт весёлую песню.");
    }

    public String singSong() {
        return getName() + " утешает Элизу своей песней.";
    }
}