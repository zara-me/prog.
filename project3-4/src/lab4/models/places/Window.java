package lab4.models.places;

/**
 * Represents the gridded window from which the thrush sings.
 */
public class Window extends Place implements HasCases {
    public static final String DEFAULT_NAME = "решетчатое окно";

    public Window() {
        super(DEFAULT_NAME);
    }

    @Override
    public String dativeCase() {
        return "решетчатому окну";
    }

    @Override
    public String genitiveCase() {
        return "решетчатого окна";
    }
}