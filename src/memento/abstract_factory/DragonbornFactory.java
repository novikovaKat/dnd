package memento.abstract_factory;

public class DragonbornFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create(String type) {
        return new Dragonborn("Dragonborn", new Stats(2, 0, 0, 0,0 , 1));
    }
}
