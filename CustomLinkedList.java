/**
 * The class Custom Linked List uses generic Nodes Class and
 * adds functionalities that make these behave like a Linked List
 */
public class CustomLinkedList {
    public ParentNode tail;
    public ParentNode head;

    CustomLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * The add method takes a Node and adds it to the list at Front
     *
     * @param parameterNode
     */
    public void add(ParentNode parameterNode) {
        if (this.tail == null)
            this.tail = parameterNode;
        if (this.head == null)
            this.head = parameterNode;
        else {
            ParentNode temporaryNode = this.head;
            this.head = parameterNode;
            this.head.setNextNode(temporaryNode);
        }
    }

    /**
     * The append method adds the latest element to the last of the list
     *
     * @param parameterNode
     */
    public void append(ParentNode parameterNode) {
        if (this.tail == null)
            this.tail = parameterNode;
        if (this.head == null)
            this.head = parameterNode;
        else {
            this.tail.setNextNode(parameterNode);
            this.tail = parameterNode;
        }
    }

    /**
     * The insert method allows to place the new node in Between initial node and after node
     *
     * @param initialNode
     * @param afterNode
     */
    public void insertNodeBetween(ParentNode initialNode, ParentNode afterNode) {
        ParentNode temporaryNode = initialNode.getNextNode();
        initialNode.setNextNode(afterNode);
        afterNode.setNextNode(temporaryNode);
    }

    /**
     * The pop method removes the first element from the list
     *
     * @return
     */
    public void pop() {

        ParentNode temporaryNode = this.head;
        this.head = head.getNextNode();

    }

    /**
     * the popLast method deletes the last node of the list
     */
    public void popLast() {
        ParentNode temporaryNode = head;
        while (!temporaryNode.getNextNode().equals(tail)) {
            temporaryNode = temporaryNode.getNextNode();
        }
        this.tail = temporaryNode;
    }


    public void printAllNodes() {
        StringBuffer currentNodes = new StringBuffer("All Nodes are : ");
        ParentNode temporaryNode = head;
        while (temporaryNode.getNextNode() != null) {
            currentNodes.append(temporaryNode.getValue());
            if (!temporaryNode.equals(tail)) {
                currentNodes.append(" points to ");
            }
            temporaryNode = temporaryNode.getNextNode();
        }
        currentNodes.append(temporaryNode.getValue());
        System.out.println(currentNodes);
    }

}
