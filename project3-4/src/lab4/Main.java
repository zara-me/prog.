package lab4;

import lab4.models.common.Action;
import lab4.models.people.*;
import lab4.models.places.*;
import lab4.models.scene.*;
import lab4.models.things.NettleStem;
import lab4.models.weather.Dawn;
import lab4.models.weather.Sun;
import lab4.utils.Direction;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Create main characters
        Eliza eliza = new Eliza("Элиза", 55.0);
        King king = new King("Король", 80.0);

        // Simulate mice gathering nettle stems
        System.out.println("Мышки шмыгают по полу и собирают крапиву.");
        NettleStem stem = new NettleStem();
        stem.gather();

        // Create and use the thrush (bird)
        Thrush thrush = new Thrush("Дрозд", 1.5);
        thrush.sing();
        System.out.println(thrush.singSong());

        // Create eleven brothers and add them to a group
        List<Brother> brothersList = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            brothersList.add(new Brother("Брат " + i, 60.0 + i));
        }
        Group<Brother> brothersGroup = new Group<>(brothersList);

        // At the castle gate, the brothers plead and threaten
        CastleGate castleGate = new CastleGate();
        System.out.println("У " + castleGate.genitiveCase() + ":");
        for (Brother brother : brothersList) {
            System.out.println(brother.plead());
            System.out.println(brother.threaten());
        }

        // A guard blocks entry
        Guard guard = new Guard("Страж", 70.0);
        System.out.println(guard.blockEntry());

        // The king wakes up and comes out
        System.out.println(king.wakeUp());

        // Brothers transform into wild swans
        for (Brother brother : brothersList) {
            System.out.println(brother.transform());
        }

        // Dawn and sun events
        Dawn dawn = new Dawn();
        System.out.println(dawn.getTimeDescription());
        Sun sun = new Sun();
        System.out.println(sun.rise());

        // Build the narrative using a Story and Scene
        Story story = new Story("Приключения Элизы");
        story.addSentence(new Sentence("Мышки собрали крапиву и принесли её к ногам Элизы"));
        story.addSentence(new Sentence("Дрозд утешал её своей весёлой песней"));
        story.addSentence(new Sentence("У дворцовых ворот появились одиннадцать братьев, требующих впустить их к королю"));
        story.addSentence(new Sentence("Страж и король отказали им, но они продолжали просить и угрожать"));
        story.addSentence(new Sentence("Взошло солнце, и братья превратились в диких лебедей"));

        Scene scene = new Scene(eliza, story);
        scene.addLocation(castleGate);
        scene.addLocation(new ThroneRoom());
        scene.addLocation(new Window());
        scene.addCharacter(eliza);
        scene.addCharacter(king);
        scene.addCharacter(guard);
        for (Brother b : brothersList) {
            scene.addCharacter(b);
        }

        // Optionally, demonstrate a utility usage:
        Direction direction = new Direction(Direction.Movement.BACKWARD, Direction.Preposition.AWAY, "на родину");
        System.out.println("Например, движение: " + direction);

        // Play the scene (print out the story)
        scene.play();
    }
}