import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    /**
     * Testing the Insert method to return the list as expected
     */

    @Test
    void whenInsertedNewElement_ShouldBeInBetweenAsExpected() {
        NodeClass<Integer> firstNode = new NodeClass<>(56);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(70);

        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.add(firstNode);
        customLinkedList.append(thirdNode);
        customLinkedList.insertNodeBetween(firstNode,secondNode);

        Assertions.assertTrue(customLinkedList.head.equals(firstNode) &&
                                        customLinkedList.head.getNextNode().equals(secondNode) &&
                                        customLinkedList.tail.equals(thirdNode) );
    }

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
     * Created the append method in the Linked List class and verifying it here
     */

    @Test
    void whenAppendedNewElement_ShouldBeAtLast() {
        NodeClass<Integer> firstNode = new NodeClass<>(70);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(56);

        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.append(firstNode);
        customLinkedList.append(secondNode);
        customLinkedList.append(thirdNode);

        Assertions.assertTrue(customLinkedList.tail.equals(thirdNode) &&
                                        customLinkedList.tail.getNextNode().equals(secondNode) &&
                                        customLinkedList.head.equals(firstNode) );
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
