package alinkedlist;

public class LinkedListSelf {
    public Node head;
    public Node tail;
    public int size = 0;


    public LinkedListSelf() {
        this.head = null; // the head object dont point to any where
        this.tail = null;
    }

    public void insertFirst(Object input_value) {
        Node node = new Node(input_value);
        size++;
        boolean checkIfHeadPointToNull = this.head==null;
        if (checkIfHeadPointToNull) {
            this.head = node;
            this.tail = node;
        }else{
            node.link = this.head;
            this.head = node;
        }
    }
    public void insertLast(Object input_value) {
        size++;
        Node node = new Node(input_value);
        boolean checkIfTailPointToNull = this.tail == null;
        if (checkIfTailPointToNull) {
            this.tail = node;
            this.head = node;
        }else{
            this.tail.link = node;
            this.tail = node;
        }
    }
    public void deleteFirst(){
        Node temporaryNode = this.head.link;
        head.link = null;
        head = temporaryNode;
        size--;
    }

    public void deleteLast(){
        Node current = this.head;
        for (int index = 0; index < size-2; index++) {
            current = current.link;
        }
        tail = current;
        tail.link = null;
        size --;

    }
    public void displayList(){
        Node temp = this.head;
        while (temp!= null){
            System.out.println(temp.info + " " + temp);
            temp = temp.link;
        }
    }
}
