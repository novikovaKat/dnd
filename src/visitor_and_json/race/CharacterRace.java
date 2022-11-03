package visitor_and_json.race;

import visitor_and_json.character.Stats;
import visitor_and_json.DataElement;
import visitor_and_json.DataElementsVisitor;

import java.util.Set;

public abstract class CharacterRace implements DataElement {
    protected String name;
    protected Stats bonuses;

    public CharacterRace(String name, Stats bonuses) {
        this.name = name;
        this.bonuses = bonuses;
    }

    public Stats getBonuses(){
        return bonuses;
    }

    public String getName() {
        return name;
    }

    public void print(){
        Set<String> keys = this.bonuses.getAttributes().keySet();

        System.out.println("Race: " + name);
        System.out.println("-------Bonuses-------");

        for (String title: keys) {
            if(bonuses.getAttributes().get(title)!=0){
                System.out.println(title + ": " + bonuses.getAttributes().get(title));
            }
        }

        System.out.println("---------------------");
    }

    public void saySMTH() {

    }

    @Override
    public void access(DataElementsVisitor visitor) {
        visitor.visit(this);
    }
}
