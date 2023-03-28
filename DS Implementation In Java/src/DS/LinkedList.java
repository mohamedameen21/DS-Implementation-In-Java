package DS;

public class LinkedList {

    private static class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }

    private Node head = null;

    private Node last = null;
    public int size;

    public int addFirst(int val) {
        if (head == null) {
            head = last = new Node(val);
        } else {
            Node node = new Node(val);
            node.next = head;
            head = node;
        }
        size++;
        return val;
    }

    public int addLast(int val) {
        if (head == null) {
            head = last = new Node(val);
        } else {
            last.next = new Node(val);
            last = last.next;
        }
        size++;
        return val;
    }

    public int addAtIndex(int index, int val) {
        if (index == 0)
            return addFirst(val);

        if (index == size)
            return addLast(val);

        Node prev = head;
        int i = 0;
        while (i < index) {
            prev = prev.next;
            i++;
        }

        Node node = new Node(val);
        node.next = prev.next.next;
        prev.next = node;

        size++;
        return val;
    }

    public int deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index out of bound");

        if (index == 0) {
            int ele = head.val;
            if (head == last)
                last = head = null;
            else
                head = head.next;
            size--;
            return ele;
        }

        Node prev = head;
        int i = 0;
        while (i < index) {
            prev = prev.next;
            i++;
        }
        int ele = prev.next.val;

        if (prev.next == last)
            last = prev;

        prev.next = prev.next.next;
        size--;
        return ele;
    }

    @Override
    public String toString() {
        Node temp = head;
        StringBuilder list = new StringBuilder();
        while (temp != null) {
            list.append(temp).append("-->");
            temp = temp.next;
        }
        list.append("null");
        return list.toString();
    }

}
