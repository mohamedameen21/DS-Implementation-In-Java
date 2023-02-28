import DS.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(5);
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        System.out.println(array.add(60));
        System.out.println(array);
        System.out.println(array.length());
        System.out.println(array.indexOf(600));
        System.out.println(array.removeAt(0));
        System.out.println(array);
    }
}