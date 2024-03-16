package Basics.Node;

public class basics_of_node {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(5);// creating and inserting the data in the nodes of linked list
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(10);
        a.next = b;// for accessing the data of next node
        b.next = c;
        c.next = d;
        d.next = e;
        // a.next=b;
        System.out.println(a);// give random hexadecimal address
        System.out.println(a.next);// same give some hexadecimal address
        System.out.println(a.next.data);// give the value of b which is pointing using node A

        // for displaying a ll using loops
        Node temp = a;// for pointing a head node of a linked list
        /*
         * for (int i = 0; i <= 5; i++) {
         * System.out.print(temp.data + " -> ");
         * temp = temp.next;
         * }
         */
        // when we don't know th e size of linked list then we using while loop instead
        // of for loop
        while (temp != null) { // displaying a ll
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

    }
}
