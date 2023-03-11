public class LinkedList3 {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void appendNodes() {
        Node node56 = new Node(56);
        Node node30 = new Node(30);
        Node node70 = new Node(70);

        node56.next = node30;
        node30.next = node70;
        head = node56;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList3 ll = new LinkedList3();

        ll.appendNodes();

        ll.printList();
    }
}
