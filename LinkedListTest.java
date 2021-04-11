import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class LinkedListTest {
    /**
     * Creating an Linked List and Checking if the nodes are pointing correctly
     */
    @Test
    void whenAddedNewElement_ShouldBeAtFront() {
        NodeClass<Integer> firstNode = new NodeClass<>(70);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(56);

        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.add(firstNode);
        customLinkedList.add(secondNode);
        customLinkedList.add(thirdNode);
        Assertions.assertTrue(customLinkedList.head.equals(thirdNode) &&
                                        customLinkedList.head.getNextNode().equals(secondNode) &&
                                        customLinkedList.tail.equals(firstNode) );
    }

    /**
     * Creating three different Nodes and Using test Cases to verify that three nodes are linked
     */
    @Test
    void assignedThreeValues_ToLinkedList_ShouldPass() {

        NodeClass<Integer> firstNode = new NodeClass<>(56);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(70);

        firstNode.setNextNode(secondNode);
        secondNode.setNextNode(thirdNode);

        /**
         *Asserting that the first node points to second and second points to third Node
         */
        Assertions.assertTrue(firstNode.getNextNode().equals(secondNode) && secondNode.getNextNode().equals(thirdNode));




    }
}
