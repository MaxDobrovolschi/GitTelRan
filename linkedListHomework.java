import java.util.LinkedList;
import java.util.List;

public class linkedListHomework {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int integer) {
            data = integer;
            next = null;
        }
    }

    public void display() {
        Node node = head;
        while (node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        linkedListHomework SinglyLinkedList = new linkedListHomework();

        SinglyLinkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        SinglyLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        SinglyLinkedList.display();


    }

}