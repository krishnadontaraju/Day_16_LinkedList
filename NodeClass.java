public class NodeClass<K> implements ParentNode<K> {
    public K value;
    public ParentNode nextNode;


    NodeClass(K value){
        this.value = value;
    }

    public ParentNode getNextNode() {
        return nextNode;
    }


    public void setNextNode(ParentNode nextNode) {
        this.nextNode = nextNode;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }
}

