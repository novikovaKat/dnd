package memento.abstract_factory;

import java.util.Set;

public class Character {
    private String name;
    private CharacterRace race;
    private Stats stats;


    public Character(String name, CharacterRace race) {
        this.name = name;
        this.race = race;

        this.stats = new Stats();
    }

    public void generateStats(){
        stats.generate();
    }

    public void addBonuses(){
        Set<String> keys = this.stats.getAttributes().keySet();
        for (String title: keys) {
            stats.getAttributes().put(title, stats.getAttributes().get(title) + race.getBonuses().getAttributes().get(title));
        }
    }
    public void printSheet(){
        System.out.println("Name: " + name);
        System.out.println("Race: " + race.getName());
        stats.print();
    }

    public String getName() {
        return name;
    }

    public CharacterRace getRace() {
        return race;
    }

    public Stats getStats() {
        return stats;
    }
}
