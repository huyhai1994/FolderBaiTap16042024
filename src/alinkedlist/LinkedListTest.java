package alinkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedListSelf linkedListSelf = new LinkedListSelf();
        linkedListSelf.insertFirst("1");
        linkedListSelf.insertFirst("2");
        linkedListSelf.insertFirst("3");
        linkedListSelf.insertFirst("4");
        linkedListSelf.insertFirst("4");
        linkedListSelf.insertFirst("5");
        linkedListSelf.insertFirst("6");
        linkedListSelf.displayList();
        System.out.println(" ");
        System.out.println(linkedListSelf.searchAnNodeInfoInLinkedList("2"));
    }
}
