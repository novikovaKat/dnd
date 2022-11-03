package visitor_and_json.race;

import abstract_factory.Stats;

public class Human extends CharacterRace {
    public Human() {
        super("Human", new Stats(1, 1, 1, 1, 1, 1));
    }

    @Override
    public void saySMTH() {
        System.out.println("I`m human");
    }
}
