import java.util.Scanner;

public class cleanpassengerroute {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


        static Node insert(Node head, int data) {
            Node newNode = new Node(data);
            if (head == null) {
                return newNode;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return head;
        }

        static Node cleanroute(Node head) {
            Node temp = head;
            while (temp != null && temp.next != null) {
                if (temp.data == temp.next.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }

            }
            return head;

        }

        static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }


        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            Node head = null;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                head = insert(head,x);
            }
            head = cleanroute(head);
            display(head);
        }

}
