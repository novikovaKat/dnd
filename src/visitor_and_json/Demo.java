package visitor_and_json;

import org.json.simple.JSONObject;
import visitor_and_json.character.Character;
import visitor_and_json.dndclass.Fighter;
import visitor_and_json.race.Dragonborn;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        DataElementsVisitor elementVisitor = new DataPrintVisitor();
        /*JSONObject jsonObject = new JSONObject();
        FileWriter file = new FileWriter("output.json");
        Character player1 = new Character("Elise Etter",
                ClassFactory.getClass("Druid"),
                new DragonbornFactory().create());
                player1.generateStats();
                player1.addBonuses();

        List<DataElement> list = new ArrayList<>();
        list.add(player1);
        list.add(player1.getClass());*/

        Character player1 = new Character("Elise Etter", new Fighter(), new Dragonborn());
        player1.generateStats();
        player1.addBonuses();

        player1.access(elementVisitor);
        player1.getStats().access(elementVisitor);
        player1.getRace().access(elementVisitor);
        player1.getDndClass().access(elementVisitor);
    }
}
