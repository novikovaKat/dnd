public class Stats implements Cloneable{
    private int strength;
    private int dexterity;
    private int constitution;
    private int intellect;
    private int wisdom;
    private int charisma;

    public void generate(){
        Dice dice = new Dice();

        strength = dice.rollStat();
        dexterity = dice.rollStat();
        constitution = dice.rollStat();
        intellect = dice.rollStat();
        wisdom = dice.rollStat();
        charisma = dice.rollStat();
    }

    public void print(){
        System.out.println("------Attributes------");

        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Constitution: " + constitution);
        System.out.println("Intellect: " + intellect);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Charisma: " + charisma);

        System.out.println("----------------------");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
