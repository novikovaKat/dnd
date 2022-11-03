package visitor_and_json.dndclass;

import visitor_and_json.DataElement;
import visitor_and_json.DataElementsVisitor;

public abstract class CharacterClass implements DataElement {
    protected String name;
    protected int initialHP;

    public abstract void printMagica();

    public int getDice() {
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
    public void access(DataElementsVisitor visitor) {
        visitor.visit(this);
    }
}
