import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    /**
     * The Search method returns true if found and false if not
     */
    @Test
    void whenSearchedForA_ValueIfPresent_ShouldReturnTrue() {
        NodeClass<Integer> firstNode = new NodeClass<>(56);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(70);

        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.add(thirdNode);
        customLinkedList.add(secondNode);
        customLinkedList.add(firstNode);

        boolean isSearchFound = customLinkedList.searchNode(30);
        Assertions.assertTrue(isSearchFound);
    }

    /**
     * The test to validate the pop Last method
     */
    @Test
    void whenPoppedLast_ShouldRemove_TheLastElement() {
        NodeClass<Integer> firstNode = new NodeClass<>(56);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(70);

        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.add(thirdNode);
        customLinkedList.add(secondNode);
        customLinkedList.add(firstNode);

        customLinkedList.popLast();

        Assertions.assertTrue(customLinkedList.head.equals(firstNode) &&
                customLinkedList.tail.equals(secondNode));
    }


    /**
     * Testing the pop method which should remove the first element
     */
    @Test
    void whenPopped_ShouldRemove_TheFirstElement() {
        NodeClass<Integer> firstNode = new NodeClass<>(56);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(70);

        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.add(thirdNode);
        customLinkedList.add(secondNode);
        customLinkedList.add(firstNode);

        customLinkedList.pop();

        Assertions.assertTrue(customLinkedList.head.equals(secondNode) &&
                customLinkedList.tail.equals(thirdNode));
    }

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
        customLinkedList.insertNodeBetween(firstNode, secondNode);

        Assertions.assertTrue(customLinkedList.head.equals(firstNode) &&
                customLinkedList.head.getNextNode().equals(secondNode) &&
                customLinkedList.tail.equals(thirdNode));
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
                customLinkedList.tail.equals(firstNode));
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
                customLinkedList.head.equals(firstNode));
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
