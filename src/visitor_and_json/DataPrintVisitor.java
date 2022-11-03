package visitor_and_json;


import visitor_and_json.character.Character;
import visitor_and_json.character.Stats;
import visitor_and_json.dndclass.CharacterClass;
import visitor_and_json.race.CharacterRace;

public class DataPrintVisitor implements DataElementsVisitor{
    @Override
    public void visit(Character character) {
        System.out.println("Name: " + character.getName());
    }

    @Override
    public void visit(CharacterRace characterRace) {
        characterRace.print();
    }

    @Override
    public void visit(CharacterClass characterClass) {
        System.out.println(characterClass.toString());
        characterClass.printMagica();
    }

    @Override
    public void visit(Stats stats) {
        stats.print();
    }
}
