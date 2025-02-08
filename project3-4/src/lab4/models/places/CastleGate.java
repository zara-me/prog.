package lab4.models.places;

/**
 * Represents the castle (palace) gate where the brothers appear.
 */
public class CastleGate extends Place implements HasCases {
    public static final String DEFAULT_NAME = "дворцовые ворота";

    public CastleGate() {
        super(DEFAULT_NAME);
    }

    @Override
    public String dativeCase() {
        return "дворцовым воротам";
    }

    @Override
    public String genitiveCase() {
        return "дворцовых ворот";
    }
}