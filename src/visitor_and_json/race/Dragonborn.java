package visitor_and_json.race;

import abstract_factory.Stats;

public class Dragonborn extends CharacterRace {
    public Dragonborn() {
        super("Dragonborn", new Stats(2, 0, 0, 0,0 , 1));
    }

    @Override
    public void saySMTH() {
        System.out.println("I`m dragonborn");
    }
}
