package visitor_and_json.character;


import visitor_and_json.DataElement;
import visitor_and_json.DataElementsVisitor;
import visitor_and_json.dndclass.CharacterClass;
import visitor_and_json.race.CharacterRace;

import java.util.Set;

public class Character implements DataElement {
    private String name;
    private CharacterClass dndClass;
    private CharacterRace race;
    private Stats stats;
    private int health;

    public Character(String name, CharacterClass dndClass, CharacterRace race) {
        this.name = name;
        this.dndClass = dndClass;
        this.race = race;
        this.health = dndClass.getDice();
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
        this.health+=Math.floor(this.stats.getAttributes().get("Constitution")/2 -5);
    }
    public String getName() {
        return name;
    }

    public CharacterClass getDndClass() {
        return dndClass;
    }

    public CharacterRace getRace() {
        return race;
    }

    public Stats getStats() {
        return stats;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public void access(DataElementsVisitor visitor) {
        visitor.visit(this);
    }
}
