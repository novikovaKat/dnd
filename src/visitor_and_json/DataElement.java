package visitor_and_json;

import java.util.TreeMap;

public interface DataElement {
    public TreeMap access(DataElementsVisitor visitor);
}
