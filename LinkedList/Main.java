import slll.Node;

public class Main {
    public static void main(String[] args) {
        
        LinkedList list=new LinkedList();

        list.createLinkedList(5);
        list.addfirst(12);
        list.addAtPosition(233, 3);
        list.addLast(33);
        list.addLast(222);
        list.display();
        System.out.println();
        list.deleteAtFirst();
        list.display();
        System.out.println();
        list.deleteAtPosition(3);
        list.display();
        System.out.println();
        list.deleteAtLast();
        list.display();
        System.out.println();
        list.printFirst();
        list.printLast();
        list.printPosition(3);
        System.out.println();
        list.countNodes();
        System.out.println();
        list.printReverse(list.head);
        System.out.println();
        list.reverse();
        list.display();
    }
}
