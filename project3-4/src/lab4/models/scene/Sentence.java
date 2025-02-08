package lab4.models.scene;

/**
 * Represents a sentence in the story.
 */
public class Sentence {
    private String content;

    public Sentence(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content + ".");
    }

    public Sentence and(String additional) {
        return new Sentence(content + " и " + additional);
    }

    public Sentence but(String additional) {
        return new Sentence(content + ", но " + additional);
    }

    public Sentence because(String additional) {
        return new Sentence(content + ", так как " + additional);
    }

    @Override
    public String toString() {
        return content;
    }
}