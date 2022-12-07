// Code for LinkedList Transversal
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Test {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        head.next.next = temp2;
        head.next.next.next = temp3;
        printList(head);
    }
    public static void printList(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
