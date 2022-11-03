package visitor_and_json;

import abstract_factory.CharacterRace;
import factory.CharacterClass;

import java.util.TreeMap;
/*

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
        tree.put("Race", characterRace.toString());
        return tree;
    }

    @Override
    public TreeMap visit(CharacterClass characterClass) {
        TreeMap tree = new TreeMap<>();
        tree.put("Class", characterClass.toString());
        return tree;
    }

    @Override
    public TreeMap visit(Stats stats) {

        TreeMap tree = new TreeMap<>();
        tree.put("Stats", stats.getAttributes());
        return tree;
    }
}
*/
