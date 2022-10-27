package memento;

public class Originator {
    private String state;
    private Stats stats;

    public Originator() {
        stats = new Stats();
    }
    public void generateNew(String state){
        this.state = state;
        stats.generate();
    }
    public Memento saveStateToMemento() throws CloneNotSupportedException {
        System.out.println(state + " has been saved into archive");

        return new Memento(state, (Stats) stats.clone());
    }

    public void getStateFromMemento(Object o) throws CloneNotSupportedException {
        Memento memento = (Memento)o;

        stats = (Stats) memento.stats.clone();
        state = memento.state;

        System.out.println(state + " has been pulled from the archive");
    }

    public void print(){
        System.out.println(state);
        stats.print();
    }

    public String getState() {
        return state;
    }

    public Stats getStats() throws CloneNotSupportedException {
        return (Stats) stats.clone();
    }
    public void setState(String state) {
        this.state = state;
    }

    public void setStats(Stats stats) throws CloneNotSupportedException {
        this.stats = (Stats) stats.clone();
    }

    private class Memento{
        private String state;
        private Stats stats;

        public Memento(String state, Stats stats) {
            this.state = state;
            this.stats = stats;
        }

    }
}
