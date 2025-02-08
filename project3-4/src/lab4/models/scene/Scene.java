package lab4.models.scene;

import lab4.models.people.Person;
import lab4.models.places.Place;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents a scene in the story.
 */
public class Scene {
    private Person mainCharacter;
    private Story story;
    private Map<String, Place> locations;
    private Map<String, Person> characters;

    public Scene() {
        locations = new HashMap<>();
        characters = new HashMap<>();
    }

    public Scene(Person mainCharacter, Story story) {
        this();
        this.mainCharacter = mainCharacter;
        this.story = story;
    }

    public void addLocation(Place place) {
        locations.put(place.getName(), place);
    }

    public void addCharacter(Person person) {
        characters.put(person.getName(), person);
    }

    public void play() {
        story.tell();
    }

    public Person getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(Person mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}