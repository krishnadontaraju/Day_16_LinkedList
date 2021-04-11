/**
 * Created an interface that will hold the get and set methods
 * for future nodes that can implement this Interface with their own
 * Modifications
 * @param <K>
 */
public interface ParentNode<K> {
    K getValue();
    void setValue(K value);

    ParentNode getNextNode();
    void setNextNode(ParentNode nextNode);
}
