package lab4.models.places;

/**
 * Represents the throne room where the king resides.
 */
public class ThroneRoom extends Place implements HasCases {
    public static final String DEFAULT_NAME = "тронный зал";

    public ThroneRoom() {
        super(DEFAULT_NAME);
    }

    @Override
    public String dativeCase() {
        return "тронному залу";
    }

    @Override
    public String genitiveCase() {
        return "тронного зала";
    }
}