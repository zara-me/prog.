package lab4.models.scene;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the overall story with a title and a series of sentences.
 */
public class Story {
    private List<Sentence> sentences;
    private String title;

    public Story(String title) {
        this.title = title;
        this.sentences = new ArrayList<>();
    }

    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }

    public void tell() {
        System.out.println("Story: " + title);
        for (Sentence s : sentences) {
            s.print();
        }
    }

    public String getTitle() {
        return title;
    }
}