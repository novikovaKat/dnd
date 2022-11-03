package factory;

import java.util.ArrayList;
import java.util.List;

public class Druid extends CharacterClass {
    private List<String> spells;

    public Druid() {
        this.name = "Druid";
        this.initialHP = 8;
        this.spells = new ArrayList<>();
        this.spells.add("Healing Word");
        this.spells.add("Animal Shape");
    }

    @Override
    protected void printMagica() {
        System.out.println("Class " + name + " knows spells:");
        for (String spell: spells) {
            System.out.println("+ " + spell);
        }
    }
}
