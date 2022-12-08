import java.util.Scanner;

public class SearchItertive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        head.next.next = temp2;
        head.next.next.next = temp3;
        int ans = search(head,key);
        System.out.println(ans);

    }
    public static int search(Node head,int key) {
        int pos = 1;
        Node curr = head;
        while(curr != null) {
            if (curr.data == key)
                return pos;
            else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
}
