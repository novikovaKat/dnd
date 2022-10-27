package factory;

import factory.Dice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stats {
    private static final int STATS_AMOUNT = 6;
    private HashMap<String, Integer> attributes;

    public Stats(){
        attributes = new HashMap<>();
    }

    public HashMap<String, Integer> getAttributes() {
        return attributes;
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
