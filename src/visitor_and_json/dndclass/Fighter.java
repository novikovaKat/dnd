package visitor_and_json.dndclass;

public class Fighter extends CharacterClass {
    private String perk;

    public Fighter() {
        name = "Fighter";
        initialHP = 10;
        perk = "Extra Attack";
    }

    @Override
    public void printMagica() {
        System.out.println("Class " + name + " can perk " + perk);
    }
}
