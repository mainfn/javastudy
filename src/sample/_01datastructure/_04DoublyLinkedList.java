package sample._01datastructure;


public class _04DoublyLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.print();
    }

    static class LinkedList {
        Node head;
        Node tail;

        void add(int value) {

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                return;
            }

            Node cursor = head;
            while (cursor.next != null) {
                cursor = cursor.next;
            }
            cursor.next = newNode;
        }

        void print() {
            Node cursor = head;
            while (cursor != null) {
                System.out.print(cursor.value + " ");
                cursor = cursor.next;
            }
        }


    }

    static class Node {
        int value;
        Node next;

        Node() {

        }

        Node(int value) {
            this.value = value;
        }
    }
}
