package visitor_and_json;

import org.json.simple.JSONObject;
import visitor_and_json.character.Character;
import visitor_and_json.dndclass.Druid;
import visitor_and_json.dndclass.Fighter;
import visitor_and_json.race.Dragonborn;
import visitor_and_json.race.Human;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        DataElementsVisitor elementVisitor = new ElementVisitor();
        JSONObject jsonObject = new JSONObject();
        FileWriter file = new FileWriter("../dnd/src/visitor_and_json/output.json");

        Character player1 = new Character("Earnan Magees", new Fighter(), new Dragonborn());
        player1.generateStats();
        player1.addBonuses();


        List<DataElement> list = new ArrayList<>();
        list.add(player1);
        list.add(player1.getDndClass());
        list.add(player1.getRace());
        list.add(player1.getStats());

        for(DataElement element: list){
            jsonObject.putAll(element.access(elementVisitor));
        }
        file.write("[");
        file.write(jsonObject.toJSONString());
        list.clear();

        Character player2 = new Character("Marceline Duffs", new Druid(), new Human());
        player2.generateStats();
        player2.addBonuses();

        list.add(player2);
        list.add(player2.getDndClass());
        list.add(player2.getRace());
        list.add(player2.getStats());

        for(DataElement element: list){
            jsonObject.putAll(element.access(elementVisitor));
        }
        file.write(",");
        file.write(jsonObject.toJSONString());
        file.write("]");
        file.close();
    }
}
