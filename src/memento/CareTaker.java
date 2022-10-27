package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Object> mementoList;

    public CareTaker() {
        mementoList = new ArrayList<>();
    }
    public void add(Object memento){
        mementoList.add(memento);
    }
    public Object get(int index){
        return mementoList.get(index);
    }
}
