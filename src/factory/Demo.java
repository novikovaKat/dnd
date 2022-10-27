package factory;

public class Demo {
    public static void main(String []args){

        Character player = new Character("Grizelda", ClassFactory.getClass("Druid"));

        player.generateStats();
        player.addBonuses();
        player.printSheet();


    }
}
