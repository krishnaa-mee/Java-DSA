import java.util.Scanner;
public class node {
    int data;
    node next;
    node(int newdata) {
        this.data = newdata;
        this.next = null;
    }
    static void main() {
        node head =  new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);

        while (head.next != null) {
            System.out.print(head.data);
            if(head.next!=null) {
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println(head.data);
    }


}
