package factory;

public abstract class CharacterClass {
    protected String name;
    protected int initialHP;

    protected abstract void printMagica();

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
}
