import java.util.Scanner;

public class day25 {
    //I love you, baby :3 go, go, go!!! ~Juliebee 
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class SinglyLinkedList {
        Node head;

        SinglyLinkedList() {
            this.head = null;
        }

        public void addLast (int data) {
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

        public void displayList() {
            if (head == null) {
                System.out.println("NULL");
                return;
            }
            Node current = head;
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.print(" -> NULL");
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scan = new Scanner(System.in);

        System.out.println("\nSingly Linked List");
        System.out.println("\nInput numbers in the list (0 = end)");
        while (true) {
            System.out.print("Add: ");
            int number = scan.nextInt();
            if (number == 0) {break;}
            list.addLast(number);
        }
        list.displayList();
        scan.close();
    }
}
