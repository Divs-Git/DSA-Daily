//Recursively transverse the linked list


public class RecTransverse {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        head.next.next = temp2;
        head.next.next.next = temp3;
        rPrint(head);
    }

    public static void rPrint(Node head) {
        if(head == null)
            return;
        System.out.print(head.data + " ");
        rPrint(head.next);
    }
}
