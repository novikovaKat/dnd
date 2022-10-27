package abstract_factory;

import java.util.HashMap;
import java.util.Set;

public class Stats {
    private HashMap<String, Integer> attributes;

    public Stats(){
        attributes = new HashMap<>();
    }

    public HashMap<String, Integer> getAttributes() {
        return attributes;
    }

    public Stats(int strength, int dexterity, int constitution, int intellect, int wisdom, int charisma){
        this();
        attributes.put("Strength" , strength);
        attributes.put("Dexterity" , dexterity);
        attributes.put("Constitution" , constitution);
        attributes.put("Intellect" , intellect);
        attributes.put("Wisdom" , wisdom);
        attributes.put("Charisma" , charisma);
    }
    public void generate(){
        Dice dice = new Dice();

        attributes.put("Strength" , dice.rollStat());
        attributes.put("Dexterity" , dice.rollStat());
        attributes.put("Constitution" , dice.rollStat());
        attributes.put("Intellect" , dice.rollStat());
        attributes.put("Wisdom" , dice.rollStat());
        attributes.put("Charisma" , dice.rollStat());

    }

    public void print(){
        System.out.println("------Attributes------");

        Set<String> keys = this.attributes.keySet();
        for (String title: keys) {
            System.out.println(title + ": " + attributes.get(title));
        }

        System.out.println("----------------------");
    }
}
