public class NodeClass<K> {
    public K value;
    public NodeClass nextNode;


    NodeClass(K value){
        this.value = value;
    }

    public NodeClass<K> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeClass<K> nextNode) {
        this.nextNode = nextNode;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }
}
