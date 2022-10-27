package abstract_factory;

public class HumanFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create(String type) {
        return new Human("Human", new Stats(1, 1, 1, 1, 1, 1));
    }
}
