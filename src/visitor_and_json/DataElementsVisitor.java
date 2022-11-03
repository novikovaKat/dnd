package visitor_and_json;

import visitor_and_json.race.CharacterRace;
import visitor_and_json.dndclass.CharacterClass;
import visitor_and_json.character.Character;
import visitor_and_json.character.Stats;

import java.util.TreeMap;

public interface DataElementsVisitor {
    TreeMap visit(Character character);
    TreeMap visit(CharacterRace characterRace);
    TreeMap visit(CharacterClass characterClass);
    TreeMap visit(Stats stats);
}
