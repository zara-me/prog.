package lab4.models.people;

/**
 * Represents the king, who is sleeping until he is awakened.
 */
public class King extends Person {
    public King(String name, double mass) {
        super(name, Sex.MALE, mass);
    }

    @Override
    public String speak() {
        return "Король " + getName() + " молчит, так как спит.";
    }

    public String wakeUp() {
        return "Король проснулся и вышел узнать, что происходит.";
    }
}