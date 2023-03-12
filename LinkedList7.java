public class LinkedList7 {

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

    public Node search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList7 ll = new LinkedList7();

        ll.addNode(56);
        ll.addNode(30);
        ll.addNode(70);

        Node foundNode = ll.search(30);
        if (foundNode != null) {
            System.out.println("Found node with value 30: " + foundNode.data);
        } else {
            System.out.println("Node with value 30 not found");
        }
    }
}
