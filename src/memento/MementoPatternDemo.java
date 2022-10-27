package memento;

public class MementoPatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Character player = new Character("Robert", "bard");
        CareTaker careTaker = new CareTaker();

        Originator originator = new Originator();
        originator.generateNew("State 1");
        originator.print();
        careTaker.add(originator.saveStateToMemento());

        originator.generateNew("State 2");
        originator.print();

        originator.generateNew("State 3");
        originator.print();
        careTaker.add(originator.saveStateToMemento());

        originator.getStateFromMemento(careTaker.get(0));
        originator.print();

        originator.getStateFromMemento(careTaker.get(1));
        originator.print();

        player.setAttributes(originator.getStats());
        player.printSheet();

    }

}
