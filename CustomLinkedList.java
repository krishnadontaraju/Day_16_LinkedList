/**
 * The class Custom Linked List uses generic Nodes Class and
 * adds functionalities that make these behave like a Linked List
 */
public class CustomLinkedList {
    public ParentNode tail;
    public ParentNode head;

    CustomLinkedList(){
        this.head = null;
        this.tail = null;
    }

    /**
     * The add method takes a Node and adds it to the list at Front
     * @param parameterNode
     */
    public void add(ParentNode parameterNode) {
        if(this.tail == null)
            this.tail = parameterNode;
        if (this.head == null)
            this.head = parameterNode;
        else{
            ParentNode temporaryNode = this.head;
            this.head = parameterNode;
            this.head.setNextNode(temporaryNode);
        }
    }
}
