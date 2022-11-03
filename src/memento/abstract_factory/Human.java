package memento.abstract_factory;

public class Human extends CharacterRace{
    public Human(String name, Stats bonuses) {
        super(name, bonuses);
    }

    @Override
    public void saySMTH() {
        System.out.println("I`m human");
    }
}
