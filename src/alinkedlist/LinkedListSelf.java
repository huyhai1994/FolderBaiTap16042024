package alinkedlist;

public class LinkedListSelf {
    public Node head;
    public Node tail;
    public static int numberOfNodes = 0;


    public LinkedListSelf() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(Object input_value) {
        /**
         * This method is used to insert a new node at the beginning of the LinkedList.
         * It increases the size of the LinkedList by one and then creates a new node with the given input_value.
         * If the head of the LinkedList is null, the new node is set as both the head and tail.
         * Otherwise, the new node is linked to the current head and the head is updated to the new node.
         *
         * @param input_value the data to be stored in the new node
         */
        Node node = new Node(input_value);
        increaseLinkedListSizeByOne();
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
        /**
         * This method is used to insert a new node at the end of the LinkedList.
         * It increases the size of the LinkedList by one and then creates a new node with the given input_value.
         * If the tail of the LinkedList is null, the new node is set as both the head and tail.
         * Otherwise, the new node is linked to the current tail and the tail is updated to the new node.
         *
         * @param input_value the data to be stored in the new node
         */
       increaseLinkedListSizeByOne();
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
        /**
         * This method is used to delete the first node from the LinkedList.
         * It updates the head of the LinkedList to the second node in the list.
         * Finally, it reduces the size of the LinkedList by one.
         *
         * @return void
         */
        boolean isLinkedListHasOneNode = numberOfNodes==1;
        if(isLinkedListHasOneNode){
            head.link = null;
            head = null;
            tail = null;
            reduceLinkedListSizeByOne();
            return;
        }
        head = this.head.link;
        reduceLinkedListSizeByOne();
    }

    public void deleteLast(){
        /**
         * This method is used to delete the last node from the LinkedList.
         * It traverses the LinkedList from the head node and finds the second last node.
         * Then it sets the tail of the LinkedList to the second last node and sets its link to null.
         * Finally, it reduces the size of the LinkedList by one.
         *
         * @return void
         */
        Node current = this.head;
        int nodeBeforeTailNode = numberOfNodes-2;
        for (int index = 0; index < nodeBeforeTailNode; index++) {
            current = current.link;
        }
        tail = current;
        tail.link = null;
        reduceLinkedListSizeByOne();
    }
    public void deleteNodeInsideLinkedList(int index){
        
        Node beforeCurrentNode = this.head;
        Node CurrentNode = this.head.link;
        Node afterCurrentNode = CurrentNode.link;
         for (int i = 0; i < numberOfNodes; i++) {
            if(i == index-1){  
                beforeCurrentNode.link = afterCurrentNode;
                CurrentNode.link = null;
                reduceLinkedListSizeByOne();
                return;
            }
            beforeCurrentNode = beforeCurrentNode.link;
            CurrentNode = CurrentNode.link;
            afterCurrentNode = afterCurrentNode.link;
         }
         
    }
    public void displayAll(){
        /**
         * This method is used to display the LinkedList.
         * It traverses the LinkedList from the head node and prints the data of each node.
         *
         * @return void
         */
        Node CurrentNode = this.head;
        while (CurrentNode!= null){
            System.out.println(CurrentNode.info);
            CurrentNode = CurrentNode.link;
        }
        System.out.println("-------------------------------------------------------------------");
    }
    public int searchAnNodeInfoInLinkedList(Object node_info){
        /**
         * This method is used to search for a specific node's information in the LinkedList.
         * It traverses the LinkedList from the head node and compares the information of each node with the given node_info.
         * If a match is found, it returns the location of the searching node.
         *
         * @param node_info the data to be searched in the LinkedList
         * @return the location of the searching node in the LinkedList
         */
        Node current = head;
        int locationOfSearchingNode = 0;
        for (int i = 0; i < numberOfNodes; i++) {
            if(current.info == node_info){
                locationOfSearchingNode = i;
            } else{
                return -1;
            }
            current = current.link;
        }
        return locationOfSearchingNode;
    }
        /**
     * This method is used to search for a specific node's information in the LinkedList based on a given student's GPA.
     * It traverses the LinkedList from the head node and compares the GPA of each node with the given student_GPA.
     * If a match is found, it prints the information of the matching node.
     *
     * @param student_GPA the minimum GPA to search for in the LinkedList
     */
    public void searchAnNodeInfoInLinkedList(double student_GPA){
        
        Node current = head;
        System.out.println("Danh sach Sinh vien co diem lon hon: " + student_GPA + " : ");
        for (int i = 0; i < numberOfNodes; i++) {
            if(((Student) current.info).getGPA() >= student_GPA){
                System.out.println(current.info);
            }
            current = current.link;
        }
    }

    /**
     * This method is used to search for a specific node's information in the LinkedList based on a given student's ID.
     * It traverses the LinkedList from the head node and compares the ID of each node with the given student_id.
     * If a match is found, it prints the information of the matching node.
     *
     * @param student_id the ID of the student to search for in the LinkedList
     */
    public void searchAnNodeInfoInLinkedList(int student_id){
        Node current = head;
        for (int i = 0; i < numberOfNodes; i++) {
            if(((Student) current.info).getId() == student_id){
                System.out.println(current.info);
            }
            current = current.link;
        }
    }
    public void updateNodeInfoInLinkedList(int index, Object node_info){

        Node current = head;
        for (int i = 0; i < numberOfNodes; i++) {
            if(i == index){
                current.info = node_info;
            }
            current = current.link;
        }

    }
    private void increaseLinkedListSizeByOne(){
        numberOfNodes++;
    }
        private void reduceLinkedListSizeByOne(){
            numberOfNodes--;
        }
}
