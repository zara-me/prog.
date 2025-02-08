package lab4.models.people;

/**
 * A guard who blocks entry at the castle gate.
 */
public class Guard extends Person {
    public Guard(String name, double mass) {
        super(name, Sex.MALE, mass);
    }

    @Override
    public String speak() {
        return "Страж " + getName() + " стоит на страже.";
    }

    public String blockEntry() {
        return "Страж " + getName() + " отказал братьям во входе.";
    }
}