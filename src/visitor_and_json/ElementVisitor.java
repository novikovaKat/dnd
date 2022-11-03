package visitor_and_json;

import visitor_and_json.character.Character;
import visitor_and_json.character.Stats;
import visitor_and_json.dndclass.CharacterClass;
import visitor_and_json.race.CharacterRace;

import java.util.TreeMap;

public class ElementVisitor implements DataElementsVisitor{
    @Override
    public TreeMap visit(Character character) {
        TreeMap tree = new TreeMap<>();
        tree.put("Name", character.getName());
        tree.put("HP", character.getHealth());
        return tree;
    }

    @Override
    public TreeMap visit(CharacterRace characterRace) {
        TreeMap tree = new TreeMap<>();
        tree.put("Race", characterRace.getName());
        return tree;
    }

    @Override
    public TreeMap visit(CharacterClass characterClass) {
        TreeMap tree = new TreeMap<>();
        tree.put("Class", characterClass.getName());
        return tree;
    }

    @Override
    public TreeMap visit(Stats stats) {
        TreeMap tree = new TreeMap<>();
        tree.put("Attributes", stats.getAttributes());
        return tree;
    }
}
