package lab4.models.things;

import lab4.interfaces.Gatherable;

/**
 * Represents a nettle stem that the mice collect.
 */
public class NettleStem implements Gatherable {
    private final String description;

    public NettleStem() {
        this.description = "разбросанный стебель крапивы";
    }

    @Override
    public void gather() {
        System.out.println("Мышка собирает " + description + ".");
    }

    @Override
    public String toString() {
        return description;
    }
}