public class LinkedListDuplicateRemover {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head;

    // Method to insert a new node at the end of the list
    public void insert(int data) {
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

    // Method to remove duplicates from a sorted linked list
    public void removeDuplicates() {
        Node current = head;
        
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                // Skip the duplicate node
                current.next = current.next.next;
            } else {
                // Move to the next distinct node
                current = current.next;
            }
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListDuplicateRemover list = new LinkedListDuplicateRemover();

        list.insert(10);
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(30);
        list.insert(40);

        System.out.println("Original Linked List:");
        list.printList();

        // Process duplicates
        list.removeDuplicates();

        System.out.println("\nLinked List after removing duplicates:");
        list.printList();
    }
}
