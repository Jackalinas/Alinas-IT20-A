package prelime;

public class NewClassLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add a node to the end of the linked list
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Display the linked list
    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Display node data and memory references
    void displayNodes() {
        Node current = head;

        while (current != null) {
            System.out.println("Data: " + current.data);
            System.out.println("| Current pointer: " + current);
            System.out.println("| Next pointer:");

            if (current.next != null) {
                System.out.println(current.next);
            } else {
                System.out.println("null");
            }

            System.out.println("--------------------");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        NewClassLinkedList list = new NewClassLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked List:");
        list.display();

        System.out.println("\nNode Details:");
        list.displayNodes();
    }
}