package lab4.utils;

/**
 * A helper class for representing movement directions.
 */
public class Direction {
    public enum Preposition {
        TOWARD,
        AWAY,
        ALONG
    }

    public enum Movement {
        FORWARD,
        BACKWARD,
        SIDEWAYS
    }

    private final Movement movement;
    private final Preposition preposition;
    private final String destination;

    public Direction(Movement movement, Preposition preposition, String destination) {
        this.movement = movement;
        this.preposition = preposition;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return movement + " " + preposition + " " + destination;
    }
}