package visitor_and_json;

import visitor_and_json.race.CharacterRace;
import visitor_and_json.dndclass.CharacterClass;
import visitor_and_json.character.Character;
import visitor_and_json.character.Stats;

public interface DataElementsVisitor {
    void visit(Character character);
    void visit(CharacterRace characterRace);
    void visit(CharacterClass characterClass);
    void visit(Stats stats);
}
