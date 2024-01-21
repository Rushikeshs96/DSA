public class MainClass {

    public static void main(String[] args) {
        Sclist l=new Sclist();
       l.createList(12);
       l.createList(13);
       l.createList(2);
       l.createList(80);
       l.display();
       l.addAtpos(2, 33);
       l.display();
       l.modify(13,23);
       l.display();
       System.out.println();
      l.split();

    }
    
}
