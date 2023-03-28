import DS.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addFirst(30);
        list.addLast(50);
        list.addLast(60);
        list.addLast(80);
        list.addFirst(500);
        list.deleteAtIndex(3);
        list.addAtIndex(3, 75);


        System.out.println(list.size);
        System.out.println(list);
    }
}