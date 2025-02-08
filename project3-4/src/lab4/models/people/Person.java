package lab4.models.people;

import lab4.models.common.Impression;
import lab4.models.common.Action;

/**
 * The abstract base class for any person in the story.
 */
public abstract class Person {
    private String name;
    private Sex sex;
    private double mass;
    private Impression impression = Impression.NONE;

    public Person(String name, Sex sex, double mass) {
        this.name = name;
        this.sex = sex;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public double getMass() {
        return mass;
    }

    public Impression getImpression() {
        return impression;
    }

    public void setImpression(Impression impression) {
        this.impression = impression;
    }

    /**
     * Every person can speak in their own way.
     */
    public abstract String speak();

    /**
     * Express an action.
     */
    public String express(Action action) {
        return name + " " + action.getDescription(this);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}