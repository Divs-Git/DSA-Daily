public class insertLL {
    static Node insert(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }
    public static void main(String[] args) {
        Node head = null;
        head = insert(head,30);
        head = insert(head,20);
        head = insert(head,10);
        printed(head);
    }
    public static void printed(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
