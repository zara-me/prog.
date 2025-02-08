package lab4.models.common;

import lab4.models.people.Person;

/**
 * Defines actions that occur in the story.
 */
public enum Action {
    COLLECTED_NETTLE("собирали крапиву"),
    BROUGHT_TO_FEET("принесли к её ногам"),
    SANG("пел песню"),
    APPEARED("появились"),
    PLEADED("просили впустить"),
    THREATENED("угрожали"),
    TRANSFORMED("превратились в лебедей"),
    KNEW("знал");

    private final String description;

    Action(String description) {
        this.description = description;
    }

    public String getDescription(Person person) {
        // For simplicity, we return the same description regardless of the person’s gender.
        return description;
    }
}