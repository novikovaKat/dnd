package visitor_and_json.dndclass;

import visitor_and_json.DataElement;
import visitor_and_json.DataElementsVisitor;

import java.util.TreeMap;

public abstract class CharacterClass implements DataElement {
    protected String name;
    protected int initialHP;

    public abstract void printMagica();

    public int getInitialHP() {
        return initialHP;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Class: " + name + " uses " + initialHP + "D dice to roll up hp";
    }

    @Override
    public TreeMap access(DataElementsVisitor visitor) {
        return visitor.visit(this);
    }
}
