package factory;

public class Character {
    private String name;
    private CharacterClass dndClass;
    private Stats stats;
    private int health;

    public Character(String name, CharacterClass dndClass) {
        this.name = name;
        this.dndClass = dndClass;
        this.health = dndClass.getDice();
        this.stats = new Stats();
    }

    public void generateStats(){
        stats.generate();
    }

    public void addBonuses(){
        this.health+=Math.floor(this.stats.getAttributes().get("Constitution")/2 -5);
    }
    public void printSheet(){
        System.out.println("Name: " + name);
        System.out.println("DnD class: " + dndClass.getName());
        dndClass.printMagica();
        System.out.println("Health: " + health);
        stats.print();
    }
}
