public class Main {

    public static void main(String[] args) {

        System.out.println("THIS IS THE LINKED LIST OPERATION TEST, WELCOME");

        NodeClass<Integer> firstNode = new NodeClass<>(56);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(70);
        NodeClass<Integer> fourthNode = new NodeClass<>(40);

        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.append(firstNode);
        customLinkedList.append(secondNode);
        customLinkedList.append(thirdNode);

        customLinkedList.insertNodeAfterBySearching(30, fourthNode);
        customLinkedList.deleteNodeBySearchingValue(40);
        customLinkedList.printAllNodes();

        OrderedLinkedList linkedList = new OrderedLinkedList();

        linkedList.insertNodeInSortedLinkedList(56);
        linkedList.insertNodeInSortedLinkedList(30);
        linkedList.insertNodeInSortedLinkedList(40);
        linkedList.insertNodeInSortedLinkedList(70);

        linkedList.displayOrderedLinkedList();
    }
}
