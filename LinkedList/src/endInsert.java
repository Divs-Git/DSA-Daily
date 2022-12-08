public class endInsert {
    static Node insert(Node head, int data) {
        Node temp = new Node(data);
        if(head == null)
            return temp;
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
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
