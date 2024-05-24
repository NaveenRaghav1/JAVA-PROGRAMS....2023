package Basics.Node;

//THIS IS SIMPLE PROGRAM TO DISPLAY A LINKED LIST USING FUNCTION AND WHILE LOOPS 
// SHRI SHIVAY NAMASTAYBHUYAM
// JAI BABA KI 05/03/2024 TUESDAY.......
public class display_NODE_funct {
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--");
            temp = temp.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node y = new Node(13);
        Node z = new Node(14);
        Node s = new Node(15);
        Node t = new Node(16);
        a.next = y;
        y.next = z;
        z.next = s;
        s.next = t;
        // a.next=y;
        System.out.println("HELLO USERS THIS IS A SIMPL SINGLY LINKED LIST BY @NAVEEN_RAGHAV-->");
        display(a);
    }
}
