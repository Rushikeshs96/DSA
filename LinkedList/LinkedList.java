import slll.Node;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    // to create linkedlist
    public void createLinkedList(int number) {
        int no = 1;
        for (int i = 0; i < number; i++) {
            Node record = new Node(no);
            if (head == null) {
                head = record;
            } else {
                Node move = head;
                while (move.next != null) {
                    move = move.next;
                }
                move.next = record;
            }
            no = no + 2;
        }
    }

    // to display linkedlist
    public void display() {
        Node move = head;
        while (move != null) {
            System.out.print(move.data + " ");
            move = move.next;
        }
        System.out.println();
    }

    // print first element
    public void printFirst() {
        System.out.println(head.data);
    }

    // print last element
    public void printLast() {
        Node move = head;
        if (head == null) {
            System.out.println(head.data);
        } else {
            while (move.next != null) {
                move = move.next;
            }
            System.out.println(move.data);
        }
    }

    // print at position
    public void printPosition(int position) {
        Node move = head;
        if (head == null && position <= 1) {
            System.out.println(head.data);
        } else {
            for (int i = 0; i < position - 1; i++) {
                move = move.next;
            }
            System.out.println(move.data);
        }
    }

    // add at first place
    public void addfirst(int value) {
        Node record = new Node(value);
        record.next = head;
        head = record;
    }

    // add at position
    public void addAtPosition(int value, int position) {
        Node record = new Node(value);
        if (head == null && position <= 1) {
            head = record;
        } else {
            Node move = head;
            for (int i = 1; i < position - 1; i++) {
                move = move.next;
            }
            record.next = move.next;
            move.next = record;
        }
    }

    // add at last
    public void addLast(int value) {
        Node record = new Node(value);
        if (head == null) {
            head = record;
        } else {
            Node move = head;
            while (move.next != null) {
                move = move.next;
            }
            move.next = record;
        }
    }

    // delete first element
    public void deleteAtFirst() {
        head = head.next;
    }

    // delete at position
    public void deleteAtPosition(int position) {
        Node move = head;
        if (head == null) {
            deleteAtFirst();
        } else {
            for (int i = 0; i < position - 1; i++) {
                move = move.next;
            }
            move.next = move.next.next;
        }
    }

    // delete at last
    public void deleteAtLast() {
        Node move = head;
        if (head.next == null) {
            head = null;
        } else {
            while (move.next.next != null) {
                move = move.next;
            }
            move.next = null;
        }
    }

    // count total nodes from list
    public void countNodes() {
        Node move = head;
        int count = 1;
        while (move.next != null) {
            move = move.next;
            count++;
        }
        System.out.println(count);
    }

    // just print reverse
    public void printReverse(Node move) {
        if (move != null) {
            printReverse(move.next);
            System.out.print(move.data+" ");

        }

    }

    //reverse linkedlist
    public void reverse()
    {
        Node prev=null;
        Node Current=head;
        Node next=null;

        while(Current!=null)
        {
            next=Current.next;
            Current.next=prev;
            prev=Current;
            Current=next;
        }
        head=prev;
    }
    

}
