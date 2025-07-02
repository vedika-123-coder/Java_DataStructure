package Linked;

// Node class representing each node in the linked list
class Node4 {
    int data;
    Node4 next;

    // Constructor to initialize a node with given data
    Node4(int value) {
        this.data = value;
        this.next = null;
    }
}

// LinkedList class
class LinkedList1 {
    private Node4 head;

    // Constructor to initialize an empty linked list
    public LinkedList1() {
        head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int value) {
        Node4 newNode = new Node4(value);
        if (head == null) {
            head = newNode;
        } else {
            Node4 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static LinkedList1 mergeSortedLists(LinkedList1 list1, LinkedList1 list2) {
        LinkedList1 mergedList = new LinkedList1();
        Node4 head1 = list1.head;
        Node4 head2 = list2.head;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                mergedList.insert(head1.data);
                head1 = head1.next;
            } else {
                mergedList.insert(head2.data);
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            mergedList.insert(head1.data);
            head1 = head1.next;
        }

        while (head2 != null) {
            mergedList.insert(head2.data);
            head2 = head2.next;
        }

        return mergedList;
    }



    // Method to print all elements in the linked list
    public void display() {
        Node4 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to demonstrate merging of two sorted linked lists
public class MergeLinkedLists {
    public static void main(String[] args) {
        // Create and populate the first sorted linked list: 1 -> 3 -> 5
        LinkedList1 list1 = new LinkedList1();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);
        list1.insert(7);

        // Create and populate the second sorted linked list: 2 -> 4 -> 6
        LinkedList1 list2 = new LinkedList1();
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);
        list2.insert(8);

        // Merge the two sorted linked lists
        LinkedList1 mergedList = LinkedList1.mergeSortedLists(list1, list2);

        // Display the merged sorted linked list
        System.out.print("Merged Sorted Linked List: ");
        mergedList.display();
    }
}