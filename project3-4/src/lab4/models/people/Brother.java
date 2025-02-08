package lab4.models.people;

import lab4.interfaces.Pleadable;
import lab4.interfaces.Threatenable;
import lab4.interfaces.Transformable;

/**
 * Represents one of Eliza's eleven brothers.
 * They plead for entry, threaten, and eventually transform.
 */
public class Brother extends Person implements Pleadable, Threatenable, Transformable {

    public Brother(String name, double mass) {
        super(name, Sex.MALE, mass);
    }

    @Override
    public String speak() {
        return getName() + " просит войти.";
    }

    @Override
    public String plead() {
        return getName() + " умоляет впустить его к королю.";
    }

    @Override
    public String threaten() {
        return getName() + " угрожает, что войдет насильно!";
    }

    @Override
    public String transform() {
        return getName() + " превращается в дикого лебедя.";
    }
}