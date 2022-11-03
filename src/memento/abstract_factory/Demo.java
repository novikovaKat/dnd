package memento.abstract_factory;

public class Demo {
    public static void main(String []args){

        Character player = new Character("Fongo Linster",
                new DragonbornFactory().create("Dragonborn"));

        player.generateStats();
        player.addBonuses();
        player.printSheet();


    }
}
