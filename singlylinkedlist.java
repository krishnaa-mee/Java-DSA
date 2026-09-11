public class singlylinkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public singlylinkedlist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertathead(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;

    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }

    public void insertAtposition(int data, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Position out of range");
            return;
        }
        if (position == 1) {
            insertathead(data);
            return;
        }
        if (position == size + 1) {
            insertAtTail(data);
            return;
        }
        Node prevNode = head;
        for (int i = 1; i < position - 1; i++) {
            prevNode = prevNode.next;

        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        size++;

    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;

    }

    public void findmiddle() {
        if (head == null && tail == null) {
            System.out.println("list is empty");
            return;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle =" + slow.data);
    }

    public int tosearch(int target) {
        int position = 1;
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return position;

            }
            else{
                temp = temp.next;
                position++;
            }
        }
        return -1;

    }

    public Node reverselist(){
//        creating three pointer curr, prev, next
        Node curr = head;
        Node prev = null;
        Node next ;
        while (curr != null) {
            next = curr.next;
//            current ke next pointer ko reverse krdo
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return  prev;
    }

    public void deleteAthead(){
        if (head == null) {
            System.out.println("list is empty, can't delete");
            return;
        }
        else {
            head = head.next;
            size--;
        }
        if(head == null){
            tail = null;
        }

    }

    public void deleteAttail(){
        if(head==null){
            System.out.println("list is empty, can't delete");
            return;
        }
//        check for single node
        if(head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }
        Node temp = head;
        for(int i = 1 ; i<=size-2; i++){
            temp = temp.next;
        }
//        now  temp is pointing to 2nd last node
        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteAtposition(int position){
        if(position<1 || position>size+1){
            System.out.println("Position out of range");
            return;
        }
        if(position==1){
            deleteAthead();
            return;
        }
        if(position==size){
            deleteAttail();
            return;
        }

        Node prevnode = head;
        for (int i = 1; i < position-1; i++) {
            prevnode = prevnode.next;
        }
        Node curr = prevnode.next;
        Node forward =  curr.next;
        prevnode.next = forward;
        curr.next = null;
        size--;

    }


    public static void main() {
        singlylinkedlist mylist = new singlylinkedlist();
        if (mylist == null) {
            System.out.println("List is empty");
        }
//        insertion ---->
        mylist.insertathead(1);
        mylist.insertathead(2);
        mylist.insertathead(3);
        mylist.insertAtTail(10);
        mylist.insertAtposition(4, 5);

//        display------>>
        mylist.printlist();

//       to find middle element of linked list---->
        mylist.findmiddle();
//       number of nodes---->
        int nodecount = mylist.getSize();
        System.out.println("The size of the list is " + nodecount);
//      search element position ---->
        System.out.println("element found at node: " + mylist.tosearch(1));
//     reverse list----->
        mylist.head= mylist.reverselist();
        mylist.printlist();

//        deletion---->
        mylist.deleteAthead();
        mylist.deleteAttail();
        mylist.deleteAtposition(2);
        mylist.printlist();









    }


}
