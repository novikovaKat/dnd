package memento.abstract_factory;

public class Dragonborn extends CharacterRace{
    public Dragonborn(String name, Stats bonuses) {
        super(name, bonuses);
    }

    @Override
    public void saySMTH() {
        System.out.println("I`m dragonborn");
    }
}
