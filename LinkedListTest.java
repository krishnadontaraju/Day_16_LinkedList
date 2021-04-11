import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
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
