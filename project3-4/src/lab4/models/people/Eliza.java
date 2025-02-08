package lab4.models.people;

/**
 * The main character, Eliza.
 */
public class Eliza extends Person {
    public Eliza(String name, double mass) {
        super(name, Sex.FEMALE, mass);
    }

    @Override
    public String speak() {
        return getName() + " говорит с грустью.";
    }

    /**
     * When help arrives, she receives it.
     */
    public String receiveHelp(String item) {
        return getName() + " получила " + item + " к своим ногам.";
    }
}